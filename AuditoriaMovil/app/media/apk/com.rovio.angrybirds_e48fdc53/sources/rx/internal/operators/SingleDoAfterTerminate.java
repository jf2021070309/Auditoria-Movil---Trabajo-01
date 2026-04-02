package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class SingleDoAfterTerminate<T> implements Single.OnSubscribe<T> {
    final Single<T> a;
    final Action0 b;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public SingleDoAfterTerminate(Single<T> single, Action0 action0) {
        this.a = single;
        this.b = action0;
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber, this.b);
        singleSubscriber.add(aVar);
        this.a.subscribe(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends SingleSubscriber<T> {
        final SingleSubscriber<? super T> a;
        final Action0 b;

        public a(SingleSubscriber<? super T> singleSubscriber, Action0 action0) {
            this.a = singleSubscriber;
            this.b = action0;
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            try {
                this.a.onSuccess(t);
            } finally {
                a();
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            try {
                this.a.onError(th);
            } finally {
                a();
            }
        }

        void a() {
            try {
                this.b.call();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaHooks.onError(th);
            }
        }
    }
}
