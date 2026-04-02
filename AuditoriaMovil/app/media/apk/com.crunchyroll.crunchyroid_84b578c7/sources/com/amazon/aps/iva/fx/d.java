package com.amazon.aps.iva.fx;

import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: DownloadingFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.zv.c, com.amazon.aps.iva.wy.j {
    public final /* synthetic */ com.amazon.aps.iva.q00.c b;

    public d() {
        CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
        EtpContentService etpContentService = CrunchyrollApplication.a.a().e().getEtpContentService();
        CrunchyrollApplication a = CrunchyrollApplication.a.a();
        if (q.a.a == null) {
            q.a.a = new r(a);
        }
        r rVar = q.a.a;
        com.amazon.aps.iva.yb0.j.c(rVar);
        com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
        this.b = new com.amazon.aps.iva.q00.c(etpContentService, rVar);
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
        this.b.cancelRunningApiCalls();
    }

    @Override // com.amazon.aps.iva.zv.c
    public final void w1(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.yb0.j.f(aVar, "onAccessible");
        com.amazon.aps.iva.q00.c cVar = this.b;
        cVar.getClass();
        com.amazon.aps.iva.se0.i.d(cVar, null, null, new com.amazon.aps.iva.q00.b(cVar, str, aVar2, aVar, null), 3);
    }
}
