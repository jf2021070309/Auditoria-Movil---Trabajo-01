package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.Subscribers;
/* loaded from: classes4.dex */
public class OperatorDoOnSubscribe<T> implements Observable.Operator<T, T> {
    private final Action0 a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorDoOnSubscribe(Action0 action0) {
        this.a = action0;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        this.a.call();
        return Subscribers.wrap(subscriber);
    }
}
