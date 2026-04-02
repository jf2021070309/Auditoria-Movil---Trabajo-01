package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.ve0.g0;
/* compiled from: PlayerEventListener.kt */
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.nk.j> {
    public final /* synthetic */ com.amazon.aps.iva.kk.c h;
    public final /* synthetic */ b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, com.amazon.aps.iva.kk.c cVar) {
        super(1);
        this.h = cVar;
        this.i = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.nk.j invoke(com.amazon.aps.iva.nk.j jVar) {
        com.amazon.aps.iva.nk.j jVar2 = jVar;
        com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
        com.amazon.aps.iva.kk.c cVar = this.h;
        b bVar = this.i;
        String str = bVar.f.getValue().e;
        g0<com.amazon.aps.iva.nk.f> g0Var = bVar.f;
        return com.amazon.aps.iva.nk.j.a(jVar2, false, 0L, 0L, 0.0f, 0L, null, cVar, 0, null, null, str, null, null, null, g0Var.getValue().f, null, false, g0Var.getValue().g, g0Var.getValue().h, 909183);
    }
}
