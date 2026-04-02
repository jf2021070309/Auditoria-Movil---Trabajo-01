package rx.internal.util;

import rx.Notification;
import rx.Observer;
import rx.functions.Action1;
/* loaded from: classes4.dex */
public final class ActionNotificationObserver<T> implements Observer<T> {
    final Action1<Notification<? super T>> a;

    public ActionNotificationObserver(Action1<Notification<? super T>> action1) {
        this.a = action1;
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.a.call(Notification.createOnNext(t));
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.a.call(Notification.createOnError(th));
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.a.call(Notification.createOnCompleted());
    }
}
