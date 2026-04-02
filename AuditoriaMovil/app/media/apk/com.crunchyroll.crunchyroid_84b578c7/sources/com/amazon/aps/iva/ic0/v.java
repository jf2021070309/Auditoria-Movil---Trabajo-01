package com.amazon.aps.iva.ic0;
/* compiled from: KDeclarationContainerImpl.kt */
/* loaded from: classes4.dex */
public final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.oc0.r, com.amazon.aps.iva.oc0.r, Integer> {
    public static final v h = new v();

    public v() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Integer invoke(com.amazon.aps.iva.oc0.r rVar, com.amazon.aps.iva.oc0.r rVar2) {
        int intValue;
        Integer b = com.amazon.aps.iva.oc0.q.b(rVar, rVar2);
        if (b == null) {
            intValue = 0;
        } else {
            intValue = b.intValue();
        }
        return Integer.valueOf(intValue);
    }
}
