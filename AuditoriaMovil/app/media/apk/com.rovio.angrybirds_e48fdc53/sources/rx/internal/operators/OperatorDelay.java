package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
/* loaded from: classes4.dex */
public final class OperatorDelay<T> implements Observable.Operator<T, T> {
    final long a;
    final TimeUnit b;
    final Scheduler c;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorDelay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.c.createWorker();
        subscriber.add(createWorker);
        return new AnonymousClass1(subscriber, createWorker, subscriber);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rx.internal.operators.OperatorDelay$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends Subscriber<T> {
        boolean a;
        final /* synthetic */ Scheduler.Worker b;
        final /* synthetic */ Subscriber c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Subscriber subscriber, Scheduler.Worker worker, Subscriber subscriber2) {
            super(subscriber);
            this.b = worker;
            this.c = subscriber2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.b.schedule(new Action0() { // from class: rx.internal.operators.OperatorDelay.1.1
                @Override // rx.functions.Action0
                public void call() {
                    if (!AnonymousClass1.this.a) {
                        AnonymousClass1.this.a = true;
                        AnonymousClass1.this.c.onCompleted();
                    }
                }
            }, OperatorDelay.this.a, OperatorDelay.this.b);
        }

        @Override // rx.Observer
        public void onError(final Throwable th) {
            this.b.schedule(new Action0() { // from class: rx.internal.operators.OperatorDelay.1.2
                @Override // rx.functions.Action0
                public void call() {
                    if (!AnonymousClass1.this.a) {
                        AnonymousClass1.this.a = true;
                        AnonymousClass1.this.c.onError(th);
                        AnonymousClass1.this.b.unsubscribe();
                    }
                }
            });
        }

        @Override // rx.Observer
        public void onNext(final T t) {
            this.b.schedule(new Action0() { // from class: rx.internal.operators.OperatorDelay.1.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // rx.functions.Action0
                public void call() {
                    if (!AnonymousClass1.this.a) {
                        AnonymousClass1.this.c.onNext(t);
                    }
                }
            }, OperatorDelay.this.a, OperatorDelay.this.b);
        }
    }
}
