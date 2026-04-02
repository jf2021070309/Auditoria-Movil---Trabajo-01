package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.q5.u0;
import com.amazon.aps.iva.t5.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.common.collect.UnmodifiableIterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements o.a, com.amazon.aps.iva.t5.g, p1.e, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        com.amazon.aps.iva.b8.p1 p1Var = (com.amazon.aps.iva.b8.p1) this.c;
        com.amazon.aps.iva.q5.u0 u0Var = (com.amazon.aps.iva.q5.u0) this.d;
        v1 v1Var = (v1) obj;
        int i = com.amazon.aps.iva.b8.p1.i;
        p1Var.getClass();
        if (!u0Var.z.isEmpty()) {
            u0.a c = u0Var.a().c();
            UnmodifiableIterator<com.amazon.aps.iva.q5.t0> it = u0Var.z.values().iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.q5.t0 next = it.next();
                com.amazon.aps.iva.q5.s0 s0Var = p1Var.g.inverse().get(next.b.c);
                if (s0Var != null && next.b.b == s0Var.b) {
                    c.a(new com.amazon.aps.iva.q5.t0(s0Var, next.c));
                } else {
                    c.a(next);
                }
            }
            u0Var = c.b();
        }
        v1Var.D(u0Var);
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        com.amazon.aps.iva.b8.o oVar = (com.amazon.aps.iva.b8.o) tVar;
        int i2 = com.amazon.aps.iva.b8.p1.i;
        oVar.getClass();
        com.amazon.aps.iva.cq.b.D(dVar.d);
        synchronized (oVar.a) {
            throw null;
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Object lambda$logAndUpdateState$5;
        lambda$logAndUpdateState$5 = ((Uploader) this.c).lambda$logAndUpdateState$5((Iterable) this.d);
        return lambda$logAndUpdateState$5;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((b) obj).y((b.a) obj3, (String) obj2);
                return;
            case 1:
                ((b) obj).F((b.a) obj3, (com.amazon.aps.iva.o6.t) obj2);
                return;
            case 2:
                ((b) obj).w((b.a) obj3, (com.amazon.aps.iva.q5.f0) obj2);
                return;
            default:
                ((b) obj).K((b.a) obj3, (com.amazon.aps.iva.a6.f) obj2);
                return;
        }
    }

    public /* synthetic */ g0(String str, com.amazon.aps.iva.b8.l lVar) {
        this.b = 5;
        this.d = str;
        this.c = lVar;
    }
}
