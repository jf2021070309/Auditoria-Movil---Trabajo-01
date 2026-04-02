package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
/* loaded from: classes4.dex */
public final class OnSubscribeTakeLastOne<T> implements Observable.OnSubscribe<T> {
    final Observable<T> a;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeTakeLastOne(Observable<T> observable) {
        this.a = observable;
    }

    public void call(Subscriber<? super T> subscriber) {
        new a(subscriber).subscribeTo(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends DeferredScalarSubscriber<T, T> {
        static final Object b = new Object();

        /* JADX WARN: Type inference failed for: r0v0, types: [R, java.lang.Object] */
        public a(Subscriber<? super T> subscriber) {
            super(subscriber);
            this.value = b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rx.Observer
        public void onNext(T t) {
            this.value = t;
        }

        @Override // rx.internal.operators.DeferredScalarSubscriber, rx.Observer
        public void onCompleted() {
            Object obj = this.value;
            if (obj == b) {
                complete();
            } else {
                complete(obj);
            }
        }
    }
}
