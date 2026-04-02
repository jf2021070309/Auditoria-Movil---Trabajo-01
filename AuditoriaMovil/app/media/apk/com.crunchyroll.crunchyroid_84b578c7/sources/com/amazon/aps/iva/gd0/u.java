package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.oc0.t0;
import java.util.Map;
/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* loaded from: classes4.dex */
public final class u implements t0 {
    public final com.amazon.aps.iva.bd0.m b;

    public u(com.amazon.aps.iva.bd0.m mVar) {
        com.amazon.aps.iva.yb0.j.f(mVar, "packageFragment");
        this.b = mVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        com.amazon.aps.iva.bd0.m mVar = this.b;
        sb.append(mVar);
        sb.append(": ");
        mVar.getClass();
        sb.append(((Map) com.amazon.aps.iva.ab.x.T(mVar.k, com.amazon.aps.iva.bd0.m.o[0])).keySet());
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.oc0.t0
    public final void b() {
    }
}
