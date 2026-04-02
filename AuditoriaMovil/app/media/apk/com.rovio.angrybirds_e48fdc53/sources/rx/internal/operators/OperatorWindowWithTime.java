package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.SerializedObserver;
import rx.observers.SerializedSubscriber;
import rx.subjects.UnicastSubject;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OperatorWindowWithTime<T> implements Observable.Operator<Observable<T>, T> {
    static final Object f = new Object();
    static final NotificationLite<Object> g = NotificationLite.instance();
    final long a;
    final long b;
    final TimeUnit c;
    final Scheduler d;
    final int e;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorWindowWithTime(long j, long j2, TimeUnit timeUnit, int i, Scheduler scheduler) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.e = i;
        this.d = scheduler;
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        Scheduler.Worker createWorker = this.d.createWorker();
        if (this.a == this.b) {
            b bVar = new b(subscriber, createWorker);
            bVar.add(createWorker);
            bVar.c();
            return bVar;
        }
        c cVar = new c(subscriber, createWorker);
        cVar.add(createWorker);
        cVar.b();
        cVar.a();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d<T> {
        static final d<Object> d = new d<>(null, null, 0);
        final Observer<T> a;
        final Observable<T> b;
        final int c;

        public d(Observer<T> observer, Observable<T> observable, int i) {
            this.a = observer;
            this.b = observable;
            this.c = i;
        }

        public d<T> a() {
            return new d<>(this.a, this.b, this.c + 1);
        }

        public d<T> a(Observer<T> observer, Observable<T> observable) {
            return new d<>(observer, observable, 0);
        }

        public d<T> b() {
            return c();
        }

        public static <T> d<T> c() {
            return (d<T>) d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class b extends Subscriber<T> {
        final Subscriber<? super Observable<T>> a;
        final Scheduler.Worker b;
        List<Object> d;
        boolean e;
        final Object c = new Object();
        volatile d<T> f = d.c();

        public b(Subscriber<? super Observable<T>> subscriber, Scheduler.Worker worker) {
            this.a = new SerializedSubscriber(subscriber);
            this.b = worker;
            subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.b.1
                @Override // rx.functions.Action0
                public void call() {
                    if (b.this.f.a == null) {
                        b.this.unsubscribe();
                    }
                }
            }));
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            List<Object> list;
            boolean z = true;
            boolean z2 = false;
            synchronized (this.c) {
                if (this.e) {
                    if (this.d == null) {
                        this.d = new ArrayList();
                    }
                    this.d.add(t);
                    return;
                }
                this.e = true;
                try {
                    if (!a((b) t)) {
                        synchronized (this.c) {
                            this.e = false;
                        }
                        return;
                    }
                    do {
                        try {
                            synchronized (this.c) {
                                try {
                                    list = this.d;
                                    if (list == null) {
                                        this.e = false;
                                        return;
                                    }
                                    this.d = null;
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
                                synchronized (this.c) {
                                    this.e = false;
                                }
                            }
                            throw th;
                        }
                    } while (a(list));
                    synchronized (this.c) {
                        this.e = false;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean a(List<Object> list) {
            if (list == null) {
                return true;
            }
            for (Object obj : list) {
                if (obj == OperatorWindowWithTime.f) {
                    if (!a()) {
                        return false;
                    }
                } else if (OperatorWindowWithTime.g.isError(obj)) {
                    a(OperatorWindowWithTime.g.getError(obj));
                    return true;
                } else if (OperatorWindowWithTime.g.isCompleted(obj)) {
                    b();
                    return true;
                } else if (!a((b) obj)) {
                    return false;
                }
            }
            return true;
        }

        boolean a() {
            Observer<T> observer = this.f.a;
            if (observer != null) {
                observer.onCompleted();
            }
            if (this.a.isUnsubscribed()) {
                this.f = this.f.b();
                unsubscribe();
                return false;
            }
            UnicastSubject create = UnicastSubject.create();
            this.f = this.f.a(create, create);
            this.a.onNext(create);
            return true;
        }

        boolean a(T t) {
            d<T> a;
            d<T> dVar = this.f;
            if (dVar.a == null) {
                if (!a()) {
                    return false;
                }
                dVar = this.f;
            }
            dVar.a.onNext(t);
            if (dVar.c == OperatorWindowWithTime.this.e - 1) {
                dVar.a.onCompleted();
                a = dVar.b();
            } else {
                a = dVar.a();
            }
            this.f = a;
            return true;
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this.c) {
                if (this.e) {
                    this.d = Collections.singletonList(OperatorWindowWithTime.g.error(th));
                    return;
                }
                this.d = null;
                this.e = true;
                a(th);
            }
        }

        void a(Throwable th) {
            Observer<T> observer = this.f.a;
            this.f = this.f.b();
            if (observer != null) {
                observer.onError(th);
            }
            this.a.onError(th);
            unsubscribe();
        }

        void b() {
            Observer<T> observer = this.f.a;
            this.f = this.f.b();
            if (observer != null) {
                observer.onCompleted();
            }
            this.a.onCompleted();
            unsubscribe();
        }

        @Override // rx.Observer
        public void onCompleted() {
            synchronized (this.c) {
                if (this.e) {
                    if (this.d == null) {
                        this.d = new ArrayList();
                    }
                    this.d.add(OperatorWindowWithTime.g.completed());
                    return;
                }
                List<Object> list = this.d;
                this.d = null;
                this.e = true;
                try {
                    a(list);
                    b();
                } catch (Throwable th) {
                    a(th);
                }
            }
        }

        void c() {
            this.b.schedulePeriodically(new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.b.2
                @Override // rx.functions.Action0
                public void call() {
                    b.this.d();
                }
            }, 0L, OperatorWindowWithTime.this.a, OperatorWindowWithTime.this.c);
        }

        void d() {
            List<Object> list;
            boolean z = true;
            boolean z2 = false;
            synchronized (this.c) {
                if (this.e) {
                    if (this.d == null) {
                        this.d = new ArrayList();
                    }
                    this.d.add(OperatorWindowWithTime.f);
                    return;
                }
                this.e = true;
                try {
                    if (!a()) {
                        synchronized (this.c) {
                            this.e = false;
                        }
                        return;
                    }
                    do {
                        try {
                            synchronized (this.c) {
                                try {
                                    list = this.d;
                                    if (list == null) {
                                        this.e = false;
                                        return;
                                    }
                                    this.d = null;
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
                                synchronized (this.c) {
                                    this.e = false;
                                }
                            }
                            throw th;
                        }
                    } while (a(list));
                    synchronized (this.c) {
                        this.e = false;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> {
        final Observer<T> a;
        final Observable<T> b;
        int c;

        public a(Observer<T> observer, Observable<T> observable) {
            this.a = new SerializedObserver(observer);
            this.b = observable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class c extends Subscriber<T> {
        final Subscriber<? super Observable<T>> a;
        final Scheduler.Worker b;
        final Object c;
        final List<a<T>> d;
        boolean e;

        public c(Subscriber<? super Observable<T>> subscriber, Scheduler.Worker worker) {
            super(subscriber);
            this.a = subscriber;
            this.b = worker;
            this.c = new Object();
            this.d = new LinkedList();
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            synchronized (this.c) {
                if (!this.e) {
                    ArrayList<a> arrayList = new ArrayList(this.d);
                    Iterator<a<T>> it = this.d.iterator();
                    while (it.hasNext()) {
                        a<T> next = it.next();
                        int i = next.c + 1;
                        next.c = i;
                        if (i == OperatorWindowWithTime.this.e) {
                            it.remove();
                        }
                    }
                    for (a aVar : arrayList) {
                        aVar.a.onNext(t);
                        if (aVar.c == OperatorWindowWithTime.this.e) {
                            aVar.a.onCompleted();
                        }
                    }
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
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
        }

        @Override // rx.Observer
        public void onCompleted() {
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
        }

        void a() {
            this.b.schedulePeriodically(new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.c.1
                @Override // rx.functions.Action0
                public void call() {
                    c.this.b();
                }
            }, OperatorWindowWithTime.this.b, OperatorWindowWithTime.this.b, OperatorWindowWithTime.this.c);
        }

        void b() {
            final a<T> c = c();
            synchronized (this.c) {
                if (!this.e) {
                    this.d.add(c);
                    try {
                        this.a.onNext(c.b);
                        this.b.schedule(new Action0() { // from class: rx.internal.operators.OperatorWindowWithTime.c.2
                            @Override // rx.functions.Action0
                            public void call() {
                                c.this.a(c);
                            }
                        }, OperatorWindowWithTime.this.a, OperatorWindowWithTime.this.c);
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

        a<T> c() {
            UnicastSubject create = UnicastSubject.create();
            return new a<>(create, create);
        }
    }
}
