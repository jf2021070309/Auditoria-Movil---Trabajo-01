package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.subjects.Subject;
import rx.subjects.UnicastSubject;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OperatorWindowWithSize<T> implements Observable.Operator<Observable<T>, T> {
    final int a;
    final int b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorWindowWithSize(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        if (this.b == this.a) {
            a aVar = new a(subscriber, this.a);
            subscriber.add(aVar.d);
            subscriber.setProducer(aVar.a());
            return aVar;
        } else if (this.b > this.a) {
            c cVar = new c(subscriber, this.a, this.b);
            subscriber.add(cVar.e);
            subscriber.setProducer(cVar.a());
            return cVar;
        } else {
            b bVar = new b(subscriber, this.a, this.b);
            subscriber.add(bVar.e);
            subscriber.setProducer(bVar.a());
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super Observable<T>> a;
        final int b;
        final AtomicInteger c = new AtomicInteger(1);
        final Subscription d = Subscriptions.create(this);
        int e;
        Subject<T, T> f;

        public a(Subscriber<? super Observable<T>> subscriber, int i) {
            this.a = subscriber;
            this.b = i;
            add(this.d);
            request(0L);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            int i = this.e;
            UnicastSubject unicastSubject = this.f;
            if (i == 0) {
                this.c.getAndIncrement();
                unicastSubject = UnicastSubject.create(this.b, this);
                this.f = unicastSubject;
                this.a.onNext(unicastSubject);
            }
            int i2 = i + 1;
            unicastSubject.onNext(t);
            if (i2 == this.b) {
                this.e = 0;
                this.f = null;
                unicastSubject.onCompleted();
                return;
            }
            this.e = i2;
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            Subject<T, T> subject = this.f;
            if (subject != null) {
                this.f = null;
                subject.onError(th);
            }
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            Subject<T, T> subject = this.f;
            if (subject != null) {
                this.f = null;
                subject.onCompleted();
            }
            this.a.onCompleted();
        }

        Producer a() {
            return new Producer() { // from class: rx.internal.operators.OperatorWindowWithSize.a.1
                @Override // rx.Producer
                public void request(long j) {
                    if (j < 0) {
                        throw new IllegalArgumentException("n >= 0 required but it was " + j);
                    }
                    if (j != 0) {
                        a.this.request(BackpressureUtils.multiplyCap(a.this.b, j));
                    }
                }
            };
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.c.decrementAndGet() == 0) {
                unsubscribe();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super Observable<T>> a;
        final int b;
        final int c;
        final AtomicInteger d = new AtomicInteger(1);
        final Subscription e = Subscriptions.create(this);
        int f;
        Subject<T, T> g;

        public c(Subscriber<? super Observable<T>> subscriber, int i, int i2) {
            this.a = subscriber;
            this.b = i;
            this.c = i2;
            add(this.e);
            request(0L);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            int i = this.f;
            UnicastSubject unicastSubject = this.g;
            if (i == 0) {
                this.d.getAndIncrement();
                unicastSubject = UnicastSubject.create(this.b, this);
                this.g = unicastSubject;
                this.a.onNext(unicastSubject);
            }
            int i2 = i + 1;
            if (unicastSubject != null) {
                unicastSubject.onNext(t);
            }
            if (i2 == this.b) {
                this.f = i2;
                this.g = null;
                unicastSubject.onCompleted();
            } else if (i2 == this.c) {
                this.f = 0;
            } else {
                this.f = i2;
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            Subject<T, T> subject = this.g;
            if (subject != null) {
                this.g = null;
                subject.onError(th);
            }
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            Subject<T, T> subject = this.g;
            if (subject != null) {
                this.g = null;
                subject.onCompleted();
            }
            this.a.onCompleted();
        }

        Producer a() {
            return new a();
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.d.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public final class a extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            a() {
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                }
                if (j != 0) {
                    c cVar = c.this;
                    if (get() || !compareAndSet(false, true)) {
                        cVar.request(BackpressureUtils.multiplyCap(j, cVar.c));
                    } else {
                        cVar.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j, cVar.b), BackpressureUtils.multiplyCap(cVar.c - cVar.b, j - 1)));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super Observable<T>> a;
        final int b;
        final int c;
        final Queue<Subject<T, T>> i;
        Throwable j;
        volatile boolean k;
        int l;
        int m;
        final AtomicInteger d = new AtomicInteger(1);
        final ArrayDeque<Subject<T, T>> f = new ArrayDeque<>();
        final AtomicInteger h = new AtomicInteger();
        final AtomicLong g = new AtomicLong();
        final Subscription e = Subscriptions.create(this);

        public b(Subscriber<? super Observable<T>> subscriber, int i, int i2) {
            this.a = subscriber;
            this.b = i;
            this.c = i2;
            add(this.e);
            request(0L);
            this.i = new SpscLinkedArrayQueue(((i2 - 1) + i) / i2);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            int i = this.l;
            ArrayDeque<Subject<T, T>> arrayDeque = this.f;
            if (i == 0 && !this.a.isUnsubscribed()) {
                this.d.getAndIncrement();
                UnicastSubject create = UnicastSubject.create(16, this);
                arrayDeque.offer(create);
                this.i.offer(create);
                b();
            }
            Iterator<Subject<T, T>> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            int i2 = this.m + 1;
            if (i2 == this.b) {
                this.m = i2 - this.c;
                Subject<T, T> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.onCompleted();
                }
            } else {
                this.m = i2;
            }
            int i3 = i + 1;
            if (i3 == this.c) {
                this.l = 0;
            } else {
                this.l = i3;
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            Iterator<Subject<T, T>> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.f.clear();
            this.j = th;
            this.k = true;
            b();
        }

        @Override // rx.Observer
        public void onCompleted() {
            Iterator<Subject<T, T>> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().onCompleted();
            }
            this.f.clear();
            this.k = true;
            b();
        }

        Producer a() {
            return new a();
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.d.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void b() {
            long j;
            AtomicInteger atomicInteger = this.h;
            if (atomicInteger.getAndIncrement() == 0) {
                Subscriber<? super Observable<T>> subscriber = this.a;
                Queue<Subject<T, T>> queue = this.i;
                int i = 1;
                while (true) {
                    int i2 = i;
                    long j2 = this.g.get();
                    long j3 = 0;
                    while (true) {
                        j = j3;
                        if (j == j2) {
                            break;
                        }
                        boolean z = this.k;
                        Subject<T, T> poll = queue.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, subscriber, queue)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j3 = 1 + j;
                        } else {
                            return;
                        }
                    }
                    if (j != j2 || !a(this.k, queue.isEmpty(), subscriber, queue)) {
                        if (j != 0 && j2 != Long.MAX_VALUE) {
                            this.g.addAndGet(-j);
                        }
                        i = atomicInteger.addAndGet(-i2);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        boolean a(boolean z, boolean z2, Subscriber<? super Subject<T, T>> subscriber, Queue<Subject<T, T>> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (z) {
                Throwable th = this.j;
                if (th != null) {
                    queue.clear();
                    subscriber.onError(th);
                    return true;
                } else if (z2) {
                    subscriber.onCompleted();
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public final class a extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            a() {
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                }
                if (j != 0) {
                    b bVar = b.this;
                    if (!get() && compareAndSet(false, true)) {
                        bVar.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(bVar.c, j - 1), bVar.b));
                    } else {
                        b.this.request(BackpressureUtils.multiplyCap(bVar.c, j));
                    }
                    BackpressureUtils.getAndAddRequest(bVar.g, j);
                    bVar.b();
                }
            }
        }
    }
}
