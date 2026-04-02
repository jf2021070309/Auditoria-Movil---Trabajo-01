package com.amazon.aps.iva.ke0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.s0;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ke0.f;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lc0.m;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.y0;
import java.util.List;
/* compiled from: modifierChecks.kt */
/* loaded from: classes4.dex */
public final class m implements f {
    public static final m a = new m();

    @Override // com.amazon.aps.iva.ke0.f
    public final String a(com.amazon.aps.iva.oc0.v vVar) {
        return f.a.a(this, vVar);
    }

    @Override // com.amazon.aps.iva.ke0.f
    public final boolean b(com.amazon.aps.iva.oc0.v vVar) {
        m0 e;
        com.amazon.aps.iva.yb0.j.f(vVar, "functionDescriptor");
        c1 c1Var = vVar.f().get(1);
        m.b bVar = com.amazon.aps.iva.lc0.m.d;
        com.amazon.aps.iva.yb0.j.e(c1Var, "secondParameter");
        c0 j = com.amazon.aps.iva.ud0.b.j(c1Var);
        bVar.getClass();
        com.amazon.aps.iva.oc0.e a2 = com.amazon.aps.iva.oc0.u.a(j, o.a.Q);
        if (a2 == null) {
            e = null;
        } else {
            a1.c.getClass();
            a1 a1Var = a1.d;
            List<y0> parameters = a2.h().getParameters();
            com.amazon.aps.iva.yb0.j.e(parameters, "kPropertyClass.typeConstructor.parameters");
            Object P0 = x.P0(parameters);
            com.amazon.aps.iva.yb0.j.e(P0, "kPropertyClass.typeConstructor.parameters.single()");
            e = f0.e(a1Var, a2, f1.J(new s0((y0) P0)));
        }
        if (e != null) {
            e0 type = c1Var.getType();
            com.amazon.aps.iva.yb0.j.e(type, "secondParameter.type");
            return com.amazon.aps.iva.da0.a.r(e, s1.i(type));
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ke0.f
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
