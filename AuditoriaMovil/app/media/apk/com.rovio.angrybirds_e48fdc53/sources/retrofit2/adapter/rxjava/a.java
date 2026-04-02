package retrofit2.adapter.rxjava;

import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.plugins.RxJavaPlugins;
/* loaded from: classes4.dex */
final class a<T> implements Observable.OnSubscribe<T> {
    private final Observable.OnSubscribe<Response<T>> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Observable.OnSubscribe<Response<T>> onSubscribe) {
        this.a = onSubscribe;
    }

    @Override // rx.functions.Action1
    /* renamed from: a */
    public void call(Subscriber<? super T> subscriber) {
        this.a.call(new C0346a(subscriber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: retrofit2.adapter.rxjava.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0346a<R> extends Subscriber<Response<R>> {
        private final Subscriber<? super R> a;
        private boolean b;

        C0346a(Subscriber<? super R> subscriber) {
            super(subscriber);
            this.a = subscriber;
        }

        @Override // rx.Observer
        /* renamed from: a */
        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.a.onNext(response.body());
                return;
            }
            this.b = true;
            HttpException httpException = new HttpException(response);
            try {
                this.a.onError(httpException);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.getInstance().getErrorHandler().handleError(new CompositeException(httpException, th));
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (!this.b) {
                this.a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a Retrofit bug with the full stacktrace.");
            assertionError.initCause(th);
            RxJavaPlugins.getInstance().getErrorHandler().handleError(assertionError);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.b) {
                this.a.onCompleted();
            }
        }
    }
}
