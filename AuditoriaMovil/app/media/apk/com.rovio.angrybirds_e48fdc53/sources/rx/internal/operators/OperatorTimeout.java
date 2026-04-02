package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.operators.a;
/* loaded from: classes4.dex */
public final class OperatorTimeout<T> extends a<T> {
    @Override // rx.internal.operators.a
    public /* bridge */ /* synthetic */ Subscriber call(Subscriber subscriber) {
        return super.call(subscriber);
    }

    public OperatorTimeout(final long j, final TimeUnit timeUnit, Observable<? extends T> observable, Scheduler scheduler) {
        super(new a.InterfaceC0379a<T>() { // from class: rx.internal.operators.OperatorTimeout.1
            @Override // rx.functions.Func3
            /* renamed from: a */
            public Subscription call(final a.c<T> cVar, final Long l, Scheduler.Worker worker) {
                return worker.schedule(new Action0() { // from class: rx.internal.operators.OperatorTimeout.1.1
                    @Override // rx.functions.Action0
                    public void call() {
                        cVar.a(l.longValue());
                    }
                }, j, timeUnit);
            }
        }, new a.b<T>() { // from class: rx.internal.operators.OperatorTimeout.2
            @Override // rx.functions.Func4
            /* renamed from: a */
            public Subscription call(final a.c<T> cVar, final Long l, T t, Scheduler.Worker worker) {
                return worker.schedule(new Action0() { // from class: rx.internal.operators.OperatorTimeout.2.1
                    @Override // rx.functions.Action0
                    public void call() {
                        cVar.a(l.longValue());
                    }
                }, j, timeUnit);
            }
        }, observable, scheduler);
    }
}
