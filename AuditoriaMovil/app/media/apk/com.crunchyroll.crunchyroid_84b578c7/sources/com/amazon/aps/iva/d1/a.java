package com.amazon.aps.iva.d1;

import androidx.compose.ui.focus.FocusTargetNode;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.c;
/* compiled from: BeyondBoundsLayout.kt */
/* loaded from: classes.dex */
public final class a {
    public static final <T> T a(FocusTargetNode focusTargetNode, int i, com.amazon.aps.iva.xb0.l<? super c.a, ? extends T> lVar) {
        int i2;
        boolean z;
        FocusTargetNode focusTargetNode2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        androidx.compose.ui.node.m mVar;
        boolean z7;
        boolean z8;
        f.c cVar = focusTargetNode.b;
        if (cVar.n) {
            f.c cVar2 = cVar.f;
            androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(focusTargetNode);
            loop0: while (true) {
                i2 = 1;
                z = false;
                if (e != null) {
                    if ((e.z.e.e & 1024) != 0) {
                        while (cVar2 != null) {
                            if ((cVar2.d & 1024) != 0) {
                                focusTargetNode2 = cVar2;
                                com.amazon.aps.iva.p0.f fVar = null;
                                while (focusTargetNode2 != null) {
                                    if (focusTargetNode2 instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((focusTargetNode2.d & 1024) != 0) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7 && (focusTargetNode2 instanceof com.amazon.aps.iva.u1.j)) {
                                        int i3 = 0;
                                        for (f.c cVar3 = ((com.amazon.aps.iva.u1.j) focusTargetNode2).p; cVar3 != null; cVar3 = cVar3.g) {
                                            if ((cVar3.d & 1024) != 0) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            if (z8) {
                                                i3++;
                                                if (i3 == 1) {
                                                    focusTargetNode2 = cVar3;
                                                } else {
                                                    if (fVar == null) {
                                                        fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                    }
                                                    if (focusTargetNode2 != null) {
                                                        fVar.b(focusTargetNode2);
                                                        focusTargetNode2 = null;
                                                    }
                                                    fVar.b(cVar3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    focusTargetNode2 = com.amazon.aps.iva.u1.i.b(fVar);
                                }
                                continue;
                            }
                            cVar2 = cVar2.f;
                        }
                    }
                    e = e.v();
                    if (e != null && (mVar = e.z) != null) {
                        cVar2 = mVar.d;
                    } else {
                        cVar2 = null;
                    }
                } else {
                    focusTargetNode2 = null;
                    break;
                }
            }
            FocusTargetNode focusTargetNode3 = focusTargetNode2;
            if (focusTargetNode3 != null) {
                com.amazon.aps.iva.t1.i<com.amazon.aps.iva.s1.c> iVar = com.amazon.aps.iva.s1.d.a;
                if (com.amazon.aps.iva.yb0.j.a((com.amazon.aps.iva.s1.c) focusTargetNode3.l(iVar), (com.amazon.aps.iva.s1.c) focusTargetNode.l(iVar))) {
                    return null;
                }
            }
            com.amazon.aps.iva.s1.c cVar4 = (com.amazon.aps.iva.s1.c) focusTargetNode.l(com.amazon.aps.iva.s1.d.a);
            if (cVar4 == null) {
                return null;
            }
            int i4 = 5;
            if (i == 5) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                i4 = 6;
                if (i == 6) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    i4 = 3;
                    if (i == 3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        i4 = 4;
                        if (i == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            if (i == 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                i2 = 2;
                            } else {
                                if (i == 2) {
                                    z = true;
                                }
                                if (!z) {
                                    throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                                }
                            }
                            return (T) cVar4.l(i2, lVar);
                        }
                    }
                }
            }
            i2 = i4;
            return (T) cVar4.l(i2, lVar);
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
