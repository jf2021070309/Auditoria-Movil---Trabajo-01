package rx.internal.operators;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.internal.operators.a;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public class OperatorTimeoutWithSelector<T, U, V> extends a<T> {
    @Override // rx.internal.operators.a
    public /* bridge */ /* synthetic */ Subscriber call(Subscriber subscriber) {
        return super.call(subscriber);
    }

    public OperatorTimeoutWithSelector(final Func0<? extends Observable<U>> func0, final Func1<? super T, ? extends Observable<V>> func1, Observable<? extends T> observable) {
        super(new a.InterfaceC0379a<T>() { // from class: rx.internal.operators.OperatorTimeoutWithSelector.1
            @Override // rx.functions.Func3
            /* renamed from: a */
            public Subscription call(final a.c<T> cVar, final Long l, Scheduler.Worker worker) {
                if (Func0.this != null) {
                    try {
                        return ((Observable) Func0.this.call()).unsafeSubscribe(new Subscriber<U>() { // from class: rx.internal.operators.OperatorTimeoutWithSelector.1.1
                            @Override // rx.Observer
                            public void onCompleted() {
                                cVar.a(l.longValue());
                            }

                            @Override // rx.Observer
                            public void onError(Throwable th) {
                                cVar.onError(th);
                            }

                            @Override // rx.Observer
                            public void onNext(U u) {
                                cVar.a(l.longValue());
                            }
                        });
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, cVar);
                        return Subscriptions.unsubscribed();
                    }
                }
                return Subscriptions.unsubscribed();
            }
        }, new a.b<T>() { // from class: rx.internal.operators.OperatorTimeoutWithSelector.2
            @Override // rx.functions.Func4
            /* renamed from: a */
            public Subscription call(final a.c<T> cVar, final Long l, T t, Scheduler.Worker worker) {
                try {
                    return ((Observable) Func1.this.call(t)).unsafeSubscribe(new Subscriber<V>() { // from class: rx.internal.operators.OperatorTimeoutWithSelector.2.1
                        @Override // rx.Observer
                        public void onCompleted() {
                            cVar.a(l.longValue());
                        }

                        @Override // rx.Observer
                        public void onError(Throwable th) {
                            cVar.onError(th);
                        }

                        @Override // rx.Observer
                        public void onNext(V v) {
                            cVar.a(l.longValue());
                        }
                    });
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, cVar);
                    return Subscriptions.unsubscribed();
                }
            }
        }, observable, Schedulers.immediate());
    }
}
