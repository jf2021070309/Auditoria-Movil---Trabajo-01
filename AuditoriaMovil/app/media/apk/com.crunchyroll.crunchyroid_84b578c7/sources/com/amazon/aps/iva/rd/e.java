package com.amazon.aps.iva.rd;

import android.content.Context;
import androidx.lifecycle.m;
import com.amazon.aps.iva.nz.b;
import com.amazon.aps.iva.ob0.h;
import com.amazon.aps.iva.se0.d1;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.connectivity.d;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: WidgetsFeature.kt */
/* loaded from: classes.dex */
public final class e implements d {
    public final /* synthetic */ d a;
    public final g b;

    public e(com.amazon.aps.iva.ux.e eVar) {
        this.a = eVar;
        m mVar = m.j;
        d1 d1Var = d1.b;
        Context context = eVar.a;
        j.f(context, "context");
        com.amazon.aps.iva.sd.d dVar = new com.amazon.aps.iva.sd.d(context, d1Var);
        h hVar = h.b;
        com.amazon.aps.iva.nz.c cVar = b.a.a;
        if (cVar == null) {
            cVar = new com.amazon.aps.iva.nz.c(hVar);
            b.a.a = cVar;
        }
        com.crunchyroll.connectivity.d a = d.a.a(context, mVar.g);
        b bVar = eVar.e;
        j.f(bVar, "playheadUpdateEligibilityHandler");
        this.b = new g(bVar, dVar, cVar, a);
    }

    @Override // com.amazon.aps.iva.rd.d
    public final com.amazon.aps.iva.xb0.a<Boolean> a() {
        return this.a.a();
    }

    @Override // com.amazon.aps.iva.rd.d
    public final com.amazon.aps.iva.sd.g b() {
        return this.a.b();
    }

    @Override // com.amazon.aps.iva.rd.d
    public final EtpContentService getEtpContentService() {
        return this.a.getEtpContentService();
    }
}
