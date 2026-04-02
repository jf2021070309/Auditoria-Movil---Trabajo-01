package rx.observers;

import java.util.concurrent.atomic.AtomicReference;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public abstract class AsyncCompletableSubscriber implements CompletableSubscriber, Subscription {
    static final a a = new a();
    private final AtomicReference<Subscription> b = new AtomicReference<>();

    @Override // rx.CompletableSubscriber
    public final void onSubscribe(Subscription subscription) {
        if (!this.b.compareAndSet(null, subscription)) {
            subscription.unsubscribe();
            if (this.b.get() != a) {
                RxJavaHooks.onError(new IllegalStateException("Subscription already set!"));
                return;
            }
            return;
        }
        onStart();
    }

    protected void onStart() {
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.b.get() == a;
    }

    protected final void clear() {
        this.b.set(a);
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        Subscription andSet;
        if (this.b.get() != a && (andSet = this.b.getAndSet(a)) != null && andSet != a) {
            andSet.unsubscribe();
        }
    }

    /* loaded from: classes4.dex */
    static final class a implements Subscription {
        a() {
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
