package rx.internal.util;

import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;
/* loaded from: classes4.dex */
public final class ActionSubscriber<T> extends Subscriber<T> {
    final Action1<? super T> a;
    final Action1<Throwable> b;
    final Action0 c;

    public ActionSubscriber(Action1<? super T> action1, Action1<Throwable> action12, Action0 action0) {
        this.a = action1;
        this.b = action12;
        this.c = action0;
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.a.call(t);
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.b.call(th);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.c.call();
    }
}
