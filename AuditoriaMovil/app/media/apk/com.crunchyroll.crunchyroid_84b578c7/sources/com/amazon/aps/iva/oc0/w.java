package com.amazon.aps.iva.oc0;

import com.amazon.aps.iva.he0.i;
import java.util.List;
/* compiled from: InlineClassRepresentation.kt */
/* loaded from: classes4.dex */
public final class w<Type extends com.amazon.aps.iva.he0.i> extends a1<Type> {
    public final com.amazon.aps.iva.nd0.f a;
    public final Type b;

    public w(com.amazon.aps.iva.nd0.f fVar, Type type) {
        com.amazon.aps.iva.yb0.j.f(fVar, "underlyingPropertyName");
        com.amazon.aps.iva.yb0.j.f(type, "underlyingType");
        this.a = fVar;
        this.b = type;
    }

    @Override // com.amazon.aps.iva.oc0.a1
    public final List<com.amazon.aps.iva.kb0.j<com.amazon.aps.iva.nd0.f, Type>> a() {
        return com.amazon.aps.iva.ee0.f1.J(new com.amazon.aps.iva.kb0.j(this.a, this.b));
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.a + ", underlyingType=" + this.b + ')';
    }
}
