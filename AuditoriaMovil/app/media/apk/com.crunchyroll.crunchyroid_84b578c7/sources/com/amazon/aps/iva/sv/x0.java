package com.amazon.aps.iva.sv;

import java.util.ArrayList;
import java.util.List;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class x0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ List<com.ellation.crunchyroll.downloading.e0> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ArrayList arrayList) {
        super(1);
        this.h = arrayList;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
        com.ellation.crunchyroll.downloading.g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
        g0Var2.M3(this.h);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
