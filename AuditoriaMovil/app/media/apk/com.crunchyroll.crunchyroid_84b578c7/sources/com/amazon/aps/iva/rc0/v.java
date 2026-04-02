package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.q1;
import java.util.Collection;
/* compiled from: FunctionDescriptorImpl.java */
/* loaded from: classes4.dex */
public final class v implements com.amazon.aps.iva.xb0.a<Collection<com.amazon.aps.iva.oc0.v>> {
    public final /* synthetic */ q1 b;
    public final /* synthetic */ x c;

    public v(x xVar, q1 q1Var) {
        this.c = xVar;
        this.b = q1Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Collection<com.amazon.aps.iva.oc0.v> invoke() {
        com.amazon.aps.iva.me0.c cVar = new com.amazon.aps.iva.me0.c();
        for (com.amazon.aps.iva.oc0.v vVar : this.c.k()) {
            cVar.add(vVar.b(this.b));
        }
        return cVar;
    }
}
