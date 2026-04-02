package com.amazon.aps.iva.b0;
/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class p0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.p1.y, Boolean> {
    public static final p0 h = new p0();

    public p0() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.p1.y yVar) {
        boolean z;
        com.amazon.aps.iva.p1.y yVar2 = yVar;
        com.amazon.aps.iva.yb0.j.f(yVar2, "down");
        if (yVar2.i == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(!z);
    }
}
