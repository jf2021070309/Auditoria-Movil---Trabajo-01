package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OnSubscribeAmb<T> implements Observable.OnSubscribe<T> {
    final Iterable<? extends Observable<? extends T>> a;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6, Observable<? extends T> observable7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6, Observable<? extends T> observable7, Observable<? extends T> observable8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        arrayList.add(observable8);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Observable<? extends T> observable, Observable<? extends T> observable2, Observable<? extends T> observable3, Observable<? extends T> observable4, Observable<? extends T> observable5, Observable<? extends T> observable6, Observable<? extends T> observable7, Observable<? extends T> observable8, Observable<? extends T> observable9) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable);
        arrayList.add(observable2);
        arrayList.add(observable3);
        arrayList.add(observable4);
        arrayList.add(observable5);
        arrayList.add(observable6);
        arrayList.add(observable7);
        arrayList.add(observable8);
        arrayList.add(observable9);
        return amb(arrayList);
    }

    public static <T> Observable.OnSubscribe<T> amb(Iterable<? extends Observable<? extends T>> iterable) {
        return new OnSubscribeAmb(iterable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> {
        private final Subscriber<? super T> a;
        private final b<T> b;
        private boolean c;

        a(long j, Subscriber<? super T> subscriber, b<T> bVar) {
            this.a = subscriber;
            this.b = bVar;
            request(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            request(j);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (a()) {
                this.a.onNext(t);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (a()) {
                this.a.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (a()) {
                this.a.onError(th);
            }
        }

        private boolean a() {
            if (this.c) {
                return true;
            }
            if (this.b.get() == this) {
                this.c = true;
                return true;
            } else if (this.b.compareAndSet(null, this)) {
                this.b.a(this);
                this.c = true;
                return true;
            } else {
                this.b.a();
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends AtomicReference<a<T>> {
        final Collection<a<T>> a = new ConcurrentLinkedQueue();

        b() {
        }

        public void a() {
            a<T> aVar = get();
            if (aVar != null) {
                a(aVar);
            }
        }

        public void a(a<T> aVar) {
            for (a<T> aVar2 : this.a) {
                if (aVar2 != aVar) {
                    aVar2.unsubscribe();
                }
            }
            this.a.clear();
        }
    }

    private OnSubscribeAmb(Iterable<? extends Observable<? extends T>> iterable) {
        this.a = iterable;
    }

    public void call(Subscriber<? super T> subscriber) {
        final b bVar = new b();
        subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OnSubscribeAmb.1
            @Override // rx.functions.Action0
            public void call() {
                a<T> aVar = bVar.get();
                if (aVar != null) {
                    aVar.unsubscribe();
                }
                OnSubscribeAmb.a(bVar.a);
            }
        }));
        for (Observable<? extends T> observable : this.a) {
            if (subscriber.isUnsubscribed()) {
                break;
            }
            a<T> aVar = new a<>(0L, subscriber, bVar);
            bVar.a.add(aVar);
            a<T> aVar2 = bVar.get();
            if (aVar2 != null) {
                bVar.a(aVar2);
                return;
            }
            observable.unsafeSubscribe(aVar);
        }
        if (subscriber.isUnsubscribed()) {
            a(bVar.a);
        }
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OnSubscribeAmb.2
            @Override // rx.Producer
            public void request(long j) {
                a<T> aVar3 = bVar.get();
                if (aVar3 != null) {
                    aVar3.a(j);
                    return;
                }
                for (a<T> aVar4 : bVar.a) {
                    if (!aVar4.isUnsubscribed()) {
                        if (bVar.get() == aVar4) {
                            aVar4.a(j);
                            return;
                        }
                        aVar4.a(j);
                    }
                }
            }
        });
    }

    static <T> void a(Collection<a<T>> collection) {
        if (!collection.isEmpty()) {
            for (a<T> aVar : collection) {
                aVar.unsubscribe();
            }
            collection.clear();
        }
    }
}
