package com.amazon.aps.iva.qd0;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oc0.y0;
import java.util.Collection;
/* compiled from: DescriptorEquivalenceForOverrides.kt */
/* loaded from: classes4.dex */
public final class g {
    public static final g a = new g();

    public static t0 d(com.amazon.aps.iva.oc0.a aVar) {
        while (aVar instanceof com.amazon.aps.iva.oc0.b) {
            com.amazon.aps.iva.oc0.b bVar = (com.amazon.aps.iva.oc0.b) aVar;
            if (bVar.getKind() != b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends com.amazon.aps.iva.oc0.b> k = bVar.k();
            com.amazon.aps.iva.yb0.j.e(k, "overriddenDescriptors");
            aVar = (com.amazon.aps.iva.oc0.b) x.Q0(k);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
        if (r7.m(r6, r5, null, true).c() == r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.amazon.aps.iva.oc0.k r5, com.amazon.aps.iva.oc0.k r6, boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qd0.g.a(com.amazon.aps.iva.oc0.k, com.amazon.aps.iva.oc0.k, boolean, boolean):boolean");
    }

    public final boolean b(y0 y0Var, y0 y0Var2, boolean z, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.oc0.k, ? super com.amazon.aps.iva.oc0.k, Boolean> pVar) {
        com.amazon.aps.iva.yb0.j.f(y0Var, "a");
        com.amazon.aps.iva.yb0.j.f(y0Var2, "b");
        com.amazon.aps.iva.yb0.j.f(pVar, "equivalentCallables");
        if (com.amazon.aps.iva.yb0.j.a(y0Var, y0Var2)) {
            return true;
        }
        if (!com.amazon.aps.iva.yb0.j.a(y0Var.d(), y0Var2.d()) && c(y0Var, y0Var2, pVar, z) && y0Var.getIndex() == y0Var2.getIndex()) {
            return true;
        }
        return false;
    }

    public final boolean c(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.k kVar2, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.oc0.k, ? super com.amazon.aps.iva.oc0.k, Boolean> pVar, boolean z) {
        com.amazon.aps.iva.oc0.k d = kVar.d();
        com.amazon.aps.iva.oc0.k d2 = kVar2.d();
        if (!(d instanceof com.amazon.aps.iva.oc0.b) && !(d2 instanceof com.amazon.aps.iva.oc0.b)) {
            return a(d, d2, z, true);
        }
        return pVar.invoke(d, d2).booleanValue();
    }
}
