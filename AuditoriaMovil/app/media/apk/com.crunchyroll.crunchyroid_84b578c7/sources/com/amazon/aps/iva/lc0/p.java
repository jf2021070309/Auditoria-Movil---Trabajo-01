package com.amazon.aps.iva.lc0;

import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.q;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.rc0.h0;
import com.amazon.aps.iva.rc0.t0;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: suspendFunctionTypes.kt */
/* loaded from: classes4.dex */
public final class p {
    public static final h0 a;

    static {
        com.amazon.aps.iva.ge0.k kVar = com.amazon.aps.iva.ge0.k.a;
        com.amazon.aps.iva.rc0.r rVar = new com.amazon.aps.iva.rc0.r(com.amazon.aps.iva.ge0.k.b, o.e);
        com.amazon.aps.iva.oc0.f fVar = com.amazon.aps.iva.oc0.f.INTERFACE;
        com.amazon.aps.iva.nd0.f f = o.f.f();
        c.a aVar = com.amazon.aps.iva.de0.c.e;
        h0 h0Var = new h0(rVar, fVar, f, aVar);
        b0 b0Var = b0.ABSTRACT;
        if (b0Var != null) {
            h0Var.k = b0Var;
            q.h hVar = com.amazon.aps.iva.oc0.q.e;
            if (hVar != null) {
                h0Var.l = hVar;
                List J = f1.J(t0.K0(h0Var, v1.IN_VARIANCE, com.amazon.aps.iva.nd0.f.h(RequestConfiguration.MAX_AD_CONTENT_RATING_T), 0, aVar));
                if (h0Var.n == null) {
                    ArrayList arrayList = new ArrayList(J);
                    h0Var.n = arrayList;
                    h0Var.m = new com.amazon.aps.iva.ee0.m(h0Var, arrayList, h0Var.o, h0Var.p);
                    Set<v> emptySet = Collections.emptySet();
                    if (emptySet != null) {
                        for (v vVar : emptySet) {
                            ((com.amazon.aps.iva.rc0.l) vVar).O0(h0Var.m());
                        }
                        a = h0Var;
                        return;
                    }
                    h0.A0(13);
                    throw null;
                }
                throw new IllegalStateException("Type parameters are already set for " + h0Var.getName());
            }
            h0.A0(9);
            throw null;
        }
        h0.A0(6);
        throw null;
    }
}
