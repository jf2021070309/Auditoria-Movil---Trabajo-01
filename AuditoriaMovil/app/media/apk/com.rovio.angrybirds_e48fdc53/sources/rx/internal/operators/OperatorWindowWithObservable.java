package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;
import rx.subjects.UnicastSubject;
/* loaded from: classes4.dex */
public final class OperatorWindowWithObservable<T, U> implements Observable.Operator<Observable<T>, T> {
    static final Object b = new Object();
    static final NotificationLite<Object> c = NotificationLite.instance();
    final Observable<U> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorWindowWithObservable(Observable<U> observable) {
        this.a = observable;
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        b bVar = new b(subscriber);
        a aVar = new a(bVar);
        subscriber.add(bVar);
        subscriber.add(aVar);
        bVar.c();
        this.a.unsafeSubscribe(aVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends Subscriber<T> {
        final Subscriber<? super Observable<T>> a;
        final Object b = new Object();
        Observer<T> c;
        Observable<T> d;
        boolean e;
        List<Object> f;

        public b(Subscriber<? super Observable<T>> subscriber) {
            this.a = new SerializedSubscriber(subscriber);
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
                            a((b<T>) t);
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
                    if (obj == OperatorWindowWithObservable.b) {
                        a();
                    } else if (OperatorWindowWithObservable.c.isError(obj)) {
                        a(OperatorWindowWithObservable.c.getError(obj));
                        return;
                    } else if (OperatorWindowWithObservable.c.isCompleted(obj)) {
                        d();
                        return;
                    } else {
                        a((b<T>) obj);
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
                    this.f = Collections.singletonList(OperatorWindowWithObservable.c.error(th));
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
                    this.f.add(OperatorWindowWithObservable.c.completed());
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
                    this.f.add(OperatorWindowWithObservable.b);
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
        final b<T> a;

        public a(b<T> bVar) {
            this.a = bVar;
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(U u) {
            this.a.c();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.onCompleted();
        }
    }
}
