package com.amazon.aps.iva.j0;
/* compiled from: TextFieldKeyInput.kt */
/* loaded from: classes.dex */
public final class u1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.l0.z, com.amazon.aps.iva.i2.f> {
    public static final u1 h = new u1();

    public u1() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.i2.f invoke(com.amazon.aps.iva.l0.z zVar) {
        com.amazon.aps.iva.l0.z zVar2 = zVar;
        com.amazon.aps.iva.yb0.j.f(zVar2, "$this$deleteIfSelectedOr");
        Integer d = zVar2.d();
        if (d != null) {
            return new com.amazon.aps.iva.i2.d(com.amazon.aps.iva.c2.z.c(zVar2.f) - d.intValue(), 0);
        }
        return null;
    }
}
