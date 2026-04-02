package com.amazon.aps.iva.yw;

import android.app.Activity;
import com.ellation.crunchyroll.presentation.main.home.HomeBottomBarActivity;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Activity, Boolean> {
    public static final c h = new c();

    public c() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Activity activity) {
        Activity activity2 = activity;
        com.amazon.aps.iva.yb0.j.f(activity2, "it");
        return Boolean.valueOf(activity2 instanceof HomeBottomBarActivity);
    }
}
