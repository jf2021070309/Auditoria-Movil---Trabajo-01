package com.amazon.aps.iva.m0;
/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class c2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<f2> {
    public final /* synthetic */ g2 h;
    public final /* synthetic */ com.amazon.aps.iva.o2.c i;
    public final /* synthetic */ com.amazon.aps.iva.z.j<Float> j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<g2, Boolean> k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c2(g2 g2Var, com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.z.j<Float> jVar, com.amazon.aps.iva.xb0.l<? super g2, Boolean> lVar, boolean z) {
        super(0);
        this.h = g2Var;
        this.i = cVar;
        this.j = jVar;
        this.k = lVar;
        this.l = z;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final f2 invoke() {
        g2 g2Var = this.h;
        com.amazon.aps.iva.yb0.j.f(g2Var, "initialValue");
        com.amazon.aps.iva.o2.c cVar = this.i;
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        com.amazon.aps.iva.z.j<Float> jVar = this.j;
        com.amazon.aps.iva.yb0.j.f(jVar, "animationSpec");
        com.amazon.aps.iva.xb0.l<g2, Boolean> lVar = this.k;
        com.amazon.aps.iva.yb0.j.f(lVar, "confirmValueChange");
        f2 f2Var = new f2(g2Var, jVar, this.l, lVar);
        f2Var.d = cVar;
        return f2Var;
    }
}
