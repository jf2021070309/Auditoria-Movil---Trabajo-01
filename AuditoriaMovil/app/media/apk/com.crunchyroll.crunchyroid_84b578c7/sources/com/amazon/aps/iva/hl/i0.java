package com.amazon.aps.iva.hl;

import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
/* compiled from: RestrictionOverlayProvider.kt */
/* loaded from: classes2.dex */
public final class i0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.nk.j, Boolean> {
    public static final i0 h = new i0();

    public i0() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Boolean invoke(com.amazon.aps.iva.nk.j jVar, com.amazon.aps.iva.nk.j jVar2) {
        com.amazon.aps.iva.nk.j jVar3 = jVar;
        com.amazon.aps.iva.nk.j jVar4 = jVar2;
        com.amazon.aps.iva.yb0.j.f(jVar3, "old");
        com.amazon.aps.iva.yb0.j.f(jVar4, AppSettingsData.STATUS_NEW);
        return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(jVar3.h.n, jVar4.h.n));
    }
}
