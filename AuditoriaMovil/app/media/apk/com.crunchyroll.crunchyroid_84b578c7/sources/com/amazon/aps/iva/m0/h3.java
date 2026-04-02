package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
/* compiled from: TextFieldDefaults.kt */
/* loaded from: classes.dex */
public final class h3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ com.amazon.aps.iva.c0.k j;
    public final /* synthetic */ e3 k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(boolean z, boolean z2, com.amazon.aps.iva.c0.l lVar, e3 e3Var, float f, float f2) {
        super(3);
        this.h = z;
        this.i = z2;
        this.j = lVar;
        this.k = e3Var;
        this.l = f;
        this.m = f2;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        float f;
        com.amazon.aps.iva.o0.p3 h0;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        com.amazon.aps.iva.o0.t1.c(num, fVar, "$this$composed", iVar2, 1398930845);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        boolean z = this.h;
        boolean z2 = this.i;
        e3 e3Var = this.k;
        iVar2.s(1097899920);
        com.amazon.aps.iva.c0.k kVar = this.j;
        com.amazon.aps.iva.o0.q1 m = com.amazon.aps.iva.aq.j.m(kVar, iVar2, 0);
        com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.f1.x> f2 = e3Var.f(z, z2, kVar, iVar2, 0);
        boolean booleanValue = ((Boolean) m.getValue()).booleanValue();
        float f3 = this.m;
        if (booleanValue) {
            f = this.l;
        } else {
            f = f3;
        }
        if (z) {
            iVar2.s(1685712066);
            h0 = com.amazon.aps.iva.z.e.a(f, com.amazon.aps.iva.z.k.d(150, 0, null, 6), iVar2);
            iVar2.G();
        } else {
            iVar2.s(1685712164);
            h0 = com.amazon.aps.iva.cq.b.h0(new com.amazon.aps.iva.o2.e(f3), iVar2);
            iVar2.G();
        }
        com.amazon.aps.iva.o0.q1 h02 = com.amazon.aps.iva.cq.b.h0(new com.amazon.aps.iva.a0.p(((com.amazon.aps.iva.o2.e) h0.getValue()).b, new com.amazon.aps.iva.f1.x0(f2.getValue().a)), iVar2);
        iVar2.G();
        f.a aVar = f.a.c;
        com.amazon.aps.iva.a0.p pVar = (com.amazon.aps.iva.a0.p) h02.getValue();
        float f4 = r3.a;
        com.amazon.aps.iva.yb0.j.f(pVar, "indicatorBorder");
        com.amazon.aps.iva.a1.f c = androidx.compose.ui.draw.a.c(aVar, new s3(pVar.a, pVar));
        iVar2.G();
        return c;
    }
}
