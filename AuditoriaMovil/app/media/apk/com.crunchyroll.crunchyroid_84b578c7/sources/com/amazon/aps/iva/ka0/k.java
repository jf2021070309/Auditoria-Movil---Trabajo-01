package com.amazon.aps.iva.ka0;

import com.amazon.aps.iva.ka0.p;
/* compiled from: MuxDataSdk.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class k extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.r<f, String, com.amazon.aps.iva.ga0.e, com.amazon.aps.iva.ca0.d, a0> {
    public k(p.b bVar) {
        super(4, bVar, p.b.class, "defaultMuxStats", "defaultMuxStats(Lcom/mux/stats/sdk/muxstats/IPlayerListener;Ljava/lang/String;Lcom/mux/stats/sdk/core/model/CustomerData;Lcom/mux/stats/sdk/core/CustomOptions;)Lcom/mux/stats/sdk/muxstats/MuxStats;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.r
    public final a0 K(f fVar, String str, com.amazon.aps.iva.ga0.e eVar, com.amazon.aps.iva.ca0.d dVar) {
        f fVar2 = fVar;
        String str2 = str;
        com.amazon.aps.iva.ga0.e eVar2 = eVar;
        com.amazon.aps.iva.ca0.d dVar2 = dVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "p0");
        com.amazon.aps.iva.yb0.j.f(str2, "p1");
        com.amazon.aps.iva.yb0.j.f(eVar2, "p2");
        com.amazon.aps.iva.yb0.j.f(dVar2, "p3");
        ((p.b) this.receiver).getClass();
        return new a0(fVar2, str2, eVar2, dVar2);
    }
}
