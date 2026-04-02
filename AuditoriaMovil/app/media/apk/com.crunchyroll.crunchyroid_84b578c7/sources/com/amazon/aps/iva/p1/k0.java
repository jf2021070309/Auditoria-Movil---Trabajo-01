package com.amazon.aps.iva.p1;
/* compiled from: PointerInteropFilter.android.kt */
/* loaded from: classes.dex */
public final class k0 implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
    public g0 b;

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        g0 g0Var = this.b;
        if (g0Var != null) {
            g0Var.e = booleanValue;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
