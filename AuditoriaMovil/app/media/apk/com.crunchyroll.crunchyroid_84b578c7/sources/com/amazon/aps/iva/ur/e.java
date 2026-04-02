package com.amazon.aps.iva.ur;

import com.amazon.aps.iva.tr.a;
import java.io.Closeable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PendingTrace.java */
/* loaded from: classes2.dex */
public final class e extends LinkedList<com.amazon.aps.iva.ur.a> {
    public static final AtomicReference<a> l = new AtomicReference<>();
    public final c b;
    public final BigInteger c;
    public final ReferenceQueue f = new ReferenceQueue();
    public final Set<WeakReference<?>> g = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicInteger i = new AtomicInteger(0);
    public final AtomicReference<WeakReference<com.amazon.aps.iva.ur.a>> j = new AtomicReference<>();
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final long d = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    public final long e = System.nanoTime();

    /* compiled from: PendingTrace.java */
    /* loaded from: classes2.dex */
    public static class a implements Runnable, Closeable {
        public final Set<e> b = Collections.newSetFromMap(new ConcurrentHashMap());

        public a() {
            com.amazon.aps.iva.tr.a aVar = com.amazon.aps.iva.tr.a.c;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.getClass();
            if (!aVar.isShutdown()) {
                try {
                    new WeakReference(this);
                    aVar.b.scheduleAtFixedRate(new a.RunnableC0747a(this), 0L, 1L, timeUnit);
                } catch (RejectedExecutionException unused) {
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            run();
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (e eVar : this.b) {
                synchronized (eVar) {
                    while (true) {
                        Reference poll = eVar.f.poll();
                        if (poll != null) {
                            eVar.g.remove(poll);
                            if (eVar.k.compareAndSet(false, true)) {
                                a aVar = e.l.get();
                                if (aVar != null) {
                                    aVar.b.remove(eVar);
                                }
                                eVar.b.c.d0();
                            }
                            eVar.d();
                        }
                    }
                }
            }
        }
    }

    /* compiled from: PendingTrace.java */
    /* loaded from: classes2.dex */
    public static class b implements a.c<a> {
        public static final b a = new b();
    }

    public e(c cVar, BigInteger bigInteger) {
        this.b = cVar;
        this.c = bigInteger;
        a aVar = l.get();
        if (aVar != null) {
            aVar.b.add(this);
        }
    }

    @Override // java.util.LinkedList, java.util.Deque
    /* renamed from: b */
    public final void addFirst(com.amazon.aps.iva.ur.a aVar) {
        super.addFirst(aVar);
        this.i.incrementAndGet();
    }

    public final void d() {
        if (this.h.decrementAndGet() == 0) {
            synchronized (this) {
                if (this.k.compareAndSet(false, true)) {
                    a aVar = l.get();
                    if (aVar != null) {
                        aVar.b.remove(this);
                    }
                    if (!isEmpty()) {
                        this.b.a(this);
                    }
                }
            }
        } else if (this.b.i > 0 && size() > this.b.i) {
            synchronized (this) {
                if (size() > this.b.i) {
                    com.amazon.aps.iva.ur.a f = f();
                    ArrayList arrayList = new ArrayList(size());
                    Iterator<com.amazon.aps.iva.ur.a> it = iterator();
                    while (it.hasNext()) {
                        com.amazon.aps.iva.ur.a next = it.next();
                        if (next != f) {
                            arrayList.add(next);
                            this.i.decrementAndGet();
                            it.remove();
                        }
                    }
                    this.b.a(arrayList);
                }
            }
        }
    }

    public final void e(com.amazon.aps.iva.ur.a aVar, boolean z) {
        com.amazon.aps.iva.ur.b bVar;
        BigInteger bigInteger = this.c;
        if (bigInteger == null || (bVar = aVar.b) == null || !bigInteger.equals(bVar.d)) {
            return;
        }
        synchronized (aVar) {
            if (aVar.f == null) {
                return;
            }
            this.g.remove(aVar.f);
            aVar.f.clear();
            aVar.f = null;
            if (z) {
                d();
            } else {
                this.h.decrementAndGet();
            }
        }
    }

    public final com.amazon.aps.iva.ur.a f() {
        WeakReference<com.amazon.aps.iva.ur.a> weakReference = this.j.get();
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final int size() {
        return this.i.get();
    }
}
