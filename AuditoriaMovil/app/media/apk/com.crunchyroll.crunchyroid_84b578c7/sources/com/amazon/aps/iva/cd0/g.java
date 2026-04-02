package com.amazon.aps.iva.cd0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.g1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.m1;
import com.amazon.aps.iva.ee0.r1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lc0.k;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.xd0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RawSubstitution.kt */
/* loaded from: classes4.dex */
public final class g extends m1 {
    public static final com.amazon.aps.iva.cd0.a d;
    public static final com.amazon.aps.iva.cd0.a e;
    public final f b;
    public final g1 c;

    /* compiled from: RawSubstitution.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fe0.f, m0> {
        public final /* synthetic */ com.amazon.aps.iva.oc0.e h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.oc0.e eVar, com.amazon.aps.iva.cd0.a aVar, g gVar, m0 m0Var) {
            super(1);
            this.h = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final m0 invoke(com.amazon.aps.iva.fe0.f fVar) {
            com.amazon.aps.iva.nd0.b f;
            com.amazon.aps.iva.fe0.f fVar2 = fVar;
            j.f(fVar2, "kotlinTypeRefiner");
            com.amazon.aps.iva.oc0.e eVar = this.h;
            if (!(eVar instanceof com.amazon.aps.iva.oc0.e)) {
                eVar = null;
            }
            if (eVar != null && (f = com.amazon.aps.iva.ud0.b.f(eVar)) != null) {
                fVar2.s(f);
            }
            return null;
        }
    }

    static {
        r1 r1Var = r1.COMMON;
        d = com.amazon.aps.iva.a60.b.w(r1Var, false, true, null, 5).f(b.FLEXIBLE_LOWER_BOUND);
        e = com.amazon.aps.iva.a60.b.w(r1Var, false, true, null, 5).f(b.FLEXIBLE_UPPER_BOUND);
    }

    public g() {
        f fVar = new f();
        this.b = fVar;
        this.c = new g1(fVar);
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final j1 d(e0 e0Var) {
        return new l1(h(e0Var, new com.amazon.aps.iva.cd0.a(r1.COMMON, false, false, null, 62)));
    }

    public final com.amazon.aps.iva.kb0.j<m0, Boolean> g(m0 m0Var, com.amazon.aps.iva.oc0.e eVar, com.amazon.aps.iva.cd0.a aVar) {
        if (m0Var.I0().getParameters().isEmpty()) {
            return new com.amazon.aps.iva.kb0.j<>(m0Var, Boolean.FALSE);
        }
        if (k.z(m0Var)) {
            j1 j1Var = m0Var.G0().get(0);
            v1 c = j1Var.c();
            e0 type = j1Var.getType();
            j.e(type, "componentTypeProjection.type");
            return new com.amazon.aps.iva.kb0.j<>(f0.f(m0Var.H0(), m0Var.I0(), f1.J(new l1(h(type, aVar), c)), m0Var.J0(), null), Boolean.FALSE);
        } else if (com.amazon.aps.iva.e4.l1.D(m0Var)) {
            return new com.amazon.aps.iva.kb0.j<>(com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.ERROR_RAW_TYPE, m0Var.I0().toString()), Boolean.FALSE);
        } else {
            i u = eVar.u(this);
            j.e(u, "declaration.getMemberScope(this)");
            a1 H0 = m0Var.H0();
            c1 h = eVar.h();
            j.e(h, "declaration.typeConstructor");
            List<y0> parameters = eVar.h().getParameters();
            j.e(parameters, "declaration.typeConstructor.parameters");
            List<y0> list = parameters;
            ArrayList arrayList = new ArrayList(r.Y(list));
            for (y0 y0Var : list) {
                j.e(y0Var, MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                g1 g1Var = this.c;
                arrayList.add(this.b.t(y0Var, aVar, g1Var, g1Var.b(y0Var, aVar)));
            }
            return new com.amazon.aps.iva.kb0.j<>(f0.g(H0, h, arrayList, m0Var.J0(), u, new a(eVar, aVar, this, m0Var)), Boolean.TRUE);
        }
    }

    public final e0 h(e0 e0Var, com.amazon.aps.iva.cd0.a aVar) {
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k instanceof y0) {
            aVar.getClass();
            com.amazon.aps.iva.cd0.a e2 = com.amazon.aps.iva.cd0.a.e(aVar, null, true, null, null, 59);
            return h(this.c.b((y0) k, e2), aVar);
        } else if (k instanceof com.amazon.aps.iva.oc0.e) {
            com.amazon.aps.iva.oc0.h k2 = com.amazon.aps.iva.dg.b.J(e0Var).I0().k();
            if (k2 instanceof com.amazon.aps.iva.oc0.e) {
                com.amazon.aps.iva.kb0.j<m0, Boolean> g = g(com.amazon.aps.iva.dg.b.C(e0Var), (com.amazon.aps.iva.oc0.e) k, d);
                m0 m0Var = g.b;
                boolean booleanValue = g.c.booleanValue();
                com.amazon.aps.iva.kb0.j<m0, Boolean> g2 = g(com.amazon.aps.iva.dg.b.J(e0Var), (com.amazon.aps.iva.oc0.e) k2, e);
                m0 m0Var2 = g2.b;
                boolean booleanValue2 = g2.c.booleanValue();
                if (!booleanValue && !booleanValue2) {
                    return f0.c(m0Var, m0Var2);
                }
                return new h(m0Var, m0Var2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + k2 + "\" while for lower it's \"" + k + '\"').toString());
        } else {
            throw new IllegalStateException(("Unexpected declaration kind: " + k).toString());
        }
    }
}
