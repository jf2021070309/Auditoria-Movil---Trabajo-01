package com.amazon.aps.iva.y30;

import com.amazon.aps.iva.ml.f;
import com.amazon.aps.iva.y30.h;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
/* compiled from: SettingsModule.kt */
/* loaded from: classes2.dex */
public final class g0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, n0> {
    public static final g0 h = new g0();

    public g0() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final n0 invoke(androidx.lifecycle.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        com.amazon.aps.iva.pm.c cVar = ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).c.a;
        EtpAccountService accountService = com.ellation.crunchyroll.application.e.c().getAccountService();
        com.amazon.aps.iva.oz.a aVar = com.amazon.aps.iva.oz.a.a;
        com.amazon.aps.iva.yb0.j.f(accountService, "accountService");
        com.amazon.aps.iva.jd.c cVar2 = new com.amazon.aps.iva.jd.c(accountService);
        com.amazon.aps.iva.d20.k kVar = new com.amazon.aps.iva.d20.k(com.ellation.crunchyroll.application.e.c().getAccountService(), com.ellation.crunchyroll.application.e.c().getJwtInvalidator(), h.a.a(null, 7), ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).c.a);
        com.amazon.aps.iva.ql.g gVar = com.amazon.aps.iva.ql.g.g;
        if (gVar != null) {
            com.amazon.aps.iva.pm.c cVar3 = ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).c.a;
            com.amazon.aps.iva.yb0.j.f(cVar3, "userProfileInteractor");
            com.amazon.aps.iva.ql.g gVar2 = com.amazon.aps.iva.ql.g.g;
            if (gVar2 != null) {
                return new n0(cVar, cVar2, kVar, gVar, new com.amazon.aps.iva.ql.e(gVar2, f.a.a(), cVar3), com.ellation.crunchyroll.application.f.a(null, 3), ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).p.c, ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).l.J(), ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).h.a);
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }
}
