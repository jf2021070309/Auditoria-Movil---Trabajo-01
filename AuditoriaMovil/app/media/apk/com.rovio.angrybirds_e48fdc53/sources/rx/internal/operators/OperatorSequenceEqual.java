package rx.internal.operators;

import rx.Observable;
import rx.functions.Func2;
import rx.internal.util.UtilityFunctions;
/* loaded from: classes4.dex */
public final class OperatorSequenceEqual {
    static final Object a = new Object();

    private OperatorSequenceEqual() {
        throw new IllegalStateException("No instances!");
    }

    static <T> Observable<Object> a(Observable<T> observable) {
        return Observable.concat(observable, Observable.just(a));
    }

    public static <T> Observable<Boolean> sequenceEqual(Observable<? extends T> observable, Observable<? extends T> observable2, final Func2<? super T, ? super T, Boolean> func2) {
        return Observable.zip(a(observable), a(observable2), new Func2<Object, Object, Boolean>() { // from class: rx.internal.operators.OperatorSequenceEqual.1
            @Override // rx.functions.Func2
            /* renamed from: a */
            public Boolean call(Object obj, Object obj2) {
                boolean z = obj == OperatorSequenceEqual.a;
                boolean z2 = obj2 == OperatorSequenceEqual.a;
                if (z && z2) {
                    return true;
                }
                if (z || z2) {
                    return false;
                }
                return (Boolean) Func2.this.call(obj, obj2);
            }
        }).all(UtilityFunctions.identity());
    }
}
