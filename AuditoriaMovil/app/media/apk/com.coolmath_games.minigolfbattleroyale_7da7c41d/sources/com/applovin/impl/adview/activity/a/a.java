package com.applovin.impl.adview.activity.a;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.n;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a {
    final k a;
    final AppLovinFullscreenActivity b;
    final g c;
    final ViewGroup d;
    final FrameLayout.LayoutParams e = new FrameLayout.LayoutParams(-1, -1, 17);

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        this.c = gVar;
        this.a = kVar;
        this.b = appLovinFullscreenActivity;
        FrameLayout frameLayout = new FrameLayout(appLovinFullscreenActivity);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.d.setLayoutParams(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(g.c cVar, int i, n nVar) {
        nVar.a(cVar.a, cVar.e, cVar.d, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(nVar.getLayoutParams());
        layoutParams.setMargins(cVar.c, cVar.b, cVar.c, 0);
        layoutParams.gravity = i;
        this.d.addView(nVar, layoutParams);
    }
}
