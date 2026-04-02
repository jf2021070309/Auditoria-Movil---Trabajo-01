package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.oc0.c1;
/* compiled from: ReflectionObjectRenderer.kt */
/* loaded from: classes4.dex */
public final class s0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c1, CharSequence> {
    public static final s0 h = new s0();

    public s0() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final CharSequence invoke(c1 c1Var) {
        com.amazon.aps.iva.pd0.d dVar = r0.a;
        com.amazon.aps.iva.ee0.e0 type = c1Var.getType();
        com.amazon.aps.iva.yb0.j.e(type, "it.type");
        return r0.d(type);
    }
}
