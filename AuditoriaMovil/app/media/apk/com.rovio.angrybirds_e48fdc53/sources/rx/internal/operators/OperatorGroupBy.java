package rx.internal.operators;

import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.internal.producers.ProducerArbiter;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.UtilityFunctions;
import rx.observables.GroupedObservable;
import rx.observers.Subscribers;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OperatorGroupBy<T, K, V> implements Observable.Operator<GroupedObservable<K, V>, T> {
    final Func1<? super T, ? extends K> a;
    final Func1<? super T, ? extends V> b;
    final int c;
    final boolean d;
    final Func1<Action1<K>, Map<K, Object>> e;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1) {
        this(func1, UtilityFunctions.identity(), RxRingBuffer.SIZE, false, null);
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12) {
        this(func1, func12, RxRingBuffer.SIZE, false, null);
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, Func1<Action1<K>, Map<K, Object>> func13) {
        this(func1, func12, RxRingBuffer.SIZE, false, func13);
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, int i, boolean z, Func1<Action1<K>, Map<K, Object>> func13) {
        this.a = func1;
        this.b = func12;
        this.c = i;
        this.d = z;
        this.e = func13;
    }

    public Subscriber<? super T> call(Subscriber<? super GroupedObservable<K, V>> subscriber) {
        try {
            final GroupBySubscriber groupBySubscriber = new GroupBySubscriber(subscriber, this.a, this.b, this.c, this.d, this.e);
            subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorGroupBy.1
                @Override // rx.functions.Action0
                public void call() {
                    groupBySubscriber.cancel();
                }
            }));
            subscriber.setProducer(groupBySubscriber.h);
            return groupBySubscriber;
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
            Subscriber<? super T> empty = Subscribers.empty();
            empty.unsubscribe();
            return empty;
        }
    }

    /* loaded from: classes4.dex */
    public static final class GroupByProducer implements Producer {
        final GroupBySubscriber<?, ?, ?> a;

        public GroupByProducer(GroupBySubscriber<?, ?, ?> groupBySubscriber) {
            this.a = groupBySubscriber;
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.requestMore(j);
        }
    }

    /* loaded from: classes4.dex */
    public static final class GroupBySubscriber<T, K, V> extends Subscriber<T> {
        static final Object j = new Object();
        final Subscriber<? super GroupedObservable<K, V>> a;
        final Func1<? super T, ? extends K> b;
        final Func1<? super T, ? extends V> c;
        final int d;
        final boolean e;
        final Map<Object, a<K, V>> f;
        final GroupByProducer h;
        final Queue<K> i;
        final AtomicBoolean l;
        final AtomicLong m;
        final AtomicInteger n;
        Throwable o;
        volatile boolean p;
        final AtomicInteger q;
        final Queue<GroupedObservable<K, V>> g = new ConcurrentLinkedQueue();
        final ProducerArbiter k = new ProducerArbiter();

        public GroupBySubscriber(Subscriber<? super GroupedObservable<K, V>> subscriber, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func12, int i, boolean z, Func1<Action1<K>, Map<K, Object>> func13) {
            this.a = subscriber;
            this.b = func1;
            this.c = func12;
            this.d = i;
            this.e = z;
            this.k.request(i);
            this.h = new GroupByProducer(this);
            this.l = new AtomicBoolean();
            this.m = new AtomicLong();
            this.n = new AtomicInteger(1);
            this.q = new AtomicInteger();
            if (func13 == null) {
                this.f = new ConcurrentHashMap();
                this.i = null;
                return;
            }
            this.i = new ConcurrentLinkedQueue();
            this.f = a(func13, new a(this.i));
        }

        /* loaded from: classes4.dex */
        static class a<K> implements Action1<K> {
            final Queue<K> a;

            a(Queue<K> queue) {
                this.a = queue;
            }

            @Override // rx.functions.Action1
            public void call(K k) {
                this.a.offer(k);
            }
        }

        private Map<Object, a<K, V>> a(Func1<Action1<K>, Map<K, Object>> func1, Action1<K> action1) {
            return func1.call(action1);
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.k.setProducer(producer);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            boolean z;
            if (!this.p) {
                Queue<?> queue = this.g;
                Subscriber<? super GroupedObservable<K, V>> subscriber = this.a;
                try {
                    Object call = this.b.call(t);
                    Object obj = call != null ? call : j;
                    a aVar = this.f.get(obj);
                    if (aVar != null) {
                        z = true;
                    } else if (!this.l.get()) {
                        aVar = a.a(call, this.d, this, this.e);
                        this.f.put(obj, aVar);
                        this.n.getAndIncrement();
                        z = false;
                        queue.offer(aVar);
                        a();
                    } else {
                        return;
                    }
                    try {
                        aVar.a((a) this.c.call(t));
                        if (this.i != null) {
                            while (true) {
                                K poll = this.i.poll();
                                if (poll == null) {
                                    break;
                                }
                                a<K, V> aVar2 = this.f.get(poll);
                                if (aVar2 != null) {
                                    aVar2.a();
                                }
                            }
                        }
                        if (z) {
                            this.k.request(1L);
                        }
                    } catch (Throwable th) {
                        unsubscribe();
                        a(subscriber, queue, th);
                    }
                } catch (Throwable th2) {
                    unsubscribe();
                    a(subscriber, queue, th2);
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.p) {
                RxJavaHooks.onError(th);
                return;
            }
            this.o = th;
            this.p = true;
            this.n.decrementAndGet();
            a();
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.p) {
                for (a<K, V> aVar : this.f.values()) {
                    aVar.a();
                }
                this.f.clear();
                if (this.i != null) {
                    this.i.clear();
                }
                this.p = true;
                this.n.decrementAndGet();
                a();
            }
        }

        public void requestMore(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j2);
            }
            BackpressureUtils.getAndAddRequest(this.m, j2);
            a();
        }

        public void cancel() {
            if (this.l.compareAndSet(false, true) && this.n.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        public void cancel(K k) {
            if (k == null) {
                k = (K) j;
            }
            if (this.f.remove(k) != null && this.n.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        void a() {
            if (this.q.getAndIncrement() == 0) {
                Queue<GroupedObservable<K, V>> queue = this.g;
                Subscriber<? super GroupedObservable<K, V>> subscriber = this.a;
                int i = 1;
                while (!a(this.p, queue.isEmpty(), subscriber, queue)) {
                    long j2 = this.m.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z = this.p;
                        GroupedObservable<K, V> poll = queue.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, subscriber, queue)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j3++;
                        } else {
                            return;
                        }
                    }
                    if (j3 != 0) {
                        if (j2 != Long.MAX_VALUE) {
                            BackpressureUtils.produced(this.m, j3);
                        }
                        this.k.request(j3);
                    }
                    int addAndGet = this.q.addAndGet(-i);
                    if (addAndGet == 0) {
                        return;
                    }
                    i = addAndGet;
                }
            }
        }

        void a(Subscriber<? super GroupedObservable<K, V>> subscriber, Queue<?> queue, Throwable th) {
            queue.clear();
            ArrayList<a> arrayList = new ArrayList(this.f.values());
            this.f.clear();
            if (this.i != null) {
                this.i.clear();
            }
            for (a aVar : arrayList) {
                aVar.a(th);
            }
            subscriber.onError(th);
        }

        boolean a(boolean z, boolean z2, Subscriber<? super GroupedObservable<K, V>> subscriber, Queue<?> queue) {
            if (z) {
                Throwable th = this.o;
                if (th != null) {
                    a(subscriber, queue, th);
                    return true;
                } else if (z2) {
                    this.a.onCompleted();
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<K, T> extends GroupedObservable<K, T> {
        final b<T, K> b;

        public static <T, K> a<K, T> a(K k, int i, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z) {
            return new a<>(k, new b(i, groupBySubscriber, k, z));
        }

        protected a(K k, b<T, K> bVar) {
            super(k, bVar);
            this.b = bVar;
        }

        public void a(T t) {
            this.b.a((b<T, K>) t);
        }

        public void a(Throwable th) {
            this.b.a(th);
        }

        public void a() {
            this.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T, K> extends AtomicInteger implements Observable.OnSubscribe<T>, Producer, Subscription {
        private static final long serialVersionUID = -3852313036005250360L;
        final K a;
        final GroupBySubscriber<?, K, T> c;
        final boolean d;
        volatile boolean f;
        Throwable g;
        final Queue<Object> b = new ConcurrentLinkedQueue();
        final AtomicBoolean h = new AtomicBoolean();
        final AtomicReference<Subscriber<? super T>> i = new AtomicReference<>();
        final AtomicBoolean j = new AtomicBoolean();
        final AtomicLong e = new AtomicLong();

        @Override // rx.functions.Action1
        public /* synthetic */ void call(Object obj) {
            a((Subscriber) ((Subscriber) obj));
        }

        public b(int i, GroupBySubscriber<?, K, T> groupBySubscriber, K k, boolean z) {
            this.c = groupBySubscriber;
            this.a = k;
            this.d = z;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
            if (j != 0) {
                BackpressureUtils.getAndAddRequest(this.e, j);
                b();
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.h.get();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.h.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.c.cancel(this.a);
            }
        }

        public void a(Subscriber<? super T> subscriber) {
            if (this.j.compareAndSet(false, true)) {
                subscriber.add(this);
                subscriber.setProducer(this);
                this.i.lazySet(subscriber);
                b();
                return;
            }
            subscriber.onError(new IllegalStateException("Only one Subscriber allowed!"));
        }

        public void a(T t) {
            if (t == null) {
                this.g = new NullPointerException();
                this.f = true;
            } else {
                this.b.offer(NotificationLite.instance().next(t));
            }
            b();
        }

        public void a(Throwable th) {
            this.g = th;
            this.f = true;
            b();
        }

        public void a() {
            this.f = true;
            b();
        }

        void b() {
            long j;
            if (getAndIncrement() == 0) {
                Queue<Object> queue = this.b;
                boolean z = this.d;
                NotificationLite instance = NotificationLite.instance();
                Subscriber<? super T> subscriber = this.i.get();
                int i = 1;
                while (true) {
                    if (subscriber != null) {
                        if (!a(this.f, queue.isEmpty(), subscriber, z)) {
                            long j2 = this.e.get();
                            long j3 = 0;
                            while (true) {
                                j = j3;
                                if (j == j2) {
                                    break;
                                }
                                boolean z2 = this.f;
                                Object poll = queue.poll();
                                boolean z3 = poll == null;
                                if (!a(z2, z3, subscriber, z)) {
                                    if (z3) {
                                        break;
                                    }
                                    subscriber.onNext((Object) instance.getValue(poll));
                                    j3 = 1 + j;
                                } else {
                                    return;
                                }
                            }
                            if (j != 0) {
                                if (j2 != Long.MAX_VALUE) {
                                    BackpressureUtils.produced(this.e, j);
                                }
                                this.c.k.request(j);
                            }
                        } else {
                            return;
                        }
                    }
                    int addAndGet = addAndGet(-i);
                    if (addAndGet != 0) {
                        if (subscriber == null) {
                            subscriber = this.i.get();
                            i = addAndGet;
                        } else {
                            i = addAndGet;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        boolean a(boolean z, boolean z2, Subscriber<? super T> subscriber, boolean z3) {
            if (this.h.get()) {
                this.b.clear();
                this.c.cancel(this.a);
                return true;
            }
            if (z) {
                if (z3) {
                    if (z2) {
                        Throwable th = this.g;
                        if (th != null) {
                            subscriber.onError(th);
                            return true;
                        }
                        subscriber.onCompleted();
                        return true;
                    }
                } else {
                    Throwable th2 = this.g;
                    if (th2 != null) {
                        this.b.clear();
                        subscriber.onError(th2);
                        return true;
                    } else if (z2) {
                        subscriber.onCompleted();
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
