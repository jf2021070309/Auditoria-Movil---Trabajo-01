package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public final class OnSubscribeToMultimap<T, K, V> implements Observable.OnSubscribe<Map<K, Collection<V>>>, Func0<Map<K, Collection<V>>> {
    private final Func1<? super T, ? extends K> a;
    private final Func1<? super T, ? extends V> b;
    private final Func0<? extends Map<K, Collection<V>>> c;
    private final Func1<? super K, ? extends Collection<V>> d;
    private final Observable<T> e;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeToMultimap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
        this(observable, func1, func12, null, a.a());
    }

    public OnSubscribeToMultimap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func0<? extends Map<K, Collection<V>>> func0) {
        this(observable, func1, func12, func0, a.a());
    }

    public OnSubscribeToMultimap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func0<? extends Map<K, Collection<V>>> func0, Func1<? super K, ? extends Collection<V>> func13) {
        this.e = observable;
        this.a = func1;
        this.b = func12;
        if (func0 == null) {
            this.c = this;
        } else {
            this.c = func0;
        }
        this.d = func13;
    }

    @Override // rx.functions.Func0, java.util.concurrent.Callable
    public Map<K, Collection<V>> call() {
        return new HashMap();
    }

    public void call(Subscriber<? super Map<K, Collection<V>>> subscriber) {
        try {
            new b(subscriber, this.c.call(), this.a, this.b, this.d).subscribeTo(this.e);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b<T, K, V> extends DeferredScalarSubscriberSafe<T, Map<K, Collection<V>>> {
        private final Func1<? super T, ? extends K> b;
        private final Func1<? super T, ? extends V> c;
        private final Func1<? super K, ? extends Collection<V>> d;

        /* JADX WARN: Multi-variable type inference failed */
        b(Subscriber<? super Map<K, Collection<V>>> subscriber, Map<K, Collection<V>> map, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func1<? super K, ? extends Collection<V>> func13) {
            super(subscriber);
            this.value = map;
            this.hasValue = true;
            this.b = func1;
            this.c = func12;
            this.d = func13;
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.done) {
                try {
                    K call = this.b.call(t);
                    V call2 = this.c.call(t);
                    Collection<V> collection = (Collection) ((Map) this.value).get(call);
                    if (collection == null) {
                        collection = this.d.call(call);
                        ((Map) this.value).put(call, collection);
                    }
                    collection.add(call2);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    unsubscribe();
                    onError(th);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class a<K, V> implements Func1<K, Collection<V>> {
        private static final a<Object, Object> a = new a<>();

        private a() {
        }

        static <K, V> a<K, V> a() {
            return (a<K, V>) a;
        }

        @Override // rx.functions.Func1
        /* renamed from: a */
        public Collection<V> call(K k) {
            return new ArrayList();
        }
    }
}
