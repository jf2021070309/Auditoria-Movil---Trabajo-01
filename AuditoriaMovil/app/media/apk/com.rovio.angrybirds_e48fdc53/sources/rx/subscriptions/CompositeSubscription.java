package rx.subscriptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import rx.Subscription;
import rx.exceptions.Exceptions;
/* loaded from: classes4.dex */
public final class CompositeSubscription implements Subscription {
    private Set<Subscription> a;
    private volatile boolean b;

    public CompositeSubscription() {
    }

    public CompositeSubscription(Subscription... subscriptionArr) {
        this.a = new HashSet(Arrays.asList(subscriptionArr));
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.b;
    }

    public void add(Subscription subscription) {
        if (!subscription.isUnsubscribed()) {
            if (!this.b) {
                synchronized (this) {
                    if (!this.b) {
                        if (this.a == null) {
                            this.a = new HashSet(4);
                        }
                        this.a.add(subscription);
                        return;
                    }
                }
            }
            subscription.unsubscribe();
        }
    }

    public void addAll(Subscription... subscriptionArr) {
        int i = 0;
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    if (this.a == null) {
                        this.a = new HashSet(subscriptionArr.length);
                    }
                    int length = subscriptionArr.length;
                    while (i < length) {
                        Subscription subscription = subscriptionArr[i];
                        if (!subscription.isUnsubscribed()) {
                            this.a.add(subscription);
                        }
                        i++;
                    }
                    return;
                }
            }
        }
        int length2 = subscriptionArr.length;
        while (i < length2) {
            subscriptionArr[i].unsubscribe();
            i++;
        }
    }

    public void remove(Subscription subscription) {
        if (!this.b) {
            synchronized (this) {
                if (!this.b && this.a != null) {
                    boolean remove = this.a.remove(subscription);
                    if (remove) {
                        subscription.unsubscribe();
                    }
                }
            }
        }
    }

    public void clear() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b && this.a != null) {
                    Set<Subscription> set = this.a;
                    this.a = null;
                    a(set);
                }
            }
        }
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.b = true;
                    Set<Subscription> set = this.a;
                    this.a = null;
                    a(set);
                }
            }
        }
    }

    private static void a(Collection<Subscription> collection) {
        if (collection != null) {
            ArrayList arrayList = null;
            for (Subscription subscription : collection) {
                try {
                    subscription.unsubscribe();
                } catch (Throwable th) {
                    ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                    arrayList2.add(th);
                    arrayList = arrayList2;
                }
            }
            Exceptions.throwIfAny(arrayList);
        }
    }

    public boolean hasSubscriptions() {
        boolean z = false;
        if (!this.b) {
            synchronized (this) {
                if (!this.b && this.a != null && !this.a.isEmpty()) {
                    z = true;
                }
            }
        }
        return z;
    }
}
