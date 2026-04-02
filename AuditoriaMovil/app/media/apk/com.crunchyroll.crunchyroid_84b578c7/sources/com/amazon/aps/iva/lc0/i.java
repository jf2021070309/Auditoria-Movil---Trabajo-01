package com.amazon.aps.iva.lc0;

import com.amazon.aps.iva.rc0.g0;
/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes4.dex */
public final class i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.oc0.e> {
    public final /* synthetic */ k b;

    public i(k kVar) {
        this.b = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.oc0.e invoke(com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.nd0.f fVar2 = fVar;
        g0 l = this.b.l();
        com.amazon.aps.iva.nd0.c cVar = o.k;
        com.amazon.aps.iva.xd0.i l2 = l.y(cVar).l();
        if (l2 != null) {
            com.amazon.aps.iva.oc0.h g = l2.g(fVar2, com.amazon.aps.iva.wc0.d.FROM_BUILTINS);
            if (g != null) {
                if (g instanceof com.amazon.aps.iva.oc0.e) {
                    return (com.amazon.aps.iva.oc0.e) g;
                }
                throw new AssertionError("Must be a class descriptor " + fVar2 + ", but was " + g);
            }
            throw new AssertionError("Built-in class " + cVar.c(fVar2) + " is not found");
        }
        k.a(11);
        throw null;
    }
}
