package com.amazon.aps.iva.cd0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.l0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.ee0.y;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.xd0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: RawType.kt */
/* loaded from: classes4.dex */
public final class h extends y implements l0 {

    /* compiled from: RawType.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<String, CharSequence> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(String str) {
            String str2 = str;
            j.f(str2, "it");
            return "(raw) ".concat(str2);
        }
    }

    public h(m0 m0Var, m0 m0Var2, boolean z) {
        super(m0Var, m0Var2);
        if (z) {
            return;
        }
        com.amazon.aps.iva.fe0.d.a.d(m0Var, m0Var2);
    }

    public static final ArrayList S0(com.amazon.aps.iva.pd0.c cVar, m0 m0Var) {
        List<j1> G0 = m0Var.G0();
        ArrayList arrayList = new ArrayList(r.Y(G0));
        for (j1 j1Var : G0) {
            arrayList.add(cVar.v(j1Var));
        }
        return arrayList;
    }

    public static final String T0(String str, String str2) {
        if (!q.j0(str, '<')) {
            return str;
        }
        return q.L0(str, '<') + '<' + str2 + '>' + q.K0('>', str, str);
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 M0(boolean z) {
        return new h(this.c.M0(z), this.d.M0(z));
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 O0(a1 a1Var) {
        j.f(a1Var, "newAttributes");
        return new h(this.c.O0(a1Var), this.d.O0(a1Var));
    }

    @Override // com.amazon.aps.iva.ee0.y
    public final m0 P0() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ee0.y
    public final String Q0(com.amazon.aps.iva.pd0.c cVar, com.amazon.aps.iva.pd0.j jVar) {
        boolean z;
        j.f(cVar, "renderer");
        j.f(jVar, "options");
        m0 m0Var = this.c;
        String u = cVar.u(m0Var);
        m0 m0Var2 = this.d;
        String u2 = cVar.u(m0Var2);
        if (jVar.h()) {
            return "raw (" + u + ".." + u2 + ')';
        } else if (m0Var2.G0().isEmpty()) {
            return cVar.r(u, u2, com.amazon.aps.iva.da0.a.n(this));
        } else {
            ArrayList S0 = S0(cVar, m0Var);
            ArrayList S02 = S0(cVar, m0Var2);
            String B0 = x.B0(S0, ", ", null, null, a.h, 30);
            ArrayList e1 = x.e1(S0, S02);
            boolean z2 = true;
            if (!e1.isEmpty()) {
                Iterator it = e1.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.amazon.aps.iva.kb0.j jVar2 = (com.amazon.aps.iva.kb0.j) it.next();
                    String str = (String) jVar2.c;
                    if (!j.a((String) jVar2.b, q.y0("out ", str)) && !j.a(str, "*")) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2) {
                u2 = T0(u2, B0);
            }
            String T0 = T0(u, B0);
            if (j.a(T0, u2)) {
                return T0;
            }
            return cVar.r(T0, u2, com.amazon.aps.iva.da0.a.n(this));
        }
    }

    @Override // com.amazon.aps.iva.ee0.u1
    /* renamed from: R0 */
    public final y N0(com.amazon.aps.iva.fe0.f fVar) {
        j.f(fVar, "kotlinTypeRefiner");
        e0 w = fVar.w(this.c);
        j.d(w, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        e0 w2 = fVar.w(this.d);
        j.d(w2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new h((m0) w, (m0) w2, true);
    }

    @Override // com.amazon.aps.iva.ee0.y, com.amazon.aps.iva.ee0.e0
    public final i l() {
        com.amazon.aps.iva.oc0.e eVar;
        com.amazon.aps.iva.oc0.h k = I0().k();
        if (k instanceof com.amazon.aps.iva.oc0.e) {
            eVar = (com.amazon.aps.iva.oc0.e) k;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            i u = eVar.u(new g());
            j.e(u, "classDescriptor.getMemberScope(RawSubstitution())");
            return u;
        }
        throw new IllegalStateException(("Incorrect classifier: " + I0().k()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(m0 m0Var, m0 m0Var2) {
        this(m0Var, m0Var2, false);
        j.f(m0Var, "lowerBound");
        j.f(m0Var2, "upperBound");
    }
}
