package com.amazon.aps.iva.c2;

import android.graphics.Matrix;
import android.graphics.Shader;
import com.amazon.aps.iva.d2.k0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f1.s0;
import com.amazon.aps.iva.f1.t0;
import com.amazon.aps.iva.f1.x0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MultiParagraph.kt */
/* loaded from: classes.dex */
public final class f {
    public final g a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public f(g gVar, long j, int i, boolean z) {
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.e1.e eVar;
        int g;
        this.a = gVar;
        this.b = i;
        if (com.amazon.aps.iva.o2.a.j(j) == 0 && com.amazon.aps.iva.o2.a.i(j) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = gVar.e;
            int size = arrayList2.size();
            float f = 0.0f;
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                j jVar = (j) arrayList2.get(i2);
                k kVar = jVar.a;
                int h = com.amazon.aps.iva.o2.a.h(j);
                if (com.amazon.aps.iva.o2.a.c(j)) {
                    g = com.amazon.aps.iva.o2.a.g(j) - ((int) Math.ceil(f));
                    if (g < 0) {
                        g = 0;
                    }
                } else {
                    g = com.amazon.aps.iva.o2.a.g(j);
                }
                long b = com.amazon.aps.iva.o2.b.b(h, g, 5);
                com.amazon.aps.iva.yb0.j.f(kVar, "paragraphIntrinsics");
                a aVar = new a((com.amazon.aps.iva.k2.d) kVar, this.b - i3, z, b);
                float height = aVar.getHeight() + f;
                k0 k0Var = aVar.d;
                int i4 = i3 + k0Var.e;
                arrayList.add(new i(aVar, jVar.b, jVar.c, i3, i4, f, height));
                if (!k0Var.c) {
                    i3 = i4;
                    if (i3 != this.b || i2 == f1.B(this.a.e)) {
                        i2++;
                        f = height;
                    }
                } else {
                    i3 = i4;
                }
                f = height;
                z3 = true;
                break;
            }
            z3 = false;
            this.e = f;
            this.f = i3;
            this.c = z3;
            this.h = arrayList;
            this.d = com.amazon.aps.iva.o2.a.h(j);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                i iVar = (i) arrayList.get(i5);
                List<com.amazon.aps.iva.e1.e> t = iVar.a.t();
                ArrayList arrayList4 = new ArrayList(t.size());
                int size3 = t.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    com.amazon.aps.iva.e1.e eVar2 = t.get(i6);
                    if (eVar2 != null) {
                        eVar = iVar.a(eVar2);
                    } else {
                        eVar = null;
                    }
                    arrayList4.add(eVar);
                }
                com.amazon.aps.iva.lb0.t.d0(arrayList3, arrayList4);
            }
            if (arrayList3.size() < this.a.b.size()) {
                int size4 = this.a.b.size() - arrayList3.size();
                ArrayList arrayList5 = new ArrayList(size4);
                for (int i7 = 0; i7 < size4; i7++) {
                    arrayList5.add(null);
                }
                arrayList3 = com.amazon.aps.iva.lb0.x.L0(arrayList5, arrayList3);
            }
            this.g = arrayList3;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public static void a(f fVar, com.amazon.aps.iva.f1.u uVar, long j, t0 t0Var, com.amazon.aps.iva.n2.i iVar, com.amazon.aps.iva.h1.f fVar2) {
        fVar.getClass();
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        uVar.n();
        ArrayList arrayList = fVar.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i iVar2 = (i) arrayList.get(i);
            iVar2.a.n(uVar, j, t0Var, iVar, fVar2, 3);
            uVar.f(0.0f, iVar2.a.getHeight());
        }
        uVar.g();
    }

    public static void b(f fVar, com.amazon.aps.iva.f1.u uVar, com.amazon.aps.iva.f1.s sVar, float f, t0 t0Var, com.amazon.aps.iva.n2.i iVar, com.amazon.aps.iva.h1.f fVar2) {
        fVar.getClass();
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        uVar.n();
        ArrayList arrayList = fVar.h;
        if (arrayList.size() <= 1) {
            com.amazon.aps.iva.ab.r.i(fVar, uVar, sVar, f, t0Var, iVar, fVar2, 3);
        } else if (sVar instanceof x0) {
            com.amazon.aps.iva.ab.r.i(fVar, uVar, sVar, f, t0Var, iVar, fVar2, 3);
        } else if (sVar instanceof s0) {
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                i iVar2 = (i) arrayList.get(i);
                f3 += iVar2.a.getHeight();
                f2 = Math.max(f2, iVar2.a.getWidth());
            }
            Shader b = ((s0) sVar).b(com.amazon.aps.iva.ab.r.d(f2, f3));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                i iVar3 = (i) arrayList.get(i2);
                iVar3.a.u(uVar, new com.amazon.aps.iva.f1.t(b), f, t0Var, iVar, fVar2, 3);
                h hVar = iVar3.a;
                uVar.f(0.0f, hVar.getHeight());
                matrix.setTranslate(0.0f, -hVar.getHeight());
                b.setLocalMatrix(matrix);
            }
        }
        uVar.g();
    }

    public final void c(int i) {
        g gVar = this.a;
        boolean z = false;
        if (i >= 0 && i <= gVar.a.b.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("offset(", i, ") is out of bounds [0, ");
        d.append(gVar.a.length());
        d.append(']');
        throw new IllegalArgumentException(d.toString().toString());
    }

    public final void d(int i) {
        int i2 = this.f;
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')').toString());
    }
}
