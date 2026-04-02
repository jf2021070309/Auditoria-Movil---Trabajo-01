package rx.observables;

import rx.Observable;
import rx.Subscriber;
/* loaded from: classes4.dex */
public class GroupedObservable<K, T> extends Observable<T> {
    private final K b;

    public static <K, T> GroupedObservable<K, T> from(K k, final Observable<T> observable) {
        return new GroupedObservable<>(k, new Observable.OnSubscribe<T>() { // from class: rx.observables.GroupedObservable.1
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(Subscriber<? super T> subscriber) {
                Observable.this.unsafeSubscribe(subscriber);
            }
        });
    }

    public static <K, T> GroupedObservable<K, T> create(K k, Observable.OnSubscribe<T> onSubscribe) {
        return new GroupedObservable<>(k, onSubscribe);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GroupedObservable(K k, Observable.OnSubscribe<T> onSubscribe) {
        super(onSubscribe);
        this.b = k;
    }

    public K getKey() {
        return this.b;
    }
}
