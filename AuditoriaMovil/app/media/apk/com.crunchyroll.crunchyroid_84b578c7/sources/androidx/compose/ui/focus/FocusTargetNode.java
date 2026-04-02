package androidx.compose.ui.focus;

import androidx.compose.ui.node.e;
import androidx.compose.ui.node.m;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d1.g;
import com.amazon.aps.iva.d1.n;
import com.amazon.aps.iva.d1.o;
import com.amazon.aps.iva.d1.p;
import com.amazon.aps.iva.d1.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.u1.i;
import com.amazon.aps.iva.u1.p0;
import com.amazon.aps.iva.u1.q0;
import com.amazon.aps.iva.yb0.d0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: FocusTargetNode.kt */
/* loaded from: classes.dex */
public final class FocusTargetNode extends f.c implements p0, com.amazon.aps.iva.t1.f {
    public boolean o;
    public boolean p;
    public x q = x.Inactive;

    /* compiled from: FocusTargetNode.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Lcom/amazon/aps/iva/u1/f0;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class FocusTargetElement extends f0<FocusTargetNode> {
        public static final FocusTargetElement c = new FocusTargetElement();

        private FocusTargetElement() {
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.u1.f0
        public final int hashCode() {
            return 1739042953;
        }

        @Override // com.amazon.aps.iva.u1.f0
        public final FocusTargetNode l() {
            return new FocusTargetNode();
        }

        @Override // com.amazon.aps.iva.u1.f0
        public final void p(FocusTargetNode focusTargetNode) {
            j.f(focusTargetNode, "node");
        }
    }

    /* compiled from: FocusTargetNode.kt */
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
                iArr[x.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* compiled from: FocusTargetNode.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ d0<n> h;
        public final /* synthetic */ FocusTargetNode i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d0<n> d0Var, FocusTargetNode focusTargetNode) {
            super(0);
            this.h = d0Var;
            this.i = focusTargetNode;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.amazon.aps.iva.d1.o] */
        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.b = this.i.t1();
            return q.a;
        }
    }

    @Override // com.amazon.aps.iva.u1.p0
    public final void a0() {
        x xVar = this.q;
        u1();
        if (xVar != this.q) {
            g.c(this);
        }
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void o1() {
        int i = a.a[this.q.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    v1();
                    return;
                }
                return;
            }
            v1();
            w1(x.Inactive);
            return;
        }
        i.f(this).getFocusOwner().m(true);
    }

    public final o t1() {
        m mVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        o oVar = new o();
        f.c cVar = this.b;
        if (cVar.n) {
            e e = i.e(this);
            f.c cVar2 = cVar;
            loop0: while (e != null) {
                if ((e.z.e.e & 3072) != 0) {
                    while (cVar2 != null) {
                        int i = cVar2.d;
                        if ((i & 3072) != 0) {
                            if (cVar2 != cVar) {
                                if ((i & 1024) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    break loop0;
                                }
                            }
                            if ((i & 2048) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                f.c cVar3 = cVar2;
                                com.amazon.aps.iva.p0.f fVar = null;
                                while (cVar3 != null) {
                                    if (cVar3 instanceof p) {
                                        ((p) cVar3).k0(oVar);
                                    } else {
                                        if ((cVar3.d & 2048) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2 && (cVar3 instanceof com.amazon.aps.iva.u1.j)) {
                                            int i2 = 0;
                                            for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                                if ((cVar4.d & 2048) != 0) {
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
                                    cVar3 = i.b(fVar);
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
            return oVar;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public final void u1() {
        int i = a.a[this.q.ordinal()];
        if (i == 1 || i == 2) {
            d0 d0Var = new d0();
            q0.a(this, new b(d0Var, this));
            T t = d0Var.b;
            if (t != 0) {
                if (!((n) t).b()) {
                    i.f(this).getFocusOwner().m(true);
                    return;
                }
                return;
            }
            j.m("focusProperties");
            throw null;
        }
    }

    public final void v1() {
        m mVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        f.c cVar = this.b;
        com.amazon.aps.iva.p0.f fVar = null;
        while (cVar != null) {
            if (cVar instanceof com.amazon.aps.iva.d1.f) {
                g.b((com.amazon.aps.iva.d1.f) cVar);
            } else {
                if ((cVar.d & 4096) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (cVar instanceof com.amazon.aps.iva.u1.j)) {
                    int i = 0;
                    for (f.c cVar2 = ((com.amazon.aps.iva.u1.j) cVar).p; cVar2 != null; cVar2 = cVar2.g) {
                        if ((cVar2.d & 4096) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            i++;
                            if (i == 1) {
                                cVar = cVar2;
                            } else {
                                if (fVar == null) {
                                    fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                }
                                if (cVar != null) {
                                    fVar.b(cVar);
                                    cVar = null;
                                }
                                fVar.b(cVar2);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
            }
            cVar = i.b(fVar);
        }
        f.c cVar3 = this.b;
        if (cVar3.n) {
            f.c cVar4 = cVar3.f;
            e e = i.e(this);
            while (e != null) {
                if ((e.z.e.e & 5120) != 0) {
                    while (cVar4 != null) {
                        int i2 = cVar4.d;
                        if ((i2 & 5120) != 0) {
                            if ((i2 & 1024) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && cVar4.n) {
                                f.c cVar5 = cVar4;
                                com.amazon.aps.iva.p0.f fVar2 = null;
                                while (cVar5 != null) {
                                    if (cVar5 instanceof com.amazon.aps.iva.d1.f) {
                                        g.b((com.amazon.aps.iva.d1.f) cVar5);
                                    } else {
                                        if ((cVar5.d & 4096) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2 && (cVar5 instanceof com.amazon.aps.iva.u1.j)) {
                                            int i3 = 0;
                                            for (f.c cVar6 = ((com.amazon.aps.iva.u1.j) cVar5).p; cVar6 != null; cVar6 = cVar6.g) {
                                                if ((cVar6.d & 4096) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        cVar5 = cVar6;
                                                    } else {
                                                        if (fVar2 == null) {
                                                            fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                        }
                                                        if (cVar5 != null) {
                                                            fVar2.b(cVar5);
                                                            cVar5 = null;
                                                        }
                                                        fVar2.b(cVar6);
                                                    }
                                                }
                                            }
                                            if (i3 == 1) {
                                            }
                                        }
                                    }
                                    cVar5 = i.b(fVar2);
                                }
                            }
                        }
                        cVar4 = cVar4.f;
                    }
                }
                e = e.v();
                if (e != null && (mVar = e.z) != null) {
                    cVar4 = mVar.d;
                } else {
                    cVar4 = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public final void w1(x xVar) {
        j.f(xVar, "<set-?>");
        this.q = xVar;
    }
}
