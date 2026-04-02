package com.amazon.aps.iva.u1;

import com.amazon.aps.iva.a1.f;
/* compiled from: DelegatableNode.kt */
/* loaded from: classes.dex */
public final class i {
    public static final void a(com.amazon.aps.iva.p0.f fVar, f.c cVar) {
        com.amazon.aps.iva.p0.f<androidx.compose.ui.node.e> y = e(cVar).y();
        int i = y.d;
        if (i > 0) {
            int i2 = i - 1;
            androidx.compose.ui.node.e[] eVarArr = y.b;
            do {
                fVar.b(eVarArr[i2].z.e);
                i2--;
            } while (i2 >= 0);
        }
    }

    public static final f.c b(com.amazon.aps.iva.p0.f fVar) {
        if (fVar != null && !fVar.i()) {
            return (f.c) fVar.l(fVar.d - 1);
        }
        return null;
    }

    public static final x c(f.c cVar) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        if ((cVar.d & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        if (cVar instanceof x) {
            return (x) cVar;
        }
        if (cVar instanceof j) {
            f.c cVar2 = ((j) cVar).p;
            while (cVar2 != null) {
                if (cVar2 instanceof x) {
                    return (x) cVar2;
                }
                if (cVar2 instanceof j) {
                    if ((cVar2.d & 2) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        cVar2 = ((j) cVar2).p;
                    }
                }
                cVar2 = cVar2.g;
            }
        }
        return null;
    }

    public static final androidx.compose.ui.node.o d(h hVar, int i) {
        com.amazon.aps.iva.yb0.j.f(hVar, "$this$requireCoordinator");
        androidx.compose.ui.node.o oVar = hVar.V().i;
        com.amazon.aps.iva.yb0.j.c(oVar);
        if (oVar.r1() == hVar && k0.h(i)) {
            androidx.compose.ui.node.o oVar2 = oVar.j;
            com.amazon.aps.iva.yb0.j.c(oVar2);
            return oVar2;
        }
        return oVar;
    }

    public static final androidx.compose.ui.node.e e(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        androidx.compose.ui.node.o oVar = hVar.V().i;
        if (oVar != null) {
            return oVar.i;
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
    }

    public static final androidx.compose.ui.node.p f(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        androidx.compose.ui.node.p pVar = e(hVar).j;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
