package com.amazon.aps.iva.u1;

import com.amazon.aps.iva.a1.f;
/* compiled from: DelegatingNode.kt */
/* loaded from: classes.dex */
public abstract class j extends f.c {
    public final int o = k0.f(this);
    public f.c p;

    @Override // com.amazon.aps.iva.a1.f.c
    public final void k1() {
        super.k1();
        for (f.c cVar = this.p; cVar != null; cVar = cVar.g) {
            cVar.s1(this.i);
            if (!cVar.n) {
                cVar.k1();
            }
        }
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void l1() {
        for (f.c cVar = this.p; cVar != null; cVar = cVar.g) {
            cVar.l1();
        }
        super.l1();
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void p1() {
        super.p1();
        for (f.c cVar = this.p; cVar != null; cVar = cVar.g) {
            cVar.p1();
        }
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void q1() {
        for (f.c cVar = this.p; cVar != null; cVar = cVar.g) {
            cVar.q1();
        }
        super.q1();
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void r1() {
        super.r1();
        for (f.c cVar = this.p; cVar != null; cVar = cVar.g) {
            cVar.r1();
        }
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void s1(androidx.compose.ui.node.o oVar) {
        this.i = oVar;
        for (f.c cVar = this.p; cVar != null; cVar = cVar.g) {
            cVar.s1(oVar);
        }
    }

    public final void t1(f.c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        f.c cVar2;
        boolean z5;
        f.c cVar3 = cVar.b;
        boolean z6 = false;
        if (cVar3 != cVar) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f.c cVar4 = cVar.f;
            if (cVar3 == this.b && com.amazon.aps.iva.yb0.j.a(cVar4, this)) {
                z6 = true;
            }
            if (z6) {
                return;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
        } else if (!cVar3.n) {
            f.c cVar5 = this.b;
            com.amazon.aps.iva.yb0.j.f(cVar5, "owner");
            cVar3.b = cVar5;
            int i2 = this.d;
            int g = k0.g(cVar3);
            cVar3.d = g;
            int i3 = this.d;
            int i4 = g & 2;
            if (i4 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if ((i3 & 2) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 && !(this instanceof x)) {
                    throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar3).toString());
                }
            }
            cVar3.g = this.p;
            this.p = cVar3;
            cVar3.f = this;
            int i5 = g | i3;
            this.d = i5;
            if (i3 != i5) {
                f.c cVar6 = this.b;
                if (cVar6 == this) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    this.e = i5;
                }
                if (this.n) {
                    f.c cVar7 = this;
                    while (cVar7 != null) {
                        i5 |= cVar7.d;
                        cVar7.d = i5;
                        if (cVar7 == cVar6) {
                            break;
                        }
                        cVar7 = cVar7.f;
                    }
                    if (cVar7 != null && (cVar2 = cVar7.g) != null) {
                        i = cVar2.e;
                    } else {
                        i = 0;
                    }
                    int i6 = i5 | i;
                    while (cVar7 != null) {
                        i6 |= cVar7.d;
                        cVar7.e = i6;
                        cVar7 = cVar7.f;
                    }
                }
            }
            if (this.n) {
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if ((i2 & 2) != 0) {
                        z6 = true;
                    }
                    if (!z6) {
                        androidx.compose.ui.node.m mVar = i.e(this).z;
                        this.b.s1(null);
                        mVar.g();
                        cVar3.k1();
                        cVar3.q1();
                        k0.a(cVar3);
                    }
                }
                s1(this.i);
                cVar3.k1();
                cVar3.q1();
                k0.a(cVar3);
            }
        } else {
            throw new IllegalStateException("Cannot delegate to an already attached node".toString());
        }
    }
}
