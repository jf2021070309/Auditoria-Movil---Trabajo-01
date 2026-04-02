package com.amazon.aps.iva.hl;

import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
/* compiled from: RestrictionOverlayProvider.kt */
/* loaded from: classes2.dex */
public final class f0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.nk.j, Boolean> {
    public static final f0 h = new f0();

    public f0() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Boolean invoke(com.amazon.aps.iva.nk.j jVar, com.amazon.aps.iva.nk.j jVar2) {
        boolean z;
        com.amazon.aps.iva.nk.j jVar3 = jVar;
        com.amazon.aps.iva.nk.j jVar4 = jVar2;
        com.amazon.aps.iva.yb0.j.f(jVar3, "old");
        com.amazon.aps.iva.yb0.j.f(jVar4, AppSettingsData.STATUS_NEW);
        if (com.amazon.aps.iva.yb0.j.a(jVar3.j, jVar4.j) && jVar3.g == jVar4.g) {
            com.amazon.aps.iva.kk.c cVar = jVar3.h;
            Object obj = cVar.t;
            com.amazon.aps.iva.kk.c cVar2 = jVar4.h;
            if (com.amazon.aps.iva.yb0.j.a(obj, cVar2.t) && com.amazon.aps.iva.yb0.j.a(cVar.a, cVar2.a)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
