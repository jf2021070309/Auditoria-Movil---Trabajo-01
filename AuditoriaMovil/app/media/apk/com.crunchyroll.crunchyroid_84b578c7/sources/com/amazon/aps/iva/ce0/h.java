package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.yb0.e0;
/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class h extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, m0> {
    public h(d dVar) {
        super(1, dVar);
    }

    @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
    public final String getName() {
        return "getValueClassPropertyType";
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final com.amazon.aps.iva.fc0.f getOwner() {
        return e0.a(d.class);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final String getSignature() {
        return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final m0 invoke(com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.nd0.f fVar2 = fVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "p0");
        return ((d) this.receiver).H0(fVar2);
    }
}
