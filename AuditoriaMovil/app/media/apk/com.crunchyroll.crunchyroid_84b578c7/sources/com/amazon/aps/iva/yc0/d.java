package com.amazon.aps.iva.yc0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.hc.m;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.yb0.l;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes4.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<c0, e0> {
    public static final d h = new d();

    public d() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final e0 invoke(c0 c0Var) {
        e0 e0Var;
        c0 c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "module");
        c1 j = m.j(c.b, c0Var2.j().j(o.a.t));
        if (j != null) {
            e0Var = j.getType();
        } else {
            e0Var = null;
        }
        if (e0Var == null) {
            return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]);
        }
        return e0Var;
    }
}
