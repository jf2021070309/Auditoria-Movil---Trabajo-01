package com.amazon.aps.iva.sv;
/* compiled from: LocalVideosManagerFactory.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class k2 extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
    public k2(com.amazon.aps.iva.m6.i iVar) {
        super(0, iVar, com.amazon.aps.iva.m6.i.class, "isIdle", "isIdle()Z", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        boolean z;
        com.amazon.aps.iva.m6.i iVar = (com.amazon.aps.iva.m6.i) this.receiver;
        if (iVar.g == 0 && iVar.f == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
