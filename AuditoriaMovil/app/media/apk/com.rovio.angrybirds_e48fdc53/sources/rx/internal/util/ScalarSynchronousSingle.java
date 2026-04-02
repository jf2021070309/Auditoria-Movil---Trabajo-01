package rx.internal.util;

import rx.Scheduler;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.schedulers.EventLoopsScheduler;
/* loaded from: classes4.dex */
public final class ScalarSynchronousSingle<T> extends Single<T> {
    final T b;

    public static <T> ScalarSynchronousSingle<T> create(T t) {
        return new ScalarSynchronousSingle<>(t);
    }

    protected ScalarSynchronousSingle(final T t) {
        super(new Single.OnSubscribe<T>() { // from class: rx.internal.util.ScalarSynchronousSingle.1
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(SingleSubscriber<? super T> singleSubscriber) {
                singleSubscriber.onSuccess((Object) t);
            }
        });
        this.b = t;
    }

    public T get() {
        return this.b;
    }

    public Single<T> scalarScheduleOn(Scheduler scheduler) {
        return scheduler instanceof EventLoopsScheduler ? create((Single.OnSubscribe) new a((EventLoopsScheduler) scheduler, this.b)) : create((Single.OnSubscribe) new b(scheduler, this.b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Single.OnSubscribe<T> {
        private final EventLoopsScheduler a;
        private final T b;

        a(EventLoopsScheduler eventLoopsScheduler, T t) {
            this.a = eventLoopsScheduler;
            this.b = t;
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            singleSubscriber.add(this.a.scheduleDirect(new c(singleSubscriber, this.b)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> implements Single.OnSubscribe<T> {
        private final Scheduler a;
        private final T b;

        b(Scheduler scheduler, T t) {
            this.a = scheduler;
            this.b = t;
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            Scheduler.Worker createWorker = this.a.createWorker();
            singleSubscriber.add(createWorker);
            createWorker.schedule(new c(singleSubscriber, this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> implements Action0 {
        private final SingleSubscriber<? super T> a;
        private final T b;

        c(SingleSubscriber<? super T> singleSubscriber, T t) {
            this.a = singleSubscriber;
            this.b = t;
        }

        @Override // rx.functions.Action0
        public void call() {
            try {
                this.a.onSuccess((T) this.b);
            } catch (Throwable th) {
                this.a.onError(th);
            }
        }
    }

    public <R> Single<R> scalarFlatMap(final Func1<? super T, ? extends Single<? extends R>> func1) {
        return create((Single.OnSubscribe) new Single.OnSubscribe<R>() { // from class: rx.internal.util.ScalarSynchronousSingle.2
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(final SingleSubscriber<? super R> singleSubscriber) {
                Single single = (Single) func1.call(ScalarSynchronousSingle.this.b);
                if (single instanceof ScalarSynchronousSingle) {
                    singleSubscriber.onSuccess((T) ((ScalarSynchronousSingle) single).b);
                    return;
                }
                Subscriber<R> subscriber = new Subscriber<R>() { // from class: rx.internal.util.ScalarSynchronousSingle.2.1
                    @Override // rx.Observer
                    public void onCompleted() {
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th) {
                        singleSubscriber.onError(th);
                    }

                    @Override // rx.Observer
                    public void onNext(R r) {
                        singleSubscriber.onSuccess(r);
                    }
                };
                singleSubscriber.add(subscriber);
                single.unsafeSubscribe(subscriber);
            }
        });
    }
}
