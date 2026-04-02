package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.oc0.y0;
import java.util.List;
/* compiled from: AbstractTypeAliasDescriptor.kt */
/* loaded from: classes4.dex */
public abstract class f extends q implements com.amazon.aps.iva.oc0.x0 {
    public final com.amazon.aps.iva.oc0.r f;
    public List<? extends y0> g;
    public final g h;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u1, Boolean> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(u1 u1Var) {
            boolean z;
            u1 u1Var2 = u1Var;
            com.amazon.aps.iva.yb0.j.e(u1Var2, "type");
            boolean z2 = false;
            if (!l1.D(u1Var2)) {
                com.amazon.aps.iva.oc0.h k = u1Var2.I0().k();
                if ((k instanceof y0) && !com.amazon.aps.iva.yb0.j.a(((y0) k).d(), f.this)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(com.amazon.aps.iva.oc0.k r3, com.amazon.aps.iva.pc0.h r4, com.amazon.aps.iva.nd0.f r5, com.amazon.aps.iva.oc0.r r6) {
        /*
            r2 = this;
            com.amazon.aps.iva.oc0.t0$a r0 = com.amazon.aps.iva.oc0.t0.a
            java.lang.String r1 = "containingDeclaration"
            com.amazon.aps.iva.yb0.j.f(r3, r1)
            java.lang.String r1 = "visibilityImpl"
            com.amazon.aps.iva.yb0.j.f(r6, r1)
            r2.<init>(r3, r4, r5, r0)
            r2.f = r6
            com.amazon.aps.iva.rc0.g r3 = new com.amazon.aps.iva.rc0.g
            r3.<init>(r2)
            r2.h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rc0.f.<init>(com.amazon.aps.iva.oc0.k, com.amazon.aps.iva.pc0.h, com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.oc0.r):void");
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.l(this, d);
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean U() {
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.h a() {
        return this;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean g0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.oc0.h
    public final c1 h() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean isExternal() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.i
    public final List<y0> n() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        com.amazon.aps.iva.yb0.j.m("declaredTypeParametersImpl");
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.p
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // com.amazon.aps.iva.oc0.i
    public final boolean z() {
        return s1.c(((com.amazon.aps.iva.ce0.p) this).o0(), new a());
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k a() {
        return this;
    }

    @Override // com.amazon.aps.iva.rc0.q
    public final com.amazon.aps.iva.oc0.n A0() {
        return this;
    }
}
