package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
/* loaded from: classes4.dex */
public final class SingleDoOnEvent<T> implements Single.OnSubscribe<T> {
    final Single<T> a;
    final Action1<? super T> b;
    final Action1<Throwable> c;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public SingleDoOnEvent(Single<T> single, Action1<? super T> action1, Action1<Throwable> action12) {
        this.a = single;
        this.b = action1;
        this.c = action12;
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber, this.b, this.c);
        singleSubscriber.add(aVar);
        this.a.subscribe(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends SingleSubscriber<T> {
        final SingleSubscriber<? super T> a;
        final Action1<? super T> b;
        final Action1<Throwable> c;

        a(SingleSubscriber<? super T> singleSubscriber, Action1<? super T> action1, Action1<Throwable> action12) {
            this.a = singleSubscriber;
            this.b = action1;
            this.c = action12;
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            try {
                this.b.call(t);
                this.a.onSuccess(t);
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this, t);
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            try {
                this.c.call(th);
                this.a.onError(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.a.onError(new CompositeException(th, th2));
            }
        }
    }
}
