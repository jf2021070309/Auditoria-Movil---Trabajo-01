package rx.internal.util;

import rx.Observer;
import rx.Subscriber;
/* loaded from: classes4.dex */
public final class ObserverSubscriber<T> extends Subscriber<T> {
    final Observer<? super T> a;

    public ObserverSubscriber(Observer<? super T> observer) {
        this.a = observer;
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.a.onNext(t);
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.a.onCompleted();
    }
}
