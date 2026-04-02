package com.amazon.aps.iva.u2;

import com.amazon.aps.iva.u2.e;
/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public final class k {
    public static final boolean[] a = new boolean[3];

    public static void a(f fVar, com.amazon.aps.iva.s2.d dVar, e eVar) {
        eVar.p = -1;
        eVar.q = -1;
        e.b bVar = fVar.V[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        e.b[] bVarArr = eVar.V;
        if (bVar != bVar2 && bVarArr[0] == e.b.MATCH_PARENT) {
            d dVar2 = eVar.K;
            int i = dVar2.g;
            int r = fVar.r();
            d dVar3 = eVar.M;
            int i2 = r - dVar3.g;
            dVar2.i = dVar.k(dVar2);
            dVar3.i = dVar.k(dVar3);
            dVar.d(dVar2.i, i);
            dVar.d(dVar3.i, i2);
            eVar.p = 2;
            eVar.b0 = i;
            int i3 = i2 - i;
            eVar.X = i3;
            int i4 = eVar.e0;
            if (i3 < i4) {
                eVar.X = i4;
            }
        }
        if (fVar.V[1] != bVar2 && bVarArr[1] == e.b.MATCH_PARENT) {
            d dVar4 = eVar.L;
            int i5 = dVar4.g;
            int l = fVar.l();
            d dVar5 = eVar.N;
            int i6 = l - dVar5.g;
            dVar4.i = dVar.k(dVar4);
            dVar5.i = dVar.k(dVar5);
            dVar.d(dVar4.i, i5);
            dVar.d(dVar5.i, i6);
            if (eVar.d0 > 0 || eVar.j0 == 8) {
                d dVar6 = eVar.O;
                dVar6.i = dVar.k(dVar6);
                dVar.d(dVar6.i, eVar.d0 + i5);
            }
            eVar.q = 2;
            eVar.c0 = i5;
            int i7 = i6 - i5;
            eVar.Y = i7;
            int i8 = eVar.f0;
            if (i7 < i8) {
                eVar.Y = i8;
            }
        }
    }

    public static final boolean b(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }
}
