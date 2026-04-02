package c.g.a.i;

import c.g.a.i.d;
/* loaded from: classes.dex */
public class i {
    public static boolean[] a = new boolean[3];

    public static void a(e eVar, c.g.a.d dVar, d dVar2) {
        dVar2.o = -1;
        dVar2.p = -1;
        d.a aVar = eVar.U[0];
        d.a aVar2 = d.a.WRAP_CONTENT;
        if (aVar != aVar2 && dVar2.U[0] == d.a.MATCH_PARENT) {
            int i2 = dVar2.J.f1738g;
            int u = eVar.u() - dVar2.L.f1738g;
            c cVar = dVar2.J;
            cVar.f1740i = dVar.l(cVar);
            c cVar2 = dVar2.L;
            cVar2.f1740i = dVar.l(cVar2);
            dVar.e(dVar2.J.f1740i, i2);
            dVar.e(dVar2.L.f1740i, u);
            dVar2.o = 2;
            dVar2.a0 = i2;
            int i3 = u - i2;
            dVar2.W = i3;
            int i4 = dVar2.d0;
            if (i3 < i4) {
                dVar2.W = i4;
            }
        }
        if (eVar.U[1] == aVar2 || dVar2.U[1] != d.a.MATCH_PARENT) {
            return;
        }
        int i5 = dVar2.K.f1738g;
        int l2 = eVar.l() - dVar2.M.f1738g;
        c cVar3 = dVar2.K;
        cVar3.f1740i = dVar.l(cVar3);
        c cVar4 = dVar2.M;
        cVar4.f1740i = dVar.l(cVar4);
        dVar.e(dVar2.K.f1740i, i5);
        dVar.e(dVar2.M.f1740i, l2);
        if (dVar2.c0 > 0 || dVar2.i0 == 8) {
            c cVar5 = dVar2.N;
            cVar5.f1740i = dVar.l(cVar5);
            dVar.e(dVar2.N.f1740i, dVar2.c0 + i5);
        }
        dVar2.p = 2;
        dVar2.b0 = i5;
        int i6 = l2 - i5;
        dVar2.X = i6;
        int i7 = dVar2.e0;
        if (i6 < i7) {
            dVar2.X = i7;
        }
    }

    public static final boolean b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
