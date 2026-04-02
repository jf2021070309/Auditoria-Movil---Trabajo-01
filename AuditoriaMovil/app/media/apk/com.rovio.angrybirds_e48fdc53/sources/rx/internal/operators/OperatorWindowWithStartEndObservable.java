package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func1;
import rx.observers.SerializedObserver;
import rx.observers.SerializedSubscriber;
import rx.subjects.UnicastSubject;
import rx.subscriptions.CompositeSubscription;
/* loaded from: classes4.dex */
public final class OperatorWindowWithStartEndObservable<T, U, V> implements Observable.Operator<Observable<T>, T> {
    final Observable<? extends U> a;
    final Func1<? super U, ? extends Observable<? extends V>> b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorWindowWithStartEndObservable(Observable<? extends U> observable, Func1<? super U, ? extends Observable<? extends V>> func1) {
        this.a = observable;
        this.b = func1;
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        subscriber.add(compositeSubscription);
        final b bVar = new b(subscriber, compositeSubscription);
        Subscriber<U> subscriber2 = new Subscriber<U>() { // from class: rx.internal.operators.OperatorWindowWithStartEndObservable.1
            @Override // rx.Subscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }

            @Override // rx.Observer
            public void onNext(U u) {
                bVar.a((b) u);
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                bVar.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                bVar.onCompleted();
            }
        };
        compositeSubscription.add(bVar);
        compositeSubscription.add(subscriber2);
        this.a.unsafeSubscribe(subscriber2);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> {
        final Observer<T> a;
        final Observable<T> b;

        public a(Observer<T> observer, Observable<T> observable) {
            this.a = new SerializedObserver(observer);
            this.b = observable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class b extends Subscriber<T> {
        final Subscriber<? super Observable<T>> a;
        final CompositeSubscription b;
        final Object c = new Object();
        final List<a<T>> d = new LinkedList();
        boolean e;

        public b(Subscriber<? super Observable<T>> subscriber, CompositeSubscription compositeSubscription) {
            this.a = new SerializedSubscriber(subscriber);
            this.b = compositeSubscription;
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            synchronized (this.c) {
                if (!this.e) {
                    for (a aVar : new ArrayList(this.d)) {
                        aVar.a.onNext(t);
                    }
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            try {
                synchronized (this.c) {
                    if (!this.e) {
                        this.e = true;
                        ArrayList<a> arrayList = new ArrayList(this.d);
                        this.d.clear();
                        for (a aVar : arrayList) {
                            aVar.a.onError(th);
                        }
                        this.a.onError(th);
                    }
                }
            } finally {
                this.b.unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                synchronized (this.c) {
                    if (!this.e) {
                        this.e = true;
                        ArrayList<a> arrayList = new ArrayList(this.d);
                        this.d.clear();
                        for (a aVar : arrayList) {
                            aVar.a.onCompleted();
                        }
                        this.a.onCompleted();
                    }
                }
            } finally {
                this.b.unsubscribe();
            }
        }

        void a(U u) {
            final a<T> a = a();
            synchronized (this.c) {
                if (!this.e) {
                    this.d.add(a);
                    this.a.onNext(a.b);
                    try {
                        Observable<? extends V> call = OperatorWindowWithStartEndObservable.this.b.call(u);
                        Subscriber<V> subscriber = new Subscriber<V>() { // from class: rx.internal.operators.OperatorWindowWithStartEndObservable.b.1
                            boolean a = true;

                            @Override // rx.Observer
                            public void onNext(V v) {
                                onCompleted();
                            }

                            @Override // rx.Observer
                            public void onError(Throwable th) {
                                b.this.onError(th);
                            }

                            @Override // rx.Observer
                            public void onCompleted() {
                                if (this.a) {
                                    this.a = false;
                                    b.this.a((a) a);
                                    b.this.b.remove(this);
                                }
                            }
                        };
                        this.b.add(subscriber);
                        call.unsafeSubscribe(subscriber);
                    } catch (Throwable th) {
                        onError(th);
                    }
                }
            }
        }

        void a(a<T> aVar) {
            boolean z;
            synchronized (this.c) {
                if (!this.e) {
                    Iterator<a<T>> it = this.d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() == aVar) {
                            z = true;
                            it.remove();
                            break;
                        }
                    }
                    if (z) {
                        aVar.a.onCompleted();
                    }
                }
            }
        }

        a<T> a() {
            UnicastSubject create = UnicastSubject.create();
            return new a<>(create, create);
        }
    }
}
