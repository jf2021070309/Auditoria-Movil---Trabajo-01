package com.amazon.aps.iva.qd0;
/* compiled from: OverridingUtil.java */
/* loaded from: classes4.dex */
public final class p implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.b, Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.oc0.e b;

    public p(com.amazon.aps.iva.oc0.e eVar) {
        this.b = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.oc0.b bVar) {
        boolean z;
        com.amazon.aps.iva.oc0.b bVar2 = bVar;
        boolean z2 = false;
        if (!com.amazon.aps.iva.oc0.q.e(bVar2.getVisibility())) {
            com.amazon.aps.iva.oc0.e eVar = this.b;
            if (eVar != null) {
                if (com.amazon.aps.iva.oc0.q.c(com.amazon.aps.iva.oc0.q.n, bVar2, eVar) == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            } else {
                com.amazon.aps.iva.oc0.q.a(3);
                throw null;
            }
        }
        return Boolean.valueOf(z2);
    }
}
