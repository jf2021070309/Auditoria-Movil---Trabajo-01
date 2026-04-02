package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.m;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class d extends a {
    public d(e eVar, Activity activity, m mVar) {
        super(eVar, activity, mVar);
    }

    public void a(ImageView imageView, com.applovin.impl.adview.m mVar, com.applovin.impl.adview.m mVar2, com.applovin.impl.adview.a aVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f3157d.addView(appLovinAdView);
        if (mVar != null) {
            a(this.f3156c.S(), (this.f3156c.X() ? 3 : 5) | 48, mVar);
        }
        if (mVar2 != null) {
            a(this.f3156c.S(), (this.f3156c.W() ? 3 : 5) | 48, mVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f3155b, ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cA)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cC)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f3155b, ((Integer) this.a.a(com.applovin.impl.sdk.c.b.cB)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f3157d.addView(imageView, layoutParams);
        }
        if (aVar != null) {
            this.f3157d.addView(aVar, this.f3158e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f3157d);
        } else {
            this.f3155b.setContentView(this.f3157d);
        }
    }
}
