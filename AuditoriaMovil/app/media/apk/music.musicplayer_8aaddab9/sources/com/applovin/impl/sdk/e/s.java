package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class s extends a {
    private final JSONObject a;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f4084c;

    /* renamed from: d  reason: collision with root package name */
    private final AppLovinAdLoadListener f4085d;

    /* renamed from: e  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f4086e;

    public s(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskRenderAppLovinAd", mVar);
        this.a = jSONObject;
        this.f4084c = jSONObject2;
        this.f4086e = bVar;
        this.f4085d = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        a("Rendering ad...");
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.a, this.f4084c, this.f4086e, this.f4020b);
        boolean booleanValue = JsonUtils.getBoolean(this.a, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.a, "vs_load_immediately", Boolean.TRUE).booleanValue();
        d dVar = new d(aVar, this.f4020b, this.f4085d);
        dVar.a(booleanValue2);
        dVar.b(booleanValue);
        o.a aVar2 = o.a.CACHING_OTHER;
        if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.bo)).booleanValue()) {
            AppLovinAdSize size = aVar.getSize();
            AppLovinAdSize appLovinAdSize = AppLovinAdSize.INTERSTITIAL;
            if (size == appLovinAdSize && aVar.getType() == AppLovinAdType.REGULAR) {
                aVar2 = o.a.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == appLovinAdSize && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar2 = o.a.CACHING_INCENTIVIZED;
            }
        }
        this.f4020b.S().a(dVar, aVar2);
    }
}
