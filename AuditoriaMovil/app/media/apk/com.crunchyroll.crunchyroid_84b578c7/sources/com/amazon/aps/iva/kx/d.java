package com.amazon.aps.iva.kx;

import android.app.Activity;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yh.f;
import com.amazon.aps.iva.yh.i;
/* compiled from: InAppUpdatesFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.lo.c h;
    public final /* synthetic */ f i;
    public final /* synthetic */ com.amazon.aps.iva.x50.e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.lo.d dVar, i iVar, com.amazon.aps.iva.x50.e eVar) {
        super(0);
        this.h = dVar;
        this.i = iVar;
        this.j = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        com.amazon.aps.iva.hi.a k = this.i.k();
        com.amazon.aps.iva.fc0.d<? extends Activity> d = this.j.d();
        boolean z = true;
        if (!k.c(d)) {
            com.amazon.aps.iva.lo.c cVar = this.h;
            if (!j.a(d, cVar.i(true)) && !j.a(d, cVar.i(false))) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
