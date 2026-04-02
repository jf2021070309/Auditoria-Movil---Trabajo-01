package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.observables.ConnectableObservable;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OnSubscribeRefCount<T> implements Observable.OnSubscribe<T> {
    volatile CompositeSubscription a = new CompositeSubscription();
    final AtomicInteger b = new AtomicInteger(0);
    final ReentrantLock c = new ReentrantLock();
    private final ConnectableObservable<? extends T> d;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeRefCount(ConnectableObservable<? extends T> connectableObservable) {
        this.d = connectableObservable;
    }

    public void call(Subscriber<? super T> subscriber) {
        boolean z;
        this.c.lock();
        if (this.b.incrementAndGet() == 1) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.d.connect(a(subscriber, atomicBoolean));
                if (z) {
                    return;
                }
                return;
            } finally {
                if (atomicBoolean.get()) {
                }
            }
        }
        try {
            a(subscriber, this.a);
        } finally {
            this.c.unlock();
        }
    }

    private Action1<Subscription> a(final Subscriber<? super T> subscriber, final AtomicBoolean atomicBoolean) {
        return new Action1<Subscription>() { // from class: rx.internal.operators.OnSubscribeRefCount.1
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(Subscription subscription) {
                try {
                    OnSubscribeRefCount.this.a.add(subscription);
                    OnSubscribeRefCount.this.a(subscriber, OnSubscribeRefCount.this.a);
                } finally {
                    OnSubscribeRefCount.this.c.unlock();
                    atomicBoolean.set(false);
                }
            }
        };
    }

    void a(final Subscriber<? super T> subscriber, final CompositeSubscription compositeSubscription) {
        subscriber.add(a(compositeSubscription));
        this.d.unsafeSubscribe(new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OnSubscribeRefCount.2
            @Override // rx.Observer
            public void onError(Throwable th) {
                a();
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                subscriber.onNext(t);
            }

            @Override // rx.Observer
            public void onCompleted() {
                a();
                subscriber.onCompleted();
            }

            void a() {
                OnSubscribeRefCount.this.c.lock();
                try {
                    if (OnSubscribeRefCount.this.a == compositeSubscription) {
                        OnSubscribeRefCount.this.a.unsubscribe();
                        OnSubscribeRefCount.this.a = new CompositeSubscription();
                        OnSubscribeRefCount.this.b.set(0);
                    }
                } finally {
                    OnSubscribeRefCount.this.c.unlock();
                }
            }
        });
    }

    private Subscription a(final CompositeSubscription compositeSubscription) {
        return Subscriptions.create(new Action0() { // from class: rx.internal.operators.OnSubscribeRefCount.3
            @Override // rx.functions.Action0
            public void call() {
                OnSubscribeRefCount.this.c.lock();
                try {
                    if (OnSubscribeRefCount.this.a == compositeSubscription && OnSubscribeRefCount.this.b.decrementAndGet() == 0) {
                        OnSubscribeRefCount.this.a.unsubscribe();
                        OnSubscribeRefCount.this.a = new CompositeSubscription();
                    }
                } finally {
                    OnSubscribeRefCount.this.c.unlock();
                }
            }
        });
    }
}
