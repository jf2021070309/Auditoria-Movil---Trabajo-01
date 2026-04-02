package com.amazon.aps.iva.z3;

import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.ue0.i;
import com.amazon.aps.iva.z3.q;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: SimpleActor.kt */
/* loaded from: classes.dex */
public final class p<T> {
    public final g0 a;
    public final com.amazon.aps.iva.xb0.p<T, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> b;
    public final com.amazon.aps.iva.ue0.a c;
    public final AtomicInteger d;

    public p(g0 g0Var, r rVar, s sVar, t tVar) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "scope");
        com.amazon.aps.iva.yb0.j.f(sVar, "onUndeliveredElement");
        this.a = g0Var;
        this.b = tVar;
        this.c = com.amazon.aps.iva.dg.b.c(Integer.MAX_VALUE, null, 6);
        this.d = new AtomicInteger(0);
        j1 j1Var = (j1) g0Var.getCoroutineContext().get(j1.b.b);
        if (j1Var != null) {
            j1Var.s0(new n(rVar, this, sVar));
        }
    }

    public final void a(q.a aVar) {
        i.a aVar2;
        Object h = this.c.h(aVar);
        boolean z = h instanceof i.a;
        Throwable th = null;
        if (z) {
            if (z) {
                aVar2 = (i.a) h;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                th = aVar2.a;
            }
            if (th == null) {
                throw new com.amazon.aps.iva.ue0.l("Channel was closed normally");
            }
        } else if (!(h instanceof i.b)) {
            if (this.d.getAndIncrement() == 0) {
                com.amazon.aps.iva.se0.i.d(this.a, null, null, new o(this, null), 3);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
