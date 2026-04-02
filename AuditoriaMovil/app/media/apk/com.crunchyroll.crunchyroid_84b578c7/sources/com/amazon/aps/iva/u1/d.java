package com.amazon.aps.iva.u1;
/* compiled from: NodeKind.kt */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.d1.n {
    public static final d a = new d();
    public static Boolean b;

    @Override // com.amazon.aps.iva.d1.n
    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // com.amazon.aps.iva.d1.n
    public final boolean b() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
