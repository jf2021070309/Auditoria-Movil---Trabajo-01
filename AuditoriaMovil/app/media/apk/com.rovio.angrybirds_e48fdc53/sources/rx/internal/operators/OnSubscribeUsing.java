package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.observers.Subscribers;
/* loaded from: classes4.dex */
public final class OnSubscribeUsing<T, Resource> implements Observable.OnSubscribe<T> {
    private final Func0<Resource> a;
    private final Func1<? super Resource, ? extends Observable<? extends T>> b;
    private final Action1<? super Resource> c;
    private final boolean d;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeUsing(Func0<Resource> func0, Func1<? super Resource, ? extends Observable<? extends T>> func1, Action1<? super Resource> action1, boolean z) {
        this.a = func0;
        this.b = func1;
        this.c = action1;
        this.d = z;
    }

    public void call(Subscriber<? super T> subscriber) {
        Observable<? extends T> doAfterTerminate;
        try {
            Resource call = this.a.call();
            a aVar = new a(this.c, call);
            subscriber.add(aVar);
            Observable<? extends T> call2 = this.b.call(call);
            if (this.d) {
                doAfterTerminate = call2.doOnTerminate(aVar);
            } else {
                doAfterTerminate = call2.doAfterTerminate(aVar);
            }
            doAfterTerminate.unsafeSubscribe(Subscribers.wrap(subscriber));
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
        }
    }

    private Throwable a(Action0 action0) {
        try {
            action0.call();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<Resource> extends AtomicBoolean implements Subscription, Action0 {
        private static final long serialVersionUID = 4262875056400218316L;
        private Action1<? super Resource> a;
        private Resource b;

        a(Action1<? super Resource> action1, Resource resource) {
            this.a = action1;
            this.b = resource;
            lazySet(false);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Resource, rx.functions.Action1<? super Resource>] */
        @Override // rx.functions.Action0
        public void call() {
            ?? r2 = (Resource) false;
            if (compareAndSet(false, true)) {
                try {
                    this.a.call((Resource) this.b);
                } finally {
                    this.b = null;
                    this.a = null;
                }
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            call();
        }
    }
}
