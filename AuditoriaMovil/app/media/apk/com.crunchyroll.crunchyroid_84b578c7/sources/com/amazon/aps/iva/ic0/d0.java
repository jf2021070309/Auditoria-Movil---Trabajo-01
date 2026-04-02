package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.oc0.b;
import java.lang.reflect.Type;
/* compiled from: KParameterImpl.kt */
/* loaded from: classes4.dex */
public final class d0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Type> {
    public final /* synthetic */ c0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var) {
        super(0);
        this.h = c0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Type invoke() {
        c0 c0Var = this.h;
        com.amazon.aps.iva.oc0.k0 h = c0Var.h();
        boolean z = h instanceof com.amazon.aps.iva.oc0.q0;
        h<?> hVar = c0Var.b;
        if (z && com.amazon.aps.iva.yb0.j.a(v0.g(hVar.o()), h) && hVar.o().getKind() == b.a.FAKE_OVERRIDE) {
            com.amazon.aps.iva.oc0.k d = hVar.o().d();
            com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> j = v0.j((com.amazon.aps.iva.oc0.e) d);
            if (j == null) {
                throw new com.amazon.aps.iva.wb0.a("Cannot determine receiver Java type of inherited declaration: " + h);
            }
            return j;
        }
        return hVar.i().a().get(c0Var.c);
    }
}
