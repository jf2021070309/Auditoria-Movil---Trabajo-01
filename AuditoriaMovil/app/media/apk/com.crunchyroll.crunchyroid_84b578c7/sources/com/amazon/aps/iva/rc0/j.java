package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.c1;
import java.util.Collections;
import java.util.List;
/* compiled from: AbstractTypeParameterDescriptor.java */
/* loaded from: classes4.dex */
public final class j implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ee0.m0> {
    public final /* synthetic */ com.amazon.aps.iva.nd0.f b;
    public final /* synthetic */ k c;

    public j(k kVar, com.amazon.aps.iva.nd0.f fVar) {
        this.c = kVar;
        this.b = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.ee0.m0 invoke() {
        a1.c.getClass();
        a1 a1Var = a1.d;
        c1 h = this.c.h();
        List emptyList = Collections.emptyList();
        i iVar = new i(this);
        c.a aVar = com.amazon.aps.iva.de0.c.e;
        com.amazon.aps.iva.yb0.j.e(aVar, "NO_LOCKS");
        return com.amazon.aps.iva.ee0.f0.h(emptyList, new com.amazon.aps.iva.xd0.h(aVar, iVar), a1Var, h, false);
    }
}
