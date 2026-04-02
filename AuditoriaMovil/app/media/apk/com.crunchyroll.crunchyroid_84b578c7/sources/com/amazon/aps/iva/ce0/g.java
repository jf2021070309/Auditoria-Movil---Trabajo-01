package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.ae0.i0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class g extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.id0.p, m0> {
    public g(i0 i0Var) {
        super(1, i0Var);
    }

    @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
    public final String getName() {
        return "simpleType";
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final com.amazon.aps.iva.fc0.f getOwner() {
        return e0.a(j.a.class);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final String getSignature() {
        return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final m0 invoke(com.amazon.aps.iva.id0.p pVar) {
        com.amazon.aps.iva.id0.p pVar2 = pVar;
        com.amazon.aps.iva.yb0.j.f(pVar2, "p0");
        return ((i0) this.receiver).d(pVar2, true);
    }
}
