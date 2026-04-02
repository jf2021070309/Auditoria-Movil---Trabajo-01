package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.operators.BufferUntilSubscriber;
import rx.observers.SerializedObserver;
import rx.subjects.PublishSubject;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public class SchedulerWhen extends Scheduler implements Subscription {
    static final Subscription b = new Subscription() { // from class: rx.internal.schedulers.SchedulerWhen.3
        @Override // rx.Subscription
        public void unsubscribe() {
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return false;
        }
    };
    static final Subscription c = Subscriptions.unsubscribed();
    private final Scheduler d;
    private final Observer<Observable<Completable>> e;
    private final Subscription f;

    public SchedulerWhen(Func1<Observable<Observable<Completable>>, Completable> func1, Scheduler scheduler) {
        this.d = scheduler;
        PublishSubject create = PublishSubject.create();
        this.e = new SerializedObserver(create);
        this.f = func1.call(create.onBackpressureBuffer()).subscribe();
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.f.unsubscribe();
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.f.isUnsubscribed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        final Scheduler.Worker createWorker = this.d.createWorker();
        BufferUntilSubscriber create = BufferUntilSubscriber.create();
        final SerializedObserver serializedObserver = new SerializedObserver(create);
        Object map = create.map(new Func1<c, Completable>() { // from class: rx.internal.schedulers.SchedulerWhen.1
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Completable call(final c cVar) {
                return Completable.create(new Completable.OnSubscribe() { // from class: rx.internal.schedulers.SchedulerWhen.1.1
                    @Override // rx.functions.Action1
                    /* renamed from: a */
                    public void call(CompletableSubscriber completableSubscriber) {
                        completableSubscriber.onSubscribe(cVar);
                        cVar.b(createWorker);
                        completableSubscriber.onCompleted();
                    }
                });
            }
        });
        Scheduler.Worker worker = new Scheduler.Worker() { // from class: rx.internal.schedulers.SchedulerWhen.2
            private final AtomicBoolean d = new AtomicBoolean();

            @Override // rx.Subscription
            public void unsubscribe() {
                if (this.d.compareAndSet(false, true)) {
                    createWorker.unsubscribe();
                    serializedObserver.onCompleted();
                }
            }

            @Override // rx.Subscription
            public boolean isUnsubscribed() {
                return this.d.get();
            }

            @Override // rx.Scheduler.Worker
            public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
                a aVar = new a(action0, j, timeUnit);
                serializedObserver.onNext(aVar);
                return aVar;
            }

            @Override // rx.Scheduler.Worker
            public Subscription schedule(Action0 action0) {
                b bVar = new b(action0);
                serializedObserver.onNext(bVar);
                return bVar;
            }
        };
        this.e.onNext(map);
        return worker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static abstract class c extends AtomicReference<Subscription> implements Subscription {
        protected abstract Subscription a(Scheduler.Worker worker);

        public c() {
            super(SchedulerWhen.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Scheduler.Worker worker) {
            Subscription subscription = get();
            if (subscription != SchedulerWhen.c && subscription == SchedulerWhen.b) {
                Subscription a = a(worker);
                if (!compareAndSet(SchedulerWhen.b, a)) {
                    a.unsubscribe();
                }
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get().isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            Subscription subscription;
            Subscription subscription2 = SchedulerWhen.c;
            do {
                subscription = get();
                if (subscription == SchedulerWhen.c) {
                    return;
                }
            } while (!compareAndSet(subscription, subscription2));
            if (subscription != SchedulerWhen.b) {
                subscription.unsubscribe();
            }
        }
    }

    /* loaded from: classes4.dex */
    private static class b extends c {
        private final Action0 a;

        public b(Action0 action0) {
            this.a = action0;
        }

        @Override // rx.internal.schedulers.SchedulerWhen.c
        protected Subscription a(Scheduler.Worker worker) {
            return worker.schedule(this.a);
        }
    }

    /* loaded from: classes4.dex */
    private static class a extends c {
        private final Action0 a;
        private final long b;
        private final TimeUnit c;

        public a(Action0 action0, long j, TimeUnit timeUnit) {
            this.a = action0;
            this.b = j;
            this.c = timeUnit;
        }

        @Override // rx.internal.schedulers.SchedulerWhen.c
        protected Subscription a(Scheduler.Worker worker) {
            return worker.schedule(this.a, this.b, this.c);
        }
    }
}
