package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.BackpressureOverflow;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.internal.util.BackpressureDrainManager;
/* loaded from: classes4.dex */
public class OperatorOnBackpressureBuffer<T> implements Observable.Operator<T, T> {
    private final Long a;
    private final Action0 b;
    private final BackpressureOverflow.Strategy c;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {
        static final OperatorOnBackpressureBuffer<?> a = new OperatorOnBackpressureBuffer<>();

        b() {
        }
    }

    public static <T> OperatorOnBackpressureBuffer<T> instance() {
        return (OperatorOnBackpressureBuffer<T>) b.a;
    }

    OperatorOnBackpressureBuffer() {
        this.a = null;
        this.b = null;
        this.c = BackpressureOverflow.ON_OVERFLOW_DEFAULT;
    }

    public OperatorOnBackpressureBuffer(long j) {
        this(j, null, BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j, Action0 action0) {
        this(j, action0, BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j, Action0 action0, BackpressureOverflow.Strategy strategy) {
        if (j <= 0) {
            throw new IllegalArgumentException("Buffer capacity must be > 0");
        }
        if (strategy == null) {
            throw new NullPointerException("The BackpressureOverflow strategy must not be null");
        }
        this.a = Long.valueOf(j);
        this.b = action0;
        this.c = strategy;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber, this.a, this.b, this.c);
        subscriber.add(aVar);
        subscriber.setProducer(aVar.a());
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> implements BackpressureDrainManager.BackpressureQueueCallback {
        private final AtomicLong b;
        private final Subscriber<? super T> c;
        private final BackpressureDrainManager e;
        private final Action0 g;
        private final BackpressureOverflow.Strategy h;
        private final ConcurrentLinkedQueue<Object> a = new ConcurrentLinkedQueue<>();
        private final AtomicBoolean d = new AtomicBoolean(false);
        private final NotificationLite<T> f = NotificationLite.instance();

        public a(Subscriber<? super T> subscriber, Long l, Action0 action0, BackpressureOverflow.Strategy strategy) {
            this.c = subscriber;
            this.b = l != null ? new AtomicLong(l.longValue()) : null;
            this.g = action0;
            this.e = new BackpressureDrainManager(this);
            this.h = strategy;
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.d.get()) {
                this.e.terminateAndDrain();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (!this.d.get()) {
                this.e.terminateAndDrain(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (b()) {
                this.a.offer(this.f.next(t));
                this.e.drain();
            }
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public boolean accept(Object obj) {
            return this.f.accept(this.c, obj);
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public void complete(Throwable th) {
            if (th != null) {
                this.c.onError(th);
            } else {
                this.c.onCompleted();
            }
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public Object peek() {
            return this.a.peek();
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public Object poll() {
            Object poll = this.a.poll();
            if (this.b != null && poll != null) {
                this.b.incrementAndGet();
            }
            return poll;
        }

        private boolean b() {
            long j;
            boolean z;
            if (this.b == null) {
                return true;
            }
            do {
                j = this.b.get();
                if (j <= 0) {
                    try {
                        z = this.h.mayAttemptDrop() && poll() != null;
                    } catch (MissingBackpressureException e) {
                        if (this.d.compareAndSet(false, true)) {
                            unsubscribe();
                            this.c.onError(e);
                        }
                        z = false;
                    }
                    if (this.g != null) {
                        try {
                            this.g.call();
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.e.terminateAndDrain(th);
                            return false;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            } while (!this.b.compareAndSet(j, j - 1));
            return true;
        }

        protected Producer a() {
            return this.e;
        }
    }
}
