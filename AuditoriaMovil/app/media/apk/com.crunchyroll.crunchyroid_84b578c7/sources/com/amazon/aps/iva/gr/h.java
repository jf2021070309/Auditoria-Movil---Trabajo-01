package com.amazon.aps.iva.gr;

import androidx.fragment.app.Fragment;
/* compiled from: FragmentViewTrackingStrategy.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.dr.a> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar) {
        super(0);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.dr.a invoke() {
        com.amazon.aps.iva.ar.a aVar;
        k kVar = this.h;
        g gVar = new g(kVar);
        f<Fragment> fVar = kVar.c;
        com.amazon.aps.iva.sq.f fVar2 = com.amazon.aps.iva.sq.c.c;
        if (fVar2 instanceof com.amazon.aps.iva.ar.a) {
            aVar = (com.amazon.aps.iva.ar.a) fVar2;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new com.amazon.aps.iva.ar.d();
        }
        return new com.amazon.aps.iva.dr.a(gVar, fVar, fVar2, aVar);
    }
}
