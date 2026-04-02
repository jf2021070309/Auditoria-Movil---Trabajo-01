package rx.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.functions.Action0;
/* loaded from: classes4.dex */
public final class BooleanSubscription implements Subscription {
    static final Action0 b = new Action0() { // from class: rx.subscriptions.BooleanSubscription.1
        @Override // rx.functions.Action0
        public void call() {
        }
    };
    final AtomicReference<Action0> a;

    public BooleanSubscription() {
        this.a = new AtomicReference<>();
    }

    private BooleanSubscription(Action0 action0) {
        this.a = new AtomicReference<>(action0);
    }

    public static BooleanSubscription create() {
        return new BooleanSubscription();
    }

    public static BooleanSubscription create(Action0 action0) {
        return new BooleanSubscription(action0);
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.a.get() == b;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        Action0 andSet;
        if (this.a.get() != b && (andSet = this.a.getAndSet(b)) != null && andSet != b) {
            andSet.call();
        }
    }
}
