package rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.internal.producers.SingleProducer;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OnSubscribeToObservableFuture {
    private OnSubscribeToObservableFuture() {
        throw new IllegalStateException("No instances!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a<T> implements Observable.OnSubscribe<T> {
        final Future<? extends T> a;
        private final long b;
        private final TimeUnit c;

        public a(Future<? extends T> future) {
            this.a = future;
            this.b = 0L;
            this.c = null;
        }

        public a(Future<? extends T> future, long j, TimeUnit timeUnit) {
            this.a = future;
            this.b = j;
            this.c = timeUnit;
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber<? super T> subscriber) {
            subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OnSubscribeToObservableFuture.a.1
                @Override // rx.functions.Action0
                public void call() {
                    a.this.a.cancel(true);
                }
            }));
            try {
                if (!subscriber.isUnsubscribed()) {
                    subscriber.setProducer(new SingleProducer(subscriber, this.c == null ? this.a.get() : this.a.get(this.b, this.c)));
                }
            } catch (Throwable th) {
                if (!subscriber.isUnsubscribed()) {
                    Exceptions.throwOrReport(th, subscriber);
                }
            }
        }
    }

    public static <T> Observable.OnSubscribe<T> toObservableFuture(Future<? extends T> future) {
        return new a(future);
    }

    public static <T> Observable.OnSubscribe<T> toObservableFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return new a(future, j, timeUnit);
    }
}
