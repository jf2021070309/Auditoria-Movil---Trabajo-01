package com.amazon.aps.iva.vj;

import com.amazon.aps.iva.cj.k;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.cj.p;
import com.amazon.aps.iva.yb0.j;
/* compiled from: GatewaysEntryPointImpl.kt */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.wj.a {
    public final g a;
    public final boolean b;

    public e(h hVar, boolean z) {
        this.a = hVar;
        this.b = z;
    }

    @Override // com.amazon.aps.iva.wj.a
    public final com.amazon.aps.iva.zj.c a() {
        if (this.b) {
            p pVar = n.f;
            if (pVar != null) {
                return pVar.e();
            }
            j.m("feature");
            throw null;
        }
        return com.amazon.aps.iva.lj.b.a;
    }

    @Override // com.amazon.aps.iva.wj.a
    public final com.amazon.aps.iva.lj.a b() {
        k kVar = n.d;
        if (kVar != null) {
            return new com.amazon.aps.iva.lj.a(kVar.getDrmProxyService());
        }
        j.m("dependencies");
        throw null;
    }
}
