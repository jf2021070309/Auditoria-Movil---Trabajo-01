package com.amazon.aps.iva.v2;

import com.amazon.aps.iva.u2.e;
import java.util.ArrayList;
/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public final class i {
    public static o a(com.amazon.aps.iva.u2.e eVar, int i, ArrayList<o> arrayList, o oVar) {
        int i2;
        boolean z;
        int i3;
        if (i == 0) {
            i2 = eVar.q0;
        } else {
            i2 = eVar.r0;
        }
        int i4 = 0;
        if (i2 != -1 && (oVar == null || i2 != oVar.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i5);
                if (oVar2.b == i2) {
                    if (oVar != null) {
                        oVar.c(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i5++;
                }
            }
        } else if (i2 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (eVar instanceof com.amazon.aps.iva.u2.j) {
                com.amazon.aps.iva.u2.j jVar = (com.amazon.aps.iva.u2.j) eVar;
                int i6 = 0;
                while (true) {
                    if (i6 < jVar.t0) {
                        com.amazon.aps.iva.u2.e eVar2 = jVar.s0[i6];
                        if ((i == 0 && (i3 = eVar2.q0) != -1) || (i == 1 && (i3 = eVar2.r0) != -1)) {
                            break;
                        }
                        i6++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i7);
                        if (oVar3.b == i3) {
                            oVar = oVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i);
            }
            arrayList.add(oVar);
        }
        ArrayList<com.amazon.aps.iva.u2.e> arrayList2 = oVar.a;
        if (arrayList2.contains(eVar)) {
            z = false;
        } else {
            arrayList2.add(eVar);
            z = true;
        }
        if (z) {
            if (eVar instanceof com.amazon.aps.iva.u2.h) {
                com.amazon.aps.iva.u2.h hVar = (com.amazon.aps.iva.u2.h) eVar;
                com.amazon.aps.iva.u2.d dVar = hVar.v0;
                if (hVar.w0 == 0) {
                    i4 = 1;
                }
                dVar.c(i4, oVar, arrayList);
            }
            int i8 = oVar.b;
            if (i == 0) {
                eVar.q0 = i8;
                eVar.K.c(i, oVar, arrayList);
                eVar.M.c(i, oVar, arrayList);
            } else {
                eVar.r0 = i8;
                eVar.L.c(i, oVar, arrayList);
                eVar.O.c(i, oVar, arrayList);
                eVar.N.c(i, oVar, arrayList);
            }
            eVar.R.c(i, oVar, arrayList);
        }
        return oVar;
    }

    public static boolean b(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        boolean z;
        boolean z2;
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        if (bVar3 != bVar7 && bVar3 != (bVar6 = e.b.WRAP_CONTENT) && (bVar3 != e.b.MATCH_PARENT || bVar == bVar6)) {
            z = false;
        } else {
            z = true;
        }
        if (bVar4 != bVar7 && bVar4 != (bVar5 = e.b.WRAP_CONTENT) && (bVar4 != e.b.MATCH_PARENT || bVar2 == bVar5)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }
}
