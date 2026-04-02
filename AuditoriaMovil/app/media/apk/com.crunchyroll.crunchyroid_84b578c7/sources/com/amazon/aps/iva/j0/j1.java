package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: TextFieldCursor.kt */
/* loaded from: classes.dex */
public final class j1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ com.amazon.aps.iva.f1.s h;
    public final /* synthetic */ p2 i;
    public final /* synthetic */ com.amazon.aps.iva.i2.e0 j;
    public final /* synthetic */ com.amazon.aps.iva.i2.q k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.amazon.aps.iva.f1.s sVar, p2 p2Var, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.q qVar) {
        super(3);
        this.h = sVar;
        this.i = p2Var;
        this.j = e0Var;
        this.k = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.a1.f fVar2;
        boolean z;
        com.amazon.aps.iva.a1.f fVar3 = fVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        com.amazon.aps.iva.o0.t1.c(num, fVar3, "$this$composed", iVar2, 1634330012);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar2.s(-492369756);
        Object t = iVar2.t();
        if (t == i.a.a) {
            t = com.amazon.aps.iva.ab.x.d(1.0f);
            iVar2.n(t);
        }
        iVar2.G();
        com.amazon.aps.iva.z.b bVar2 = (com.amazon.aps.iva.z.b) t;
        com.amazon.aps.iva.f1.s sVar = this.h;
        boolean z2 = true;
        if (sVar instanceof com.amazon.aps.iva.f1.x0) {
            if (((com.amazon.aps.iva.f1.x0) sVar).a == com.amazon.aps.iva.f1.x.g) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = false;
            }
        }
        if (this.i.b()) {
            com.amazon.aps.iva.i2.e0 e0Var = this.j;
            if (com.amazon.aps.iva.c2.z.b(e0Var.b) && z2) {
                com.amazon.aps.iva.o0.x0.d(e0Var.a, new com.amazon.aps.iva.c2.z(e0Var.b), new h1(bVar2, null), iVar2);
                fVar2 = androidx.compose.ui.draw.a.c(fVar3, new i1(bVar2, this.k, this.j, this.i, this.h));
                iVar2.G();
                return fVar2;
            }
        }
        fVar2 = f.a.c;
        iVar2.G();
        return fVar2;
    }
}
