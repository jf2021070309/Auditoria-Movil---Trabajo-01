package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.ve0.u0;
/* compiled from: PlayerSessionHeartbeatListener.kt */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.h, com.amazon.aps.iva.nk.h> {
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar) {
        super(1);
        this.h = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.nk.h invoke(com.amazon.aps.iva.nk.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "$this$set");
        j jVar = this.h;
        String str = jVar.c.getValue().h.a;
        u0<com.amazon.aps.iva.nk.j> u0Var = jVar.c;
        return new com.amazon.aps.iva.nk.h(u0Var.getValue().v, str, u0Var.getValue().u);
    }
}
