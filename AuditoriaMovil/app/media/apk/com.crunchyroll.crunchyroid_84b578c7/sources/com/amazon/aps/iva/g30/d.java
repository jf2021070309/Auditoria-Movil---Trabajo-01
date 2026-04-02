package com.amazon.aps.iva.g30;

import com.amazon.aps.iva.js.i;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.js.q;
import com.amazon.aps.iva.js.r;
import com.amazon.aps.iva.ks.j;
import com.amazon.aps.iva.ks.s;
import com.amazon.aps.iva.ks.u;
import com.amazon.aps.iva.rs.p;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: SubscriptionSuccessAnalytics.kt */
/* loaded from: classes2.dex */
public class d implements c {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.vw.a b;
    public final com.amazon.aps.iva.fs.c c;

    public d(com.amazon.aps.iva.fs.c cVar, com.amazon.aps.iva.vw.a aVar) {
        com.amazon.aps.iva.ds.c cVar2 = com.amazon.aps.iva.ds.c.b;
        j.f(cVar, "screenLoadingTimer");
        this.a = cVar2;
        this.b = aVar;
        this.c = cVar;
    }

    @Override // com.amazon.aps.iva.g30.c
    public final void b(p pVar, l0 l0Var, String str, String str2, com.amazon.aps.iva.ks.j jVar, i iVar) {
        boolean z;
        r rVar;
        q qVar;
        com.amazon.aps.iva.ks.g gVar;
        j.f(pVar, FirebaseAnalytics.Event.PURCHASE);
        j.f(l0Var, "upsellType");
        j.f(iVar, "eventSourceProperty");
        s sVar = new s(pVar.b, pVar.c);
        if (j.a(jVar, j.c.a)) {
            l0Var = l0.FREE_TRIAL;
        }
        u uVar = new u(l0Var);
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            rVar = new r(str);
        } else {
            rVar = null;
        }
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            qVar = new q(str2);
        } else {
            qVar = null;
        }
        com.amazon.aps.iva.vw.a aVar = this.b;
        if (aVar != null) {
            gVar = aVar.y();
        } else {
            gVar = null;
        }
        if (jVar != null) {
            iVar = i.CR_VOD_INTRO_OFFER;
        }
        this.a.e(new com.amazon.aps.iva.es.j(sVar, uVar, rVar, qVar, gVar, iVar, jVar));
    }

    public final void c() {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.CHECKOUT_SUCCESS;
        float a = this.c.a();
        com.amazon.aps.iva.vw.a aVar2 = this.b;
        if (aVar2 != null) {
            gVar = aVar2.y();
        } else {
            gVar = null;
        }
        this.a.c(i.s(aVar, a, null, gVar, null, new com.amazon.aps.iva.is.a[0], 20));
    }
}
