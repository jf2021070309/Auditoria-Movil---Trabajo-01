package com.amazon.aps.iva.qd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.oc0.a1;
import com.amazon.aps.iva.oc0.d0;
import com.amazon.aps.iva.oc0.d1;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.o0;
/* compiled from: inlineClassesUtils.kt */
/* loaded from: classes4.dex */
public final class k {
    static {
        com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(com.amazon.aps.iva.oc0.v vVar) {
        com.amazon.aps.iva.yb0.j.f(vVar, "<this>");
        if (vVar instanceof o0) {
            n0 S = ((o0) vVar).S();
            com.amazon.aps.iva.yb0.j.e(S, "correspondingProperty");
            if (d(S)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(com.amazon.aps.iva.oc0.k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "<this>");
        if ((kVar instanceof com.amazon.aps.iva.oc0.e) && (((com.amazon.aps.iva.oc0.e) kVar).R() instanceof com.amazon.aps.iva.oc0.w)) {
            return true;
        }
        return false;
    }

    public static final boolean c(e0 e0Var) {
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k != null) {
            return b(k);
        }
        return false;
    }

    public static final boolean d(d1 d1Var) {
        com.amazon.aps.iva.oc0.e eVar;
        com.amazon.aps.iva.oc0.w wVar;
        if (d1Var.M() == null) {
            com.amazon.aps.iva.oc0.k d = d1Var.d();
            com.amazon.aps.iva.nd0.f fVar = null;
            if (d instanceof com.amazon.aps.iva.oc0.e) {
                eVar = (com.amazon.aps.iva.oc0.e) d;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                int i = com.amazon.aps.iva.ud0.b.a;
                a1<m0> R = eVar.R();
                if (R instanceof com.amazon.aps.iva.oc0.w) {
                    wVar = (com.amazon.aps.iva.oc0.w) R;
                } else {
                    wVar = null;
                }
                if (wVar != null) {
                    fVar = wVar.a;
                }
            }
            if (com.amazon.aps.iva.yb0.j.a(fVar, d1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(com.amazon.aps.iva.oc0.k kVar) {
        boolean z;
        if (b(kVar)) {
            return true;
        }
        if ((kVar instanceof com.amazon.aps.iva.oc0.e) && (((com.amazon.aps.iva.oc0.e) kVar).R() instanceof d0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public static final m0 f(e0 e0Var) {
        com.amazon.aps.iva.oc0.e eVar;
        com.amazon.aps.iva.oc0.w wVar;
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k instanceof com.amazon.aps.iva.oc0.e) {
            eVar = (com.amazon.aps.iva.oc0.e) k;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return null;
        }
        int i = com.amazon.aps.iva.ud0.b.a;
        a1<m0> R = eVar.R();
        if (R instanceof com.amazon.aps.iva.oc0.w) {
            wVar = (com.amazon.aps.iva.oc0.w) R;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            return null;
        }
        return (m0) wVar.b;
    }
}
