package com.amazon.aps.iva.bs;

import java.util.Collections;
import java.util.Map;
/* compiled from: RateByServiceSampler.java */
/* loaded from: classes2.dex */
public final class e implements g, d {
    public volatile Map<String, f> a = Collections.unmodifiableMap(Collections.singletonMap("service:,env:", new c(1.0d)));

    @Override // com.amazon.aps.iva.bs.d
    public final void b(com.amazon.aps.iva.ur.a aVar) {
        String valueOf;
        boolean g;
        String str = aVar.b.h;
        if (aVar.h().get("env") == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(aVar.h().get("env"));
        }
        String a = com.amazon.aps.iva.c.b.a("service:", str, ",env:", valueOf);
        Map<String, f> map = this.a;
        f fVar = this.a.get(a);
        if (fVar == null) {
            fVar = map.get("service:,env:");
        }
        if (fVar.c(aVar)) {
            g = aVar.b.g(1);
        } else {
            g = aVar.b.g(0);
        }
        if (g) {
            aVar.b.f("_dd.agent_psr", Double.valueOf(fVar.a()));
        }
    }

    @Override // com.amazon.aps.iva.bs.g
    public final boolean c(com.amazon.aps.iva.ur.a aVar) {
        return true;
    }
}
