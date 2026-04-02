package com.amazon.aps.iva.m0;
/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class e2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g2, f2> {
    public final /* synthetic */ com.amazon.aps.iva.o2.c h;
    public final /* synthetic */ com.amazon.aps.iva.z.j<Float> i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<g2, Boolean> j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.amazon.aps.iva.z.j jVar, com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.xb0.l lVar, boolean z) {
        super(1);
        this.h = cVar;
        this.i = jVar;
        this.j = lVar;
        this.k = z;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final f2 invoke(g2 g2Var) {
        g2 g2Var2 = g2Var;
        com.amazon.aps.iva.yb0.j.f(g2Var2, "it");
        float f = j1.a;
        com.amazon.aps.iva.o2.c cVar = this.h;
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        com.amazon.aps.iva.z.j<Float> jVar = this.i;
        com.amazon.aps.iva.yb0.j.f(jVar, "animationSpec");
        com.amazon.aps.iva.xb0.l<g2, Boolean> lVar = this.j;
        com.amazon.aps.iva.yb0.j.f(lVar, "confirmValueChange");
        f2 f2Var = new f2(g2Var2, jVar, this.k, lVar);
        f2Var.d = cVar;
        return f2Var;
    }
}
