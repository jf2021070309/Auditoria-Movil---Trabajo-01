package com.applovin.impl.sdk.e;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class k extends j {
    private final com.applovin.impl.sdk.a.c a;

    public k(com.applovin.impl.sdk.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(com.applovin.impl.sdk.a.d.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", kVar);
        this.a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.j
    Map<String, String> a() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.a.a());
        hashMap.put("adtoken_prefix", this.a.c());
        return hashMap;
    }

    @Override // com.applovin.impl.sdk.e.j
    protected com.applovin.impl.sdk.a.b b() {
        return com.applovin.impl.sdk.a.b.REGULAR_AD_TOKEN;
    }
}
