package com.amazon.aps.iva.yd0;

import com.amazon.aps.iva.ee0.e0;
/* compiled from: ContextReceiver.kt */
/* loaded from: classes4.dex */
public final class c extends a implements f {
    public final com.amazon.aps.iva.oc0.a c;
    public final com.amazon.aps.iva.nd0.f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.oc0.a aVar, e0 e0Var, com.amazon.aps.iva.nd0.f fVar, g gVar) {
        super(e0Var, gVar);
        com.amazon.aps.iva.yb0.j.f(aVar, "declarationDescriptor");
        com.amazon.aps.iva.yb0.j.f(e0Var, "receiverType");
        this.c = aVar;
        this.d = fVar;
    }

    @Override // com.amazon.aps.iva.yd0.f
    public final com.amazon.aps.iva.nd0.f a() {
        return this.d;
    }

    public final String toString() {
        return "Cxt { " + this.c + " }";
    }
}
