package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.j8.h;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: PagedListFactory.kt */
/* loaded from: classes2.dex */
public final class h implements g {
    public final com.crunchyroll.connectivity.d a;
    public final EtpContentService b;
    public final h.f c = new h.f(20, 20, true, 20);

    public h(com.crunchyroll.connectivity.d dVar, EtpContentService etpContentService) {
        this.a = dVar;
        this.b = etpContentService;
    }

    @Override // com.amazon.aps.iva.w40.g
    public final com.amazon.aps.iva.j8.h a(String str, t0 t0Var, u0 u0Var, v0 v0Var, com.amazon.aps.iva.se0.g0 g0Var) {
        EtpContentService etpContentService = this.b;
        com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
        q qVar = new q(new y(etpContentService, str), t0Var, u0Var, v0Var, g0Var);
        this.a.a(qVar);
        h.d dVar = new h.d(qVar, this.c);
        dVar.d = com.amazon.aps.iva.vu.a.a;
        dVar.c = com.amazon.aps.iva.vu.a.b;
        return dVar.a();
    }
}
