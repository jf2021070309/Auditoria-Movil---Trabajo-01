package com.amazon.aps.iva.p1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.v1.d1;
/* compiled from: PointerIcon.kt */
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ p h = com.amazon.aps.iva.b50.w.c;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z) {
        super(3);
        this.i = z;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.a1.f fVar2 = fVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        t1.c(num, fVar2, "$this$composed", iVar2, 811087536);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        w wVar = (w) iVar2.i(d1.r);
        com.amazon.aps.iva.a1.f fVar3 = f.a.c;
        if (wVar != null) {
            s sVar = new s(wVar);
            iVar2.s(-492369756);
            Object t = iVar2.t();
            i.a.C0550a c0550a = i.a.a;
            boolean z = this.i;
            p pVar = this.h;
            if (t == c0550a) {
                t = new v(pVar, z, sVar);
                iVar2.n(t);
            }
            iVar2.G();
            v vVar = (v) t;
            Object[] objArr = {vVar, pVar, Boolean.valueOf(z), sVar};
            iVar2.s(-568225417);
            boolean z2 = false;
            boolean z3 = false;
            for (int i = 0; i < 4; i++) {
                z3 |= iVar2.H(objArr[i]);
            }
            Object t2 = iVar2.t();
            if (z3 || t2 == c0550a) {
                t2 = new r(vVar, pVar, z, sVar);
                iVar2.n(t2);
            }
            iVar2.G();
            x0.f((com.amazon.aps.iva.xb0.a) t2, iVar2);
            v l = vVar.l();
            if ((l == null || !l.p()) ? true : true) {
                iVar2.s(1157296644);
                boolean H = iVar2.H(vVar);
                Object t3 = iVar2.t();
                if (H || t3 == c0550a) {
                    t3 = new t(vVar, null);
                    iVar2.n(t3);
                }
                iVar2.G();
                fVar3 = l0.a(fVar2, vVar, (com.amazon.aps.iva.xb0.p) t3);
            }
            fVar3 = vVar.o(fVar3);
        }
        e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
        iVar2.G();
        return fVar3;
    }
}
