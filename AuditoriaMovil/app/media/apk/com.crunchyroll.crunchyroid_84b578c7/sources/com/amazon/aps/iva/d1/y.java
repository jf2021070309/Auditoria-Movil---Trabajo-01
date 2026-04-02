package com.amazon.aps.iva.d1;

import androidx.compose.ui.focus.FocusTargetNode;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.u1.q0;
/* compiled from: FocusTransactions.kt */
/* loaded from: classes.dex */
public final class y {

    /* compiled from: FocusTransactions.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[x.values().length];
            try {
                iArr2[x.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[x.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[x.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[x.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public static final boolean a(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(focusTargetNode, "<this>");
        int i = a.b[focusTargetNode.q.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                } else {
                    FocusTargetNode c = a0.c(focusTargetNode);
                    if (c != null) {
                        z3 = a(c, z, z2);
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        focusTargetNode.w1(x.Inactive);
                        if (z2) {
                            g.c(focusTargetNode);
                        }
                    } else {
                        return false;
                    }
                }
            } else if (z) {
                focusTargetNode.w1(x.Inactive);
                if (z2) {
                    g.c(focusTargetNode);
                    return z;
                }
                return z;
            } else {
                return z;
            }
        } else {
            focusTargetNode.w1(x.Inactive);
            if (z2) {
                g.c(focusTargetNode);
            }
        }
        return true;
    }

    public static final boolean b(FocusTargetNode focusTargetNode) {
        int i = a.b[focusTargetNode.q.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3 && i != 4) {
                throw new com.amazon.aps.iva.kb0.h();
            }
            return false;
        }
        focusTargetNode.w1(x.Active);
        g.c(focusTargetNode);
        return true;
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        q0.a(focusTargetNode, new z(focusTargetNode));
        int i = a.b[focusTargetNode.q.ordinal()];
        if (i == 3 || i == 4) {
            focusTargetNode.w1(x.Active);
        }
    }

    public static final b d(FocusTargetNode focusTargetNode, int i) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(focusTargetNode, "$this$performCustomClearFocus");
        int i2 = a.b[focusTargetNode.q.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                } else {
                    FocusTargetNode c = a0.c(focusTargetNode);
                    if (c != null) {
                        b d = d(c, i);
                        b bVar = b.None;
                        if (d == bVar) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            d = null;
                        }
                        if (d == null) {
                            if (!focusTargetNode.o) {
                                focusTargetNode.o = true;
                                try {
                                    focusTargetNode.t1().k.getClass();
                                    r rVar = r.b;
                                    return bVar;
                                } finally {
                                    focusTargetNode.o = false;
                                }
                            }
                            return bVar;
                        }
                        return d;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                return b.Cancelled;
            }
        }
        return b.None;
    }

    public static final b e(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.p) {
            focusTargetNode.p = true;
            try {
                focusTargetNode.t1().j.getClass();
                r rVar = r.b;
            } finally {
                focusTargetNode.p = false;
            }
        }
        return b.None;
    }

    public static final b f(FocusTargetNode focusTargetNode, int i) {
        b bVar;
        FocusTargetNode focusTargetNode2;
        androidx.compose.ui.node.m mVar;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(focusTargetNode, "$this$performCustomRequestFocus");
        int i2 = a.b[focusTargetNode.q.ordinal()];
        boolean z3 = true;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    f.c cVar = focusTargetNode.b;
                    if (cVar.n) {
                        f.c cVar2 = cVar.f;
                        androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(focusTargetNode);
                        loop0: while (true) {
                            bVar = null;
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
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (z && (focusTargetNode2 instanceof com.amazon.aps.iva.u1.j)) {
                                                    int i3 = 0;
                                                    for (f.c cVar3 = ((com.amazon.aps.iva.u1.j) focusTargetNode2).p; cVar3 != null; cVar3 = cVar3.g) {
                                                        if ((cVar3.d & 1024) != 0) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (z2) {
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
                        if (focusTargetNode3 == null) {
                            return b.None;
                        }
                        int i4 = a.b[focusTargetNode3.q.ordinal()];
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 == 4) {
                                        b f = f(focusTargetNode3, i);
                                        if (f != b.None) {
                                            z3 = false;
                                        }
                                        if (!z3) {
                                            bVar = f;
                                        }
                                        if (bVar == null) {
                                            return e(focusTargetNode3);
                                        }
                                        return bVar;
                                    }
                                    throw new com.amazon.aps.iva.kb0.h();
                                }
                                return f(focusTargetNode3, i);
                            }
                            return b.Cancelled;
                        }
                        return e(focusTargetNode3);
                    }
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                throw new com.amazon.aps.iva.kb0.h();
            }
            FocusTargetNode c = a0.c(focusTargetNode);
            if (c != null) {
                return d(c, i);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        return b.None;
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        boolean z;
        FocusTargetNode focusTargetNode2;
        androidx.compose.ui.node.m mVar;
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(focusTargetNode, "<this>");
        int i = a.b[focusTargetNode.q.ordinal()];
        boolean z4 = true;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    f.c cVar = focusTargetNode.b;
                    if (cVar.n) {
                        f.c cVar2 = cVar.f;
                        androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(focusTargetNode);
                        loop0: while (true) {
                            focusTargetNode2 = null;
                            if (e == null) {
                                break;
                            }
                            if ((e.z.e.e & 1024) != 0) {
                                while (cVar2 != null) {
                                    if ((cVar2.d & 1024) != 0) {
                                        f.c cVar3 = cVar2;
                                        com.amazon.aps.iva.p0.f fVar = null;
                                        while (cVar3 != null) {
                                            if (cVar3 instanceof FocusTargetNode) {
                                                focusTargetNode2 = cVar3;
                                                break loop0;
                                            }
                                            if ((cVar3.d & 1024) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2 && (cVar3 instanceof com.amazon.aps.iva.u1.j)) {
                                                int i2 = 0;
                                                for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                                    if ((cVar4.d & 1024) != 0) {
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
                                            cVar3 = com.amazon.aps.iva.u1.i.b(fVar);
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
                        }
                        FocusTargetNode focusTargetNode3 = focusTargetNode2;
                        if (focusTargetNode3 != null) {
                            return i(focusTargetNode3, focusTargetNode);
                        }
                        if (j(focusTargetNode)) {
                            c(focusTargetNode);
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            g.c(focusTargetNode);
                            return z4;
                        }
                        return z4;
                    }
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                throw new com.amazon.aps.iva.kb0.h();
            }
            FocusTargetNode c = a0.c(focusTargetNode);
            if (c != null) {
                z = a(c, false, true);
            } else {
                z = true;
            }
            if (z) {
                c(focusTargetNode);
            } else {
                z4 = false;
            }
            if (z4) {
                g.c(focusTargetNode);
                return z4;
            }
            return z4;
        }
        g.c(focusTargetNode);
        return true;
    }

    public static final boolean h(FocusTargetNode focusTargetNode) {
        com.amazon.aps.iva.yb0.j.f(focusTargetNode, "<this>");
        int i = a.a[f(focusTargetNode, 7).ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3 && i != 4) {
                throw new com.amazon.aps.iva.kb0.h();
            }
            return false;
        }
        return g(focusTargetNode);
    }

    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        boolean z;
        FocusTargetNode focusTargetNode3;
        f.c cVar;
        boolean z2;
        androidx.compose.ui.node.m mVar;
        boolean z3;
        boolean z4;
        androidx.compose.ui.node.m mVar2;
        boolean z5;
        boolean z6;
        f.c cVar2 = focusTargetNode2.b;
        if (cVar2.n) {
            f.c cVar3 = cVar2.f;
            androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(focusTargetNode2);
            loop0: while (true) {
                z = false;
                focusTargetNode3 = null;
                if (e != null) {
                    if ((e.z.e.e & 1024) != 0) {
                        while (cVar3 != null) {
                            if ((cVar3.d & 1024) != 0) {
                                cVar = cVar3;
                                com.amazon.aps.iva.p0.f fVar = null;
                                while (cVar != null) {
                                    if (cVar instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((cVar.d & 1024) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 && (cVar instanceof com.amazon.aps.iva.u1.j)) {
                                        int i = 0;
                                        for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar).p; cVar4 != null; cVar4 = cVar4.g) {
                                            if ((cVar4.d & 1024) != 0) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            if (z6) {
                                                i++;
                                                if (i == 1) {
                                                    cVar = cVar4;
                                                } else {
                                                    if (fVar == null) {
                                                        fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                    }
                                                    if (cVar != null) {
                                                        fVar.b(cVar);
                                                        cVar = null;
                                                    }
                                                    fVar.b(cVar4);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    cVar = com.amazon.aps.iva.u1.i.b(fVar);
                                }
                                continue;
                            }
                            cVar3 = cVar3.f;
                        }
                    }
                    e = e.v();
                    if (e != null && (mVar2 = e.z) != null) {
                        cVar3 = mVar2.d;
                    } else {
                        cVar3 = null;
                    }
                } else {
                    cVar = null;
                    break;
                }
            }
            if (com.amazon.aps.iva.yb0.j.a(cVar, focusTargetNode)) {
                int i2 = a.b[focusTargetNode.q.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        return false;
                    }
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f.c cVar5 = focusTargetNode.b;
                            if (cVar5.n) {
                                f.c cVar6 = cVar5.f;
                                androidx.compose.ui.node.e e2 = com.amazon.aps.iva.u1.i.e(focusTargetNode);
                                loop4: while (true) {
                                    if (e2 == null) {
                                        break;
                                    }
                                    if ((e2.z.e.e & 1024) != 0) {
                                        while (cVar6 != null) {
                                            if ((cVar6.d & 1024) != 0) {
                                                f.c cVar7 = cVar6;
                                                com.amazon.aps.iva.p0.f fVar2 = null;
                                                while (cVar7 != null) {
                                                    if (cVar7 instanceof FocusTargetNode) {
                                                        focusTargetNode3 = cVar7;
                                                        break loop4;
                                                    }
                                                    if ((cVar7.d & 1024) != 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (z3 && (cVar7 instanceof com.amazon.aps.iva.u1.j)) {
                                                        int i3 = 0;
                                                        for (f.c cVar8 = ((com.amazon.aps.iva.u1.j) cVar7).p; cVar8 != null; cVar8 = cVar8.g) {
                                                            if ((cVar8.d & 1024) != 0) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            if (z4) {
                                                                i3++;
                                                                if (i3 == 1) {
                                                                    cVar7 = cVar8;
                                                                } else {
                                                                    if (fVar2 == null) {
                                                                        fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                                    }
                                                                    if (cVar7 != null) {
                                                                        fVar2.b(cVar7);
                                                                        cVar7 = null;
                                                                    }
                                                                    fVar2.b(cVar8);
                                                                }
                                                            }
                                                        }
                                                        if (i3 == 1) {
                                                        }
                                                    }
                                                    cVar7 = com.amazon.aps.iva.u1.i.b(fVar2);
                                                }
                                                continue;
                                            }
                                            cVar6 = cVar6.f;
                                        }
                                    }
                                    e2 = e2.v();
                                    if (e2 != null && (mVar = e2.z) != null) {
                                        cVar6 = mVar.d;
                                    } else {
                                        cVar6 = null;
                                    }
                                }
                                FocusTargetNode focusTargetNode4 = focusTargetNode3;
                                if (focusTargetNode4 == null && j(focusTargetNode)) {
                                    focusTargetNode.w1(x.Active);
                                    g.c(focusTargetNode);
                                    return i(focusTargetNode, focusTargetNode2);
                                } else if (focusTargetNode4 == null || !i(focusTargetNode4, focusTargetNode)) {
                                    return false;
                                } else {
                                    boolean i4 = i(focusTargetNode, focusTargetNode2);
                                    if (focusTargetNode.q == x.ActiveParent) {
                                        z = true;
                                    }
                                    if (z) {
                                        return i4;
                                    }
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                            }
                            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                        }
                        throw new com.amazon.aps.iva.kb0.h();
                    } else if (a0.c(focusTargetNode) != null) {
                        FocusTargetNode c = a0.c(focusTargetNode);
                        if (c != null) {
                            z2 = a(c, false, true);
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            c(focusTargetNode2);
                            z = true;
                        }
                        if (z) {
                            g.c(focusTargetNode2);
                            return z;
                        }
                        return z;
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                c(focusTargetNode2);
                focusTargetNode.w1(x.ActiveParent);
                g.c(focusTargetNode2);
                g.c(focusTargetNode);
                return true;
            }
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.p pVar;
        androidx.compose.ui.node.o oVar = focusTargetNode.i;
        if (oVar != null && (eVar = oVar.i) != null && (pVar = eVar.j) != null) {
            return pVar.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
