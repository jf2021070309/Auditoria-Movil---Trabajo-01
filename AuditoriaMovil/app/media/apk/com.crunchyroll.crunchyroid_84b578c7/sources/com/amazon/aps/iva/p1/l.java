package com.amazon.aps.iva.p1;

import java.util.Map;
/* compiled from: HitPathTracker.kt */
/* loaded from: classes.dex */
public class l {
    public final com.amazon.aps.iva.p0.f<k> a = new com.amazon.aps.iva.p0.f<>(new k[16]);

    public boolean a(Map<x, y> map, com.amazon.aps.iva.s1.q qVar, h hVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(map, "changes");
        com.amazon.aps.iva.yb0.j.f(qVar, "parentCoordinates");
        com.amazon.aps.iva.p0.f<k> fVar = this.a;
        int i = fVar.d;
        if (i <= 0) {
            return false;
        }
        k[] kVarArr = fVar.b;
        int i2 = 0;
        boolean z2 = false;
        do {
            if (!kVarArr[i2].a(map, qVar, hVar, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            i2++;
        } while (i2 < i);
        return z2;
    }

    public void b(h hVar) {
        com.amazon.aps.iva.p0.f<k> fVar = this.a;
        for (int i = fVar.d - 1; -1 < i; i--) {
            if (fVar.b[i].c.i()) {
                fVar.l(i);
            }
        }
    }

    public final void c() {
        int i = 0;
        while (true) {
            com.amazon.aps.iva.p0.f<k> fVar = this.a;
            if (i < fVar.d) {
                k kVar = fVar.b[i];
                if (!kVar.b.n) {
                    fVar.l(i);
                    kVar.d();
                } else {
                    i++;
                    kVar.c();
                }
            } else {
                return;
            }
        }
    }
}
