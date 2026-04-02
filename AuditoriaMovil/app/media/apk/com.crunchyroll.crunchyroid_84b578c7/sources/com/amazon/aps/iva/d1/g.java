package com.amazon.aps.iva.d1;

import androidx.compose.ui.focus.FocusTargetNode;
import com.amazon.aps.iva.a1.f;
/* compiled from: FocusEventModifierNode.kt */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: FocusEventModifierNode.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x008d, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.d1.x a(com.amazon.aps.iva.d1.f r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d1.g.a(com.amazon.aps.iva.d1.f):com.amazon.aps.iva.d1.x");
    }

    public static final void b(f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        com.amazon.aps.iva.u1.i.f(fVar).getFocusOwner().e(fVar);
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.m mVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        com.amazon.aps.iva.yb0.j.f(focusTargetNode, "<this>");
        f.c cVar = focusTargetNode.b;
        if (cVar.n) {
            androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(focusTargetNode);
            f.c cVar2 = cVar;
            while (e != null) {
                if ((e.z.e.e & 5120) != 0) {
                    while (cVar2 != null) {
                        int i = cVar2.d;
                        if ((i & 5120) != 0) {
                            if (cVar2 != cVar) {
                                if ((i & 1024) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    return;
                                }
                            }
                            if ((i & 4096) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                f.c cVar3 = cVar2;
                                com.amazon.aps.iva.p0.f fVar = null;
                                while (cVar3 != null) {
                                    if (cVar3 instanceof f) {
                                        f fVar2 = (f) cVar3;
                                        fVar2.p0(a(fVar2));
                                    } else {
                                        if ((cVar3.d & 4096) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2 && (cVar3 instanceof com.amazon.aps.iva.u1.j)) {
                                            int i2 = 0;
                                            for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                                if ((cVar4.d & 4096) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        cVar3 = cVar4;
                                                    } else {
                                                        if (fVar == null) {
                                                            fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                        }
                                                        if (cVar3 != null) {
                                                            fVar.b(cVar3);
                                                            cVar3 = null;
                                                        }
                                                        fVar.b(cVar4);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                    }
                                    cVar3 = com.amazon.aps.iva.u1.i.b(fVar);
                                }
                            }
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
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }
}
