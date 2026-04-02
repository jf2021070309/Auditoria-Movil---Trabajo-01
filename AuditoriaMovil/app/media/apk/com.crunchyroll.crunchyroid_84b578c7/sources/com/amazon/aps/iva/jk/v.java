package com.amazon.aps.iva.jk;
/* compiled from: PlayerSessionHeartbeatListener.kt */
/* loaded from: classes.dex */
public final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.h, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(j jVar) {
        super(1);
        this.h = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.nk.h hVar) {
        com.amazon.aps.iva.nk.h hVar2 = hVar;
        com.amazon.aps.iva.yb0.j.f(hVar2, "state");
        j jVar = this.h;
        com.amazon.aps.iva.se0.i.d(jVar.b, null, null, new u(jVar, hVar2, null), 3);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
