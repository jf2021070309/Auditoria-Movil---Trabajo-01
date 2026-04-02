package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oc0.c0;
import java.util.ArrayList;
/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes4.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, com.amazon.aps.iva.lc0.b> {
    public static final d h = new d();

    public d() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.lc0.b invoke(c0 c0Var) {
        c0 c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "module");
        ArrayList arrayList = new ArrayList();
        for (Object obj : c0Var2.y(e.f).p()) {
            if (obj instanceof com.amazon.aps.iva.lc0.b) {
                arrayList.add(obj);
            }
        }
        return (com.amazon.aps.iva.lc0.b) x.t0(arrayList);
    }
}
