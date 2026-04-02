package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
import com.google.android.gms.ads.AdRequest;
/* compiled from: IntermediateLayoutModifierNode.kt */
/* loaded from: classes.dex */
public final class k extends f.c implements com.amazon.aps.iva.u1.x {

    /* compiled from: IntermediateLayoutModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ u0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0 u0Var) {
            super(1);
            this.h = u0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            u0.a.c(this.h, 0, 0, 0.0f);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    @Override // com.amazon.aps.iva.u1.x
    public final e0 f(f0 f0Var, c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        u0 V = c0Var.V(j);
        return f0Var.F0(V.b, V.c, com.amazon.aps.iva.lb0.a0.b, new a(V));
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void m1() {
        b0 b0Var;
        boolean z;
        androidx.compose.ui.node.m mVar;
        boolean z2;
        boolean z3;
        androidx.compose.ui.node.o oVar = this.i;
        com.amazon.aps.iva.yb0.j.c(oVar);
        androidx.compose.ui.node.o oVar2 = this.i;
        com.amazon.aps.iva.yb0.j.c(oVar2);
        androidx.compose.ui.node.k p1 = oVar2.p1();
        if (p1 != null) {
            b0Var = p1.l;
        } else {
            b0Var = null;
        }
        if (b0Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            androidx.compose.ui.node.e eVar = oVar.i.d;
            f.c cVar = this.b;
            if (cVar.n) {
                f.c cVar2 = cVar.f;
                androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(this);
                while (e != null) {
                    if ((e.z.e.e & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                        while (cVar2 != null) {
                            if ((cVar2.d & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                                f.c cVar3 = cVar2;
                                com.amazon.aps.iva.p0.f fVar = null;
                                while (cVar3 != null) {
                                    if (cVar3 instanceof k) {
                                        k kVar = (k) cVar3;
                                    } else {
                                        if ((cVar3.d & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2 && (cVar3 instanceof com.amazon.aps.iva.u1.j)) {
                                            int i = 0;
                                            for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                                if ((cVar4.d & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    i++;
                                                    if (i == 1) {
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
                                            if (i == 1) {
                                            }
                                        }
                                    }
                                    cVar3 = com.amazon.aps.iva.u1.i.b(fVar);
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
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
