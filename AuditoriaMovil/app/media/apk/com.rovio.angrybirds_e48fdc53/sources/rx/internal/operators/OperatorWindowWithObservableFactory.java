package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func0;
import rx.observers.SerializedSubscriber;
import rx.subjects.UnicastSubject;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class OperatorWindowWithObservableFactory<T, U> implements Observable.Operator<Observable<T>, T> {
    static final Object b = new Object();
    static final NotificationLite<Object> c = NotificationLite.instance();
    final Func0<? extends Observable<? extends U>> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorWindowWithObservableFactory(Func0<? extends Observable<? extends U>> func0) {
        this.a = func0;
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        b bVar = new b(subscriber, this.a);
        subscriber.add(bVar);
        bVar.c();
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T, U> extends Subscriber<T> {
        final Subscriber<? super Observable<T>> a;
        Observer<T> c;
        Observable<T> d;
        boolean e;
        List<Object> f;
        final Func0<? extends Observable<? extends U>> h;
        final Object b = new Object();
        final SerialSubscription g = new SerialSubscription();

        public b(Subscriber<? super Observable<T>> subscriber, Func0<? extends Observable<? extends U>> func0) {
            this.a = new SerializedSubscriber(subscriber);
            this.h = func0;
            add(this.g);
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            boolean z = true;
            boolean z2 = false;
            synchronized (this.b) {
                if (this.e) {
                    if (this.f == null) {
                        this.f = new ArrayList();
                    }
                    this.f.add(t);
                    return;
                }
                List<Object> list = this.f;
                this.f = null;
                this.e = true;
                List<Object> list2 = list;
                boolean z3 = true;
                do {
                    try {
                        a(list2);
                        if (z3) {
                            a((b<T, U>) t);
                            z3 = false;
                        }
                        try {
                            synchronized (this.b) {
                                try {
                                    list2 = this.f;
                                    this.f = null;
                                    if (list2 == null) {
                                        this.e = false;
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z = false;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            z2 = z;
                            if (!z2) {
                                synchronized (this.b) {
                                    this.e = false;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } while (!this.a.isUnsubscribed());
                synchronized (this.b) {
                    this.e = false;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void a(List<Object> list) {
            if (list != null) {
                for (Object obj : list) {
                    if (obj == OperatorWindowWithObservableFactory.b) {
                        a();
                    } else if (OperatorWindowWithObservableFactory.c.isError(obj)) {
                        a(OperatorWindowWithObservableFactory.c.getError(obj));
                        return;
                    } else if (OperatorWindowWithObservableFactory.c.isCompleted(obj)) {
                        d();
                        return;
                    } else {
                        a((b<T, U>) obj);
                    }
                }
            }
        }

        void a() {
            Observer<T> observer = this.c;
            if (observer != null) {
                observer.onCompleted();
            }
            b();
            this.a.onNext(this.d);
        }

        void b() {
            UnicastSubject create = UnicastSubject.create();
            this.c = create;
            this.d = create;
            try {
                Observable<? extends U> call = this.h.call();
                a aVar = new a(this);
                this.g.set(aVar);
                call.unsafeSubscribe(aVar);
            } catch (Throwable th) {
                this.a.onError(th);
                unsubscribe();
            }
        }

        void a(T t) {
            Observer<T> observer = this.c;
            if (observer != null) {
                observer.onNext(t);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this.b) {
                if (this.e) {
                    this.f = Collections.singletonList(OperatorWindowWithObservableFactory.c.error(th));
                    return;
                }
                this.f = null;
                this.e = true;
                a(th);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            synchronized (this.b) {
                if (this.e) {
                    if (this.f == null) {
                        this.f = new ArrayList();
                    }
                    this.f.add(OperatorWindowWithObservableFactory.c.completed());
                    return;
                }
                List<Object> list = this.f;
                this.f = null;
                this.e = true;
                try {
                    a(list);
                    d();
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        void c() {
            boolean z = true;
            boolean z2 = false;
            synchronized (this.b) {
                if (this.e) {
                    if (this.f == null) {
                        this.f = new ArrayList();
                    }
                    this.f.add(OperatorWindowWithObservableFactory.b);
                    return;
                }
                List<Object> list = this.f;
                this.f = null;
                this.e = true;
                List<Object> list2 = list;
                boolean z3 = true;
                do {
                    try {
                        a(list2);
                        if (z3) {
                            a();
                            z3 = false;
                        }
                        try {
                            synchronized (this.b) {
                                try {
                                    list2 = this.f;
                                    this.f = null;
                                    if (list2 == null) {
                                        this.e = false;
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z = false;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            z2 = z;
                            if (!z2) {
                                synchronized (this.b) {
                                    this.e = false;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } while (!this.a.isUnsubscribed());
                synchronized (this.b) {
                    this.e = false;
                }
            }
        }

        void d() {
            Observer<T> observer = this.c;
            this.c = null;
            this.d = null;
            if (observer != null) {
                observer.onCompleted();
            }
            this.a.onCompleted();
            unsubscribe();
        }

        void a(Throwable th) {
            Observer<T> observer = this.c;
            this.c = null;
            this.d = null;
            if (observer != null) {
                observer.onError(th);
            }
            this.a.onError(th);
            unsubscribe();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, U> extends Subscriber<U> {
        final b<T, U> a;
        boolean b;

        public a(b<T, U> bVar) {
            this.a = bVar;
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(U u) {
            if (!this.b) {
                this.b = true;
                this.a.c();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.b) {
                this.b = true;
                this.a.onCompleted();
            }
        }
    }
}
