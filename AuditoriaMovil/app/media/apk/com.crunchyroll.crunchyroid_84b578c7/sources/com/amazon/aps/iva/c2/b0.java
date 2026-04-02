package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.f1.t0;
/* compiled from: TextStyle.kt */
/* loaded from: classes.dex */
public final class b0 {

    /* compiled from: TextStyle.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.o2.l.values().length];
            try {
                iArr[com.amazon.aps.iva.o2.l.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.o2.l.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final a0 a(a0 a0Var, com.amazon.aps.iva.o2.l lVar) {
        int i;
        int i2;
        float f;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(a0Var, "style");
        com.amazon.aps.iva.yb0.j.f(lVar, "direction");
        int i3 = w.e;
        u uVar = a0Var.a;
        com.amazon.aps.iva.yb0.j.f(uVar, "style");
        com.amazon.aps.iva.n2.k c = uVar.a.c(v.h);
        long j = uVar.b;
        if (com.amazon.aps.iva.e.z.F(j)) {
            j = w.a;
        }
        long j2 = j;
        com.amazon.aps.iva.h2.y yVar = uVar.c;
        if (yVar == null) {
            yVar = com.amazon.aps.iva.h2.y.g;
        }
        com.amazon.aps.iva.h2.y yVar2 = yVar;
        com.amazon.aps.iva.h2.t tVar = uVar.d;
        if (tVar != null) {
            i = tVar.a;
        } else {
            i = 0;
        }
        com.amazon.aps.iva.h2.t tVar2 = new com.amazon.aps.iva.h2.t(i);
        com.amazon.aps.iva.h2.u uVar2 = uVar.e;
        if (uVar2 != null) {
            i2 = uVar2.a;
        } else {
            i2 = 1;
        }
        com.amazon.aps.iva.h2.u uVar3 = new com.amazon.aps.iva.h2.u(i2);
        com.amazon.aps.iva.h2.k kVar = uVar.f;
        if (kVar == null) {
            kVar = com.amazon.aps.iva.h2.k.b;
        }
        com.amazon.aps.iva.h2.k kVar2 = kVar;
        String str = uVar.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = uVar.h;
        if (com.amazon.aps.iva.e.z.F(j3)) {
            j3 = w.b;
        }
        long j4 = j3;
        com.amazon.aps.iva.n2.a aVar = uVar.i;
        if (aVar != null) {
            f = aVar.a;
        } else {
            f = 0.0f;
        }
        com.amazon.aps.iva.n2.a aVar2 = new com.amazon.aps.iva.n2.a(f);
        com.amazon.aps.iva.n2.l lVar2 = uVar.j;
        if (lVar2 == null) {
            lVar2 = com.amazon.aps.iva.n2.l.c;
        }
        com.amazon.aps.iva.n2.l lVar3 = lVar2;
        com.amazon.aps.iva.j2.d dVar = uVar.k;
        if (dVar == null) {
            dVar = com.amazon.aps.iva.j2.f.a.a();
        }
        com.amazon.aps.iva.j2.d dVar2 = dVar;
        long j5 = com.amazon.aps.iva.f1.x.g;
        long j6 = uVar.l;
        if (j6 != j5) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            j6 = w.c;
        }
        long j7 = j6;
        com.amazon.aps.iva.n2.i iVar = uVar.m;
        if (iVar == null) {
            iVar = com.amazon.aps.iva.n2.i.b;
        }
        com.amazon.aps.iva.n2.i iVar2 = iVar;
        t0 t0Var = uVar.n;
        if (t0Var == null) {
            t0Var = t0.d;
        }
        t0 t0Var2 = t0Var;
        r rVar = uVar.o;
        com.amazon.aps.iva.h1.f fVar = uVar.p;
        if (fVar == null) {
            fVar = com.amazon.aps.iva.h1.h.a;
        }
        u uVar4 = new u(c, j2, yVar2, tVar2, uVar3, kVar2, str2, j4, aVar2, lVar3, dVar2, j7, iVar2, t0Var2, rVar, fVar);
        int i4 = o.b;
        n nVar = a0Var.b;
        com.amazon.aps.iva.yb0.j.f(nVar, "style");
        com.amazon.aps.iva.n2.h hVar = new com.amazon.aps.iva.n2.h(nVar.j);
        com.amazon.aps.iva.n2.j jVar = nVar.b;
        if (jVar != null && jVar.a == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i5 = 2;
        if (z2) {
            int i6 = a.a[lVar.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    i5 = 5;
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            } else {
                i5 = 4;
            }
        } else if (jVar == null) {
            int i7 = a.a[lVar.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            } else {
                i5 = 1;
            }
        } else {
            i5 = jVar.a;
        }
        com.amazon.aps.iva.n2.j jVar2 = new com.amazon.aps.iva.n2.j(i5);
        long j8 = nVar.c;
        if (com.amazon.aps.iva.e.z.F(j8)) {
            j8 = o.a;
        }
        com.amazon.aps.iva.n2.m mVar = nVar.d;
        if (mVar == null) {
            mVar = com.amazon.aps.iva.n2.m.c;
        }
        com.amazon.aps.iva.n2.m mVar2 = mVar;
        q qVar = nVar.e;
        com.amazon.aps.iva.n2.f fVar2 = nVar.f;
        com.amazon.aps.iva.n2.e eVar = new com.amazon.aps.iva.n2.e(nVar.k);
        com.amazon.aps.iva.n2.d dVar3 = new com.amazon.aps.iva.n2.d(nVar.l);
        com.amazon.aps.iva.n2.n nVar2 = nVar.i;
        if (nVar2 == null) {
            nVar2 = com.amazon.aps.iva.n2.n.c;
        }
        return new a0(uVar4, new n(hVar, jVar2, j8, mVar2, qVar, fVar2, eVar, dVar3, nVar2), a0Var.c);
    }
}
