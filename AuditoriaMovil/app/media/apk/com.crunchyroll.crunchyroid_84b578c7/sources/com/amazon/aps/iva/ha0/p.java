package com.amazon.aps.iva.ha0;

import com.amazon.aps.iva.da0.s;
import com.amazon.aps.iva.fa0.t;
import java.util.HashSet;
/* loaded from: classes4.dex */
public final class p extends c {
    public final HashSet<String> d;
    public com.amazon.aps.iva.ia0.a e;

    public p(com.amazon.aps.iva.da0.f fVar) {
        super(fVar);
        HashSet<String> hashSet = new HashSet<>();
        this.d = hashSet;
        hashSet.add("internalheartbeat");
        hashSet.add("internalheartbeatend");
        this.e = new com.amazon.aps.iva.ia0.a();
    }

    @Override // com.amazon.aps.iva.ha0.c
    public final void d(t tVar) {
        if (!this.d.contains(tVar.getType())) {
            com.amazon.aps.iva.ga0.o oVar = new com.amazon.aps.iva.ga0.o();
            Long valueOf = Long.valueOf(this.e.a());
            if (valueOf != null) {
                oVar.b("uti", valueOf.toString());
            }
            c(new s(oVar));
        }
    }
}
