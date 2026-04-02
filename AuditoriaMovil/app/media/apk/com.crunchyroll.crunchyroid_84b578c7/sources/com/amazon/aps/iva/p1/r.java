package com.amazon.aps.iva.p1;
/* compiled from: PointerIcon.kt */
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;
    public final /* synthetic */ p i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.kb0.q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, p pVar, boolean z, s sVar) {
        super(0);
        this.h = vVar;
        this.i = pVar;
        this.j = z;
        this.k = sVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        v vVar = this.h;
        vVar.getClass();
        p pVar = this.i;
        com.amazon.aps.iva.yb0.j.f(pVar, "icon");
        com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.kb0.q> lVar = this.k;
        com.amazon.aps.iva.yb0.j.f(lVar, "onSetIcon");
        if (!com.amazon.aps.iva.yb0.j.a(vVar.c, pVar) && vVar.h && !vVar.g) {
            lVar.invoke(pVar);
        }
        vVar.c = pVar;
        vVar.d = this.j;
        vVar.e = lVar;
        return com.amazon.aps.iva.kb0.q.a;
    }
}
