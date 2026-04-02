package c.c0.d0.t.s;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class a<V> implements e.d.c.a.a.a<V> {
    public static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f1575b = Logger.getLogger(a.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final b f1576c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f1577d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f1578e;

    /* renamed from: f  reason: collision with root package name */
    public volatile e f1579f;

    /* renamed from: g  reason: collision with root package name */
    public volatile i f1580g;

    /* loaded from: classes.dex */
    public static abstract class b {
        public b(C0024a c0024a) {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final c a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f1581b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f1582c;

        /* renamed from: d  reason: collision with root package name */
        public final Throwable f1583d;

        static {
            if (a.a) {
                f1581b = null;
                a = null;
                return;
            }
            f1581b = new c(false, null);
            a = new c(true, null);
        }

        public c(boolean z, Throwable th) {
            this.f1582c = z;
            this.f1583d = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static final d a = new d(new C0025a("Failure occurred while trying to finish a future."));

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f1584b;

        /* renamed from: c.c0.d0.t.s.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0025a extends Throwable {
            public C0025a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            boolean z = a.a;
            Objects.requireNonNull(th);
            this.f1584b = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static final e a = new e(null, null);

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f1585b;

        /* renamed from: c  reason: collision with root package name */
        public final Executor f1586c;

        /* renamed from: d  reason: collision with root package name */
        public e f1587d;

        public e(Runnable runnable, Executor executor) {
            this.f1585b = runnable;
            this.f1586c = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<i, Thread> a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f1588b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, i> f1589c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f1590d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f1591e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.a = atomicReferenceFieldUpdater;
            this.f1588b = atomicReferenceFieldUpdater2;
            this.f1589c = atomicReferenceFieldUpdater3;
            this.f1590d = atomicReferenceFieldUpdater4;
            this.f1591e = atomicReferenceFieldUpdater5;
        }

        @Override // c.c0.d0.t.s.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f1590d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // c.c0.d0.t.s.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f1591e.compareAndSet(aVar, obj, obj2);
        }

        @Override // c.c0.d0.t.s.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return this.f1589c.compareAndSet(aVar, iVar, iVar2);
        }

        @Override // c.c0.d0.t.s.a.b
        public void d(i iVar, i iVar2) {
            this.f1588b.lazySet(iVar, iVar2);
        }

        @Override // c.c0.d0.t.s.a.b
        public void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {
        public final a<V> a;

        /* renamed from: b  reason: collision with root package name */
        public final e.d.c.a.a.a<? extends V> f1592b;

        public g(a<V> aVar, e.d.c.a.a.a<? extends V> aVar2) {
            this.a = aVar;
            this.f1592b = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.f1578e != this) {
                return;
            }
            if (a.f1576c.b(this.a, this, a.f(this.f1592b))) {
                a.c(this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super(null);
        }

        @Override // c.c0.d0.t.s.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1579f == eVar) {
                    aVar.f1579f = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // c.c0.d0.t.s.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1578e == obj) {
                    aVar.f1578e = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // c.c0.d0.t.s.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f1580g == iVar) {
                    aVar.f1580g = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // c.c0.d0.t.s.a.b
        public void d(i iVar, i iVar2) {
            iVar.f1594c = iVar2;
        }

        @Override // c.c0.d0.t.s.a.b
        public void e(i iVar, Thread thread) {
            iVar.f1593b = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class i {
        public static final i a = new i(false);

        /* renamed from: b  reason: collision with root package name */
        public volatile Thread f1593b;

        /* renamed from: c  reason: collision with root package name */
        public volatile i f1594c;

        public i() {
            a.f1576c.e(this, Thread.currentThread());
        }

        public i(boolean z) {
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "g"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "f"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, e.c.a.l.e.a));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f1576c = hVar;
        if (th != null) {
            f1575b.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1577d = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [c.c0.d0.t.s.a$b] */
    /* JADX WARN: Type inference failed for: r5v0, types: [c.c0.d0.t.s.a<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c.c0.d0.t.s.a] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [c.c0.d0.t.s.a, c.c0.d0.t.s.a<V>] */
    public static void c(a<?> aVar) {
        e eVar;
        e eVar2;
        e eVar3 = null;
        while (true) {
            i iVar = ((a) aVar).f1580g;
            if (f1576c.c((a) aVar, iVar, i.a)) {
                while (iVar != null) {
                    Thread thread = iVar.f1593b;
                    if (thread != null) {
                        iVar.f1593b = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.f1594c;
                }
                do {
                    eVar = ((a) aVar).f1579f;
                } while (!f1576c.a((a) aVar, eVar, e.a));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f1587d;
                    eVar3.f1587d = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f1587d;
                    Runnable runnable = eVar2.f1585b;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        aVar = gVar.a;
                        if (aVar.f1578e == gVar) {
                            if (f1576c.b(aVar, gVar, f(gVar.f1592b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, eVar2.f1586c);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f1575b;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(e.d.c.a.a.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f1578e;
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f1582c ? cVar.f1583d != null ? new c(false, cVar.f1583d) : c.f1581b : obj;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!a) && isCancelled) {
            return c.f1581b;
        }
        try {
            Object g2 = g(aVar);
            return g2 == null ? f1577d : g2;
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e2));
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    public static <V> V g(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    @Override // e.d.c.a.a.a
    public final void a(Runnable runnable, Executor executor) {
        Objects.requireNonNull(runnable);
        Objects.requireNonNull(executor);
        e eVar = this.f1579f;
        if (eVar == e.a) {
            d(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f1587d = eVar;
            if (f1576c.a(this, eVar, eVar2)) {
                return;
            }
            eVar = this.f1579f;
        } while (eVar != e.a);
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g2 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g2 == this ? "this future" : String.valueOf(g2));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f1578e;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = a ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.a : c.f1581b;
        boolean z2 = false;
        a<V> aVar = this;
        while (true) {
            if (f1576c.b(aVar, obj, cVar)) {
                c(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                e.d.c.a.a.a<? extends V> aVar2 = ((g) obj).f1592b;
                if (!(aVar2 instanceof a)) {
                    aVar2.cancel(z);
                    return true;
                }
                aVar = (a) aVar2;
                obj = aVar.f1578e;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = aVar.f1578e;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V e(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            Throwable th = ((c) obj).f1583d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1584b);
        } else {
            if (obj == f1577d) {
                return null;
            }
            return obj;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f1578e;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return e(obj2);
        }
        i iVar = this.f1580g;
        if (iVar != i.a) {
            i iVar2 = new i();
            do {
                b bVar = f1576c;
                bVar.d(iVar2, iVar);
                if (bVar.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            i(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f1578e;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return e(obj);
                }
                iVar = this.f1580g;
            } while (iVar != i.a);
            return e(this.f1578e);
        }
        return e(this.f1578e);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1578e;
        if ((obj != null) && (!(obj instanceof g))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f1580g;
            if (iVar != i.a) {
                i iVar2 = new i();
                do {
                    b bVar = f1576c;
                    bVar.d(iVar2, iVar);
                    if (bVar.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1578e;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(iVar2);
                    } else {
                        iVar = this.f1580g;
                    }
                } while (iVar != i.a);
                return e(this.f1578e);
            }
            return e(this.f1578e);
        }
        while (nanos > 0) {
            Object obj3 = this.f1578e;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String k2 = e.a.d.a.a.k(str, " (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = k2 + convert + " " + lowerCase;
                if (z) {
                    str2 = e.a.d.a.a.k(str2, ",");
                }
                k2 = e.a.d.a.a.k(str2, " ");
            }
            if (z) {
                k2 = k2 + nanos2 + " nanoseconds ";
            }
            str = e.a.d.a.a.k(k2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(e.a.d.a.a.k(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(e.a.d.a.a.l(str, " for ", aVar));
    }

    public String h() {
        Object obj = this.f1578e;
        if (obj instanceof g) {
            StringBuilder y = e.a.d.a.a.y("setFuture=[");
            e.d.c.a.a.a<? extends V> aVar = ((g) obj).f1592b;
            return e.a.d.a.a.r(y, aVar == this ? "this future" : String.valueOf(aVar), "]");
        } else if (this instanceof ScheduledFuture) {
            StringBuilder y2 = e.a.d.a.a.y("remaining delay=[");
            y2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            y2.append(" ms]");
            return y2.toString();
        } else {
            return null;
        }
    }

    public final void i(i iVar) {
        iVar.f1593b = null;
        while (true) {
            i iVar2 = this.f1580g;
            if (iVar2 == i.a) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f1594c;
                if (iVar2.f1593b != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f1594c = iVar4;
                    if (iVar3.f1593b == null) {
                        break;
                    }
                } else if (!f1576c.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1578e instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f1578e;
        return (!(obj instanceof g)) & (obj != null);
    }

    public String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f1578e instanceof c) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                sb = h();
            } catch (RuntimeException e2) {
                StringBuilder y = e.a.d.a.a.y("Exception thrown from implementation: ");
                y.append(e2.getClass());
                sb = y.toString();
            }
            if (sb != null && !sb.isEmpty()) {
                e.a.d.a.a.L(sb2, "PENDING, info=[", sb, "]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
