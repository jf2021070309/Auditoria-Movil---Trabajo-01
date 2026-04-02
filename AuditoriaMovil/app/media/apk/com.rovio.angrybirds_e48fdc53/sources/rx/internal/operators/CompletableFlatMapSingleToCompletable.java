package rx.internal.operators;

import rx.Completable;
import rx.CompletableSubscriber;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public final class CompletableFlatMapSingleToCompletable<T> implements Completable.OnSubscribe {
    final Single<T> a;
    final Func1<? super T, ? extends Completable> b;

    public CompletableFlatMapSingleToCompletable(Single<T> single, Func1<? super T, ? extends Completable> func1) {
        this.a = single;
        this.b = func1;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        a aVar = new a(completableSubscriber, this.b);
        completableSubscriber.onSubscribe(aVar);
        this.a.subscribe(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends SingleSubscriber<T> implements CompletableSubscriber {
        final CompletableSubscriber a;
        final Func1<? super T, ? extends Completable> b;

        public a(CompletableSubscriber completableSubscriber, Func1<? super T, ? extends Completable> func1) {
            this.a = completableSubscriber;
            this.b = func1;
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            try {
                Completable call = this.b.call(t);
                if (call == null) {
                    onError(new NullPointerException("The mapper returned a null Completable"));
                } else {
                    call.subscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            this.a.onCompleted();
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            add(subscription);
        }
    }
}
