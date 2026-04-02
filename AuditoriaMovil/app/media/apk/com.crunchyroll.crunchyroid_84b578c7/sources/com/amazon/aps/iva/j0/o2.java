package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.p3;
/* compiled from: TextFieldSize.kt */
/* loaded from: classes.dex */
public final class o2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ com.amazon.aps.iva.c2.a0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.amazon.aps.iva.c2.a0 a0Var) {
        super(3);
        this.h = a0Var;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        int i;
        int i2;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        com.amazon.aps.iva.o0.t1.c(num, fVar, "$this$composed", iVar2, 1582736677);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        com.amazon.aps.iva.o2.c cVar = (com.amazon.aps.iva.o2.c) iVar2.i(com.amazon.aps.iva.v1.d1.e);
        k.a aVar = (k.a) iVar2.i(com.amazon.aps.iva.v1.d1.h);
        com.amazon.aps.iva.o2.l lVar = (com.amazon.aps.iva.o2.l) iVar2.i(com.amazon.aps.iva.v1.d1.k);
        iVar2.s(511388516);
        com.amazon.aps.iva.c2.a0 a0Var = this.h;
        boolean H = iVar2.H(a0Var) | iVar2.H(lVar);
        Object t = iVar2.t();
        Object obj = i.a.a;
        if (H || t == obj) {
            t = com.amazon.aps.iva.c2.b0.a(a0Var, lVar);
            iVar2.n(t);
        }
        iVar2.G();
        com.amazon.aps.iva.c2.a0 a0Var2 = (com.amazon.aps.iva.c2.a0) t;
        iVar2.s(511388516);
        boolean H2 = iVar2.H(aVar) | iVar2.H(a0Var2);
        Object t2 = iVar2.t();
        if (H2 || t2 == obj) {
            com.amazon.aps.iva.c2.u uVar = a0Var2.a;
            com.amazon.aps.iva.h2.k kVar = uVar.f;
            com.amazon.aps.iva.h2.y yVar = uVar.c;
            if (yVar == null) {
                yVar = com.amazon.aps.iva.h2.y.g;
            }
            com.amazon.aps.iva.h2.t tVar = uVar.d;
            if (tVar != null) {
                i = tVar.a;
            } else {
                i = 0;
            }
            com.amazon.aps.iva.h2.u uVar2 = uVar.e;
            if (uVar2 != null) {
                i2 = uVar2.a;
            } else {
                i2 = 1;
            }
            t2 = aVar.a(kVar, yVar, i, i2);
            iVar2.n(t2);
        }
        iVar2.G();
        p3 p3Var = (p3) t2;
        com.amazon.aps.iva.c2.a0 a0Var3 = this.h;
        iVar2.s(-492369756);
        Object t3 = iVar2.t();
        Object obj2 = t3;
        if (t3 == obj) {
            l2 l2Var = new l2(lVar, cVar, aVar, a0Var3, p3Var.getValue());
            iVar2.n(l2Var);
            obj2 = l2Var;
        }
        iVar2.G();
        l2 l2Var2 = (l2) obj2;
        Object value = p3Var.getValue();
        l2Var2.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        com.amazon.aps.iva.yb0.j.f(aVar, "fontFamilyResolver");
        com.amazon.aps.iva.yb0.j.f(a0Var2, "resolvedStyle");
        com.amazon.aps.iva.yb0.j.f(value, "typeface");
        if (lVar != l2Var2.a || !com.amazon.aps.iva.yb0.j.a(cVar, l2Var2.b) || !com.amazon.aps.iva.yb0.j.a(aVar, l2Var2.c) || !com.amazon.aps.iva.yb0.j.a(a0Var2, l2Var2.d) || !com.amazon.aps.iva.yb0.j.a(value, l2Var2.e)) {
            l2Var2.a = lVar;
            l2Var2.b = cVar;
            l2Var2.c = aVar;
            l2Var2.d = a0Var2;
            l2Var2.e = value;
            l2Var2.f = n1.a(a0Var2, cVar, aVar, n1.a, 1);
        }
        com.amazon.aps.iva.a1.f a = androidx.compose.ui.layout.b.a(f.a.c, new n2(l2Var2));
        iVar2.G();
        return a;
    }
}
