package com.amazon.aps.iva.qd0;
/* compiled from: DescriptorEquivalenceForOverrides.kt */
/* loaded from: classes4.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.oc0.k, com.amazon.aps.iva.oc0.k, Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.oc0.a h;
    public final /* synthetic */ com.amazon.aps.iva.oc0.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2) {
        super(2);
        this.h = aVar;
        this.i = aVar2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Boolean invoke(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.k kVar2) {
        boolean z;
        com.amazon.aps.iva.oc0.k kVar3 = kVar2;
        if (com.amazon.aps.iva.yb0.j.a(kVar, this.h) && com.amazon.aps.iva.yb0.j.a(kVar3, this.i)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
