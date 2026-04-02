package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
/* loaded from: classes4.dex */
public enum EmptyObservableHolder implements Observable.OnSubscribe<Object> {
    INSTANCE;
    
    static final Observable<Object> a = Observable.create(INSTANCE);

    public static <T> Observable<T> instance() {
        return (Observable<T>) a;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super Object> subscriber) {
        subscriber.onCompleted();
    }
}
