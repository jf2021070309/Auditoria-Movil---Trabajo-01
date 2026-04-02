package com.amazon.aps.iva.lc0;

import com.amazon.aps.iva.rc0.g0;
/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes4.dex */
public final class j implements com.amazon.aps.iva.xb0.a<Void> {
    public final /* synthetic */ g0 b;
    public final /* synthetic */ k c;

    public j(com.amazon.aps.iva.nc0.g gVar, g0 g0Var) {
        this.c = gVar;
        this.b = g0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Void invoke() {
        k kVar = this.c;
        g0 g0Var = kVar.a;
        g0 g0Var2 = this.b;
        if (g0Var == null) {
            kVar.a = g0Var2;
            return null;
        }
        throw new AssertionError("Built-ins module is already set: " + kVar.a + " (attempting to reset to " + g0Var2 + ")");
    }
}
