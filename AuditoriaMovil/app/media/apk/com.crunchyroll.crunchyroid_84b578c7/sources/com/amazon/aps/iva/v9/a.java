package com.amazon.aps.iva.v9;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: AbstractFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements ListenableFuture<V> {
    public static final boolean e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger f = Logger.getLogger(a.class.getName());
    public static final AbstractC0789a g;
    public static final Object h;
    public volatile Object b;
    public volatile d c;
    public volatile h d;

    /* compiled from: AbstractFuture.java */
    /* renamed from: com.amazon.aps.iva.v9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0789a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;
        public final Throwable b;

        static {
            if (a.e) {
                d = null;
                c = null;
                return;
            }
            d = new b(false, null);
            c = new b(true, null);
        }

        public b(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class c {
        public static final c b = new c(new C0790a());
        public final Throwable a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: com.amazon.aps.iva.v9.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0790a extends Throwable {
            public C0790a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            boolean z = a.e;
            th.getClass();
            this.a = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class d {
        public static final d d = new d(null, null);
        public final Runnable a;
        public final Executor b;
        public d c;

        public d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC0789a {
        public final AtomicReferenceFieldUpdater<h, Thread> a;
        public final AtomicReferenceFieldUpdater<h, h> b;
        public final AtomicReferenceFieldUpdater<a, h> c;
        public final AtomicReferenceFieldUpdater<a, d> d;
        public final AtomicReferenceFieldUpdater<a, Object> e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.amazon.aps.iva.v9.a.AbstractC0789a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // com.amazon.aps.iva.v9.a.AbstractC0789a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // com.amazon.aps.iva.v9.a.AbstractC0789a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == hVar);
            return false;
        }

        @Override // com.amazon.aps.iva.v9.a.AbstractC0789a
        public final void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // com.amazon.aps.iva.v9.a.AbstractC0789a
        public final void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class f<V> implements Runnable {
        public final a<V> b;
        public final ListenableFuture<? extends V> c;

        public f(a<V> aVar, ListenableFuture<? extends V> listenableFuture) {
            this.b = aVar;
            this.c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.b != this) {
                return;
            }
            if (a.g.b(this.b, this, a.e(this.c))) {
                a.b(this.b);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC0789a {
        @Override // com.amazon.aps.iva.v9.a.AbstractC0789a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.c == dVar) {
                    aVar.c = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.amazon.aps.iva.v9.a.AbstractC0789a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.b == obj) {
                    aVar.b = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.amazon.aps.iva.v9.a.AbstractC0789a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.d == hVar) {
                    aVar.d = hVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.amazon.aps.iva.v9.a.AbstractC0789a
        public final void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // com.amazon.aps.iva.v9.a.AbstractC0789a
        public final void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class h {
        public static final h c = new h(0);
        public volatile Thread a;
        public volatile h b;

        public h(int i) {
        }

        public h() {
            a.g.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0789a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "d"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        g = gVar;
        if (th != null) {
            f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.amazon.aps.iva.v9.a$a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.amazon.aps.iva.v9.a<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.amazon.aps.iva.v9.a] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.amazon.aps.iva.v9.a, com.amazon.aps.iva.v9.a<V>] */
    public static void b(a<?> aVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = ((a) aVar).d;
            if (g.c((a) aVar, hVar, h.c)) {
                while (hVar != null) {
                    Thread thread = hVar.a;
                    if (thread != null) {
                        hVar.a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.b;
                }
                do {
                    dVar = ((a) aVar).c;
                } while (!g.a((a) aVar, dVar, d.d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.c;
                    dVar3.c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.c;
                    Runnable runnable = dVar2.a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        aVar = fVar.b;
                        if (aVar.b == fVar) {
                            if (g.b(aVar, fVar, e(fVar.c))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Level level = Level.SEVERE;
            f.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object e(ListenableFuture<?> listenableFuture) {
        Object obj;
        if (listenableFuture instanceof a) {
            Object obj2 = ((a) listenableFuture).b;
            if (obj2 instanceof b) {
                b bVar = (b) obj2;
                if (bVar.a) {
                    if (bVar.b != null) {
                        return new b(false, bVar.b);
                    }
                    return b.d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!e) & isCancelled) {
            return b.d;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
                }
                return new b(false, e2);
            } catch (ExecutionException e3) {
                return new c(e3.getCause());
            } catch (Throwable th2) {
                return new c(th2);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return h;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        V v;
        String valueOf;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (v == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(v);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.c;
        d dVar2 = d.d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.c = dVar;
                if (g.a(this, dVar, dVar3)) {
                    return;
                }
                dVar = this.c;
            } while (dVar != dVar2);
            c(runnable, executor);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        b bVar;
        boolean z3;
        Object obj = this.b;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof f))) {
            return false;
        }
        if (e) {
            bVar = new b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = b.c;
        } else {
            bVar = b.d;
        }
        a<V> aVar = this;
        boolean z4 = false;
        while (true) {
            if (g.b(aVar, obj, bVar)) {
                b(aVar);
                if (!(obj instanceof f)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((f) obj).c;
                if (listenableFuture instanceof a) {
                    aVar = (a) listenableFuture;
                    obj = aVar.b;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(z3 | (obj instanceof f))) {
                        return true;
                    }
                    z4 = true;
                } else {
                    listenableFuture.cancel(z);
                    return true;
                }
            } else {
                obj = aVar.b;
                if (!(obj instanceof f)) {
                    return z4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V d(Object obj) throws ExecutionException {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).a);
        }
        Throwable th = ((b) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public final String f() {
        String valueOf;
        Object obj = this.b;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ListenableFuture<? extends V> listenableFuture = ((f) obj).c;
            if (listenableFuture == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(listenableFuture);
            }
            return defpackage.b.c(sb, valueOf, "]");
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void g(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.d;
            if (hVar2 == h.c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.b = hVar4;
                    if (hVar3.a == null) {
                        break;
                    }
                } else if (!g.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00ad -> B:56:0x00b3). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(long r18, java.util.concurrent.TimeUnit r20) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v9.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj;
        boolean z;
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof f)) & z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.b instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = f();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.b;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return d(obj2);
            }
            h hVar = this.d;
            h hVar2 = h.c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    AbstractC0789a abstractC0789a = g;
                    abstractC0789a.d(hVar3, hVar);
                    if (abstractC0789a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.b;
                            } else {
                                g(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return d(obj);
                    }
                    hVar = this.d;
                } while (hVar != hVar2);
                return d(this.b);
            }
            return d(this.b);
        }
        throw new InterruptedException();
    }
}
