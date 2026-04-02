package com.amazon.aps.iva.ka0;

import com.amazon.aps.iva.ka0.p;
/* compiled from: MuxDataSdk.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class n extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.q<a0, com.amazon.aps.iva.da0.f, Boolean, y> {
    public n(p.b bVar) {
        super(3, bVar, p.b.class, "defaultMuxStateCollector", "defaultMuxStateCollector(Lcom/mux/stats/sdk/muxstats/MuxStats;Lcom/mux/stats/sdk/core/events/IEventDispatcher;Z)Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final y invoke(a0 a0Var, com.amazon.aps.iva.da0.f fVar, Boolean bool) {
        a0 a0Var2 = a0Var;
        com.amazon.aps.iva.da0.f fVar2 = fVar;
        bool.booleanValue();
        com.amazon.aps.iva.yb0.j.f(a0Var2, "p0");
        com.amazon.aps.iva.yb0.j.f(fVar2, "p1");
        ((p.b) this.receiver).getClass();
        return new y(a0Var2, fVar2);
    }
}
