package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OnSubscribeDetach<T> implements Observable.OnSubscribe<T> {
    final Observable<T> a;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeDetach(Observable<T> observable) {
        this.a = observable;
    }

    public void call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber);
        a aVar = new a(bVar);
        subscriber.add(aVar);
        subscriber.setProducer(aVar);
        this.a.unsafeSubscribe(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends Subscriber<T> {
        final AtomicReference<Subscriber<? super T>> a;
        final AtomicReference<Producer> b = new AtomicReference<>();
        final AtomicLong c = new AtomicLong();

        public b(Subscriber<? super T> subscriber) {
            this.a = new AtomicReference<>(subscriber);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            Subscriber<? super T> subscriber = this.a.get();
            if (subscriber != null) {
                subscriber.onNext(t);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.b.lazySet(c.INSTANCE);
            Subscriber<? super T> andSet = this.a.getAndSet(null);
            if (andSet != null) {
                andSet.onError(th);
            } else {
                RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.b.lazySet(c.INSTANCE);
            Subscriber<? super T> andSet = this.a.getAndSet(null);
            if (andSet != null) {
                andSet.onCompleted();
            }
        }

        void a(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            Producer producer = this.b.get();
            if (producer != null) {
                producer.request(j);
                return;
            }
            BackpressureUtils.getAndAddRequest(this.c, j);
            Producer producer2 = this.b.get();
            if (producer2 != null && producer2 != c.INSTANCE) {
                producer2.request(this.c.getAndSet(0L));
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            if (this.b.compareAndSet(null, producer)) {
                producer.request(this.c.getAndSet(0L));
            } else if (this.b.get() != c.INSTANCE) {
                throw new IllegalStateException("Producer already set!");
            }
        }

        void a() {
            this.b.lazySet(c.INSTANCE);
            this.a.lazySet(null);
            unsubscribe();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Producer, Subscription {
        final b<T> a;

        public a(b<T> bVar) {
            this.a = bVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.a(j);
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum c implements Producer {
        INSTANCE;

        @Override // rx.Producer
        public void request(long j) {
        }
    }
}
