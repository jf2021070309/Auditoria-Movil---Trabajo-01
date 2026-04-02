package com.amazon.aps.iva.d1;

import androidx.compose.ui.focus.FocusTargetNode;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.c;
import java.util.Arrays;
/* compiled from: OneDimensionalFocusSearch.kt */
/* loaded from: classes.dex */
public final class c0 {

    /* compiled from: OneDimensionalFocusSearch.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.Active.ordinal()] = 2;
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

    /* compiled from: OneDimensionalFocusSearch.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c.a, Boolean> {
        public final /* synthetic */ FocusTargetNode h;
        public final /* synthetic */ FocusTargetNode i;
        public final /* synthetic */ int j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<FocusTargetNode, Boolean> k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, com.amazon.aps.iva.xb0.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.h = focusTargetNode;
            this.i = focusTargetNode2;
            this.j = i;
            this.k = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(c.a aVar) {
            boolean z;
            c.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$searchBeyondBounds");
            Boolean valueOf = Boolean.valueOf(c0.f(this.h, this.i, this.j, this.k));
            if (!valueOf.booleanValue() && aVar2.a()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return null;
            }
            return valueOf;
        }
    }

    public static final boolean a(FocusTargetNode focusTargetNode, com.amazon.aps.iva.xb0.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z;
        x xVar = focusTargetNode.q;
        int[] iArr = a.a;
        int i = iArr[xVar.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (!d(focusTargetNode, lVar)) {
                        if (focusTargetNode.t1().a) {
                            z = lVar.invoke(focusTargetNode).booleanValue();
                        } else {
                            z = false;
                        }
                        if (!z) {
                            return false;
                        }
                    }
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            } else {
                return d(focusTargetNode, lVar);
            }
        } else {
            FocusTargetNode c = a0.c(focusTargetNode);
            if (c != null) {
                int i2 = iArr[c.q.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        if (i2 != 4) {
                            throw new com.amazon.aps.iva.kb0.h();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    return c(focusTargetNode, c, 2, lVar);
                } else if (!a(c, lVar) && !c(focusTargetNode, c, 2, lVar) && (!c.t1().a || !lVar.invoke(c).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
        }
        return true;
    }

    public static final boolean b(FocusTargetNode focusTargetNode, com.amazon.aps.iva.xb0.l<? super FocusTargetNode, Boolean> lVar) {
        int i = a.a[focusTargetNode.q.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (focusTargetNode.t1().a) {
                        return lVar.invoke(focusTargetNode).booleanValue();
                    }
                    return e(focusTargetNode, lVar);
                }
                throw new com.amazon.aps.iva.kb0.h();
            }
            return e(focusTargetNode, lVar);
        }
        FocusTargetNode c = a0.c(focusTargetNode);
        if (c != null) {
            if (b(c, lVar) || c(focusTargetNode, c, 1, lVar)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    public static final boolean c(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, com.amazon.aps.iva.xb0.l<? super FocusTargetNode, Boolean> lVar) {
        if (f(focusTargetNode, focusTargetNode2, i, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) com.amazon.aps.iva.d1.a.a(focusTargetNode, i, new b(focusTargetNode, focusTargetNode2, i, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(FocusTargetNode focusTargetNode, com.amazon.aps.iva.xb0.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z;
        boolean z2;
        FocusTargetNode[] focusTargetNodeArr = new FocusTargetNode[16];
        f.c cVar = focusTargetNode.b;
        if (cVar.n) {
            com.amazon.aps.iva.p0.f fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
            f.c cVar2 = cVar.g;
            if (cVar2 == null) {
                com.amazon.aps.iva.u1.i.a(fVar, cVar);
            } else {
                fVar.b(cVar2);
            }
            int i = 0;
            while (fVar.j()) {
                f.c cVar3 = (f.c) fVar.l(fVar.d - 1);
                if ((cVar3.e & 1024) == 0) {
                    com.amazon.aps.iva.u1.i.a(fVar, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            break;
                        } else if ((cVar3.d & 1024) != 0) {
                            com.amazon.aps.iva.p0.f fVar2 = null;
                            while (cVar3 != null) {
                                if (cVar3 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar3;
                                    int i2 = i + 1;
                                    if (focusTargetNodeArr.length < i2) {
                                        focusTargetNodeArr = Arrays.copyOf(focusTargetNodeArr, Math.max(i2, focusTargetNodeArr.length * 2));
                                        com.amazon.aps.iva.yb0.j.e(focusTargetNodeArr, "copyOf(this, newSize)");
                                    }
                                    focusTargetNodeArr[i] = focusTargetNode2;
                                    i = i2;
                                } else {
                                    if ((cVar3.d & 1024) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z && (cVar3 instanceof com.amazon.aps.iva.u1.j)) {
                                        int i3 = 0;
                                        for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                            if ((cVar4.d & 1024) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cVar3 = cVar4;
                                                } else {
                                                    if (fVar2 == null) {
                                                        fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                    }
                                                    if (cVar3 != null) {
                                                        fVar2.b(cVar3);
                                                        cVar3 = null;
                                                    }
                                                    fVar2.b(cVar4);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                }
                                cVar3 = com.amazon.aps.iva.u1.i.b(fVar2);
                            }
                        } else {
                            cVar3 = cVar3.g;
                        }
                    }
                }
            }
            b0 b0Var = b0.b;
            com.amazon.aps.iva.yb0.j.f(focusTargetNodeArr, "<this>");
            Arrays.sort(focusTargetNodeArr, 0, i, b0Var);
            if (i <= 0) {
                return false;
            }
            int i4 = i - 1;
            do {
                FocusTargetNode focusTargetNode3 = focusTargetNodeArr[i4];
                if (a0.d(focusTargetNode3) && a(focusTargetNode3, lVar)) {
                    return true;
                }
                i4--;
            } while (i4 >= 0);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final boolean e(FocusTargetNode focusTargetNode, com.amazon.aps.iva.xb0.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z;
        boolean z2;
        boolean z3;
        FocusTargetNode[] focusTargetNodeArr = new FocusTargetNode[16];
        f.c cVar = focusTargetNode.b;
        if (cVar.n) {
            com.amazon.aps.iva.p0.f fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
            f.c cVar2 = cVar.g;
            if (cVar2 == null) {
                com.amazon.aps.iva.u1.i.a(fVar, cVar);
            } else {
                fVar.b(cVar2);
            }
            int i = 0;
            while (fVar.j()) {
                f.c cVar3 = (f.c) fVar.l(fVar.d - 1);
                if ((cVar3.e & 1024) == 0) {
                    com.amazon.aps.iva.u1.i.a(fVar, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            break;
                        } else if ((cVar3.d & 1024) != 0) {
                            com.amazon.aps.iva.p0.f fVar2 = null;
                            while (cVar3 != null) {
                                if (cVar3 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar3;
                                    int i2 = i + 1;
                                    if (focusTargetNodeArr.length < i2) {
                                        focusTargetNodeArr = Arrays.copyOf(focusTargetNodeArr, Math.max(i2, focusTargetNodeArr.length * 2));
                                        com.amazon.aps.iva.yb0.j.e(focusTargetNodeArr, "copyOf(this, newSize)");
                                    }
                                    focusTargetNodeArr[i] = focusTargetNode2;
                                    i = i2;
                                } else {
                                    if ((cVar3.d & 1024) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2 && (cVar3 instanceof com.amazon.aps.iva.u1.j)) {
                                        int i3 = 0;
                                        for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                            if ((cVar4.d & 1024) != 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cVar3 = cVar4;
                                                } else {
                                                    if (fVar2 == null) {
                                                        fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                    }
                                                    if (cVar3 != null) {
                                                        fVar2.b(cVar3);
                                                        cVar3 = null;
                                                    }
                                                    fVar2.b(cVar4);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                }
                                cVar3 = com.amazon.aps.iva.u1.i.b(fVar2);
                            }
                        } else {
                            cVar3 = cVar3.g;
                        }
                    }
                }
            }
            b0 b0Var = b0.b;
            com.amazon.aps.iva.yb0.j.f(focusTargetNodeArr, "<this>");
            Arrays.sort(focusTargetNodeArr, 0, i, b0Var);
            if (i <= 0) {
                return false;
            }
            int i4 = 0;
            do {
                FocusTargetNode focusTargetNode3 = focusTargetNodeArr[i4];
                if (a0.d(focusTargetNode3) && b(focusTargetNode3, lVar)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
                i4++;
            } while (i4 < i);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final boolean f(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, com.amazon.aps.iva.xb0.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        f.c cVar;
        androidx.compose.ui.node.m mVar;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = true;
        if (focusTargetNode.q == x.ActiveParent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FocusTargetNode[] focusTargetNodeArr = new FocusTargetNode[16];
            f.c cVar2 = focusTargetNode.b;
            if (cVar2.n) {
                com.amazon.aps.iva.p0.f fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                f.c cVar3 = cVar2.g;
                if (cVar3 == null) {
                    com.amazon.aps.iva.u1.i.a(fVar, cVar2);
                } else {
                    fVar.b(cVar3);
                }
                int i2 = 0;
                while (fVar.j()) {
                    f.c cVar4 = (f.c) fVar.l(fVar.d - 1);
                    if ((cVar4.e & 1024) == 0) {
                        com.amazon.aps.iva.u1.i.a(fVar, cVar4);
                    } else {
                        while (true) {
                            if (cVar4 == null) {
                                break;
                            } else if ((cVar4.d & 1024) != 0) {
                                com.amazon.aps.iva.p0.f fVar2 = null;
                                while (cVar4 != null) {
                                    if (cVar4 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar4;
                                        int i3 = i2 + 1;
                                        if (focusTargetNodeArr.length < i3) {
                                            focusTargetNodeArr = Arrays.copyOf(focusTargetNodeArr, Math.max(i3, focusTargetNodeArr.length * 2));
                                            com.amazon.aps.iva.yb0.j.e(focusTargetNodeArr, "copyOf(this, newSize)");
                                        }
                                        focusTargetNodeArr[i2] = focusTargetNode3;
                                        i2 = i3;
                                    } else {
                                        if ((cVar4.d & 1024) != 0) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z7 && (cVar4 instanceof com.amazon.aps.iva.u1.j)) {
                                            int i4 = 0;
                                            for (f.c cVar5 = ((com.amazon.aps.iva.u1.j) cVar4).p; cVar5 != null; cVar5 = cVar5.g) {
                                                if ((cVar5.d & 1024) != 0) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                if (z8) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        cVar4 = cVar5;
                                                    } else {
                                                        if (fVar2 == null) {
                                                            fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                        }
                                                        if (cVar4 != null) {
                                                            fVar2.b(cVar4);
                                                            cVar4 = null;
                                                        }
                                                        fVar2.b(cVar5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                    }
                                    cVar4 = com.amazon.aps.iva.u1.i.b(fVar2);
                                }
                            } else {
                                cVar4 = cVar4.g;
                            }
                        }
                    }
                }
                b0 b0Var = b0.b;
                com.amazon.aps.iva.yb0.j.f(focusTargetNodeArr, "<this>");
                Arrays.sort(focusTargetNodeArr, 0, i2, b0Var);
                if (i == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int i5 = new com.amazon.aps.iva.ec0.j(0, i2 - 1).c;
                    if (i5 >= 0) {
                        boolean z10 = false;
                        int i6 = 0;
                        while (true) {
                            if (z10) {
                                FocusTargetNode focusTargetNode4 = focusTargetNodeArr[i6];
                                if (a0.d(focusTargetNode4) && b(focusTargetNode4, lVar)) {
                                    return true;
                                }
                            }
                            if (com.amazon.aps.iva.yb0.j.a(focusTargetNodeArr[i6], focusTargetNode2)) {
                                z10 = true;
                            }
                            if (i6 == i5) {
                                break;
                            }
                            i6++;
                        }
                    }
                } else {
                    if (i == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        int i7 = new com.amazon.aps.iva.ec0.j(0, i2 - 1).c;
                        if (i7 >= 0) {
                            boolean z11 = false;
                            while (true) {
                                if (z11) {
                                    FocusTargetNode focusTargetNode5 = focusTargetNodeArr[i7];
                                    if (a0.d(focusTargetNode5) && a(focusTargetNode5, lVar)) {
                                        return true;
                                    }
                                }
                                if (com.amazon.aps.iva.yb0.j.a(focusTargetNodeArr[i7], focusTargetNode2)) {
                                    z11 = true;
                                }
                                if (i7 == 0) {
                                    break;
                                }
                                i7--;
                            }
                        }
                    } else {
                        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                    }
                }
                if (i == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && focusTargetNode.t1().a) {
                    f.c cVar6 = focusTargetNode.b;
                    if (cVar6.n) {
                        f.c cVar7 = cVar6.f;
                        androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(focusTargetNode);
                        loop5: while (true) {
                            if (e != null) {
                                if ((e.z.e.e & 1024) != 0) {
                                    while (cVar7 != null) {
                                        if ((cVar7.d & 1024) != 0) {
                                            f.c cVar8 = cVar7;
                                            com.amazon.aps.iva.p0.f fVar3 = null;
                                            while (cVar8 != null) {
                                                if (cVar8 instanceof FocusTargetNode) {
                                                    cVar = cVar8;
                                                    break loop5;
                                                }
                                                if ((cVar8.d & 1024) != 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5 && (cVar8 instanceof com.amazon.aps.iva.u1.j)) {
                                                    int i8 = 0;
                                                    for (f.c cVar9 = ((com.amazon.aps.iva.u1.j) cVar8).p; cVar9 != null; cVar9 = cVar9.g) {
                                                        if ((cVar9.d & 1024) != 0) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        if (z6) {
                                                            i8++;
                                                            if (i8 == 1) {
                                                                cVar8 = cVar9;
                                                            } else {
                                                                if (fVar3 == null) {
                                                                    fVar3 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                                }
                                                                if (cVar8 != null) {
                                                                    fVar3.b(cVar8);
                                                                    cVar8 = null;
                                                                }
                                                                fVar3.b(cVar9);
                                                            }
                                                        }
                                                    }
                                                    if (i8 == 1) {
                                                    }
                                                }
                                                cVar8 = com.amazon.aps.iva.u1.i.b(fVar3);
                                            }
                                            continue;
                                        }
                                        cVar7 = cVar7.f;
                                    }
                                }
                                e = e.v();
                                if (e != null && (mVar = e.z) != null) {
                                    cVar7 = mVar.d;
                                } else {
                                    cVar7 = null;
                                }
                            } else {
                                cVar = null;
                                break;
                            }
                        }
                        if (cVar != null) {
                            z9 = false;
                        }
                        if (!z9) {
                            return lVar.invoke(focusTargetNode).booleanValue();
                        }
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                }
                return false;
            }
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
