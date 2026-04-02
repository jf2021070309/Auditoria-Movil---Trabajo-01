package com.amazon.aps.iva.gr;

import android.app.Activity;
import android.app.Fragment;
/* compiled from: FragmentViewTrackingStrategy.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.dr.b<Activity>> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(0);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.dr.b<Activity> invoke() {
        com.amazon.aps.iva.ar.a aVar;
        k kVar = this.h;
        i iVar = new i(kVar);
        f<Fragment> fVar = kVar.d;
        com.amazon.aps.iva.sq.f fVar2 = com.amazon.aps.iva.sq.c.c;
        if (fVar2 instanceof com.amazon.aps.iva.ar.a) {
            aVar = (com.amazon.aps.iva.ar.a) fVar2;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new com.amazon.aps.iva.ar.d();
        }
        return new com.amazon.aps.iva.dr.d(iVar, fVar, fVar2, aVar);
    }
}
