package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class SingleOnSubscribeMap<T, R> implements Single.OnSubscribe<R> {
    final Single<T> a;
    final Func1<? super T, ? extends R> b;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public SingleOnSubscribeMap(Single<T> single, Func1<? super T, ? extends R> func1) {
        this.a = single;
        this.b = func1;
    }

    public void call(SingleSubscriber<? super R> singleSubscriber) {
        a aVar = new a(singleSubscriber, this.b);
        singleSubscriber.add(aVar);
        this.a.subscribe(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, R> extends SingleSubscriber<T> {
        final SingleSubscriber<? super R> a;
        final Func1<? super T, ? extends R> b;
        boolean c;

        public a(SingleSubscriber<? super R> singleSubscriber, Func1<? super T, ? extends R> func1) {
            this.a = singleSubscriber;
            this.b = func1;
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            try {
                this.a.onSuccess(this.b.call(t));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            if (this.c) {
                RxJavaHooks.onError(th);
                return;
            }
            this.c = true;
            this.a.onError(th);
        }
    }
}
