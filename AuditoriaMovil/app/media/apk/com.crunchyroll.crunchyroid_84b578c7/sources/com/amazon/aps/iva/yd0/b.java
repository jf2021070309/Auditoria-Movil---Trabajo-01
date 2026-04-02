package com.amazon.aps.iva.yd0;

import com.amazon.aps.iva.ee0.e0;
/* compiled from: ContextClassReceiver.kt */
/* loaded from: classes4.dex */
public final class b extends a implements f {
    public final com.amazon.aps.iva.oc0.e c;
    public final com.amazon.aps.iva.nd0.f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.oc0.e eVar, e0 e0Var, com.amazon.aps.iva.nd0.f fVar) {
        super(e0Var, null);
        com.amazon.aps.iva.yb0.j.f(eVar, "classDescriptor");
        com.amazon.aps.iva.yb0.j.f(e0Var, "receiverType");
        this.c = eVar;
        this.d = fVar;
    }

    @Override // com.amazon.aps.iva.yd0.f
    public final com.amazon.aps.iva.nd0.f a() {
        return this.d;
    }

    public final String toString() {
        return getType() + ": Ctx { " + this.c + " }";
    }
}
