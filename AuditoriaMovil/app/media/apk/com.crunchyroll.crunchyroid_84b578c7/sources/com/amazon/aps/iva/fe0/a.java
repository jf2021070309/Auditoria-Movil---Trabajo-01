package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.b1;
import com.amazon.aps.iva.fe0.e;
import com.amazon.aps.iva.fe0.f;
/* compiled from: ClassicTypeCheckerState.kt */
/* loaded from: classes4.dex */
public final class a {
    public static b1 a(boolean z, boolean z2, p pVar, e eVar, f fVar, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            pVar = p.a;
        }
        p pVar2 = pVar;
        if ((i & 8) != 0) {
            eVar = e.a.a;
        }
        e eVar2 = eVar;
        if ((i & 16) != 0) {
            fVar = f.a.a;
        }
        f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(pVar2, "typeSystemContext");
        com.amazon.aps.iva.yb0.j.f(eVar2, "kotlinTypePreparator");
        com.amazon.aps.iva.yb0.j.f(fVar2, "kotlinTypeRefiner");
        return new b1(z, z3, pVar2, eVar2, fVar2);
    }
}
