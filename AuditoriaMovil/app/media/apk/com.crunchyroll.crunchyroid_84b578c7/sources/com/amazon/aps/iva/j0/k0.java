package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.p3;
/* compiled from: HeightInLinesModifier.kt */
/* loaded from: classes.dex */
public final class k0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ com.amazon.aps.iva.c2.a0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(int i, int i2, com.amazon.aps.iva.c2.a0 a0Var) {
        super(3);
        this.h = i;
        this.i = i2;
        this.j = a0Var;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        int i;
        int i2;
        Integer valueOf;
        float f;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        com.amazon.aps.iva.o0.t1.c(num, fVar, "$this$composed", iVar2, 408240218);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        int i3 = this.h;
        int i4 = this.i;
        com.amazon.aps.iva.a0.k.m(i3, i4);
        f.a aVar = f.a.c;
        if (i3 == 1 && i4 == Integer.MAX_VALUE) {
            iVar2.G();
            return aVar;
        }
        com.amazon.aps.iva.o2.c cVar = (com.amazon.aps.iva.o2.c) iVar2.i(com.amazon.aps.iva.v1.d1.e);
        k.a aVar2 = (k.a) iVar2.i(com.amazon.aps.iva.v1.d1.h);
        com.amazon.aps.iva.o2.l lVar = (com.amazon.aps.iva.o2.l) iVar2.i(com.amazon.aps.iva.v1.d1.k);
        iVar2.s(511388516);
        com.amazon.aps.iva.c2.a0 a0Var = this.j;
        boolean H = iVar2.H(a0Var) | iVar2.H(lVar);
        Object t = iVar2.t();
        i.a.C0550a c0550a = i.a.a;
        if (H || t == c0550a) {
            t = com.amazon.aps.iva.c2.b0.a(a0Var, lVar);
            iVar2.n(t);
        }
        iVar2.G();
        com.amazon.aps.iva.c2.a0 a0Var2 = (com.amazon.aps.iva.c2.a0) t;
        iVar2.s(511388516);
        boolean H2 = iVar2.H(aVar2) | iVar2.H(a0Var2);
        Object t2 = iVar2.t();
        if (H2 || t2 == c0550a) {
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
            t2 = aVar2.a(kVar, yVar, i, i2);
            iVar2.n(t2);
        }
        iVar2.G();
        p3 p3Var = (p3) t2;
        Object[] objArr = {cVar, aVar2, a0Var, lVar, p3Var.getValue()};
        iVar2.s(-568225417);
        boolean z = false;
        for (int i5 = 0; i5 < 5; i5++) {
            z |= iVar2.H(objArr[i5]);
        }
        Object t3 = iVar2.t();
        if (z || t3 == c0550a) {
            t3 = Integer.valueOf(com.amazon.aps.iva.o2.j.b(n1.a(a0Var2, cVar, aVar2, n1.a, 1)));
            iVar2.n(t3);
        }
        iVar2.G();
        int intValue = ((Number) t3).intValue();
        Object[] objArr2 = {cVar, aVar2, a0Var, lVar, p3Var.getValue()};
        iVar2.s(-568225417);
        boolean z2 = false;
        for (int i6 = 0; i6 < 5; i6++) {
            z2 |= iVar2.H(objArr2[i6]);
        }
        Object t4 = iVar2.t();
        if (z2 || t4 == c0550a) {
            StringBuilder sb = new StringBuilder();
            String str = n1.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            t4 = Integer.valueOf(com.amazon.aps.iva.o2.j.b(n1.a(a0Var2, cVar, aVar2, sb.toString(), 2)));
            iVar2.n(t4);
        }
        iVar2.G();
        int intValue2 = ((Number) t4).intValue() - intValue;
        Integer num2 = null;
        if (i3 == 1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((i3 - 1) * intValue2) + intValue);
        }
        if (i4 != Integer.MAX_VALUE) {
            num2 = Integer.valueOf(((i4 - 1) * intValue2) + intValue);
        }
        float f2 = Float.NaN;
        if (valueOf != null) {
            f = cVar.I0(valueOf.intValue());
        } else {
            f = Float.NaN;
        }
        if (num2 != null) {
            f2 = cVar.I0(num2.intValue());
        }
        com.amazon.aps.iva.a1.f g = androidx.compose.foundation.layout.e.g(aVar, f, f2);
        e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
        iVar2.G();
        return g;
    }
}
