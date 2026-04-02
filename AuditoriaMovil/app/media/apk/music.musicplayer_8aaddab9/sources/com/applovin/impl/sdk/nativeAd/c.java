package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.e.h;
import com.applovin.impl.sdk.m;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c extends h {

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f4166c;

    public c(com.applovin.impl.sdk.ad.d dVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, m mVar) {
        super(dVar, null, str, mVar);
        this.f4166c = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.e.h
    public com.applovin.impl.sdk.e.a a(JSONObject jSONObject) {
        return new d(jSONObject, this.f4166c, this.f4020b);
    }

    @Override // com.applovin.impl.sdk.e.h
    public void a(int i2) {
        super.a(i2);
        this.f4166c.onNativeAdLoadFailed(i2);
    }

    @Override // com.applovin.impl.sdk.e.h
    public String b() {
        return com.applovin.impl.sdk.utils.h.i(this.f4020b);
    }

    @Override // com.applovin.impl.sdk.e.h
    public String c() {
        return com.applovin.impl.sdk.utils.h.j(this.f4020b);
    }
}
