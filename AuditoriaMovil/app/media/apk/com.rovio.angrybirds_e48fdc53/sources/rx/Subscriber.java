package rx;

import rx.internal.util.SubscriptionList;
/* loaded from: classes4.dex */
public abstract class Subscriber<T> implements Observer<T>, Subscription {
    private final SubscriptionList a;
    private final Subscriber<?> b;
    private Producer c;
    private long d;

    /* JADX INFO: Access modifiers changed from: protected */
    public Subscriber() {
        this(null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Subscriber(Subscriber<?> subscriber) {
        this(subscriber, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Subscriber(Subscriber<?> subscriber, boolean z) {
        this.d = Long.MIN_VALUE;
        this.b = subscriber;
        this.a = (!z || subscriber == null) ? new SubscriptionList() : subscriber.a;
    }

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

    public void onStart() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j);
        }
        synchronized (this) {
            if (this.c != null) {
                this.c.request(j);
                return;
            }
            a(j);
        }
    }

    private void a(long j) {
        if (this.d == Long.MIN_VALUE) {
            this.d = j;
            return;
        }
        long j2 = this.d + j;
        if (j2 < 0) {
            this.d = Long.MAX_VALUE;
        } else {
            this.d = j2;
        }
    }

    public void setProducer(Producer producer) {
        long j;
        boolean z = false;
        synchronized (this) {
            j = this.d;
            this.c = producer;
            if (this.b != null && j == Long.MIN_VALUE) {
                z = true;
            }
        }
        if (z) {
            this.b.setProducer(this.c);
        } else if (j == Long.MIN_VALUE) {
            this.c.request(Long.MAX_VALUE);
        } else {
            this.c.request(j);
        }
    }
}
