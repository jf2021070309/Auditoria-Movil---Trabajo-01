package rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.observers.SerializedObserver;
import rx.observers.SerializedSubscriber;
import rx.subjects.PublishSubject;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.RefCountSubscription;
/* loaded from: classes4.dex */
public final class OnSubscribeGroupJoin<T1, T2, D1, D2, R> implements Observable.OnSubscribe<R> {
    final Observable<T1> a;
    final Observable<T2> b;
    final Func1<? super T1, ? extends Observable<D1>> c;
    final Func1<? super T2, ? extends Observable<D2>> d;
    final Func2<? super T1, ? super Observable<T2>, ? extends R> e;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeGroupJoin(Observable<T1> observable, Observable<T2> observable2, Func1<? super T1, ? extends Observable<D1>> func1, Func1<? super T2, ? extends Observable<D2>> func12, Func2<? super T1, ? super Observable<T2>, ? extends R> func2) {
        this.a = observable;
        this.b = observable2;
        this.c = func1;
        this.d = func12;
        this.e = func2;
    }

    public void call(Subscriber<? super R> subscriber) {
        a aVar = new a(new SerializedSubscriber(subscriber));
        subscriber.add(aVar);
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class a extends HashMap<Integer, Observer<T2>> implements Subscription {
        private static final long serialVersionUID = -3035156013812425335L;
        final Subscriber<? super R> b;
        int d;
        int e;
        boolean g;
        boolean h;
        final Map<Integer, T2> f = new HashMap();
        final CompositeSubscription c = new CompositeSubscription();
        final RefCountSubscription a = new RefCountSubscription(this.c);

        public a(Subscriber<? super R> subscriber) {
            this.b = subscriber;
        }

        public void a() {
            b bVar = new b();
            d dVar = new d();
            this.c.add(bVar);
            this.c.add(dVar);
            OnSubscribeGroupJoin.this.a.unsafeSubscribe(bVar);
            OnSubscribeGroupJoin.this.b.unsafeSubscribe(dVar);
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.a.unsubscribe();
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        Map<Integer, Observer<T2>> b() {
            return this;
        }

        void a(Throwable th) {
            ArrayList<Observer> arrayList;
            synchronized (this) {
                arrayList = new ArrayList(b().values());
                b().clear();
                this.f.clear();
            }
            for (Observer observer : arrayList) {
                observer.onError(th);
            }
            this.b.onError(th);
            this.a.unsubscribe();
        }

        void b(Throwable th) {
            synchronized (this) {
                b().clear();
                this.f.clear();
            }
            this.b.onError(th);
            this.a.unsubscribe();
        }

        void a(List<Observer<T2>> list) {
            if (list != null) {
                for (Observer<T2> observer : list) {
                    observer.onCompleted();
                }
                this.b.onCompleted();
                this.a.unsubscribe();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public final class b extends Subscriber<T1> {
            b() {
            }

            @Override // rx.Observer
            public void onNext(T1 t1) {
                int i;
                ArrayList<Object> arrayList;
                try {
                    PublishSubject create = PublishSubject.create();
                    SerializedObserver serializedObserver = new SerializedObserver(create);
                    synchronized (a.this) {
                        a aVar = a.this;
                        i = aVar.d;
                        aVar.d = i + 1;
                        a.this.b().put(Integer.valueOf(i), serializedObserver);
                    }
                    Observable create2 = Observable.create(new b(create, a.this.a));
                    C0361a c0361a = new C0361a(i);
                    a.this.c.add(c0361a);
                    OnSubscribeGroupJoin.this.c.call(t1).unsafeSubscribe(c0361a);
                    R call = OnSubscribeGroupJoin.this.e.call(t1, create2);
                    synchronized (a.this) {
                        arrayList = new ArrayList(a.this.f.values());
                    }
                    a.this.b.onNext(call);
                    for (Object obj : arrayList) {
                        serializedObserver.onNext(obj);
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                ArrayList arrayList = null;
                synchronized (a.this) {
                    a.this.g = true;
                    if (a.this.h) {
                        arrayList = new ArrayList(a.this.b().values());
                        a.this.b().clear();
                        a.this.f.clear();
                    }
                }
                a.this.a(arrayList);
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.a(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public final class d extends Subscriber<T2> {
            d() {
            }

            @Override // rx.Observer
            public void onNext(T2 t2) {
                int i;
                ArrayList<Observer> arrayList;
                try {
                    synchronized (a.this) {
                        a aVar = a.this;
                        i = aVar.e;
                        aVar.e = i + 1;
                        a.this.f.put(Integer.valueOf(i), t2);
                    }
                    c cVar = new c(i);
                    a.this.c.add(cVar);
                    OnSubscribeGroupJoin.this.d.call(t2).unsafeSubscribe(cVar);
                    synchronized (a.this) {
                        arrayList = new ArrayList(a.this.b().values());
                    }
                    for (Observer observer : arrayList) {
                        observer.onNext(t2);
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                ArrayList arrayList = null;
                synchronized (a.this) {
                    a.this.h = true;
                    if (a.this.g) {
                        arrayList = new ArrayList(a.this.b().values());
                        a.this.b().clear();
                        a.this.f.clear();
                    }
                }
                a.this.a(arrayList);
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.a(th);
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeGroupJoin$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        final class C0361a extends Subscriber<D1> {
            final int a;
            boolean b = true;

            public C0361a(int i) {
                this.a = i;
            }

            @Override // rx.Observer
            public void onCompleted() {
                Observer<T2> remove;
                if (this.b) {
                    this.b = false;
                    synchronized (a.this) {
                        remove = a.this.b().remove(Integer.valueOf(this.a));
                    }
                    if (remove != null) {
                        remove.onCompleted();
                    }
                    a.this.c.remove(this);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.b(th);
            }

            @Override // rx.Observer
            public void onNext(D1 d1) {
                onCompleted();
            }
        }

        /* loaded from: classes4.dex */
        final class c extends Subscriber<D2> {
            final int a;
            boolean b = true;

            public c(int i) {
                this.a = i;
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.b) {
                    this.b = false;
                    synchronized (a.this) {
                        a.this.f.remove(Integer.valueOf(this.a));
                    }
                    a.this.c.remove(this);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.b(th);
            }

            @Override // rx.Observer
            public void onNext(D2 d2) {
                onCompleted();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b<T> implements Observable.OnSubscribe<T> {
        final RefCountSubscription a;
        final Observable<T> b;

        public b(Observable<T> observable, RefCountSubscription refCountSubscription) {
            this.a = refCountSubscription;
            this.b = observable;
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber<? super T> subscriber) {
            Subscription subscription = this.a.get();
            a aVar = new a(subscriber, subscription);
            aVar.add(subscription);
            this.b.unsafeSubscribe(aVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public final class a extends Subscriber<T> {
            final Subscriber<? super T> a;
            private final Subscription c;

            public a(Subscriber<? super T> subscriber, Subscription subscription) {
                super(subscriber);
                this.a = subscriber;
                this.c = subscription;
            }

            @Override // rx.Observer
            public void onNext(T t) {
                this.a.onNext(t);
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                this.a.onError(th);
                this.c.unsubscribe();
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.a.onCompleted();
                this.c.unsubscribe();
            }
        }
    }
}
