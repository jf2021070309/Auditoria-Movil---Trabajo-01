package com.amazon.aps.iva.g30;

import com.amazon.aps.iva.g30.c;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.ks.j;
import com.amazon.aps.iva.rs.m;
import com.amazon.aps.iva.rs.p;
import com.ellation.crunchyroll.api.etp.externalparteners.model.PurchasePaymentState;
/* compiled from: CrPlusSubscriptionSuccessViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends f0 {
    public b(com.amazon.aps.iva.wh.a aVar, l0 l0Var, boolean z, d dVar) {
        j jVar;
        String str;
        String c;
        dVar.c();
        if (z) {
            p pVar = aVar.b;
            l0 l0Var2 = aVar.f == PurchasePaymentState.FREE_TRIAL ? l0.FREE_TRIAL : l0Var;
            m mVar = aVar.e;
            if (mVar != null) {
                jVar = com.amazon.aps.iva.b30.d.c(mVar);
            } else {
                jVar = null;
            }
            j jVar2 = jVar;
            String str2 = aVar.c;
            if (mVar != null && (c = mVar.c()) != null) {
                str = c;
            } else {
                str = aVar.d;
            }
            c.a.a(dVar, pVar, l0Var2, str2, str, jVar2, 32);
        }
    }
}
