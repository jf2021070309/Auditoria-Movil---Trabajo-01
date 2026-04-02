package com.applovin.impl.sdk.e;

import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class k extends h {

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinAdLoadListener f4044c;

    public k(com.applovin.impl.sdk.ad.d dVar, com.applovin.impl.sdk.network.i iVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        this(dVar, iVar, appLovinAdLoadListener, "TaskFetchNextAd", mVar);
    }

    public k(com.applovin.impl.sdk.ad.d dVar, com.applovin.impl.sdk.network.i iVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.m mVar) {
        super(dVar, iVar, str, mVar);
        this.f4044c = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.e.h
    public a a(JSONObject jSONObject) {
        return new p(jSONObject, ((h) this).a, h(), this.f4044c, this.f4020b);
    }

    @Override // com.applovin.impl.sdk.e.h
    public void a(int i2) {
        super.a(i2);
        this.f4044c.failedToReceiveAd(i2);
    }

    @Override // com.applovin.impl.sdk.e.h
    public String b() {
        return com.applovin.impl.sdk.utils.h.g(this.f4020b);
    }

    @Override // com.applovin.impl.sdk.e.h
    public String c() {
        return com.applovin.impl.sdk.utils.h.h(this.f4020b);
    }
}
