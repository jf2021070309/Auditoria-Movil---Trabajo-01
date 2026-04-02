package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.xd0.o;
/* compiled from: AbstractTypeParameterDescriptor.java */
/* loaded from: classes4.dex */
public final class i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.xd0.i> {
    public final /* synthetic */ j b;

    public i(j jVar) {
        this.b = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.xd0.i invoke() {
        StringBuilder sb = new StringBuilder("Scope for type parameter ");
        j jVar = this.b;
        sb.append(jVar.b.b());
        return o.a.a(sb.toString(), jVar.c.getUpperBounds());
    }
}
