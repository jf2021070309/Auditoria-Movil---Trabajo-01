package com.amazon.aps.iva.tz;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: BrowseAllInteractor.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.wy.i implements m {
    public final EtpContentService b;

    public q(EtpContentService etpContentService) {
        com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
        this.b = etpContentService;
    }

    public static final String m(q qVar, List list) {
        String B0 = com.amazon.aps.iva.lb0.x.B0(list, ",", null, null, p.h, 30);
        if (!(!com.amazon.aps.iva.oe0.m.b0(B0))) {
            return null;
        }
        return B0;
    }

    @Override // com.amazon.aps.iva.tz.m
    public final void M(LinkedHashMap linkedHashMap, List list, b bVar, c cVar) {
        com.amazon.aps.iva.yb0.j.f(list, "genres");
        com.amazon.aps.iva.se0.i.d(this, null, null, new n(bVar, cVar, this, linkedHashMap, list, null), 3);
    }

    @Override // com.amazon.aps.iva.tz.m
    public final void h1(int i, int i2, LinkedHashMap linkedHashMap, List list, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2) {
        com.amazon.aps.iva.yb0.j.f(list, "genres");
        com.amazon.aps.iva.se0.i.d(this, null, null, new o(lVar, lVar2, this, i, i2, linkedHashMap, list, null), 3);
    }
}
