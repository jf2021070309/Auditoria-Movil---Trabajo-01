package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Notification;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OperatorMaterialize<T> implements Observable.Operator<Notification<T>, T> {
    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        static final OperatorMaterialize<Object> a = new OperatorMaterialize<>();

        a() {
        }
    }

    public static <T> OperatorMaterialize<T> instance() {
        return (OperatorMaterialize<T>) a.a;
    }

    OperatorMaterialize() {
    }

    public Subscriber<? super T> call(Subscriber<? super Notification<T>> subscriber) {
        final b bVar = new b(subscriber);
        subscriber.add(bVar);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorMaterialize.1
            @Override // rx.Producer
            public void request(long j) {
                if (j > 0) {
                    bVar.a(j);
                }
            }
        });
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class b<T> extends Subscriber<T> {
        private final Subscriber<? super Notification<T>> a;
        private volatile Notification<T> b;
        private boolean c;
        private boolean d;
        private final AtomicLong e = new AtomicLong();

        b(Subscriber<? super Notification<T>> subscriber) {
            this.a = subscriber;
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(0L);
        }

        void a(long j) {
            BackpressureUtils.getAndAddRequest(this.e, j);
            request(j);
            b();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.b = Notification.createOnCompleted();
            b();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.b = Notification.createOnError(th);
            RxJavaHooks.onError(th);
            b();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.a.onNext(Notification.createOnNext(t));
            a();
        }

        private void a() {
            long j;
            AtomicLong atomicLong = this.e;
            do {
                j = atomicLong.get();
                if (j == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j - 1));
        }

        private void b() {
            synchronized (this) {
                if (this.c) {
                    this.d = true;
                    return;
                }
                AtomicLong atomicLong = this.e;
                while (!this.a.isUnsubscribed()) {
                    Notification<T> notification = this.b;
                    if (notification != null && atomicLong.get() > 0) {
                        this.b = null;
                        this.a.onNext(notification);
                        if (!this.a.isUnsubscribed()) {
                            this.a.onCompleted();
                            return;
                        }
                        return;
                    }
                    synchronized (this) {
                        if (!this.d) {
                            this.c = false;
                            return;
                        }
                    }
                }
            }
        }
    }
}
