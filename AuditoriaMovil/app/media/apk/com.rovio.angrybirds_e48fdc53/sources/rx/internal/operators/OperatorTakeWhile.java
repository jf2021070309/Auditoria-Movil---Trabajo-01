package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;
/* loaded from: classes4.dex */
public final class OperatorTakeWhile<T> implements Observable.Operator<T, T> {
    final Func2<? super T, ? super Integer, Boolean> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorTakeWhile(final Func1<? super T, Boolean> func1) {
        this(new Func2<T, Integer, Boolean>() { // from class: rx.internal.operators.OperatorTakeWhile.1
            @Override // rx.functions.Func2
            /* renamed from: a */
            public Boolean call(T t, Integer num) {
                return (Boolean) Func1.this.call(t);
            }
        });
    }

    public OperatorTakeWhile(Func2<? super T, ? super Integer, Boolean> func2) {
        this.a = func2;
    }

    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        Subscriber subscriber2 = (Subscriber<T>) new Subscriber<T>(subscriber, false) { // from class: rx.internal.operators.OperatorTakeWhile.2
            private int c;
            private boolean d;

            @Override // rx.Observer
            public void onNext(T t) {
                try {
                    Func2<? super T, ? super Integer, Boolean> func2 = OperatorTakeWhile.this.a;
                    int i = this.c;
                    this.c = i + 1;
                    if (func2.call(t, Integer.valueOf(i)).booleanValue()) {
                        subscriber.onNext(t);
                        return;
                    }
                    this.d = true;
                    subscriber.onCompleted();
                    unsubscribe();
                } catch (Throwable th) {
                    this.d = true;
                    Exceptions.throwOrReport(th, subscriber, t);
                    unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (!this.d) {
                    subscriber.onCompleted();
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                if (!this.d) {
                    subscriber.onError(th);
                }
            }
        };
        subscriber.add(subscriber2);
        return subscriber2;
    }
}
