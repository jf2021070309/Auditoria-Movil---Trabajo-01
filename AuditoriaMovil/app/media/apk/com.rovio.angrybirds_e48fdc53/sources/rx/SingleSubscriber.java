package rx;

import rx.internal.util.SubscriptionList;
/* loaded from: classes4.dex */
public abstract class SingleSubscriber<T> implements Subscription {
    private final SubscriptionList a = new SubscriptionList();

    public abstract void onError(Throwable th);

    public abstract void onSuccess(T t);

    public final void add(Subscription subscription) {
        this.a.add(subscription);
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.a.unsubscribe();
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }
}
