package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
/* loaded from: classes4.dex */
public final class OnSubscribeFromArray<T> implements Observable.OnSubscribe<T> {
    final T[] a;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeFromArray(T[] tArr) {
        this.a = tArr;
    }

    public void call(Subscriber<? super T> subscriber) {
        subscriber.setProducer(new a(subscriber, this.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = 3534218984725836979L;
        final Subscriber<? super T> a;
        final T[] b;
        int c;

        public a(Subscriber<? super T> subscriber, T[] tArr) {
            this.a = subscriber;
            this.b = tArr;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j == Long.MAX_VALUE) {
                if (BackpressureUtils.getAndAddRequest(this, j) == 0) {
                    a();
                }
            } else if (j != 0 && BackpressureUtils.getAndAddRequest(this, j) == 0) {
                a(j);
            }
        }

        void a() {
            Subscriber<? super T> subscriber = this.a;
            for (T t : this.b) {
                Object obj = (Object) t;
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onNext(obj);
                } else {
                    return;
                }
            }
            if (!subscriber.isUnsubscribed()) {
                subscriber.onCompleted();
            }
        }

        void a(long j) {
            Subscriber<? super T> subscriber = this.a;
            T[] tArr = this.b;
            int length = tArr.length;
            int i = this.c;
            long j2 = 0;
            while (true) {
                if (j != 0 && i != length) {
                    if (!subscriber.isUnsubscribed()) {
                        subscriber.onNext((Object) tArr[i]);
                        i++;
                        if (i == length) {
                            if (!subscriber.isUnsubscribed()) {
                                subscriber.onCompleted();
                                return;
                            }
                            return;
                        }
                        j--;
                        j2--;
                    } else {
                        return;
                    }
                } else {
                    j = get() + j2;
                    if (j == 0) {
                        this.c = i;
                        j = addAndGet(j2);
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
    }
}
