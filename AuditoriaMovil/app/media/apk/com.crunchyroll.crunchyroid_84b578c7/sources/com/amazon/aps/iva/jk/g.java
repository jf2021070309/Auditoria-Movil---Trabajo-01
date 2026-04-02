package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.ve0.g0;
/* compiled from: PlayerEventListener.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.nk.j> {
    public final /* synthetic */ b h;
    public final /* synthetic */ com.amazon.aps.iva.kk.c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, com.amazon.aps.iva.kk.c cVar) {
        super(1);
        this.h = bVar;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.nk.j invoke(com.amazon.aps.iva.nk.j jVar) {
        com.amazon.aps.iva.nk.j jVar2 = jVar;
        com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
        b bVar = this.h;
        String str = bVar.e.getValue().e;
        g0<com.amazon.aps.iva.nk.d> g0Var = bVar.e;
        return com.amazon.aps.iva.nk.j.a(jVar2, false, 0L, 0L, 0.0f, 0L, null, this.i, 0, null, null, str, null, null, null, g0Var.getValue().f, null, false, g0Var.getValue().g, g0Var.getValue().h, 908671);
    }
}
