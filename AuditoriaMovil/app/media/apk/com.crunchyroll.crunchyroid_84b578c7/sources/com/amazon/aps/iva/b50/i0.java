package com.amazon.aps.iva.b50;

import com.amazon.aps.iva.b50.z;
/* compiled from: WatchlistViewModel.kt */
/* loaded from: classes2.dex */
public final class i0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.mn.g, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ f0 h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f0 f0Var, z.a aVar) {
        super(1);
        this.h = f0Var;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.mn.g gVar) {
        com.amazon.aps.iva.mn.g gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "newSortAndFilters");
        f0 f0Var = this.h;
        com.amazon.aps.iva.mn.g gVar3 = f0Var.i;
        if (gVar3 != null && !com.amazon.aps.iva.yb0.j.a(gVar3, gVar2)) {
            f0Var.i = gVar2;
            this.i.invoke();
        } else {
            f0Var.i = gVar2;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
