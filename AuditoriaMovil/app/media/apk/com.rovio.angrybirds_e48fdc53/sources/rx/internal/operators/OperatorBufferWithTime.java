package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;
/* loaded from: classes4.dex */
public final class OperatorBufferWithTime<T> implements Observable.Operator<List<T>, T> {
    final long a;
    final long b;
    final TimeUnit c;
    final int d;
    final Scheduler e;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorBufferWithTime(long j, long j2, TimeUnit timeUnit, int i, Scheduler scheduler) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = i;
        this.e = scheduler;
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        Scheduler.Worker createWorker = this.e.createWorker();
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        if (this.a == this.b) {
            a aVar = new a(serializedSubscriber, createWorker);
            aVar.add(createWorker);
            subscriber.add(aVar);
            aVar.a();
            return aVar;
        }
        b bVar = new b(serializedSubscriber, createWorker);
        bVar.add(createWorker);
        subscriber.add(bVar);
        bVar.b();
        bVar.a();
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class b extends Subscriber<T> {
        final Subscriber<? super List<T>> a;
        final Scheduler.Worker b;
        final List<List<T>> c = new LinkedList();
        boolean d;

        public b(Subscriber<? super List<T>> subscriber, Scheduler.Worker worker) {
            this.a = subscriber;
            this.b = worker;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            LinkedList<List> linkedList = null;
            synchronized (this) {
                if (!this.d) {
                    Iterator<List<T>> it = this.c.iterator();
                    while (it.hasNext()) {
                        List<T> next = it.next();
                        next.add(t);
                        if (next.size() == OperatorBufferWithTime.this.d) {
                            it.remove();
                            if (linkedList == null) {
                                linkedList = new LinkedList();
                            }
                            linkedList.add(next);
                        }
                        linkedList = linkedList;
                    }
                    if (linkedList != null) {
                        for (List list : linkedList) {
                            this.a.onNext(list);
                        }
                    }
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                if (!this.d) {
                    this.d = true;
                    this.c.clear();
                    this.a.onError(th);
                    unsubscribe();
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                synchronized (this) {
                    if (!this.d) {
                        this.d = true;
                        LinkedList<List> linkedList = new LinkedList(this.c);
                        this.c.clear();
                        for (List list : linkedList) {
                            this.a.onNext(list);
                        }
                        this.a.onCompleted();
                        unsubscribe();
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.a);
            }
        }

        void a() {
            this.b.schedulePeriodically(new Action0() { // from class: rx.internal.operators.OperatorBufferWithTime.b.1
                @Override // rx.functions.Action0
                public void call() {
                    b.this.b();
                }
            }, OperatorBufferWithTime.this.b, OperatorBufferWithTime.this.b, OperatorBufferWithTime.this.c);
        }

        void b() {
            final ArrayList arrayList = new ArrayList();
            synchronized (this) {
                if (!this.d) {
                    this.c.add(arrayList);
                    this.b.schedule(new Action0() { // from class: rx.internal.operators.OperatorBufferWithTime.b.2
                        @Override // rx.functions.Action0
                        public void call() {
                            b.this.a(arrayList);
                        }
                    }, OperatorBufferWithTime.this.a, OperatorBufferWithTime.this.c);
                }
            }
        }

        void a(List<T> list) {
            boolean z;
            synchronized (this) {
                if (!this.d) {
                    Iterator<List<T>> it = this.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() == list) {
                            it.remove();
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        try {
                            this.a.onNext(list);
                        } catch (Throwable th) {
                            Exceptions.throwOrReport(th, this);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class a extends Subscriber<T> {
        final Subscriber<? super List<T>> a;
        final Scheduler.Worker b;
        List<T> c = new ArrayList();
        boolean d;

        public a(Subscriber<? super List<T>> subscriber, Scheduler.Worker worker) {
            this.a = subscriber;
            this.b = worker;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            List<T> list = null;
            synchronized (this) {
                if (!this.d) {
                    this.c.add(t);
                    if (this.c.size() == OperatorBufferWithTime.this.d) {
                        list = this.c;
                        this.c = new ArrayList();
                    }
                    if (list != null) {
                        this.a.onNext(list);
                    }
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                if (!this.d) {
                    this.d = true;
                    this.c = null;
                    this.a.onError(th);
                    unsubscribe();
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                this.b.unsubscribe();
                synchronized (this) {
                    if (!this.d) {
                        this.d = true;
                        List<T> list = this.c;
                        this.c = null;
                        this.a.onNext(list);
                        this.a.onCompleted();
                        unsubscribe();
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.a);
            }
        }

        void a() {
            this.b.schedulePeriodically(new Action0() { // from class: rx.internal.operators.OperatorBufferWithTime.a.1
                @Override // rx.functions.Action0
                public void call() {
                    a.this.b();
                }
            }, OperatorBufferWithTime.this.a, OperatorBufferWithTime.this.a, OperatorBufferWithTime.this.c);
        }

        void b() {
            synchronized (this) {
                if (!this.d) {
                    List<T> list = this.c;
                    this.c = new ArrayList();
                    try {
                        this.a.onNext(list);
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, this);
                    }
                }
            }
        }
    }
}
