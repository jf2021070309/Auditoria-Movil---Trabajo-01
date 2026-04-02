package com.amazon.aps.iva.ux;

import android.content.Context;
import com.amazon.aps.iva.cg.v;
import com.amazon.aps.iva.sd.g;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: WidgetsFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.rd.d {
    public final Context a = com.ellation.crunchyroll.application.e.b().getApplicationContext();
    public final EtpContentService b = com.ellation.crunchyroll.application.e.c().getEtpContentService();
    public final a c = a.h;
    public final d d;
    public final com.amazon.aps.iva.rd.b e;

    public e(v vVar, com.amazon.aps.iva.x50.e eVar) {
        this.d = new d(vVar);
        this.e = new com.amazon.aps.iva.rd.b(new b(eVar), new c(eVar));
    }

    @Override // com.amazon.aps.iva.rd.d
    public final com.amazon.aps.iva.xb0.a<Boolean> a() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.rd.d
    public final g b() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.rd.d
    public final EtpContentService getEtpContentService() {
        return this.b;
    }
}
