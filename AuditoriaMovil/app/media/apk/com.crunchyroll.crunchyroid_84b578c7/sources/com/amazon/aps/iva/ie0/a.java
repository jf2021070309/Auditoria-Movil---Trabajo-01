package com.amazon.aps.iva.ie0;

import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.oc0.h;
import com.amazon.aps.iva.oc0.x0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: TypeUtils.kt */
/* loaded from: classes4.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<u1, Boolean> {
    public static final a h = new a();

    public a() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(u1 u1Var) {
        boolean z;
        u1 u1Var2 = u1Var;
        j.f(u1Var2, "it");
        h k = u1Var2.I0().k();
        if (k != null && (k instanceof y0) && (((y0) k).d() instanceof x0)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
