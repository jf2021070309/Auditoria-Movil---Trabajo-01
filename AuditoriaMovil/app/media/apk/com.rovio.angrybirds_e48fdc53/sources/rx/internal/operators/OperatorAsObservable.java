package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
/* loaded from: classes4.dex */
public final class OperatorAsObservable<T> implements Observable.Operator<T, T> {
    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        static final OperatorAsObservable<Object> a = new OperatorAsObservable<>();

        a() {
        }
    }

    public static <T> OperatorAsObservable<T> instance() {
        return (OperatorAsObservable<T>) a.a;
    }

    OperatorAsObservable() {
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return subscriber;
    }
}
