package com.amazon.aps.iva.d1;

import androidx.compose.ui.focus.FocusTargetNode;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d1.m;
import com.amazon.aps.iva.s1.c;
/* compiled from: TwoDimensionalFocusSearch.kt */
/* loaded from: classes.dex */
public final class d0 {

    /* compiled from: TwoDimensionalFocusSearch.kt */
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

    /* compiled from: TwoDimensionalFocusSearch.kt */
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
            Boolean valueOf = Boolean.valueOf(d0.i(this.h, this.i, this.j, this.k));
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r0 >= r2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r5 <= r14) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
        if (r4 >= r13) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        if (r15 <= r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(com.amazon.aps.iva.e1.e r16, com.amazon.aps.iva.e1.e r17, com.amazon.aps.iva.e1.e r18, int r19) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d1.d0.a(com.amazon.aps.iva.e1.e, com.amazon.aps.iva.e1.e, com.amazon.aps.iva.e1.e, int):boolean");
    }

    public static final boolean b(int i, com.amazon.aps.iva.e1.e eVar, com.amazon.aps.iva.e1.e eVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z || i == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (eVar.d <= eVar2.b || eVar.b >= eVar2.d) {
                return false;
            }
        } else {
            if (i == 5) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || i == 6) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (eVar.c <= eVar2.a || eVar.a >= eVar2.c) {
                    return false;
                }
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return true;
    }

    public static final void c(com.amazon.aps.iva.u1.h hVar, com.amazon.aps.iva.p0.f<FocusTargetNode> fVar) {
        boolean z;
        boolean z2;
        if (hVar.V().n) {
            com.amazon.aps.iva.p0.f fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
            f.c cVar = hVar.V().g;
            if (cVar == null) {
                com.amazon.aps.iva.u1.i.a(fVar2, hVar.V());
            } else {
                fVar2.b(cVar);
            }
            while (fVar2.j()) {
                f.c cVar2 = (f.c) fVar2.l(fVar2.d - 1);
                if ((cVar2.e & 1024) == 0) {
                    com.amazon.aps.iva.u1.i.a(fVar2, cVar2);
                } else {
                    while (true) {
                        if (cVar2 == null) {
                            break;
                        } else if ((cVar2.d & 1024) != 0) {
                            com.amazon.aps.iva.p0.f fVar3 = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) cVar2;
                                    if (focusTargetNode.n) {
                                        if (focusTargetNode.t1().a) {
                                            fVar.b(focusTargetNode);
                                        } else {
                                            c(focusTargetNode, fVar);
                                        }
                                    }
                                } else {
                                    if ((cVar2.d & 1024) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z && (cVar2 instanceof com.amazon.aps.iva.u1.j)) {
                                        int i = 0;
                                        for (f.c cVar3 = ((com.amazon.aps.iva.u1.j) cVar2).p; cVar3 != null; cVar3 = cVar3.g) {
                                            if ((cVar3.d & 1024) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                i++;
                                                if (i == 1) {
                                                    cVar2 = cVar3;
                                                } else {
                                                    if (fVar3 == null) {
                                                        fVar3 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                    }
                                                    if (cVar2 != null) {
                                                        fVar3.b(cVar2);
                                                        cVar2 = null;
                                                    }
                                                    fVar3.b(cVar3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                }
                                cVar2 = com.amazon.aps.iva.u1.i.b(fVar3);
                            }
                        } else {
                            cVar2 = cVar2.g;
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final FocusTargetNode d(com.amazon.aps.iva.p0.f<FocusTargetNode> fVar, com.amazon.aps.iva.e1.e eVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        com.amazon.aps.iva.e1.e c;
        boolean z5;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        float f = eVar.a;
        float f2 = eVar.c;
        if (z) {
            c = eVar.c((f2 - f) + 1, 0.0f);
        } else {
            if (i == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c = eVar.c(-((f2 - f) + 1), 0.0f);
            } else {
                if (i == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                float f3 = eVar.b;
                float f4 = eVar.d;
                if (z3) {
                    c = eVar.c(0.0f, (f4 - f3) + 1);
                } else {
                    if (i == 6) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        c = eVar.c(0.0f, -((f4 - f3) + 1));
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        int i2 = fVar.d;
        FocusTargetNode focusTargetNode = null;
        if (i2 > 0) {
            FocusTargetNode[] focusTargetNodeArr = fVar.b;
            int i3 = 0;
            do {
                FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i3];
                if (a0.d(focusTargetNode2)) {
                    com.amazon.aps.iva.e1.e b2 = a0.b(focusTargetNode2);
                    if (g(i, b2, eVar) && (!g(i, c, eVar) || a(eVar, b2, c, i) || (!a(eVar, c, b2, i) && h(i, eVar, b2) < h(i, eVar, c)))) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        focusTargetNode = focusTargetNode2;
                        c = b2;
                    }
                }
                i3++;
            } while (i3 < i2);
            return focusTargetNode;
        }
        return focusTargetNode;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, int i, com.amazon.aps.iva.xb0.l<? super FocusTargetNode, Boolean> lVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        com.amazon.aps.iva.e1.e eVar;
        Object obj;
        com.amazon.aps.iva.yb0.j.f(lVar, "onFound");
        com.amazon.aps.iva.p0.f fVar = new com.amazon.aps.iva.p0.f(new FocusTargetNode[16]);
        c(focusTargetNode, fVar);
        boolean z5 = true;
        if (fVar.d <= 1) {
            if (fVar.i()) {
                obj = null;
            } else {
                obj = fVar.b[0];
            }
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj;
            if (focusTargetNode2 == null) {
                return false;
            }
            return lVar.invoke(focusTargetNode2).booleanValue();
        }
        if (i == 7) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 4;
        }
        if (i == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || i == 6) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            com.amazon.aps.iva.e1.e b2 = a0.b(focusTargetNode);
            float f = b2.a;
            float f2 = b2.b;
            eVar = new com.amazon.aps.iva.e1.e(f, f2, f, f2);
        } else {
            if (i == 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4 && i != 5) {
                z5 = false;
            }
            if (z5) {
                com.amazon.aps.iva.e1.e b3 = a0.b(focusTargetNode);
                float f3 = b3.c;
                float f4 = b3.d;
                eVar = new com.amazon.aps.iva.e1.e(f3, f4, f3, f4);
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        FocusTargetNode d = d(fVar, eVar, i);
        if (d == null) {
            return false;
        }
        return lVar.invoke(d).booleanValue();
    }

    public static final boolean f(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, com.amazon.aps.iva.xb0.l<? super FocusTargetNode, Boolean> lVar) {
        if (i(focusTargetNode, focusTargetNode2, i, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) com.amazon.aps.iva.d1.a.a(focusTargetNode, i, new b(focusTargetNode, focusTargetNode2, i, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean g(int i, com.amazon.aps.iva.e1.e eVar, com.amazon.aps.iva.e1.e eVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        float f = eVar.a;
        float f2 = eVar.c;
        float f3 = eVar2.a;
        float f4 = eVar2.c;
        if (z) {
            if ((f4 > f2 || f3 >= f2) && f3 > f) {
                return true;
            }
        } else {
            if (i == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if ((f3 < f || f4 <= f) && f4 < f2) {
                    return true;
                }
            } else {
                if (i == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                float f5 = eVar.b;
                float f6 = eVar.d;
                float f7 = eVar2.b;
                float f8 = eVar2.d;
                if (z3) {
                    if ((f8 > f6 || f7 >= f6) && f7 > f5) {
                        return true;
                    }
                } else {
                    if (i == 6) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if ((f7 < f5 || f8 <= f5) && f8 < f6) {
                            return true;
                        }
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        return false;
    }

    public static final long h(int i, com.amazon.aps.iva.e1.e eVar, com.amazon.aps.iva.e1.e eVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        float f3;
        float f4;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        float f5 = eVar.d;
        float f6 = eVar.b;
        float f7 = eVar.c;
        float f8 = eVar.a;
        float f9 = eVar2.b;
        float f10 = eVar2.d;
        float f11 = eVar2.a;
        float f12 = eVar2.c;
        if (z) {
            f2 = f8;
            f = f12;
        } else {
            if (i == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f = f7;
                f2 = f11;
            } else {
                if (i == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f2 = f6;
                    f = f10;
                } else {
                    if (i == 6) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        f = f5;
                        f2 = f9;
                    } else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                }
            }
        }
        long abs = Math.abs(Math.max(0.0f, f2 - f));
        if (i == 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 || i == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            f3 = 2;
            f4 = ((f5 - f6) / f3) + f6;
        } else {
            if (i == 5) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 || i == 6) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                f3 = 2;
                f4 = ((f7 - f8) / f3) + f8;
                f10 = f12;
                f9 = f11;
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        long abs2 = Math.abs(f4 - (((f10 - f9) / f3) + f9));
        return (abs2 * abs2) + (13 * abs * abs);
    }

    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, com.amazon.aps.iva.xb0.l<? super FocusTargetNode, Boolean> lVar) {
        FocusTargetNode d;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.p0.f fVar = new com.amazon.aps.iva.p0.f(new FocusTargetNode[16]);
        f.c cVar = focusTargetNode.b;
        if (cVar.n) {
            com.amazon.aps.iva.p0.f fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
            f.c cVar2 = cVar.g;
            if (cVar2 == null) {
                com.amazon.aps.iva.u1.i.a(fVar2, cVar);
            } else {
                fVar2.b(cVar2);
            }
            while (fVar2.j()) {
                f.c cVar3 = (f.c) fVar2.l(fVar2.d - 1);
                if ((cVar3.e & 1024) == 0) {
                    com.amazon.aps.iva.u1.i.a(fVar2, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            break;
                        } else if ((cVar3.d & 1024) != 0) {
                            com.amazon.aps.iva.p0.f fVar3 = null;
                            while (cVar3 != null) {
                                if (cVar3 instanceof FocusTargetNode) {
                                    fVar.b((FocusTargetNode) cVar3);
                                } else {
                                    if ((cVar3.d & 1024) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z && (cVar3 instanceof com.amazon.aps.iva.u1.j)) {
                                        int i2 = 0;
                                        for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                            if ((cVar4.d & 1024) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cVar3 = cVar4;
                                                } else {
                                                    if (fVar3 == null) {
                                                        fVar3 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                    }
                                                    if (cVar3 != null) {
                                                        fVar3.b(cVar3);
                                                        cVar3 = null;
                                                    }
                                                    fVar3.b(cVar4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                }
                                cVar3 = com.amazon.aps.iva.u1.i.b(fVar3);
                            }
                        } else {
                            cVar3 = cVar3.g;
                        }
                    }
                }
            }
            while (fVar.j() && (d = d(fVar, a0.b(focusTargetNode2), i)) != null) {
                if (d.t1().a) {
                    return lVar.invoke(d).booleanValue();
                }
                if (f(d, focusTargetNode2, i, lVar)) {
                    return true;
                }
                fVar.k(d);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node".toString());
    }

    public static final Boolean j(FocusTargetNode focusTargetNode, int i, m.b bVar) {
        x xVar = focusTargetNode.q;
        int[] iArr = a.a;
        int i2 = iArr[xVar.ordinal()];
        boolean z = true;
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    if (focusTargetNode.t1().a) {
                        return (Boolean) bVar.invoke(focusTargetNode);
                    }
                    return Boolean.FALSE;
                }
                throw new com.amazon.aps.iva.kb0.h();
            }
            return Boolean.valueOf(e(focusTargetNode, i, bVar));
        }
        FocusTargetNode c = a0.c(focusTargetNode);
        if (c != null) {
            int i3 = iArr[c.q.ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    if (i3 != 4) {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                return Boolean.valueOf(f(focusTargetNode, c, i, bVar));
            }
            Boolean j = j(c, i, bVar);
            if (!com.amazon.aps.iva.yb0.j.a(j, Boolean.FALSE)) {
                return j;
            }
            if (c.q != x.ActiveParent) {
                z = false;
            }
            if (z) {
                FocusTargetNode a2 = a0.a(c);
                if (a2 != null) {
                    return Boolean.valueOf(f(focusTargetNode, a2, i, bVar));
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }
}
