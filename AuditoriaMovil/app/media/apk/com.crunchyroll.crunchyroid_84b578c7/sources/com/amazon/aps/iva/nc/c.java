package com.amazon.aps.iva.nc;

import com.amazon.aps.iva.nc.q;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class c {
    public final boolean a;
    public final Executor b;
    public final HashMap c;
    public final ReferenceQueue<q<?>> d;
    public q.a e;

    /* compiled from: ActiveResources.java */
    /* loaded from: classes.dex */
    public static final class a extends WeakReference<q<?>> {
        public final com.amazon.aps.iva.kc.f a;
        public final boolean b;
        public w<?> c;

        public a(com.amazon.aps.iva.kc.f fVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z) {
            super(qVar, referenceQueue);
            w<?> wVar;
            defpackage.i.l(fVar);
            this.a = fVar;
            if (qVar.b && z) {
                wVar = qVar.d;
                defpackage.i.l(wVar);
            } else {
                wVar = null;
            }
            this.c = wVar;
            this.b = qVar.b;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new com.amazon.aps.iva.nc.a());
        this.c = new HashMap();
        this.d = new ReferenceQueue<>();
        this.a = false;
        this.b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new b(this));
    }

    public final synchronized void a(com.amazon.aps.iva.kc.f fVar, q<?> qVar) {
        a aVar = (a) this.c.put(fVar, new a(fVar, qVar, this.d, this.a));
        if (aVar != null) {
            aVar.c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        w<?> wVar;
        synchronized (this) {
            this.c.remove(aVar.a);
            if (aVar.b && (wVar = aVar.c) != null) {
                this.e.a(aVar.a, new q<>(wVar, true, false, aVar.a, this.e));
            }
        }
    }
}
