package com.amazon.aps.iva.o40;

import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.api.etp.EtpNetworkModule;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: ShowContentInteractorFactory.kt */
/* loaded from: classes2.dex */
public final class e implements l<j, c> {
    @Override // com.amazon.aps.iva.xb0.l
    public final c invoke(j jVar) {
        j jVar2 = jVar;
        com.amazon.aps.iva.yb0.j.f(jVar2, "interactorInput");
        CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
        EtpNetworkModule e = CrunchyrollApplication.a.a().e();
        EtpContentService etpContentService = e.getEtpContentService();
        TalkboxService talkboxService = e.getTalkboxService();
        com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
        com.amazon.aps.iva.qu.b bVar = new com.amazon.aps.iva.qu.b(talkboxService);
        com.amazon.aps.iva.yb0.j.f(etpContentService, "contentApi");
        return new h(jVar2, etpContentService, bVar);
    }
}
