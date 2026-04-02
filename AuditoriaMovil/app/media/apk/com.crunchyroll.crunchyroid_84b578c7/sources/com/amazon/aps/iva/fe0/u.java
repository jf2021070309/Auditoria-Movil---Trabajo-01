package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.e0;
/* compiled from: IntersectionType.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class u extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.p<e0, e0, Boolean> {
    public u(m mVar) {
        super(2, mVar);
    }

    @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
    public final String getName() {
        return "equalTypes";
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final com.amazon.aps.iva.fc0.f getOwner() {
        return com.amazon.aps.iva.yb0.e0.a(m.class);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Boolean invoke(e0 e0Var, e0 e0Var2) {
        e0 e0Var3 = e0Var;
        e0 e0Var4 = e0Var2;
        com.amazon.aps.iva.yb0.j.f(e0Var3, "p0");
        com.amazon.aps.iva.yb0.j.f(e0Var4, "p1");
        return Boolean.valueOf(((m) this.receiver).b(e0Var3, e0Var4));
    }
}
