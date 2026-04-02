package com.amazon.aps.iva.kw;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.sv.v1;
/* compiled from: OfflinePlayheadMonitor.kt */
/* loaded from: classes2.dex */
public final class c implements g0 {
    public final o b;
    public final com.amazon.aps.iva.sk.a c;
    public final com.amazon.aps.iva.mg.a d;
    public final g0 e;

    public c(o oVar, com.amazon.aps.iva.sk.a aVar, v1 v1Var, com.amazon.aps.iva.sv.d dVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "appLifecycle");
        com.amazon.aps.iva.yb0.j.f(aVar, "playerPlayheadMonitor");
        com.amazon.aps.iva.yb0.j.f(dVar, "coroutineScope");
        this.b = oVar;
        this.c = aVar;
        this.d = v1Var;
        this.e = dVar;
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.e.getCoroutineContext();
    }
}
