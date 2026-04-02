package com.amazon.aps.iva.gx;

import android.app.Activity;
import androidx.fragment.app.h;
import com.amazon.aps.iva.k50.g;
import com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity;
/* compiled from: DownloadingRoutersFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class b implements g {
    public final /* synthetic */ Activity a;

    public b(h hVar) {
        this.a = hVar;
    }

    @Override // com.amazon.aps.iva.k50.g
    public final void a() {
        SettingsBottomBarActivity.B.getClass();
        Activity activity = this.a;
        activity.startActivity(SettingsBottomBarActivity.a.a(activity, null));
        activity.finish();
    }
}
