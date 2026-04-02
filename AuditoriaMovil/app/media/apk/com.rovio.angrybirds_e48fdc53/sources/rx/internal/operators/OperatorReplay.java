package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.internal.util.OpenHashSet;
import rx.observables.ConnectableObservable;
import rx.schedulers.Timestamped;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OperatorReplay<T> extends ConnectableObservable<T> {
    static final Func0 e = new Func0() { // from class: rx.internal.operators.OperatorReplay.1
        @Override // rx.functions.Func0, java.util.concurrent.Callable
        public Object call() {
            return new h(16);
        }
    };
    final Observable<? extends T> b;
    final AtomicReference<e<T>> c;
    final Func0<? extends d<T>> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface d<T> {
        void a(T t);

        void a(Throwable th);

        void a(b<T> bVar);

        void c();
    }

    public static <T, U, R> Observable<R> multicastSelector(final Func0<? extends ConnectableObservable<U>> func0, final Func1<? super Observable<U>, ? extends Observable<R>> func1) {
        return Observable.create(new Observable.OnSubscribe<R>() { // from class: rx.internal.operators.OperatorReplay.2
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(final Subscriber<? super R> subscriber) {
                try {
                    ConnectableObservable connectableObservable = (ConnectableObservable) Func0.this.call();
                    ((Observable) func1.call(connectableObservable)).subscribe((Subscriber) subscriber);
                    connectableObservable.connect(new Action1<Subscription>() { // from class: rx.internal.operators.OperatorReplay.2.1
                        @Override // rx.functions.Action1
                        /* renamed from: a */
                        public void call(Subscription subscription) {
                            subscriber.add(subscription);
                        }
                    });
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, subscriber);
                }
            }
        });
    }

    public static <T> ConnectableObservable<T> observeOn(final ConnectableObservable<T> connectableObservable, Scheduler scheduler) {
        final Observable<T> observeOn = connectableObservable.observeOn(scheduler);
        return new ConnectableObservable<T>(new Observable.OnSubscribe<T>() { // from class: rx.internal.operators.OperatorReplay.3
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(final Subscriber<? super T> subscriber) {
                Observable.this.unsafeSubscribe(new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorReplay.3.1
                    @Override // rx.Observer
                    public void onNext(T t) {
                        subscriber.onNext(t);
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th) {
                        subscriber.onError(th);
                    }

                    @Override // rx.Observer
                    public void onCompleted() {
                        subscriber.onCompleted();
                    }
                });
            }
        }) { // from class: rx.internal.operators.OperatorReplay.4
            @Override // rx.observables.ConnectableObservable
            public void connect(Action1<? super Subscription> action1) {
                connectableObservable.connect(action1);
            }
        };
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable) {
        return a(observable, e);
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, final int i) {
        return i == Integer.MAX_VALUE ? create(observable) : a(observable, new Func0<d<T>>() { // from class: rx.internal.operators.OperatorReplay.5
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            /* renamed from: a */
            public d<T> call() {
                return new g(i);
            }
        });
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        return create(observable, j, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable, long j, TimeUnit timeUnit, final Scheduler scheduler, final int i) {
        final long millis = timeUnit.toMillis(j);
        return a(observable, new Func0<d<T>>() { // from class: rx.internal.operators.OperatorReplay.6
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            /* renamed from: a */
            public d<T> call() {
                return new f(i, millis, scheduler);
            }
        });
    }

    static <T> ConnectableObservable<T> a(Observable<? extends T> observable, final Func0<? extends d<T>> func0) {
        final AtomicReference atomicReference = new AtomicReference();
        return new OperatorReplay(new Observable.OnSubscribe<T>() { // from class: rx.internal.operators.OperatorReplay.7
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(Subscriber<? super T> subscriber) {
                e eVar;
                while (true) {
                    eVar = (e) atomicReference.get();
                    if (eVar != null) {
                        break;
                    }
                    e eVar2 = new e((d) func0.call());
                    eVar2.a();
                    if (atomicReference.compareAndSet(eVar, eVar2)) {
                        eVar = eVar2;
                        break;
                    }
                }
                b<T> bVar = new b<>(eVar, subscriber);
                eVar.a(bVar);
                subscriber.add(bVar);
                eVar.a.a((b) bVar);
                subscriber.setProducer(bVar);
            }
        }, observable, atomicReference, func0);
    }

    private OperatorReplay(Observable.OnSubscribe<T> onSubscribe, Observable<? extends T> observable, AtomicReference<e<T>> atomicReference, Func0<? extends d<T>> func0) {
        super(onSubscribe);
        this.b = observable;
        this.c = atomicReference;
        this.d = func0;
    }

    @Override // rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        e<T> eVar;
        while (true) {
            eVar = this.c.get();
            if (eVar != null && !eVar.isUnsubscribed()) {
                break;
            }
            e<T> eVar2 = new e<>(this.d.call());
            eVar2.a();
            if (this.c.compareAndSet(eVar, eVar2)) {
                eVar = eVar2;
                break;
            }
        }
        boolean z = !eVar.k.get() && eVar.k.compareAndSet(false, true);
        action1.call(eVar);
        if (z) {
            this.b.unsafeSubscribe(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e<T> extends Subscriber<T> implements Subscription {
        static final b[] d = new b[0];
        static final b[] e = new b[0];
        final d<T> a;
        boolean c;
        volatile boolean f;
        volatile long i;
        long j;
        boolean l;
        boolean m;
        long n;
        long o;
        volatile Producer p;
        List<b<T>> q;
        boolean r;
        final NotificationLite<T> b = NotificationLite.instance();
        final OpenHashSet<b<T>> g = new OpenHashSet<>();
        b<T>[] h = d;
        final AtomicBoolean k = new AtomicBoolean();

        public e(d<T> dVar) {
            this.a = dVar;
            request(0L);
        }

        void a() {
            add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorReplay.e.1
                @Override // rx.functions.Action0
                public void call() {
                    if (!e.this.f) {
                        synchronized (e.this.g) {
                            if (!e.this.f) {
                                e.this.g.terminate();
                                e.this.i++;
                                e.this.f = true;
                            }
                        }
                    }
                }
            }));
        }

        boolean a(b<T> bVar) {
            boolean z = false;
            if (bVar == null) {
                throw new NullPointerException();
            }
            if (!this.f) {
                synchronized (this.g) {
                    if (!this.f) {
                        this.g.add(bVar);
                        this.i++;
                        z = true;
                    }
                }
            }
            return z;
        }

        void b(b<T> bVar) {
            if (!this.f) {
                synchronized (this.g) {
                    if (!this.f) {
                        this.g.remove(bVar);
                        if (this.g.isEmpty()) {
                            this.h = d;
                        }
                        this.i++;
                    }
                }
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            if (this.p != null) {
                throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
            }
            this.p = producer;
            c(null);
            c();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.c) {
                this.a.a((d<T>) t);
                c();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (!this.c) {
                this.c = true;
                try {
                    this.a.a(th);
                    c();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.c) {
                this.c = true;
                try {
                    this.a.c();
                    c();
                } finally {
                    unsubscribe();
                }
            }
        }

        void c(b<T> bVar) {
            b<T>[] b;
            long j;
            List<b<T>> list;
            boolean z;
            long j2;
            b<T>[] b2;
            if (!isUnsubscribed()) {
                synchronized (this) {
                    if (this.l) {
                        if (bVar != null) {
                            List list2 = this.q;
                            if (list2 == null) {
                                list2 = new ArrayList();
                                this.q = list2;
                            }
                            list2.add(bVar);
                        } else {
                            this.r = true;
                        }
                        this.m = true;
                        return;
                    }
                    this.l = true;
                    long j3 = this.n;
                    if (bVar != null) {
                        j = Math.max(j3, bVar.d.get());
                    } else {
                        j = j3;
                        for (b<T> bVar2 : b()) {
                            if (bVar2 != null) {
                                j = Math.max(j, bVar2.d.get());
                            }
                        }
                    }
                    a(j, j3);
                    while (!isUnsubscribed()) {
                        synchronized (this) {
                            if (!this.m) {
                                this.l = false;
                                return;
                            }
                            this.m = false;
                            list = this.q;
                            this.q = null;
                            z = this.r;
                            this.r = false;
                        }
                        long j4 = this.n;
                        if (list != null) {
                            long j5 = j4;
                            for (b<T> bVar3 : list) {
                                j5 = Math.max(j5, bVar3.d.get());
                            }
                            j2 = j5;
                        } else {
                            j2 = j4;
                        }
                        if (z) {
                            for (b<T> bVar4 : b()) {
                                if (bVar4 != null) {
                                    j2 = Math.max(j2, bVar4.d.get());
                                }
                            }
                        }
                        a(j2, j4);
                    }
                }
            }
        }

        b<T>[] b() {
            b<T>[] bVarArr;
            synchronized (this.g) {
                b<T>[] values = this.g.values();
                int length = values.length;
                bVarArr = new b[length];
                System.arraycopy(values, 0, bVarArr, 0, length);
            }
            return bVarArr;
        }

        void a(long j, long j2) {
            long j3 = this.o;
            Producer producer = this.p;
            long j4 = j - j2;
            if (j4 != 0) {
                this.n = j;
                if (producer != null) {
                    if (j3 != 0) {
                        this.o = 0L;
                        producer.request(j3 + j4);
                        return;
                    }
                    producer.request(j4);
                    return;
                }
                long j5 = j3 + j4;
                if (j5 < 0) {
                    j5 = Long.MAX_VALUE;
                }
                this.o = j5;
            } else if (j3 != 0 && producer != null) {
                this.o = 0L;
                producer.request(j3);
            }
        }

        void c() {
            b<T>[] bVarArr = this.h;
            if (this.j != this.i) {
                synchronized (this.g) {
                    bVarArr = this.h;
                    b<T>[] values = this.g.values();
                    int length = values.length;
                    if (bVarArr.length != length) {
                        bVarArr = new b[length];
                        this.h = bVarArr;
                    }
                    System.arraycopy(values, 0, bVarArr, 0, length);
                    this.j = this.i;
                }
            }
            d<T> dVar = this.a;
            for (b<T> bVar : bVarArr) {
                if (bVar != null) {
                    dVar.a((b) bVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        final e<T> a;
        Subscriber<? super T> b;
        Object c;
        final AtomicLong d = new AtomicLong();
        boolean e;
        boolean f;

        public b(e<T> eVar, Subscriber<? super T> subscriber) {
            this.a = eVar;
            this.b = subscriber;
        }

        @Override // rx.Producer
        public void request(long j) {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        if (j2 < 0 || j != 0) {
                            j3 = j2 + j;
                            if (j3 < 0) {
                                j3 = Long.MAX_VALUE;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                a(j);
                this.a.c(this);
                this.a.a.a((b) this);
            }
        }

        void a(long j) {
            long j2;
            long j3;
            do {
                j2 = this.d.get();
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!this.d.compareAndSet(j2, j3));
        }

        public long b(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j3 = j2 - j;
                if (j3 < 0) {
                    throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + ")");
                }
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.a.b(this);
                this.a.c(this);
                this.b = null;
            }
        }

        <U> U a() {
            return (U) this.c;
        }
    }

    /* loaded from: classes4.dex */
    static final class h<T> extends ArrayList<Object> implements d<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        final NotificationLite<T> a;
        volatile int b;

        public h(int i) {
            super(i);
            this.a = NotificationLite.instance();
        }

        @Override // rx.internal.operators.OperatorReplay.d
        public void a(T t) {
            add(this.a.next(t));
            this.b++;
        }

        @Override // rx.internal.operators.OperatorReplay.d
        public void a(Throwable th) {
            add(this.a.error(th));
            this.b++;
        }

        @Override // rx.internal.operators.OperatorReplay.d
        public void c() {
            add(this.a.completed());
            this.b++;
        }

        @Override // rx.internal.operators.OperatorReplay.d
        public void a(b<T> bVar) {
            synchronized (bVar) {
                if (bVar.e) {
                    bVar.f = true;
                    return;
                }
                bVar.e = true;
                while (!bVar.isUnsubscribed()) {
                    int i = this.b;
                    Integer num = (Integer) bVar.a();
                    int intValue = num != null ? num.intValue() : 0;
                    Subscriber<? super T> subscriber = bVar.b;
                    if (subscriber != null) {
                        long j = bVar.get();
                        long j2 = 0;
                        while (j2 != j && intValue < i) {
                            Object obj = get(intValue);
                            try {
                                if (!this.a.accept(subscriber, obj) && !bVar.isUnsubscribed()) {
                                    intValue++;
                                    j2++;
                                } else {
                                    return;
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                bVar.unsubscribe();
                                if (!this.a.isError(obj) && !this.a.isCompleted(obj)) {
                                    subscriber.onError(OnErrorThrowable.addValueAsLastCause(th, this.a.getValue(obj)));
                                    return;
                                }
                                return;
                            }
                        }
                        if (j2 != 0) {
                            bVar.c = Integer.valueOf(intValue);
                            if (j != Long.MAX_VALUE) {
                                bVar.b(j2);
                            }
                        }
                        synchronized (bVar) {
                            if (!bVar.f) {
                                bVar.e = false;
                                return;
                            }
                            bVar.f = false;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AtomicReference<c> {
        private static final long serialVersionUID = 245354315435971818L;
        final Object a;
        final long b;

        public c(Object obj, long j) {
            this.a = obj;
            this.b = j;
        }
    }

    /* loaded from: classes4.dex */
    static class a<T> extends AtomicReference<c> implements d<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        final NotificationLite<T> a = NotificationLite.instance();
        c b;
        int c;
        long d;

        public a() {
            c cVar = new c(null, 0L);
            this.b = cVar;
            set(cVar);
        }

        final void a(c cVar) {
            this.b.set(cVar);
            this.b = cVar;
            this.c++;
        }

        final void a() {
            c cVar = get().get();
            if (cVar == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.c--;
            b(cVar);
        }

        final void b(c cVar) {
            set(cVar);
        }

        c b() {
            return get();
        }

        @Override // rx.internal.operators.OperatorReplay.d
        public final void a(T t) {
            Object b = b(this.a.next(t));
            long j = this.d + 1;
            this.d = j;
            a(new c(b, j));
            d();
        }

        @Override // rx.internal.operators.OperatorReplay.d
        public final void a(Throwable th) {
            Object b = b(this.a.error(th));
            long j = this.d + 1;
            this.d = j;
            a(new c(b, j));
            e();
        }

        @Override // rx.internal.operators.OperatorReplay.d
        public final void c() {
            Object b = b(this.a.completed());
            long j = this.d + 1;
            this.d = j;
            a(new c(b, j));
            e();
        }

        @Override // rx.internal.operators.OperatorReplay.d
        public final void a(b<T> bVar) {
            Subscriber<? super T> subscriber;
            c cVar;
            synchronized (bVar) {
                if (bVar.e) {
                    bVar.f = true;
                    return;
                }
                bVar.e = true;
                while (!bVar.isUnsubscribed()) {
                    c cVar2 = (c) bVar.a();
                    if (cVar2 == null) {
                        cVar2 = b();
                        bVar.c = cVar2;
                        bVar.a(cVar2.b);
                    }
                    if (!bVar.isUnsubscribed() && (subscriber = bVar.b) != null) {
                        long j = bVar.get();
                        long j2 = 0;
                        while (true) {
                            cVar = cVar2;
                            if (j2 == j || (cVar2 = cVar.get()) == null) {
                                break;
                            }
                            Object c = c(cVar2.a);
                            try {
                                if (this.a.accept(subscriber, c)) {
                                    bVar.c = null;
                                    return;
                                }
                                j2++;
                                if (bVar.isUnsubscribed()) {
                                    return;
                                }
                            } catch (Throwable th) {
                                bVar.c = null;
                                Exceptions.throwIfFatal(th);
                                bVar.unsubscribe();
                                if (!this.a.isError(c) && !this.a.isCompleted(c)) {
                                    subscriber.onError(OnErrorThrowable.addValueAsLastCause(th, this.a.getValue(c)));
                                    return;
                                }
                                return;
                            }
                        }
                        if (j2 != 0) {
                            bVar.c = cVar;
                            if (j != Long.MAX_VALUE) {
                                bVar.b(j2);
                            }
                        }
                        synchronized (bVar) {
                            if (!bVar.f) {
                                bVar.e = false;
                                return;
                            }
                            bVar.f = false;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        Object b(Object obj) {
            return obj;
        }

        Object c(Object obj) {
            return obj;
        }

        void d() {
        }

        void e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int e;

        public g(int i) {
            this.e = i;
        }

        @Override // rx.internal.operators.OperatorReplay.a
        void d() {
            if (this.c > this.e) {
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final Scheduler e;
        final long f;
        final int g;

        public f(int i, long j, Scheduler scheduler) {
            this.e = scheduler;
            this.g = i;
            this.f = j;
        }

        @Override // rx.internal.operators.OperatorReplay.a
        Object b(Object obj) {
            return new Timestamped(this.e.now(), obj);
        }

        @Override // rx.internal.operators.OperatorReplay.a
        Object c(Object obj) {
            return ((Timestamped) obj).getValue();
        }

        @Override // rx.internal.operators.OperatorReplay.a
        c b() {
            long now = this.e.now() - this.f;
            c cVar = (c) get();
            c cVar2 = cVar;
            for (c cVar3 = cVar.get(); cVar3 != null && ((Timestamped) cVar3.a).getTimestampMillis() <= now; cVar3 = cVar3.get()) {
                cVar2 = cVar3;
            }
            return cVar2;
        }

        @Override // rx.internal.operators.OperatorReplay.a
        void d() {
            long now = this.e.now() - this.f;
            c cVar = (c) get();
            c cVar2 = cVar;
            int i = 0;
            c cVar3 = cVar.get();
            while (cVar3 != null) {
                if (this.c > this.g) {
                    i++;
                    this.c--;
                    cVar2 = cVar3;
                    cVar3 = cVar3.get();
                } else if (((Timestamped) cVar3.a).getTimestampMillis() > now) {
                    break;
                } else {
                    i++;
                    this.c--;
                    cVar2 = cVar3;
                    cVar3 = cVar3.get();
                }
            }
            if (i != 0) {
                b(cVar2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
            b(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
            return;
         */
        @Override // rx.internal.operators.OperatorReplay.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void e() {
            /*
                r9 = this;
                rx.Scheduler r0 = r9.e
                long r0 = r0.now()
                long r2 = r9.f
                long r4 = r0 - r2
                java.lang.Object r0 = r9.get()
                rx.internal.operators.OperatorReplay$c r0 = (rx.internal.operators.OperatorReplay.c) r0
                java.lang.Object r1 = r0.get()
                rx.internal.operators.OperatorReplay$c r1 = (rx.internal.operators.OperatorReplay.c) r1
                r2 = 0
                r3 = r0
                r8 = r1
                r1 = r2
                r2 = r8
            L1b:
                if (r2 == 0) goto L3f
                int r0 = r9.c
                r6 = 1
                if (r0 <= r6) goto L3f
                java.lang.Object r0 = r2.a
                rx.schedulers.Timestamped r0 = (rx.schedulers.Timestamped) r0
                long r6 = r0.getTimestampMillis()
                int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r0 > 0) goto L3f
                int r1 = r1 + 1
                int r0 = r9.c
                int r0 = r0 + (-1)
                r9.c = r0
                java.lang.Object r0 = r2.get()
                rx.internal.operators.OperatorReplay$c r0 = (rx.internal.operators.OperatorReplay.c) r0
                r3 = r2
                r2 = r0
                goto L1b
            L3f:
                if (r1 == 0) goto L44
                r9.b(r3)
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorReplay.f.e():void");
        }
    }
}
