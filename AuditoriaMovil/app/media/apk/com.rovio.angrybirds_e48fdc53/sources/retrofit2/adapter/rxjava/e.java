package retrofit2.adapter.rxjava;

import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.plugins.RxJavaPlugins;
/* loaded from: classes4.dex */
final class e<T> implements Observable.OnSubscribe<Result<T>> {
    private final Observable.OnSubscribe<Response<T>> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Observable.OnSubscribe<Response<T>> onSubscribe) {
        this.a = onSubscribe;
    }

    @Override // rx.functions.Action1
    /* renamed from: a */
    public void call(Subscriber<? super Result<T>> subscriber) {
        this.a.call(new a(subscriber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a<R> extends Subscriber<Response<R>> {
        private final Subscriber<? super Result<R>> a;

        a(Subscriber<? super Result<R>> subscriber) {
            super(subscriber);
            this.a = subscriber;
        }

        @Override // rx.Observer
        /* renamed from: a */
        public void onNext(Response<R> response) {
            this.a.onNext(Result.response(response));
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            try {
                this.a.onNext(Result.error(th));
                this.a.onCompleted();
            } catch (Throwable th2) {
                try {
                    this.a.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.getInstance().getErrorHandler().handleError(new CompositeException(th2, th3));
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.onCompleted();
        }
    }
}
