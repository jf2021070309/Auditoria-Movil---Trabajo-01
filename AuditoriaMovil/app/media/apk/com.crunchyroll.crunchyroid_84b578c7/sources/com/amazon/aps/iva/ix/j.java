package com.amazon.aps.iva.ix;

import android.app.Activity;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: HomeFeedRoutersFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class j implements com.amazon.aps.iva.k50.h {
    public final /* synthetic */ Activity a;

    public j(Activity activity) {
        this.a = activity;
    }

    @Override // com.amazon.aps.iva.k50.h
    public final void t(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        ShowPageActivity.K.getClass();
        ShowPageActivity.a.a(this.a, panel);
    }
}
