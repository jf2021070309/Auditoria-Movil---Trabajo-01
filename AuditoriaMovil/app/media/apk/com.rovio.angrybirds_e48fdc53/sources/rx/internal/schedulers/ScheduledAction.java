package rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.internal.util.SubscriptionList;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;
/* loaded from: classes4.dex */
public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, Subscription {
    private static final long serialVersionUID = -3962399486978279857L;
    final SubscriptionList a;
    final Action0 b;

    public ScheduledAction(Action0 action0) {
        this.b = action0;
        this.a = new SubscriptionList();
    }

    public ScheduledAction(Action0 action0, CompositeSubscription compositeSubscription) {
        this.b = action0;
        this.a = new SubscriptionList(new b(this, compositeSubscription));
    }

    public ScheduledAction(Action0 action0, SubscriptionList subscriptionList) {
        this.b = action0;
        this.a = new SubscriptionList(new c(this, subscriptionList));
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.b.call();
                unsubscribe();
            } catch (OnErrorNotImplementedException e) {
                a(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
                unsubscribe();
            } catch (Throwable th) {
                a(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th));
                unsubscribe();
            }
        } catch (Throwable th2) {
            unsubscribe();
            throw th2;
        }
    }

    void a(Throwable th) {
        RxJavaHooks.onError(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        if (!this.a.isUnsubscribed()) {
            this.a.unsubscribe();
        }
    }

    public void add(Subscription subscription) {
        this.a.add(subscription);
    }

    public void add(Future<?> future) {
        this.a.add(new a(future));
    }

    public void addParent(CompositeSubscription compositeSubscription) {
        this.a.add(new b(this, compositeSubscription));
    }

    public void addParent(SubscriptionList subscriptionList) {
        this.a.add(new c(this, subscriptionList));
    }

    /* loaded from: classes4.dex */
    final class a implements Subscription {
        private final Future<?> b;

        a(Future<?> future) {
            this.b = future;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (ScheduledAction.this.get() != Thread.currentThread()) {
                this.b.cancel(true);
            } else {
                this.b.cancel(false);
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.b.isCancelled();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AtomicBoolean implements Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        final ScheduledAction a;
        final CompositeSubscription b;

        public b(ScheduledAction scheduledAction, CompositeSubscription compositeSubscription) {
            this.a = scheduledAction;
            this.b = compositeSubscription;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.b.remove(this.a);
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AtomicBoolean implements Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        final ScheduledAction a;
        final SubscriptionList b;

        public c(ScheduledAction scheduledAction, SubscriptionList subscriptionList) {
            this.a = scheduledAction;
            this.b = subscriptionList;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.b.remove(this.a);
            }
        }
    }
}
