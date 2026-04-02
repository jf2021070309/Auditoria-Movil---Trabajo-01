package com.amazon.aps.iva.p1;

import com.amazon.aps.iva.a1.f;
import java.util.Map;
/* compiled from: HitPathTracker.kt */
/* loaded from: classes.dex */
public final class g {
    public final com.amazon.aps.iva.s1.q a;
    public final l b;

    public g(androidx.compose.ui.node.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "rootCoordinates");
        this.a = cVar;
        this.b = new l();
    }

    public final void a(com.amazon.aps.iva.u1.s sVar, long j) {
        k kVar;
        com.amazon.aps.iva.yb0.j.f(sVar, "pointerInputNodes");
        k kVar2 = this.b;
        int i = sVar.e;
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            f.c cVar = (f.c) sVar.get(i2);
            if (z) {
                com.amazon.aps.iva.p0.f<k> fVar = kVar2.a;
                int i3 = fVar.d;
                if (i3 > 0) {
                    k[] kVarArr = fVar.b;
                    int i4 = 0;
                    do {
                        kVar = kVarArr[i4];
                        if (com.amazon.aps.iva.yb0.j.a(kVar.b, cVar)) {
                            break;
                        }
                        i4++;
                    } while (i4 < i3);
                    kVar = null;
                } else {
                    kVar = null;
                }
                k kVar3 = kVar;
                if (kVar3 != null) {
                    kVar3.h = true;
                    x xVar = new x(j);
                    com.amazon.aps.iva.p0.f<x> fVar2 = kVar3.c;
                    if (!fVar2.g(xVar)) {
                        fVar2.b(new x(j));
                    }
                    kVar2 = kVar3;
                } else {
                    z = false;
                }
            }
            k kVar4 = new k(cVar);
            kVar4.c.b(new x(j));
            kVar2.a.b(kVar4);
            kVar2 = kVar4;
        }
    }

    public final boolean b(h hVar, boolean z) {
        boolean z2;
        boolean z3;
        l lVar = this.b;
        Map<x, y> map = hVar.a;
        com.amazon.aps.iva.s1.q qVar = this.a;
        if (!lVar.a(map, qVar, hVar, z)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.f(map, "changes");
        com.amazon.aps.iva.yb0.j.f(qVar, "parentCoordinates");
        com.amazon.aps.iva.p0.f<k> fVar = lVar.a;
        int i = fVar.d;
        if (i > 0) {
            k[] kVarArr = fVar.b;
            int i2 = 0;
            z2 = false;
            do {
                if (!kVarArr[i2].f(map, qVar, hVar, z) && !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                i2++;
            } while (i2 < i);
        } else {
            z2 = false;
        }
        int i3 = fVar.d;
        if (i3 > 0) {
            k[] kVarArr2 = fVar.b;
            int i4 = 0;
            z3 = false;
            do {
                if (!kVarArr2[i4].e(hVar) && !z3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                i4++;
            } while (i4 < i3);
        } else {
            z3 = false;
        }
        lVar.b(hVar);
        if (!z3 && !z2) {
            return false;
        }
        return true;
    }
}
