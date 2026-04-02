package com.applovin.impl.sdk.e;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class l extends k {

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.c f4045c;

    public l(com.applovin.impl.sdk.ad.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super(com.applovin.impl.sdk.ad.d.a("adtoken_zone"), null, appLovinAdLoadListener, "TaskFetchTokenAd", mVar);
        this.f4045c = cVar;
    }

    @Override // com.applovin.impl.sdk.e.h
    public Map<String, String> a() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f4045c.a());
        hashMap.put("adtoken_prefix", this.f4045c.c());
        return hashMap;
    }

    @Override // com.applovin.impl.sdk.e.h
    public com.applovin.impl.sdk.ad.b h() {
        return com.applovin.impl.sdk.ad.b.REGULAR_AD_TOKEN;
    }
}
