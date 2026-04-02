package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action1;
import rx.observables.ConnectableObservable;
import rx.observers.Subscribers;
/* loaded from: classes4.dex */
public final class OnSubscribeAutoConnect<T> extends AtomicInteger implements Observable.OnSubscribe<T> {
    final ConnectableObservable<? extends T> a;
    final int b;
    final Action1<? super Subscription> c;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeAutoConnect(ConnectableObservable<? extends T> connectableObservable, int i, Action1<? super Subscription> action1) {
        if (i <= 0) {
            throw new IllegalArgumentException("numberOfSubscribers > 0 required");
        }
        this.a = connectableObservable;
        this.b = i;
        this.c = action1;
    }

    public void call(Subscriber<? super T> subscriber) {
        this.a.unsafeSubscribe(Subscribers.wrap(subscriber));
        if (incrementAndGet() == this.b) {
            this.a.connect(this.c);
        }
    }
}
