package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: Row.kt */
/* loaded from: classes.dex */
public final class v1 {
    public static final r1 a;

    /* compiled from: Row.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.s<Integer, int[], com.amazon.aps.iva.o2.l, com.amazon.aps.iva.o2.c, int[], com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(5);
        }

        @Override // com.amazon.aps.iva.xb0.s
        public final com.amazon.aps.iva.kb0.q V0(Integer num, int[] iArr, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.o2.c cVar, int[] iArr2) {
            int intValue = num.intValue();
            int[] iArr3 = iArr;
            com.amazon.aps.iva.o2.l lVar2 = lVar;
            com.amazon.aps.iva.o2.c cVar2 = cVar;
            int[] iArr4 = iArr2;
            com.amazon.aps.iva.yb0.j.f(iArr3, "size");
            com.amazon.aps.iva.yb0.j.f(lVar2, "layoutDirection");
            com.amazon.aps.iva.yb0.j.f(cVar2, "density");
            com.amazon.aps.iva.yb0.j.f(iArr4, "outPosition");
            com.amazon.aps.iva.d0.a.a.c(intValue, cVar2, lVar2, iArr3, iArr4);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    static {
        d1 d1Var = d1.Horizontal;
        a.i iVar = com.amazon.aps.iva.d0.a.a;
        int i = q.a;
        q.e eVar = new q.e(a.C0097a.j);
        z1 z1Var = z1.Wrap;
        a = com.amazon.aps.iva.b50.w.r(d1Var, a.h, 0, z1Var, eVar);
    }

    public static final com.amazon.aps.iva.s1.d0 a(a.d dVar, b.C0098b c0098b, com.amazon.aps.iva.o0.i iVar) {
        com.amazon.aps.iva.s1.d0 d0Var;
        com.amazon.aps.iva.yb0.j.f(dVar, "horizontalArrangement");
        iVar.s(-837807694);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        if (com.amazon.aps.iva.yb0.j.a(dVar, com.amazon.aps.iva.d0.a.a) && com.amazon.aps.iva.yb0.j.a(c0098b, a.C0097a.j)) {
            d0Var = a;
        } else {
            iVar.s(511388516);
            boolean H = iVar.H(dVar) | iVar.H(c0098b);
            Object t = iVar.t();
            if (H || t == i.a.a) {
                d1 d1Var = d1.Horizontal;
                float a2 = dVar.a();
                int i = q.a;
                q.e eVar = new q.e(c0098b);
                t = com.amazon.aps.iva.b50.w.r(d1Var, new w1(dVar), a2, z1.Wrap, eVar);
                iVar.n(t);
            }
            iVar.G();
            d0Var = (com.amazon.aps.iva.s1.d0) t;
        }
        iVar.G();
        return d0Var;
    }
}
