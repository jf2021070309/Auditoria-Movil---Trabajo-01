package com.amazon.aps.iva.gx;

import android.app.Activity;
import android.content.Intent;
import com.amazon.aps.iva.k50.h;
import com.amazon.aps.iva.xw.f0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: DownloadingRoutersFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class c implements h {
    public final /* synthetic */ Activity a;

    public c(Activity activity) {
        this.a = activity;
    }

    @Override // com.amazon.aps.iva.k50.h
    public final void t(Panel panel) {
        j.f(panel, "panel");
        ShowPageActivity.K.getClass();
        Activity activity = this.a;
        j.f(activity, "context");
        Intent intent = new Intent(activity, ShowPageActivity.class);
        intent.putExtra("show_page_input", new com.amazon.aps.iva.o40.j(f0.c(panel), f0.a(panel), null));
        intent.putExtra("show_page_is_online", false);
        activity.startActivity(intent);
    }
}
