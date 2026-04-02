package com.crunchyroll.billingnotifications.card;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.billingnotifications.card.c;
/* compiled from: BillingNotificationCardPresenter.kt */
/* loaded from: classes.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
    public final /* synthetic */ b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        b bVar = this.h;
        if (!booleanValue) {
            e eVar = new e(bVar.f.a(bVar.b.l3().getTime() - bVar.e.a()));
            bVar.h = eVar;
            if (eVar.d instanceof c.e) {
                com.amazon.aps.iva.oe.c view = bVar.getView();
                c cVar = bVar.h;
                if (cVar != null) {
                    view.Df(cVar);
                } else {
                    j.m("uiModel");
                    throw null;
                }
            } else {
                com.amazon.aps.iva.oe.c view2 = bVar.getView();
                c cVar2 = bVar.h;
                if (cVar2 != null) {
                    view2.L3(cVar2);
                } else {
                    j.m("uiModel");
                    throw null;
                }
            }
            bVar.getView().show();
        } else {
            b.q6(bVar).hide();
        }
        return q.a;
    }
}
