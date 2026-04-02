package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.AsyncEmitter;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action1;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class OnSubscribeFromEmitter<T> implements Observable.OnSubscribe<T> {
    final Action1<AsyncEmitter<T>> a;
    final AsyncEmitter.BackpressureMode b;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeFromEmitter(Action1<AsyncEmitter<T>> action1, AsyncEmitter.BackpressureMode backpressureMode) {
        this.a = action1;
        this.b = backpressureMode;
    }

    public void call(Subscriber<? super T> subscriber) {
        a fVar;
        switch (this.b) {
            case NONE:
                fVar = new h(subscriber);
                break;
            case ERROR:
                fVar = new e(subscriber);
                break;
            case DROP:
                fVar = new d(subscriber);
                break;
            case LATEST:
                fVar = new f(subscriber);
                break;
            default:
                fVar = new b(subscriber, RxRingBuffer.SIZE);
                break;
        }
        subscriber.add(fVar);
        subscriber.setProducer(fVar);
        this.a.call(fVar);
    }

    /* loaded from: classes4.dex */
    static final class c extends AtomicReference<AsyncEmitter.Cancellable> implements Subscription {
        private static final long serialVersionUID = 5718521705281392066L;

        public c(AsyncEmitter.Cancellable cancellable) {
            super(cancellable);
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == null;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            AsyncEmitter.Cancellable andSet;
            if (get() != null && (andSet = getAndSet(null)) != null) {
                try {
                    andSet.cancel();
                } catch (Exception e) {
                    Exceptions.throwIfFatal(e);
                    RxJavaHooks.onError(e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class a<T> extends AtomicLong implements AsyncEmitter<T>, Producer, Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        final Subscriber<? super T> a;
        final SerialSubscription b = new SerialSubscription();

        public a(Subscriber<? super T> subscriber) {
            this.a = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.a.isUnsubscribed()) {
                try {
                    this.a.onCompleted();
                } finally {
                    this.b.unsubscribe();
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (!this.a.isUnsubscribed()) {
                try {
                    this.a.onError(th);
                } finally {
                    this.b.unsubscribe();
                }
            }
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            this.b.unsubscribe();
            a();
        }

        void a() {
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.b.isUnsubscribed();
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (BackpressureUtils.validate(j)) {
                BackpressureUtils.getAndAddRequest(this, j);
                b();
            }
        }

        void b() {
        }

        @Override // rx.AsyncEmitter
        public final void setSubscription(Subscription subscription) {
            this.b.set(subscription);
        }

        @Override // rx.AsyncEmitter
        public final void setCancellation(AsyncEmitter.Cancellable cancellable) {
            setSubscription(new c(cancellable));
        }

        @Override // rx.AsyncEmitter
        public final long requested() {
            return get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h<T> extends a<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public h(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long j;
            if (!this.a.isUnsubscribed()) {
                this.a.onNext(t);
                do {
                    j = get();
                    if (j == 0) {
                        return;
                    }
                } while (!compareAndSet(j, j - 1));
            }
        }
    }

    /* loaded from: classes4.dex */
    static abstract class g<T> extends a<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        abstract void c();

        public g(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onNext(T t) {
            if (!this.a.isUnsubscribed()) {
                if (get() != 0) {
                    this.a.onNext(t);
                    BackpressureUtils.produced(this, 1L);
                    return;
                }
                c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d<T> extends g<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public d(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.g
        void c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e<T> extends g<T> {
        private static final long serialVersionUID = 338953216916120960L;
        private boolean c;

        public e(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.g, rx.Observer
        public void onNext(T t) {
            if (!this.c) {
                super.onNext(t);
            }
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.a, rx.Observer
        public void onCompleted() {
            if (!this.c) {
                this.c = true;
                super.onCompleted();
            }
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.a, rx.Observer
        public void onError(Throwable th) {
            if (this.c) {
                RxJavaHooks.onError(th);
                return;
            }
            this.c = true;
            super.onError(th);
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.g
        void c() {
            onError(new MissingBackpressureException("fromEmitter: could not emit value due to lack of requests"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        final Queue<Object> c;
        Throwable d;
        volatile boolean e;
        final AtomicInteger f;
        final NotificationLite<T> g;

        public b(Subscriber<? super T> subscriber, int i) {
            super(subscriber);
            this.c = UnsafeAccess.isUnsafeAvailable() ? new SpscUnboundedArrayQueue<>(i) : new SpscUnboundedAtomicArrayQueue<>(i);
            this.f = new AtomicInteger();
            this.g = NotificationLite.instance();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.c.offer(this.g.next(t));
            c();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.a, rx.Observer
        public void onError(Throwable th) {
            this.d = th;
            this.e = true;
            c();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.a, rx.Observer
        public void onCompleted() {
            this.e = true;
            c();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.a
        void b() {
            c();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.a
        void a() {
            if (this.f.getAndIncrement() == 0) {
                this.c.clear();
            }
        }

        void c() {
            if (this.f.getAndIncrement() == 0) {
                Subscriber<? super T> subscriber = this.a;
                Queue<Object> queue = this.c;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (subscriber.isUnsubscribed()) {
                            queue.clear();
                            return;
                        }
                        boolean z = this.e;
                        Object poll = queue.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable th = this.d;
                            if (th != null) {
                                super.onError(th);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            subscriber.onNext((T) this.g.getValue(poll));
                            j2 = 1 + j2;
                        }
                    }
                    if (j2 == j) {
                        if (subscriber.isUnsubscribed()) {
                            queue.clear();
                            return;
                        }
                        boolean z3 = this.e;
                        boolean isEmpty = queue.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.d;
                            if (th2 != null) {
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        BackpressureUtils.produced(this, j2);
                    }
                    i = this.f.addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f<T> extends a<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        final AtomicReference<Object> c;
        Throwable d;
        volatile boolean e;
        final AtomicInteger f;
        final NotificationLite<T> g;

        public f(Subscriber<? super T> subscriber) {
            super(subscriber);
            this.c = new AtomicReference<>();
            this.f = new AtomicInteger();
            this.g = NotificationLite.instance();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.c.set(this.g.next(t));
            c();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.a, rx.Observer
        public void onError(Throwable th) {
            this.d = th;
            this.e = true;
            c();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.a, rx.Observer
        public void onCompleted() {
            this.e = true;
            c();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.a
        void b() {
            c();
        }

        @Override // rx.internal.operators.OnSubscribeFromEmitter.a
        void a() {
            if (this.f.getAndIncrement() == 0) {
                this.c.lazySet(null);
            }
        }

        void c() {
            if (this.f.getAndIncrement() == 0) {
                Subscriber<? super T> subscriber = this.a;
                AtomicReference<Object> atomicReference = this.c;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (subscriber.isUnsubscribed()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z = this.e;
                        Object andSet = atomicReference.getAndSet(null);
                        boolean z2 = andSet == null;
                        if (z && z2) {
                            Throwable th = this.d;
                            if (th != null) {
                                super.onError(th);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            subscriber.onNext((T) this.g.getValue(andSet));
                            j2++;
                        }
                    }
                    if (j2 == j) {
                        if (subscriber.isUnsubscribed()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z3 = this.e;
                        boolean z4 = atomicReference.get() == null;
                        if (z3 && z4) {
                            Throwable th2 = this.d;
                            if (th2 != null) {
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        BackpressureUtils.produced(this, j2);
                    }
                    i = this.f.addAndGet(-i);
                } while (i != 0);
            }
        }
    }
}
