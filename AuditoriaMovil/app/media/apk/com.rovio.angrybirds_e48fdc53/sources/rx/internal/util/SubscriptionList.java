package rx.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import rx.Subscription;
import rx.exceptions.Exceptions;
/* loaded from: classes4.dex */
public final class SubscriptionList implements Subscription {
    private List<Subscription> a;
    private volatile boolean b;

    public SubscriptionList() {
    }

    public SubscriptionList(Subscription... subscriptionArr) {
        this.a = new LinkedList(Arrays.asList(subscriptionArr));
    }

    public SubscriptionList(Subscription subscription) {
        this.a = new LinkedList();
        this.a.add(subscription);
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
                        List list = this.a;
                        if (list == null) {
                            list = new LinkedList();
                            this.a = list;
                        }
                        list.add(subscription);
                        return;
                    }
                }
            }
            subscription.unsubscribe();
        }
    }

    public void remove(Subscription subscription) {
        if (!this.b) {
            synchronized (this) {
                List<Subscription> list = this.a;
                if (!this.b && list != null) {
                    boolean remove = list.remove(subscription);
                    if (remove) {
                        subscription.unsubscribe();
                    }
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
                    List<Subscription> list = this.a;
                    this.a = null;
                    a(list);
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

    public void clear() {
        List<Subscription> list;
        if (!this.b) {
            synchronized (this) {
                list = this.a;
                this.a = null;
            }
            a(list);
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
