package com.amazon.aps.iva.k0;

import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.c2.b0;
import com.amazon.aps.iva.h2.k;
/* compiled from: MinLinesConstrainer.kt */
/* loaded from: classes.dex */
public final class b {
    public static b h;
    public final com.amazon.aps.iva.o2.l a;
    public final a0 b;
    public final com.amazon.aps.iva.o2.c c;
    public final k.a d;
    public final a0 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    /* compiled from: MinLinesConstrainer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static b a(b bVar, com.amazon.aps.iva.o2.l lVar, a0 a0Var, com.amazon.aps.iva.o2.c cVar, k.a aVar) {
            boolean z;
            com.amazon.aps.iva.yb0.j.f(a0Var, "paramStyle");
            com.amazon.aps.iva.yb0.j.f(aVar, "fontFamilyResolver");
            boolean z2 = true;
            if (bVar != null && lVar == bVar.a && com.amazon.aps.iva.yb0.j.a(a0Var, bVar.b)) {
                if (cVar.getDensity() == bVar.c.getDensity()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && aVar == bVar.d) {
                    return bVar;
                }
            }
            b bVar2 = b.h;
            if (bVar2 != null && lVar == bVar2.a && com.amazon.aps.iva.yb0.j.a(a0Var, bVar2.b)) {
                if (cVar.getDensity() != bVar2.c.getDensity()) {
                    z2 = false;
                }
                if (z2 && aVar == bVar2.d) {
                    return bVar2;
                }
            }
            b bVar3 = new b(lVar, b0.a(a0Var, lVar), cVar, aVar);
            b.h = bVar3;
            return bVar3;
        }
    }

    public b(com.amazon.aps.iva.o2.l lVar, a0 a0Var, com.amazon.aps.iva.o2.c cVar, k.a aVar) {
        this.a = lVar;
        this.b = a0Var;
        this.c = cVar;
        this.d = aVar;
        this.e = b0.a(a0Var, lVar);
    }

    public final long a(int i, long j) {
        float f = this.g;
        float f2 = this.f;
        int i2 = 0;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            float height = com.amazon.aps.iva.c2.m.a(c.a, this.e, com.amazon.aps.iva.o2.b.b(0, 0, 15), this.c, this.d, null, 1, 96).getHeight();
            float height2 = com.amazon.aps.iva.c2.m.a(c.b, this.e, com.amazon.aps.iva.o2.b.b(0, 0, 15), this.c, this.d, null, 2, 96).getHeight() - height;
            this.g = height;
            this.f = height2;
            f2 = height2;
            f = height;
        }
        if (i != 1) {
            int a2 = com.amazon.aps.iva.ob0.f.a((f2 * (i - 1)) + f);
            if (a2 >= 0) {
                i2 = a2;
            }
            int g = com.amazon.aps.iva.o2.a.g(j);
            if (i2 > g) {
                i2 = g;
            }
        } else {
            i2 = com.amazon.aps.iva.o2.a.i(j);
        }
        return com.amazon.aps.iva.o2.b.a(com.amazon.aps.iva.o2.a.j(j), com.amazon.aps.iva.o2.a.h(j), i2, com.amazon.aps.iva.o2.a.g(j));
    }
}
