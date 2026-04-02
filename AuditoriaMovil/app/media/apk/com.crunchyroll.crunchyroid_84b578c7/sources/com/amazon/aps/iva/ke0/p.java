package com.amazon.aps.iva.ke0;

import com.amazon.aps.iva.ke0.f;
import com.amazon.aps.iva.oc0.c1;
import java.util.Collection;
import java.util.List;
/* compiled from: modifierChecks.kt */
/* loaded from: classes4.dex */
public final class p implements f {
    public static final p a = new p();

    @Override // com.amazon.aps.iva.ke0.f
    public final String a(com.amazon.aps.iva.oc0.v vVar) {
        return f.a.a(this, vVar);
    }

    @Override // com.amazon.aps.iva.ke0.f
    public final boolean b(com.amazon.aps.iva.oc0.v vVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(vVar, "functionDescriptor");
        List<c1> f = vVar.f();
        com.amazon.aps.iva.yb0.j.e(f, "functionDescriptor.valueParameters");
        List<c1> list = f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (c1 c1Var : list) {
            com.amazon.aps.iva.yb0.j.e(c1Var, "it");
            if (!com.amazon.aps.iva.ud0.b.a(c1Var) && c1Var.p0() == null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.ke0.f
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
