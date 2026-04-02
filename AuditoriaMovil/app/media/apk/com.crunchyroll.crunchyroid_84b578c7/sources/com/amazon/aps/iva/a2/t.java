package com.amazon.aps.iva.a2;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.u1.i1;
/* compiled from: SemanticsNode.kt */
/* loaded from: classes.dex */
public final class t {
    public static final r a(androidx.compose.ui.node.e eVar, boolean z) {
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
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
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 && (cVar2 instanceof com.amazon.aps.iva.u1.j)) {
                            int i = 0;
                            for (f.c cVar3 = ((com.amazon.aps.iva.u1.j) cVar2).p; cVar3 != null; cVar3 = cVar3.g) {
                                if ((cVar3.d & 8) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
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
        f.c V = i1Var.V();
        l s = eVar.s();
        com.amazon.aps.iva.yb0.j.c(s);
        return new r(V, z, eVar, s);
    }

    public static final androidx.compose.ui.node.e b(androidx.compose.ui.node.e eVar, com.amazon.aps.iva.xb0.l<? super androidx.compose.ui.node.e, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "selector");
        for (androidx.compose.ui.node.e v = eVar.v(); v != null; v = v.v()) {
            if (lVar.invoke(v).booleanValue()) {
                return v;
            }
        }
        return null;
    }

    public static final i1 c(androidx.compose.ui.node.e eVar) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
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
                            if (((i1) cVar2).d1()) {
                                i1Var = cVar2;
                                break loop0;
                            }
                        } else {
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
        return i1Var;
    }
}
