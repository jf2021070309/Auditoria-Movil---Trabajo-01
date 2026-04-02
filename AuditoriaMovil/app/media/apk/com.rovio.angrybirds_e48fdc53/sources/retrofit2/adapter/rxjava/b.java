package retrofit2.adapter.rxjava;

import java.util.concurrent.atomic.AtomicInteger;
import retrofit2.Call;
import retrofit2.Response;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.plugins.RxJavaPlugins;
/* loaded from: classes4.dex */
final class b<T> extends AtomicInteger implements Producer, Subscription {
    private final Call<T> a;
    private final Subscriber<? super Response<T>> b;
    private volatile Response<T> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Call<T> call, Subscriber<? super Response<T>> subscriber) {
        super(0);
        this.a = call;
        this.b = subscriber;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.a.cancel();
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.a.isCanceled();
    }

    @Override // rx.Producer
    public void request(long j) {
        if (j == 0) {
            return;
        }
        while (true) {
            int i = get();
            switch (i) {
                case 0:
                    if (!compareAndSet(0, 1)) {
                        break;
                    } else {
                        return;
                    }
                case 1:
                case 3:
                    return;
                case 2:
                    if (!compareAndSet(2, 3)) {
                        break;
                    } else {
                        b(this.c);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Response<T> response) {
        while (true) {
            int i = get();
            switch (i) {
                case 0:
                    this.c = response;
                    if (!compareAndSet(0, 2)) {
                        break;
                    } else {
                        return;
                    }
                case 1:
                    if (!compareAndSet(1, 3)) {
                        break;
                    } else {
                        b(response);
                        return;
                    }
                case 2:
                case 3:
                    throw new AssertionError();
                default:
                    throw new IllegalStateException("Unknown state: " + i);
            }
        }
    }

    private void b(Response<T> response) {
        try {
            if (!isUnsubscribed()) {
                this.b.onNext(response);
            }
            try {
                this.b.onCompleted();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.getInstance().getErrorHandler().handleError(th);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            try {
                this.b.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.getInstance().getErrorHandler().handleError(new CompositeException(th2, th3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Throwable th) {
        set(3);
        if (!isUnsubscribed()) {
            try {
                this.b.onError(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.getInstance().getErrorHandler().handleError(new CompositeException(th, th2));
            }
        }
    }
}
