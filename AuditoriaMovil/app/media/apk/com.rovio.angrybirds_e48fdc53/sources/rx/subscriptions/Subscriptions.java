package rx.subscriptions;

import java.util.concurrent.Future;
import rx.Subscription;
import rx.functions.Action0;
/* loaded from: classes4.dex */
public final class Subscriptions {
    private static final b a = new b();

    private Subscriptions() {
        throw new IllegalStateException("No instances!");
    }

    public static Subscription empty() {
        return BooleanSubscription.create();
    }

    public static Subscription unsubscribed() {
        return a;
    }

    public static Subscription create(Action0 action0) {
        return BooleanSubscription.create(action0);
    }

    public static Subscription from(Future<?> future) {
        return new a(future);
    }

    /* loaded from: classes4.dex */
    static final class a implements Subscription {
        final Future<?> a;

        public a(Future<?> future) {
            this.a = future;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.a.cancel(true);
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isCancelled();
        }
    }

    public static CompositeSubscription from(Subscription... subscriptionArr) {
        return new CompositeSubscription(subscriptionArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b implements Subscription {
        b() {
        }

        @Override // rx.Subscription
        public void unsubscribe() {
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return true;
        }
    }
}
