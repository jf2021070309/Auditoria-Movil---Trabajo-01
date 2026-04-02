package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.internal.operators.BackpressureUtils;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class ReplaySubject<T> extends Subject<T, T> {
    private static final Object[] c = new Object[0];
    final e<T> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface a<T> {
        void a();

        void a(T t);

        void a(Throwable th);

        void a(b<T> bVar);

        T[] a(T[] tArr);

        Throwable b();

        T c();

        int d();

        boolean e();
    }

    public static <T> ReplaySubject<T> create() {
        return create(16);
    }

    public static <T> ReplaySubject<T> create(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("capacity > 0 required but it was " + i);
        }
        return new ReplaySubject<>(new e(new f(i)));
    }

    public static <T> ReplaySubject<T> createWithSize(int i) {
        return new ReplaySubject<>(new e(new d(i)));
    }

    public static <T> ReplaySubject<T> createWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return createWithTimeAndSize(j, timeUnit, Integer.MAX_VALUE, scheduler);
    }

    public static <T> ReplaySubject<T> createWithTimeAndSize(long j, TimeUnit timeUnit, int i, Scheduler scheduler) {
        return new ReplaySubject<>(new e(new c(i, timeUnit.toMillis(j), scheduler)));
    }

    ReplaySubject(e<T> eVar) {
        super(eVar);
        this.b = eVar;
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.b.onNext(t);
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.b.onError(th);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.b.onCompleted();
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.b.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.b.a() && this.b.a.b() != null;
    }

    public boolean hasCompleted() {
        return this.b.a() && this.b.a.b() == null;
    }

    public Throwable getThrowable() {
        if (this.b.a()) {
            return this.b.a.b();
        }
        return null;
    }

    public int size() {
        return this.b.a.d();
    }

    public boolean hasAnyValue() {
        return !this.b.a.e();
    }

    public boolean hasValue() {
        return hasAnyValue();
    }

    public T[] getValues(T[] tArr) {
        return this.b.a.a((Object[]) tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] values = getValues(c);
        if (values == c) {
            return new Object[0];
        }
        return values;
    }

    public T getValue() {
        return this.b.a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e<T> extends AtomicReference<b<T>[]> implements Observable.OnSubscribe<T>, Observer<T> {
        static final b[] b = new b[0];
        static final b[] c = new b[0];
        private static final long serialVersionUID = 5952362471246910544L;
        final a<T> a;

        public e(a<T> aVar) {
            this.a = aVar;
            lazySet(b);
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber<? super T> subscriber) {
            b<T> bVar = new b<>(subscriber, this);
            subscriber.add(bVar);
            subscriber.setProducer(bVar);
            if (a(bVar) && bVar.isUnsubscribed()) {
                b(bVar);
            } else {
                this.a.a((b) bVar);
            }
        }

        boolean a(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = get();
                if (bVarArr == c) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!compareAndSet(bVarArr, bVarArr2));
            return true;
        }

        void b(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = get();
                if (bVarArr != c && bVarArr != b) {
                    int length = bVarArr.length;
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (bVarArr[i2] == bVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            bVarArr2 = b;
                        } else {
                            bVarArr2 = new b[length - 1];
                            System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                            System.arraycopy(bVarArr, i + 1, bVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(bVarArr, bVarArr2));
        }

        @Override // rx.Observer
        public void onNext(T t) {
            a<T> aVar = this.a;
            aVar.a((a<T>) t);
            for (b<T> bVar : get()) {
                aVar.a((b) bVar);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            a<T> aVar = this.a;
            aVar.a(th);
            ArrayList arrayList = null;
            for (b<T> bVar : getAndSet(c)) {
                try {
                    aVar.a((b) bVar);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }

        @Override // rx.Observer
        public void onCompleted() {
            a<T> aVar = this.a;
            aVar.a();
            for (b<T> bVar : getAndSet(c)) {
                aVar.a((b) bVar);
            }
        }

        boolean a() {
            return get() == c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f<T> implements a<T> {
        final int a;
        volatile int b;
        final Object[] c;
        Object[] d;
        int e;
        volatile boolean f;
        Throwable g;

        public f(int i) {
            this.a = i;
            Object[] objArr = new Object[i + 1];
            this.c = objArr;
            this.d = objArr;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a(T t) {
            if (!this.f) {
                int i = this.e;
                Object[] objArr = this.d;
                if (i == objArr.length - 1) {
                    Object[] objArr2 = new Object[objArr.length];
                    objArr2[0] = t;
                    this.e = 1;
                    objArr[i] = objArr2;
                    this.d = objArr2;
                } else {
                    objArr[i] = t;
                    this.e = i + 1;
                }
                this.b++;
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a(Throwable th) {
            if (this.f) {
                RxJavaHooks.onError(th);
                return;
            }
            this.g = th;
            this.f = true;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a() {
            this.f = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
            if (r8 != r12) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
            if (r10.isUnsubscribed() == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
            r18.f = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
            r7 = r17.f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
            if (r6 != r17.b) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
            if (r7 == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
            if (r5 == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
            r18.f = null;
            r2 = r17.g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
            if (r2 == null) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
            r10.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
            r10.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
            if (r8 == 0) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
            if (r12 == Long.MAX_VALUE) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
            rx.internal.operators.BackpressureUtils.produced(r18.b, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
            r18.d = r6;
            r18.e = r2;
            r18.f = r4;
            r2 = r18.addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
            if (r2 == 0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
            return;
         */
        @Override // rx.subjects.ReplaySubject.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(rx.subjects.ReplaySubject.b<T> r18) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.subjects.ReplaySubject.f.a(rx.subjects.ReplaySubject$b):void");
        }

        @Override // rx.subjects.ReplaySubject.a
        public Throwable b() {
            return this.g;
        }

        @Override // rx.subjects.ReplaySubject.a
        public T c() {
            int i = this.b;
            if (i == 0) {
                return null;
            }
            Object[] objArr = this.c;
            int i2 = this.a;
            while (i >= i2) {
                objArr = objArr[i2];
                i -= i2;
            }
            return (T) objArr[i - 1];
        }

        @Override // rx.subjects.ReplaySubject.a
        public int d() {
            return this.b;
        }

        @Override // rx.subjects.ReplaySubject.a
        public boolean e() {
            return this.b == 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object[]] */
        @Override // rx.subjects.ReplaySubject.a
        public T[] a(T[] tArr) {
            int i = this.b;
            if (tArr.length < i) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
            }
            Object[] objArr = this.c;
            int i2 = this.a;
            Object[] objArr2 = objArr;
            int i3 = 0;
            while (i3 + i2 < i) {
                System.arraycopy(objArr2, 0, tArr, i3, i2);
                objArr2 = objArr2[i2];
                i3 += i2;
            }
            System.arraycopy(objArr2, 0, tArr, i3, i - i3);
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class d<T> implements a<T> {
        final int a;
        volatile a<T> b;
        a<T> c;
        int d;
        volatile boolean e;
        Throwable f;

        public d(int i) {
            this.a = i;
            a<T> aVar = new a<>(null);
            this.c = aVar;
            this.b = aVar;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a(T t) {
            a<T> aVar = new a<>(t);
            this.c.set(aVar);
            this.c = aVar;
            int i = this.d;
            if (i == this.a) {
                this.b = this.b.get();
            } else {
                this.d = i + 1;
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a(Throwable th) {
            this.f = th;
            this.e = true;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a() {
            this.e = true;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a(b<T> bVar) {
            long j;
            a<T> aVar;
            if (bVar.getAndIncrement() == 0) {
                Subscriber<? super T> subscriber = bVar.a;
                int i = 1;
                while (true) {
                    int i2 = i;
                    long j2 = bVar.b.get();
                    long j3 = 0;
                    a<T> aVar2 = (a) bVar.f;
                    if (aVar2 == null) {
                        aVar2 = this.b;
                    }
                    while (true) {
                        j = j3;
                        aVar = aVar2;
                        if (j == j2) {
                            break;
                        } else if (subscriber.isUnsubscribed()) {
                            bVar.f = null;
                            return;
                        } else {
                            boolean z = this.e;
                            aVar2 = aVar.get();
                            boolean z2 = aVar2 == null;
                            if (z && z2) {
                                bVar.f = null;
                                Throwable th = this.f;
                                if (th != null) {
                                    subscriber.onError(th);
                                    return;
                                } else {
                                    subscriber.onCompleted();
                                    return;
                                }
                            } else if (z2) {
                                break;
                            } else {
                                subscriber.onNext((T) aVar2.a);
                                j3 = 1 + j;
                            }
                        }
                    }
                    if (j == j2) {
                        if (subscriber.isUnsubscribed()) {
                            bVar.f = null;
                            return;
                        }
                        boolean z3 = this.e;
                        boolean z4 = aVar.get() == null;
                        if (z3 && z4) {
                            bVar.f = null;
                            Throwable th2 = this.f;
                            if (th2 != null) {
                                subscriber.onError(th2);
                                return;
                            } else {
                                subscriber.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j != 0 && j2 != Long.MAX_VALUE) {
                        BackpressureUtils.produced(bVar.b, j);
                    }
                    bVar.f = aVar;
                    i = bVar.addAndGet(-i2);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        /* loaded from: classes4.dex */
        static final class a<T> extends AtomicReference<a<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T a;

            public a(T t) {
                this.a = t;
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public Throwable b() {
            return this.f;
        }

        @Override // rx.subjects.ReplaySubject.a
        public T c() {
            a<T> aVar = this.b;
            while (true) {
                a<T> aVar2 = aVar;
                aVar = aVar2.get();
                if (aVar == null) {
                    return aVar2.a;
                }
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public int d() {
            int i = 0;
            a<T> aVar = this.b.get();
            while (aVar != null && i != Integer.MAX_VALUE) {
                aVar = aVar.get();
                i++;
            }
            return i;
        }

        @Override // rx.subjects.ReplaySubject.a
        public boolean e() {
            return this.b.get() == null;
        }

        @Override // rx.subjects.ReplaySubject.a
        public T[] a(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            for (a<T> aVar = this.b.get(); aVar != null; aVar = aVar.get()) {
                arrayList.add(aVar.a);
            }
            return (T[]) arrayList.toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> implements a<T> {
        final int a;
        final long b;
        final Scheduler c;
        volatile a<T> d;
        a<T> e;
        int f;
        volatile boolean g;
        Throwable h;

        public c(int i, long j, Scheduler scheduler) {
            this.a = i;
            a<T> aVar = new a<>(null, 0L);
            this.e = aVar;
            this.d = aVar;
            this.b = j;
            this.c = scheduler;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a(T t) {
            a<T> aVar;
            int i;
            long now = this.c.now();
            a<T> aVar2 = new a<>(t, now);
            this.e.set(aVar2);
            this.e = aVar2;
            long j = now - this.b;
            int i2 = this.f;
            a<T> aVar3 = this.d;
            if (i2 == this.a) {
                i = i2;
                aVar = aVar3.get();
            } else {
                int i3 = i2 + 1;
                aVar = aVar3;
                i = i3;
            }
            while (true) {
                a<T> aVar4 = aVar.get();
                if (aVar4 == null || aVar4.b > j) {
                    break;
                }
                i--;
                aVar = aVar4;
            }
            this.f = i;
            if (aVar != aVar3) {
                this.d = aVar;
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a(Throwable th) {
            f();
            this.h = th;
            this.g = true;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a() {
            f();
            this.g = true;
        }

        void f() {
            long now = this.c.now() - this.b;
            a<T> aVar = this.d;
            a<T> aVar2 = aVar;
            while (true) {
                a<T> aVar3 = aVar2.get();
                if (aVar3 == null || aVar3.b > now) {
                    break;
                }
                aVar2 = aVar3;
            }
            if (aVar != aVar2) {
                this.d = aVar2;
            }
        }

        a<T> g() {
            a<T> aVar;
            long now = this.c.now() - this.b;
            a<T> aVar2 = this.d;
            while (true) {
                aVar = aVar2;
                aVar2 = aVar.get();
                if (aVar2 == null || aVar2.b > now) {
                    break;
                }
            }
            return aVar;
        }

        @Override // rx.subjects.ReplaySubject.a
        public void a(b<T> bVar) {
            long j;
            a<T> aVar;
            if (bVar.getAndIncrement() == 0) {
                Subscriber<? super T> subscriber = bVar.a;
                int i = 1;
                while (true) {
                    int i2 = i;
                    long j2 = bVar.b.get();
                    long j3 = 0;
                    a<T> aVar2 = (a) bVar.f;
                    if (aVar2 == null) {
                        aVar2 = g();
                    }
                    while (true) {
                        j = j3;
                        aVar = aVar2;
                        if (j == j2) {
                            break;
                        } else if (subscriber.isUnsubscribed()) {
                            bVar.f = null;
                            return;
                        } else {
                            boolean z = this.g;
                            aVar2 = aVar.get();
                            boolean z2 = aVar2 == null;
                            if (z && z2) {
                                bVar.f = null;
                                Throwable th = this.h;
                                if (th != null) {
                                    subscriber.onError(th);
                                    return;
                                } else {
                                    subscriber.onCompleted();
                                    return;
                                }
                            } else if (z2) {
                                break;
                            } else {
                                subscriber.onNext((T) aVar2.a);
                                j3 = 1 + j;
                            }
                        }
                    }
                    if (j == j2) {
                        if (subscriber.isUnsubscribed()) {
                            bVar.f = null;
                            return;
                        }
                        boolean z3 = this.g;
                        boolean z4 = aVar.get() == null;
                        if (z3 && z4) {
                            bVar.f = null;
                            Throwable th2 = this.h;
                            if (th2 != null) {
                                subscriber.onError(th2);
                                return;
                            } else {
                                subscriber.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j != 0 && j2 != Long.MAX_VALUE) {
                        BackpressureUtils.produced(bVar.b, j);
                    }
                    bVar.f = aVar;
                    i = bVar.addAndGet(-i2);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a<T> extends AtomicReference<a<T>> {
            private static final long serialVersionUID = 3713592843205853725L;
            final T a;
            final long b;

            public a(T t, long j) {
                this.a = t;
                this.b = j;
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public Throwable b() {
            return this.h;
        }

        @Override // rx.subjects.ReplaySubject.a
        public T c() {
            a<T> g = g();
            while (true) {
                a<T> aVar = g;
                g = aVar.get();
                if (g == null) {
                    return aVar.a;
                }
            }
        }

        @Override // rx.subjects.ReplaySubject.a
        public int d() {
            int i = 0;
            a<T> aVar = g().get();
            while (aVar != null && i != Integer.MAX_VALUE) {
                aVar = aVar.get();
                i++;
            }
            return i;
        }

        @Override // rx.subjects.ReplaySubject.a
        public boolean e() {
            return g().get() == null;
        }

        @Override // rx.subjects.ReplaySubject.a
        public T[] a(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            for (a<T> aVar = g().get(); aVar != null; aVar = aVar.get()) {
                arrayList.add(aVar.a);
            }
            return (T[]) arrayList.toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends AtomicInteger implements Producer, Subscription {
        private static final long serialVersionUID = -5006209596735204567L;
        final Subscriber<? super T> a;
        final AtomicLong b = new AtomicLong();
        final e<T> c;
        int d;
        int e;
        Object f;

        public b(Subscriber<? super T> subscriber, e<T> eVar) {
            this.a = subscriber;
            this.c = eVar;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.c.b(this);
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j > 0) {
                BackpressureUtils.getAndAddRequest(this.b, j);
                this.c.a.a((b) this);
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
        }
    }
}
