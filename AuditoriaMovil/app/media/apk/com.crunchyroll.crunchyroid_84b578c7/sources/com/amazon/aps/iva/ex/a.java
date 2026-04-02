package com.amazon.aps.iva.ex;

import android.app.Activity;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.presentation.main.browse.BrowseBottomBarActivity;
/* compiled from: CrunchylistsFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<Activity, q> {
    public static final a h = new a();

    public a() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Activity activity) {
        Activity activity2 = activity;
        j.f(activity2, "it");
        h.a.getClass();
        int i = BrowseBottomBarActivity.v;
        BrowseBottomBarActivity.a.a(activity2);
        return q.a;
    }
}
