package rx.internal.operators;

import java.util.HashSet;
import java.util.Set;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import rx.internal.util.UtilityFunctions;
/* loaded from: classes4.dex */
public final class OperatorDistinct<T, U> implements Observable.Operator<T, T> {
    final Func1<? super T, ? extends U> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        static final OperatorDistinct<?, ?> a = new OperatorDistinct<>(UtilityFunctions.identity());

        a() {
        }
    }

    public static <T> OperatorDistinct<T, T> instance() {
        return (OperatorDistinct<T, T>) a.a;
    }

    public OperatorDistinct(Func1<? super T, ? extends U> func1) {
        this.a = func1;
    }

    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return (Subscriber<T>) new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorDistinct.1
            Set<U> a = new HashSet();

            @Override // rx.Observer
            public void onNext(T t) {
                if (this.a.add(OperatorDistinct.this.a.call(t))) {
                    subscriber.onNext(t);
                } else {
                    request(1L);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                this.a = null;
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.a = null;
                subscriber.onCompleted();
            }
        };
    }
}
