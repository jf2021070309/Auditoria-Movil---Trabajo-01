package com.amazon.aps.iva.lk;

import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
/* compiled from: MuxController.kt */
/* loaded from: classes.dex */
public final class d extends l implements p<j, j, Boolean> {
    public static final d h = new d();

    public d() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Boolean invoke(j jVar, j jVar2) {
        j jVar3 = jVar;
        j jVar4 = jVar2;
        com.amazon.aps.iva.yb0.j.f(jVar3, "old");
        com.amazon.aps.iva.yb0.j.f(jVar4, AppSettingsData.STATUS_NEW);
        return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(jVar3.j, jVar4.j));
    }
}
