package com.amazon.aps.iva.j0;
/* compiled from: TextFieldKeyInput.kt */
/* loaded from: classes.dex */
public final class t1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.l0.z, com.amazon.aps.iva.i2.f> {
    public static final t1 h = new t1();

    public t1() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.i2.f invoke(com.amazon.aps.iva.l0.z zVar) {
        com.amazon.aps.iva.l0.z zVar2 = zVar;
        com.amazon.aps.iva.yb0.j.f(zVar2, "$this$deleteIfSelectedOr");
        int v = com.amazon.aps.iva.e.z.v(com.amazon.aps.iva.c2.z.c(zVar2.f), zVar2.g.b);
        if (v != -1) {
            return new com.amazon.aps.iva.i2.d(0, v - com.amazon.aps.iva.c2.z.c(zVar2.f));
        }
        return null;
    }
}
