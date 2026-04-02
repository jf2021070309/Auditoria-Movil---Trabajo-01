package com.amazon.aps.iva.s20;
/* compiled from: UpgrageFlowRouter.kt */
/* loaded from: classes2.dex */
public final class g implements com.amazon.aps.iva.xh.b {
    public final com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.h.c<String>, String, com.amazon.aps.iva.kb0.q> a;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> b;
    public final com.amazon.aps.iva.h.c<String> c;

    public g(com.amazon.aps.iva.xw.x xVar, com.amazon.aps.iva.xh.a aVar, String str, com.amazon.aps.iva.vw.a aVar2, com.amazon.aps.iva.js.i iVar) {
        r rVar = new r(aVar2, aVar, str, iVar);
        com.amazon.aps.iva.yb0.j.f(aVar, "successScreenType");
        com.amazon.aps.iva.yb0.j.f(iVar, "eventSourceProperty");
        d dVar = d.h;
        com.amazon.aps.iva.yb0.j.f(dVar, "startFlow");
        this.a = dVar;
        this.b = f.h;
        this.c = xVar.invoke(rVar, new e(this));
    }

    @Override // com.amazon.aps.iva.xh.b
    public final void a(String str) {
        this.a.invoke(this.c, str);
    }

    @Override // com.amazon.aps.iva.xh.b
    public final void b(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        this.b = aVar;
    }
}
