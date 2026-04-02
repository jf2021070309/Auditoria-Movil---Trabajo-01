package com.amazon.aps.iva.nx;

import com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity;
/* compiled from: PlayerDependenciesImpl.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.k50.g {
    public final /* synthetic */ androidx.fragment.app.h a;

    public b(androidx.fragment.app.h hVar) {
        this.a = hVar;
    }

    @Override // com.amazon.aps.iva.k50.g
    public final void a() {
        SettingsBottomBarActivity.B.getClass();
        androidx.fragment.app.h hVar = this.a;
        hVar.startActivity(SettingsBottomBarActivity.a.a(hVar, null));
        hVar.finish();
    }
}
