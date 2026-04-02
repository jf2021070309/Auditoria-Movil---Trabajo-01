package com.amazon.aps.iva.t1;

import androidx.compose.ui.node.m;
import com.amazon.aps.iva.a1.f;
/* compiled from: ModifierLocalModifierNode.kt */
/* loaded from: classes.dex */
public interface f extends h, com.amazon.aps.iva.u1.h {
    default com.amazon.aps.iva.ab.a P() {
        return b.a;
    }

    @Override // com.amazon.aps.iva.t1.h
    default Object l(i iVar) {
        m mVar;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(iVar, "<this>");
        if (V().n) {
            if (V().n) {
                f.c cVar = V().f;
                androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(this);
                while (e != null) {
                    if ((e.z.e.e & 32) != 0) {
                        while (cVar != null) {
                            if ((cVar.d & 32) != 0) {
                                f.c cVar2 = cVar;
                                com.amazon.aps.iva.p0.f fVar = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof f) {
                                        f fVar2 = (f) cVar2;
                                        if (fVar2.P().d(iVar)) {
                                            return fVar2.P().g(iVar);
                                        }
                                    } else {
                                        if ((cVar2.d & 32) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z && (cVar2 instanceof com.amazon.aps.iva.u1.j)) {
                                            int i = 0;
                                            for (f.c cVar3 = ((com.amazon.aps.iva.u1.j) cVar2).p; cVar3 != null; cVar3 = cVar3.g) {
                                                if ((cVar3.d & 32) != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    i++;
                                                    if (i == 1) {
                                                        cVar2 = cVar3;
                                                    } else {
                                                        if (fVar == null) {
                                                            fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                        }
                                                        if (cVar2 != null) {
                                                            fVar.b(cVar2);
                                                            cVar2 = null;
                                                        }
                                                        fVar.b(cVar3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                    }
                                    cVar2 = com.amazon.aps.iva.u1.i.b(fVar);
                                }
                                continue;
                            }
                            cVar = cVar.f;
                        }
                    }
                    e = e.v();
                    if (e != null && (mVar = e.z) != null) {
                        cVar = mVar.d;
                    } else {
                        cVar = null;
                    }
                }
                return iVar.a.invoke();
            }
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
