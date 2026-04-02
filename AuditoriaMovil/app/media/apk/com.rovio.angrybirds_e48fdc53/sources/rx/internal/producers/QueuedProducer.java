package rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.BackpressureUtils;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;
/* loaded from: classes4.dex */
public final class QueuedProducer<T> extends AtomicLong implements Observer<T>, Producer {
    static final Object f = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final Subscriber<? super T> a;
    final Queue<Object> b;
    final AtomicInteger c;
    Throwable d;
    volatile boolean e;

    public QueuedProducer(Subscriber<? super T> subscriber) {
        this(subscriber, UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue() : new SpscLinkedAtomicQueue());
    }

    public QueuedProducer(Subscriber<? super T> subscriber, Queue<Object> queue) {
        this.a = subscriber;
        this.b = queue;
        this.c = new AtomicInteger();
    }

    @Override // rx.Producer
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j > 0) {
            BackpressureUtils.getAndAddRequest(this, j);
            a();
        }
    }

    public boolean offer(T t) {
        if (t == null) {
            if (!this.b.offer(f)) {
                return false;
            }
        } else if (!this.b.offer(t)) {
            return false;
        }
        a();
        return true;
    }

    @Override // rx.Observer
    public void onNext(T t) {
        if (!offer(t)) {
            onError(new MissingBackpressureException());
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.d = th;
        this.e = true;
        a();
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.e = true;
        a();
    }

    private boolean a(boolean z, boolean z2) {
        if (this.a.isUnsubscribed()) {
            return true;
        }
        if (z) {
            Throwable th = this.d;
            if (th != null) {
                this.b.clear();
                this.a.onError(th);
                return true;
            } else if (z2) {
                this.a.onCompleted();
                return true;
            }
        }
        return false;
    }

    private void a() {
        if (this.c.getAndIncrement() == 0) {
            Subscriber<? super T> subscriber = this.a;
            Queue<Object> queue = this.b;
            while (!a(this.e, queue.isEmpty())) {
                this.c.lazySet(1);
                long j = get();
                long j2 = 0;
                while (j != 0) {
                    boolean z = this.e;
                    Object poll = queue.poll();
                    if (!a(z, poll == null)) {
                        if (poll == null) {
                            break;
                        }
                        try {
                            if (poll == f) {
                                subscriber.onNext(null);
                            } else {
                                subscriber.onNext(poll);
                            }
                            j--;
                            j2 = 1 + j2;
                        } catch (Throwable th) {
                            Exceptions.throwOrReport(th, subscriber, poll != f ? poll : null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j2 != 0 && get() != Long.MAX_VALUE) {
                    addAndGet(-j2);
                }
                if (this.c.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
