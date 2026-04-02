package com.amazon.aps.iva.g40;

import com.amazon.aps.iva.ct.j;
import com.amazon.aps.iva.ct.k;
import com.amazon.aps.iva.cx.s;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e40.h;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.i5.u;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.rs.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve.l;
/* compiled from: PremiumMembershipViewModel.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.ez.b implements b, g0 {
    public final com.amazon.aps.iva.e40.g b;
    public final l c;
    public final q d;
    public final j e;
    public final com.amazon.aps.iva.co.d f;
    public final com.amazon.aps.iva.co.a g;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d i;
    public final v<com.amazon.aps.iva.ez.g<a>> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.rs.f fVar, h hVar, l lVar, q qVar, k kVar, s sVar, com.amazon.aps.iva.ts.a aVar, com.amazon.aps.iva.e40.c cVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(fVar, "billingLifecycle");
        com.amazon.aps.iva.yb0.j.f(lVar, "userBillingStatusSynchronizer");
        com.amazon.aps.iva.yb0.j.f(qVar, "billingStatusProvider");
        com.amazon.aps.iva.yb0.j.f(aVar, "accountMigrationConfiguration");
        this.b = hVar;
        this.c = lVar;
        this.d = qVar;
        this.e = kVar;
        this.f = sVar;
        this.g = aVar;
        this.h = cVar;
        this.i = z.j();
        u c = d0.c(z.G(new e(this, null)), new f(this, fVar));
        this.j = c;
        c.k(new g.b(null));
    }

    @Override // com.amazon.aps.iva.g40.b
    public final boolean B7() {
        if (this.f.isEnabled()) {
            com.amazon.aps.iva.co.a aVar = this.g;
            com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
            aVar.d();
            if (this.e.C()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.g40.b
    public final com.amazon.aps.iva.a30.a D3() {
        com.amazon.aps.iva.co.a aVar = this.g;
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        aVar.d();
        j jVar = this.e;
        if (jVar.z0()) {
            return com.amazon.aps.iva.a30.a.SUPER_FAN_PACK;
        }
        if (jVar.G1()) {
            return com.amazon.aps.iva.a30.a.FAN_PACK;
        }
        return com.amazon.aps.iva.a30.a.PREMIUM;
    }

    @Override // com.amazon.aps.iva.g40.b
    public final v I4() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.i.b;
    }

    @Override // com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        super.onCleared();
        this.h.invoke();
        z.l(this, null);
    }
}
