package com.amazon.aps.iva.j0;
/* compiled from: TextFieldKeyInput.kt */
/* loaded from: classes.dex */
public final class w1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.l0.z, com.amazon.aps.iva.i2.f> {
    public static final w1 h = new w1();

    public w1() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.i2.f invoke(com.amazon.aps.iva.l0.z zVar) {
        com.amazon.aps.iva.l0.z zVar2 = zVar;
        com.amazon.aps.iva.yb0.j.f(zVar2, "$this$deleteIfSelectedOr");
        Integer b = zVar2.b();
        if (b != null) {
            return new com.amazon.aps.iva.i2.d(com.amazon.aps.iva.c2.z.c(zVar2.f) - b.intValue(), 0);
        }
        return null;
    }
}
