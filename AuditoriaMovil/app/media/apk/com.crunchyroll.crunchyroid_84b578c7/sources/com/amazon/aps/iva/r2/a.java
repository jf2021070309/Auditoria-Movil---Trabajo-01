package com.amazon.aps.iva.r2;

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
/* compiled from: AbstractResolvableFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements ListenableFuture<V> {
    public static final boolean e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger f = Logger.getLogger(a.class.getName());
    public static final AbstractC0660a g;
    public static final Object h;
    public volatile Object b;
    public volatile d c;
    public volatile h d;

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: com.amazon.aps.iva.r2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0660a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final b b;
        public static final b c;
        public final Throwable a;

        static {
            if (a.e) {
                c = null;
                b = null;
                return;
            }
            c = new b(false, null);
            b = new b(true, null);
        }

        public b(boolean z, Throwable th) {
            this.a = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final Throwable a;

        /* compiled from: AbstractResolvableFuture.java */
        /* renamed from: com.amazon.aps.iva.r2.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0661a extends Throwable {
            public C0661a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0661a());
        }

        public c(Throwable th) {
            boolean z = a.e;
            th.getClass();
            this.a = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
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

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC0660a {
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

        @Override // com.amazon.aps.iva.r2.a.AbstractC0660a
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

        @Override // com.amazon.aps.iva.r2.a.AbstractC0660a
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

        @Override // com.amazon.aps.iva.r2.a.AbstractC0660a
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

        @Override // com.amazon.aps.iva.r2.a.AbstractC0660a
        public final void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // com.amazon.aps.iva.r2.a.AbstractC0660a
        public final void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC0660a {
        @Override // com.amazon.aps.iva.r2.a.AbstractC0660a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.c == dVar) {
                    aVar.c = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.amazon.aps.iva.r2.a.AbstractC0660a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.b == obj) {
                    aVar.b = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.amazon.aps.iva.r2.a.AbstractC0660a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.d == hVar) {
                    aVar.d = hVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.amazon.aps.iva.r2.a.AbstractC0660a
        public final void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // com.amazon.aps.iva.r2.a.AbstractC0660a
        public final void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
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
        AbstractC0660a gVar;
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

    public static void b(a<?> aVar) {
        h hVar;
        d dVar;
        do {
            hVar = aVar.d;
        } while (!g.c(aVar, hVar, h.c));
        while (hVar != null) {
            Thread thread = hVar.a;
            if (thread != null) {
                hVar.a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.b;
        }
        do {
            dVar = aVar.c;
        } while (!g.a(aVar, dVar, d.d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.c;
            dVar.c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.c;
            Runnable runnable = dVar2.a;
            if (!(runnable instanceof f)) {
                c(runnable, dVar2.b);
                dVar2 = dVar4;
            } else {
                ((f) runnable).getClass();
                throw null;
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
            bVar = b.b;
        } else {
            bVar = b.c;
        }
        while (!g.b(this, obj, bVar)) {
            obj = this.b;
            if (!(obj instanceof f)) {
                return false;
            }
        }
        b(this);
        if (!(obj instanceof f)) {
            return true;
        }
        ((f) obj).getClass();
        throw null;
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
        Throwable th = ((b) obj).a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public String e() {
        Object obj = this.b;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ((f) obj).getClass();
            sb.append("null");
            sb.append("]");
            return sb.toString();
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void f(h hVar) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r2.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
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
                str = e();
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
                    AbstractC0660a abstractC0660a = g;
                    abstractC0660a.d(hVar3, hVar);
                    if (abstractC0660a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.b;
                            } else {
                                f(hVar3);
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
