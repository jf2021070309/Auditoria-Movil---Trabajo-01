package rx.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
/* loaded from: classes4.dex */
public final class RefCountSubscription implements Subscription {
    static final b a = new b(false, 0);
    final AtomicReference<b> b = new AtomicReference<>(a);
    private final Subscription c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {
        final boolean a;
        final int b;

        b(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        b a() {
            return new b(this.a, this.b + 1);
        }

        b b() {
            return new b(this.a, this.b - 1);
        }

        b c() {
            return new b(true, this.b);
        }
    }

    public RefCountSubscription(Subscription subscription) {
        if (subscription == null) {
            throw new IllegalArgumentException("s");
        }
        this.c = subscription;
    }

    public Subscription get() {
        b bVar;
        AtomicReference<b> atomicReference = this.b;
        do {
            bVar = atomicReference.get();
            if (bVar.a) {
                return Subscriptions.unsubscribed();
            }
        } while (!atomicReference.compareAndSet(bVar, bVar.a()));
        return new a(this);
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.b.get().a;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        b bVar;
        b c;
        AtomicReference<b> atomicReference = this.b;
        do {
            bVar = atomicReference.get();
            if (!bVar.a) {
                c = bVar.c();
            } else {
                return;
            }
        } while (!atomicReference.compareAndSet(bVar, c));
        a(c);
    }

    private void a(b bVar) {
        if (bVar.a && bVar.b == 0) {
            this.c.unsubscribe();
        }
    }

    void a() {
        b bVar;
        b b2;
        AtomicReference<b> atomicReference = this.b;
        do {
            bVar = atomicReference.get();
            b2 = bVar.b();
        } while (!atomicReference.compareAndSet(bVar, b2));
        a(b2);
    }

    /* loaded from: classes4.dex */
    static final class a extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 7005765588239987643L;
        final RefCountSubscription a;

        public a(RefCountSubscription refCountSubscription) {
            this.a = refCountSubscription;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(0, 1)) {
                this.a.a();
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() != 0;
        }
    }
}
