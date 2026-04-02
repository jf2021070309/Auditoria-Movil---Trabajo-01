package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
/* loaded from: classes4.dex */
public final class OnSubscribeFromIterable<T> implements Observable.OnSubscribe<T> {
    final Iterable<? extends T> a;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeFromIterable(Iterable<? extends T> iterable) {
        if (iterable == null) {
            throw new NullPointerException("iterable must not be null");
        }
        this.a = iterable;
    }

    public void call(Subscriber<? super T> subscriber) {
        try {
            Iterator<? extends T> it = this.a.iterator();
            boolean hasNext = it.hasNext();
            if (!subscriber.isUnsubscribed()) {
                if (!hasNext) {
                    subscriber.onCompleted();
                } else {
                    subscriber.setProducer(new a(subscriber, it));
                }
            }
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -8730475647105475802L;
        private final Subscriber<? super T> a;
        private final Iterator<? extends T> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Subscriber<? super T> subscriber, Iterator<? extends T> it) {
            this.a = subscriber;
            this.b = it;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (get() != Long.MAX_VALUE) {
                if (j == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                    a();
                } else if (j > 0 && BackpressureUtils.getAndAddRequest(this, j) == 0) {
                    a(j);
                }
            }
        }

        void a(long j) {
            Subscriber<? super T> subscriber = this.a;
            Iterator<? extends T> it = this.b;
            long j2 = 0;
            while (true) {
                if (j2 != j) {
                    if (!subscriber.isUnsubscribed()) {
                        try {
                            subscriber.onNext((T) it.next());
                            if (!subscriber.isUnsubscribed()) {
                                try {
                                    if (!it.hasNext()) {
                                        if (!subscriber.isUnsubscribed()) {
                                            subscriber.onCompleted();
                                            return;
                                        }
                                        return;
                                    }
                                    j2++;
                                } catch (Throwable th) {
                                    Exceptions.throwOrReport(th, subscriber);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwOrReport(th2, subscriber);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    j = get();
                    if (j2 == j) {
                        j = BackpressureUtils.produced(this, j2);
                        if (j == 0) {
                            return;
                        }
                        j2 = 0;
                    } else {
                        continue;
                    }
                }
            }
        }

        void a() {
            Subscriber<? super T> subscriber = this.a;
            Iterator<? extends T> it = this.b;
            while (!subscriber.isUnsubscribed()) {
                try {
                    subscriber.onNext((T) it.next());
                    if (!subscriber.isUnsubscribed()) {
                        try {
                            if (!it.hasNext()) {
                                if (!subscriber.isUnsubscribed()) {
                                    subscriber.onCompleted();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwOrReport(th, subscriber);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, subscriber);
                    return;
                }
            }
        }
    }
}
