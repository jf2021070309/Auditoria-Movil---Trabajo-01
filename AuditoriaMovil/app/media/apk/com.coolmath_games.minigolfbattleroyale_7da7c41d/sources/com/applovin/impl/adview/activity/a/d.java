package com.applovin.impl.adview.activity.a;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.n;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class d extends a {
    public d(g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        super(gVar, appLovinFullscreenActivity, kVar);
    }

    public void a(ImageView imageView, n nVar, n nVar2, com.applovin.impl.adview.a aVar, AppLovinAdView appLovinAdView) {
        this.d.addView(appLovinAdView);
        if (nVar != null) {
            a(this.c.W(), (this.c.ab() ? 3 : 5) | 48, nVar);
        }
        if (nVar2 != null) {
            a(this.c.W(), (this.c.aa() ? 3 : 5) | 48, nVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cw)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cy)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cx)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.d.addView(imageView, layoutParams);
        }
        if (aVar != null) {
            this.d.addView(aVar, this.e);
        }
        this.b.setContentView(this.d);
    }
}
