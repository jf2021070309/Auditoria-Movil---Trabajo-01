package com.amazon.aps.iva.g8;
/* compiled from: NavController.kt */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.yb0.z h;
    public final /* synthetic */ com.amazon.aps.iva.yb0.z i;
    public final /* synthetic */ i j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ com.amazon.aps.iva.lb0.k<g> l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.amazon.aps.iva.yb0.z zVar, com.amazon.aps.iva.yb0.z zVar2, i iVar, boolean z, com.amazon.aps.iva.lb0.k<g> kVar) {
        super(1);
        this.h = zVar;
        this.i = zVar2;
        this.j = iVar;
        this.k = z;
        this.l = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(f fVar) {
        f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "entry");
        this.h.b = true;
        this.i.b = true;
        this.j.p(fVar2, this.k, this.l);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
