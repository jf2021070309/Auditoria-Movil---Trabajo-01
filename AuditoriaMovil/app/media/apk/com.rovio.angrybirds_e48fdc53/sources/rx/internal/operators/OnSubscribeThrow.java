package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
/* loaded from: classes4.dex */
public final class OnSubscribeThrow<T> implements Observable.OnSubscribe<T> {
    private final Throwable a;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeThrow(Throwable th) {
        this.a = th;
    }

    public void call(Subscriber<? super T> subscriber) {
        subscriber.onError(this.a);
    }
}
