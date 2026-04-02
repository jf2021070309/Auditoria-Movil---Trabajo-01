package com.amazon.aps.iva.r20;

import com.amazon.aps.iva.ds.c;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.ks.e;
import com.amazon.aps.iva.ks.g;
import com.amazon.aps.iva.us.u;
import com.amazon.aps.iva.us.v;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: PremiumUpsellDialogAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a, u {
    public final com.amazon.aps.iva.ds.a a;
    public final e b;
    public final com.amazon.aps.iva.vw.a c;
    public final com.amazon.aps.iva.xb0.a<Boolean> d;
    public final /* synthetic */ v e;

    public b(e eVar, com.amazon.aps.iva.vw.a aVar, com.amazon.aps.iva.xb0.a aVar2) {
        c cVar = c.b;
        this.a = cVar;
        this.b = eVar;
        this.c = aVar;
        this.d = aVar2;
        com.amazon.aps.iva.ls.a aVar3 = com.amazon.aps.iva.ls.a.UPSELL_DIALOG;
        j.f(aVar3, "screen");
        this.e = new v(cVar, aVar3, aVar2);
    }

    @Override // com.amazon.aps.iva.r20.a
    public final void b() {
        g gVar;
        l0 l0Var;
        i iVar = i.d;
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.UPSELL_MODAL;
        e eVar = this.b;
        com.amazon.aps.iva.vw.a aVar2 = this.c;
        if (aVar2 != null) {
            gVar = aVar2.y();
        } else {
            gVar = null;
        }
        com.amazon.aps.iva.is.a[] aVarArr = new com.amazon.aps.iva.is.a[1];
        if (this.d.invoke().booleanValue()) {
            l0Var = l0.UPGRADE;
        } else {
            l0Var = l0.SUBSCRIPTION;
        }
        aVarArr[0] = new com.amazon.aps.iva.ks.u(l0Var);
        this.a.c(iVar.r(aVar, 0.0f, eVar, gVar, null, aVarArr));
    }

    @Override // com.amazon.aps.iva.us.u
    public final void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.vw.a aVar2) {
        j.f(bVar, "clickedView");
        j.f(aVar, "screen");
        this.e.onUpsellFlowEntryPointClick(bVar, aVar, aVar2);
    }

    @Override // com.amazon.aps.iva.us.u
    public final void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, PlayableAsset playableAsset, com.amazon.aps.iva.vw.a aVar) {
        j.f(bVar, "clickedView");
        this.e.onUpsellFlowEntryPointClick(bVar, playableAsset, aVar);
    }
}
