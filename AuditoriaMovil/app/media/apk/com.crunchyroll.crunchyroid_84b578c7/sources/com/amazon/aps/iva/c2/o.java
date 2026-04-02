package com.amazon.aps.iva.c2;
/* compiled from: ParagraphStyle.kt */
/* loaded from: classes.dex */
public final class o {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        com.amazon.aps.iva.o2.n[] nVarArr = com.amazon.aps.iva.o2.m.b;
        a = com.amazon.aps.iva.o2.m.c;
    }

    public static final n a(n nVar, com.amazon.aps.iva.n2.h hVar, com.amazon.aps.iva.n2.j jVar, long j, com.amazon.aps.iva.n2.m mVar, q qVar, com.amazon.aps.iva.n2.f fVar, com.amazon.aps.iva.n2.e eVar, com.amazon.aps.iva.n2.d dVar, com.amazon.aps.iva.n2.n nVar2) {
        boolean z;
        com.amazon.aps.iva.n2.d dVar2;
        com.amazon.aps.iva.n2.n nVar3;
        com.amazon.aps.iva.n2.n nVar4;
        com.amazon.aps.iva.n2.f fVar2 = fVar;
        com.amazon.aps.iva.n2.e eVar2 = eVar;
        com.amazon.aps.iva.n2.d dVar3 = dVar;
        com.amazon.aps.iva.yb0.j.f(nVar, "$this$fastMerge");
        com.amazon.aps.iva.n2.n nVar5 = nVar.i;
        com.amazon.aps.iva.n2.d dVar4 = nVar.h;
        com.amazon.aps.iva.n2.e eVar3 = nVar.g;
        com.amazon.aps.iva.n2.f fVar3 = nVar.f;
        q qVar2 = nVar.e;
        com.amazon.aps.iva.n2.j jVar2 = nVar.b;
        com.amazon.aps.iva.n2.m mVar2 = nVar.d;
        com.amazon.aps.iva.n2.d dVar5 = dVar4;
        long j2 = nVar.c;
        com.amazon.aps.iva.n2.h hVar2 = nVar.a;
        if (hVar != null && !com.amazon.aps.iva.yb0.j.a(hVar, hVar2)) {
            nVar3 = nVar2;
            nVar4 = nVar5;
            z = true;
        } else {
            z = true;
            if (((!com.amazon.aps.iva.e.z.F(j)) && !com.amazon.aps.iva.o2.m.a(j, j2)) || ((mVar != null && !com.amazon.aps.iva.yb0.j.a(mVar, mVar2)) || ((jVar != null && !com.amazon.aps.iva.yb0.j.a(jVar, jVar2)) || ((qVar != null && !com.amazon.aps.iva.yb0.j.a(qVar, qVar2)) || ((fVar2 != null && !com.amazon.aps.iva.yb0.j.a(fVar2, fVar3)) || (eVar2 != null && !com.amazon.aps.iva.yb0.j.a(eVar2, eVar3))))))) {
                dVar2 = dVar5;
            } else {
                dVar2 = dVar5;
                if (dVar3 == null || com.amazon.aps.iva.yb0.j.a(dVar3, dVar2)) {
                    nVar3 = nVar2;
                    dVar5 = dVar2;
                    nVar4 = nVar5;
                    if (nVar3 == null || com.amazon.aps.iva.yb0.j.a(nVar3, nVar4)) {
                        z = false;
                    }
                }
            }
            nVar3 = nVar2;
            dVar5 = dVar2;
            nVar4 = nVar5;
        }
        if (!z) {
            return nVar;
        }
        if (!com.amazon.aps.iva.e.z.F(j)) {
            j2 = j;
        }
        if (mVar != null) {
            mVar2 = mVar;
        }
        if (hVar != null) {
            hVar2 = hVar;
        }
        if (jVar != null) {
            jVar2 = jVar;
        }
        if (qVar2 == null || qVar != null) {
            qVar2 = qVar;
        }
        if (fVar2 == null) {
            fVar2 = fVar3;
        }
        if (eVar2 == null) {
            eVar2 = eVar3;
        }
        if (dVar3 == null) {
            dVar3 = dVar5;
        }
        if (nVar3 != null) {
            nVar4 = nVar3;
        }
        return new n(hVar2, jVar2, j2, mVar2, qVar2, fVar2, eVar2, dVar3, nVar4);
    }
}
