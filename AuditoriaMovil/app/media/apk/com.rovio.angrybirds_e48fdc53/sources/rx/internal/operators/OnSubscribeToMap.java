package rx.internal.operators;

import java.util.HashMap;
import java.util.Map;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public final class OnSubscribeToMap<T, K, V> implements Observable.OnSubscribe<Map<K, V>>, Func0<Map<K, V>> {
    final Observable<T> a;
    final Func1<? super T, ? extends K> b;
    final Func1<? super T, ? extends V> c;
    final Func0<? extends Map<K, V>> d;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeToMap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
        this(observable, func1, func12, null);
    }

    public OnSubscribeToMap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func0<? extends Map<K, V>> func0) {
        this.a = observable;
        this.b = func1;
        this.c = func12;
        if (func0 == null) {
            this.d = this;
        } else {
            this.d = func0;
        }
    }

    @Override // rx.functions.Func0, java.util.concurrent.Callable
    public Map<K, V> call() {
        return new HashMap();
    }

    public void call(Subscriber<? super Map<K, V>> subscriber) {
        try {
            new a(subscriber, this.d.call(), this.b, this.c).subscribeTo(this.a);
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, K, V> extends DeferredScalarSubscriberSafe<T, Map<K, V>> {
        final Func1<? super T, ? extends K> b;
        final Func1<? super T, ? extends V> c;

        /* JADX WARN: Multi-variable type inference failed */
        a(Subscriber<? super Map<K, V>> subscriber, Map<K, V> map, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
            super(subscriber);
            this.value = map;
            this.hasValue = true;
            this.b = func1;
            this.c = func12;
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.done) {
                try {
                    ((Map) this.value).put(this.b.call(t), this.c.call(t));
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    unsubscribe();
                    onError(th);
                }
            }
        }
    }
}
