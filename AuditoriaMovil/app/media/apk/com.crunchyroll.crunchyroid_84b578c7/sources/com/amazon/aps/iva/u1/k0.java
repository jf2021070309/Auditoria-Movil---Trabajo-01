package com.amazon.aps.iva.u1;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.node.f;
import com.amazon.aps.iva.a1.f;
import com.google.android.gms.ads.AdRequest;
import okhttp3.internal.http2.Http2;
/* compiled from: NodeKind.kt */
/* loaded from: classes.dex */
public final class k0 {
    public static final void a(f.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "node");
        if (cVar.n) {
            b(cVar, -1, 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void b(f.c cVar, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(cVar, "node");
        if (cVar instanceof j) {
            j jVar = (j) cVar;
            int i3 = jVar.o;
            c(cVar, i3 & i, i2);
            int i4 = (~i3) & i;
            for (f.c cVar2 = jVar.p; cVar2 != null; cVar2 = cVar2.g) {
                b(cVar2, i4, i2);
            }
            return;
        }
        c(cVar, i & cVar.d, i2);
    }

    public static final void c(f.c cVar, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (i2 == 0 && !cVar.j1()) {
            return;
        }
        boolean z11 = false;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (cVar instanceof x)) {
            com.amazon.aps.iva.e.w.F((x) cVar);
            if (i2 == 2) {
                androidx.compose.ui.node.o d = i.d(cVar, 2);
                d.l = true;
                if (d.z != null) {
                    d.J1(null, false);
                }
            }
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (cVar instanceof r)) {
            i.e(cVar).D();
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && (cVar instanceof o)) {
            p.a((o) cVar);
        }
        if ((i & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (cVar instanceof i1)) {
            j1.a((i1) cVar);
        }
        if ((i & 64) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && (cVar instanceof f1)) {
            f1 f1Var = (f1) cVar;
            com.amazon.aps.iva.yb0.j.f(f1Var, "<this>");
            androidx.compose.ui.node.f fVar = i.e(f1Var).A;
            fVar.n.q = true;
            f.a aVar = fVar.o;
            if (aVar != null) {
                aVar.u = true;
            }
        }
        if ((i & 1024) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6 && (cVar instanceof FocusTargetNode)) {
            if (i2 == 2) {
                cVar.o1();
            } else {
                i.f(cVar).getFocusOwner().j((FocusTargetNode) cVar);
            }
        }
        if ((i & 2048) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && (cVar instanceof com.amazon.aps.iva.d1.p)) {
            com.amazon.aps.iva.d1.p pVar = (com.amazon.aps.iva.d1.p) cVar;
            d.b = null;
            pVar.k0(d.a);
            if (d.b != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                if (i2 == 2) {
                    if (pVar.V().n) {
                        com.amazon.aps.iva.p0.f fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                        f.c cVar2 = pVar.V().g;
                        if (cVar2 == null) {
                            i.a(fVar2, pVar.V());
                        } else {
                            fVar2.b(cVar2);
                        }
                        while (fVar2.j()) {
                            f.c cVar3 = (f.c) fVar2.l(fVar2.d - 1);
                            if ((cVar3.e & 1024) == 0) {
                                i.a(fVar2, cVar3);
                            } else {
                                while (true) {
                                    if (cVar3 == null) {
                                        break;
                                    } else if ((cVar3.d & 1024) != 0) {
                                        com.amazon.aps.iva.p0.f fVar3 = null;
                                        while (cVar3 != null) {
                                            if (cVar3 instanceof FocusTargetNode) {
                                                FocusTargetNode focusTargetNode = (FocusTargetNode) cVar3;
                                                i.f(focusTargetNode).getFocusOwner().j(focusTargetNode);
                                            } else {
                                                if ((cVar3.d & 1024) != 0) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                if (z9 && (cVar3 instanceof j)) {
                                                    int i3 = 0;
                                                    for (f.c cVar4 = ((j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                                        if ((cVar4.d & 1024) != 0) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (z10) {
                                                            i3++;
                                                            if (i3 == 1) {
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
                                                    if (i3 == 1) {
                                                    }
                                                }
                                            }
                                            cVar3 = i.b(fVar3);
                                        }
                                    } else {
                                        cVar3 = cVar3.g;
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("visitChildren called on an unattached node".toString());
                    }
                } else {
                    i.f(pVar).getFocusOwner().c(pVar);
                }
            }
        }
        if ((i & 4096) != 0) {
            z11 = true;
        }
        if (z11 && (cVar instanceof com.amazon.aps.iva.d1.f)) {
            com.amazon.aps.iva.d1.g.b((com.amazon.aps.iva.d1.f) cVar);
        }
    }

    public static final void d(f.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "node");
        if (cVar.n) {
            b(cVar, -1, 0);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final int e(f.b bVar) {
        int i;
        com.amazon.aps.iva.yb0.j.f(bVar, "element");
        if (bVar instanceof com.amazon.aps.iva.s1.v) {
            i = 3;
        } else {
            i = 1;
        }
        if (bVar instanceof com.amazon.aps.iva.c1.h) {
            i |= 4;
        }
        if (bVar instanceof com.amazon.aps.iva.a2.n) {
            i |= 8;
        }
        if (bVar instanceof com.amazon.aps.iva.p1.e0) {
            i |= 16;
        }
        if ((bVar instanceof com.amazon.aps.iva.t1.d) || (bVar instanceof com.amazon.aps.iva.t1.g)) {
            i |= 32;
        }
        if (bVar instanceof com.amazon.aps.iva.d1.e) {
            i |= 4096;
        }
        if (bVar instanceof com.amazon.aps.iva.d1.k) {
            i |= 2048;
        }
        if (bVar instanceof com.amazon.aps.iva.s1.m0) {
            i |= 256;
        }
        if (bVar instanceof com.amazon.aps.iva.s1.r0) {
            i |= 64;
        }
        if ((bVar instanceof com.amazon.aps.iva.s1.o0) || (bVar instanceof com.amazon.aps.iva.s1.p0)) {
            return i | 128;
        }
        return i;
    }

    public static final int f(f.c cVar) {
        int i;
        com.amazon.aps.iva.yb0.j.f(cVar, "node");
        int i2 = cVar.d;
        if (i2 != 0) {
            return i2;
        }
        if (cVar instanceof x) {
            i = 3;
        } else {
            i = 1;
        }
        if (cVar instanceof o) {
            i |= 4;
        }
        if (cVar instanceof i1) {
            i |= 8;
        }
        if (cVar instanceof g1) {
            i |= 16;
        }
        if (cVar instanceof com.amazon.aps.iva.t1.f) {
            i |= 32;
        }
        if (cVar instanceof f1) {
            i |= 64;
        }
        if (cVar instanceof w) {
            i |= 128;
        }
        if (cVar instanceof r) {
            i |= 256;
        }
        if (cVar instanceof com.amazon.aps.iva.s1.k) {
            i |= AdRequest.MAX_CONTENT_URL_LENGTH;
        }
        if (cVar instanceof FocusTargetNode) {
            i |= 1024;
        }
        if (cVar instanceof com.amazon.aps.iva.d1.p) {
            i |= 2048;
        }
        if (cVar instanceof com.amazon.aps.iva.d1.f) {
            i |= 4096;
        }
        if (cVar instanceof com.amazon.aps.iva.n1.d) {
            i |= 8192;
        }
        if (cVar instanceof com.amazon.aps.iva.r1.a) {
            i |= Http2.INITIAL_MAX_FRAME_SIZE;
        }
        if (cVar instanceof f) {
            i |= 32768;
        }
        if (cVar instanceof com.amazon.aps.iva.n1.f) {
            return i | 131072;
        }
        return i;
    }

    public static final int g(f.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "node");
        if (cVar instanceof j) {
            j jVar = (j) cVar;
            int i = jVar.o;
            for (f.c cVar2 = jVar.p; cVar2 != null; cVar2 = cVar2.g) {
                i |= g(cVar2);
            }
            return i;
        }
        return f(cVar);
    }

    public static final boolean h(int i) {
        if ((i & 128) != 0) {
            return true;
        }
        return false;
    }
}
