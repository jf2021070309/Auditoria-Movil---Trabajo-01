package rx.subscriptions;

import rx.Subscription;
import rx.internal.subscriptions.SequentialSubscription;
/* loaded from: classes4.dex */
public final class MultipleAssignmentSubscription implements Subscription {
    final SequentialSubscription a = new SequentialSubscription();

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.a.unsubscribe();
    }

    public void set(Subscription subscription) {
        if (subscription == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.a.replace(subscription);
    }

    public Subscription get() {
        return this.a.current();
    }
}
