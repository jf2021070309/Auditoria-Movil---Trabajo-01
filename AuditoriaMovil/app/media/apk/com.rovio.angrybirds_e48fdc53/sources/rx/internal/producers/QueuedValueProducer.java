package rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.internal.operators.BackpressureUtils;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;
/* loaded from: classes4.dex */
public final class QueuedValueProducer<T> extends AtomicLong implements Producer {
    static final Object d = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final Subscriber<? super T> a;
    final Queue<Object> b;
    final AtomicInteger c;

    public QueuedValueProducer(Subscriber<? super T> subscriber) {
        this(subscriber, UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue() : new SpscLinkedAtomicQueue());
    }

    public QueuedValueProducer(Subscriber<? super T> subscriber, Queue<Object> queue) {
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
            if (!this.b.offer(d)) {
                return false;
            }
        } else if (!this.b.offer(t)) {
            return false;
        }
        a();
        return true;
    }

    private void a() {
        Object poll;
        if (this.c.getAndIncrement() == 0) {
            Subscriber<? super T> subscriber = this.a;
            Queue<Object> queue = this.b;
            while (!subscriber.isUnsubscribed()) {
                this.c.lazySet(1);
                long j = get();
                long j2 = 0;
                while (j != 0 && (poll = queue.poll()) != null) {
                    try {
                        if (poll == d) {
                            subscriber.onNext(null);
                        } else {
                            subscriber.onNext(poll);
                        }
                        if (!subscriber.isUnsubscribed()) {
                            j--;
                            j2++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        if (poll == d) {
                            poll = null;
                        }
                        Exceptions.throwOrReport(th, subscriber, poll);
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
