package com.amazon.aps.iva.f40;

import com.amazon.aps.iva.cx.d;
import com.amazon.aps.iva.es.x;
import com.amazon.aps.iva.fs.c;
import com.amazon.aps.iva.js.i;
import com.amazon.aps.iva.js.o0;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.k;
import com.amazon.aps.iva.me.j;
import com.amazon.aps.iva.rs.q;
import com.amazon.aps.iva.us.u;
import com.amazon.aps.iva.us.v;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.Arrays;
/* compiled from: PremiumMembershipAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a, u {
    public final com.amazon.aps.iva.ds.a a;
    public final c b;
    public final com.amazon.aps.iva.vw.a c;
    public final q d;
    public final j e;
    public final com.amazon.aps.iva.xb0.a<Boolean> f;
    public final /* synthetic */ v g;

    public b(com.amazon.aps.iva.ds.a aVar, c cVar, d dVar, q qVar, d dVar2, com.amazon.aps.iva.e40.b bVar) {
        this.a = aVar;
        this.b = cVar;
        this.c = dVar;
        this.d = qVar;
        this.e = dVar2;
        this.f = bVar;
        com.amazon.aps.iva.ls.a aVar2 = com.amazon.aps.iva.ls.a.USER_SETTINGS_MEMBERSHIP_PLAN;
        com.amazon.aps.iva.yb0.j.f(aVar2, "screen");
        this.g = new v(aVar, aVar2, bVar);
    }

    @Override // com.amazon.aps.iva.f40.a
    public final void c() {
        f(null, new com.amazon.aps.iva.is.c[0]);
    }

    @Override // com.amazon.aps.iva.f40.a
    public final void d(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new x(a.C0456a.c(com.amazon.aps.iva.ls.a.USER_SETTINGS_MEMBERSHIP_PLAN, bVar), 2));
    }

    @Override // com.amazon.aps.iva.f40.a
    public final void e(o0 o0Var) {
        i iVar;
        com.amazon.aps.iva.is.c cVar;
        com.amazon.aps.iva.yb0.j.f(o0Var, "userSubscriptionType");
        if (com.amazon.aps.iva.yb0.j.a(o0Var, o0.b.a)) {
            iVar = i.CR_VOD_FUNIMATION_MIGRATION;
        } else {
            iVar = null;
        }
        com.amazon.aps.iva.is.c[] cVarArr = new com.amazon.aps.iva.is.c[2];
        j jVar = this.e;
        boolean B = jVar.B();
        q qVar = this.d;
        if (B && qVar.Z6()) {
            cVar = k.d.a;
        } else if (jVar.V() && !qVar.O0()) {
            cVar = k.e.a;
        } else {
            cVar = k.b.a;
        }
        cVarArr[0] = cVar;
        cVarArr[1] = o0Var;
        f(iVar, cVarArr);
    }

    public final void f(i iVar, com.amazon.aps.iva.is.c... cVarArr) {
        this.a.c(i.s(com.amazon.aps.iva.ls.a.USER_SETTINGS_MEMBERSHIP_PLAN, this.b.a(), null, this.c.y(), iVar, (com.amazon.aps.iva.is.a[]) Arrays.copyOf(cVarArr, cVarArr.length), 4));
    }

    @Override // com.amazon.aps.iva.us.u
    public final void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.vw.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        this.g.onUpsellFlowEntryPointClick(bVar, aVar, aVar2);
    }

    @Override // com.amazon.aps.iva.us.u
    public final void onUpsellFlowEntryPointClick(com.amazon.aps.iva.fs.b bVar, PlayableAsset playableAsset, com.amazon.aps.iva.vw.a aVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.g.onUpsellFlowEntryPointClick(bVar, playableAsset, aVar);
    }
}
