package com.amazon.aps.iva.uc0;

import java.lang.reflect.Type;
import java.util.Collection;
/* compiled from: ReflectJavaPrimitiveType.kt */
/* loaded from: classes4.dex */
public final class c0 extends e0 implements com.amazon.aps.iva.ed0.u {
    public final Class<?> a;
    public final com.amazon.aps.iva.lb0.z b = com.amazon.aps.iva.lb0.z.b;

    public c0(Class<?> cls) {
        this.a = cls;
    }

    @Override // com.amazon.aps.iva.uc0.e0
    public final Type O() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final Collection<com.amazon.aps.iva.ed0.a> getAnnotations() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ed0.u
    public final com.amazon.aps.iva.lc0.l getType() {
        Class cls = Void.TYPE;
        Class<?> cls2 = this.a;
        if (com.amazon.aps.iva.yb0.j.a(cls2, cls)) {
            return null;
        }
        return com.amazon.aps.iva.vd0.c.get(cls2.getName()).getPrimitiveType();
    }

    @Override // com.amazon.aps.iva.ed0.d
    public final void D() {
    }
}
