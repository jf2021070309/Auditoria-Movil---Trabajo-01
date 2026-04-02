package com.amazon.aps.iva.a2;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.u1.i1;
/* compiled from: SemanticsOwner.kt */
/* loaded from: classes.dex */
public final class u {
    public final androidx.compose.ui.node.e a;

    public u(androidx.compose.ui.node.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "rootNode");
        this.a = eVar;
    }

    public final r a() {
        boolean z;
        boolean z2;
        androidx.compose.ui.node.e eVar = this.a;
        f.c cVar = eVar.z.e;
        i1 i1Var = null;
        if ((cVar.e & 8) != 0) {
            loop0: while (true) {
                if (cVar == null) {
                    break;
                }
                if ((cVar.d & 8) != 0) {
                    f.c cVar2 = cVar;
                    com.amazon.aps.iva.p0.f fVar = null;
                    while (cVar2 != null) {
                        if (cVar2 instanceof i1) {
                            i1Var = cVar2;
                            break loop0;
                        }
                        if ((cVar2.d & 8) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && (cVar2 instanceof com.amazon.aps.iva.u1.j)) {
                            int i = 0;
                            for (f.c cVar3 = ((com.amazon.aps.iva.u1.j) cVar2).p; cVar3 != null; cVar3 = cVar3.g) {
                                if ((cVar3.d & 8) != 0) {
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
                        cVar2 = com.amazon.aps.iva.u1.i.b(fVar);
                    }
                }
                if ((cVar.e & 8) == 0) {
                    break;
                }
                cVar = cVar.g;
            }
        }
        com.amazon.aps.iva.yb0.j.c(i1Var);
        return new r(i1Var.V(), false, eVar, new l());
    }
}
