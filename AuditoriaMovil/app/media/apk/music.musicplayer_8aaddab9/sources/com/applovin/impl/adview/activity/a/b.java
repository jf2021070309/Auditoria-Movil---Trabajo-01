package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.m;
/* loaded from: classes.dex */
public class b extends a {
    public b(e eVar, Activity activity, m mVar) {
        super(eVar, activity, mVar);
    }

    public void a(com.applovin.impl.adview.m mVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f3157d.addView(appLovinAdView);
        if (mVar != null) {
            a(this.f3156c.S(), (this.f3156c.W() ? 3 : 5) | 48, mVar);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f3157d);
        } else {
            this.f3155b.setContentView(this.f3157d);
        }
    }
}
