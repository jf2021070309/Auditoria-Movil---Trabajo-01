package com.applovin.impl.adview.activity.a;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.n;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.k;
/* loaded from: classes.dex */
public class b extends a {
    public b(g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        super(gVar, appLovinFullscreenActivity, kVar);
    }

    public void a(n nVar, AppLovinAdView appLovinAdView) {
        this.d.addView(appLovinAdView);
        if (nVar != null) {
            a(this.c.W(), (this.c.aa() ? 3 : 5) | 48, nVar);
        }
        this.b.setContentView(this.d);
    }
}
