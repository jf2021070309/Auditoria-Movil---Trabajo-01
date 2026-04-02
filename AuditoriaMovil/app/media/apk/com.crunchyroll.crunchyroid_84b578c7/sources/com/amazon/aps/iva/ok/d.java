package com.amazon.aps.iva.ok;

import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
/* compiled from: PlayerTextTracksController.kt */
/* loaded from: classes.dex */
public final class d extends l implements p<j, j, Boolean> {
    public static final d h = new d();

    public d() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Boolean invoke(j jVar, j jVar2) {
        boolean z;
        j jVar3 = jVar;
        j jVar4 = jVar2;
        com.amazon.aps.iva.yb0.j.f(jVar3, "old");
        com.amazon.aps.iva.yb0.j.f(jVar4, AppSettingsData.STATUS_NEW);
        if (com.amazon.aps.iva.yb0.j.a(jVar3.r, jVar4.r) && com.amazon.aps.iva.yb0.j.a(jVar3.s, jVar4.s)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
