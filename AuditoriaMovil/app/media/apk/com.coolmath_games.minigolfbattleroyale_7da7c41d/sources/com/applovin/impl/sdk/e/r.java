package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r extends a {
    private final JSONObject a;
    private final JSONObject c;
    private final AppLovinAdLoadListener d;
    private final com.applovin.impl.sdk.a.b e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.a.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.a = jSONObject;
        this.c = jSONObject2;
        this.e = bVar;
        this.d = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        a("Rendering ad...");
        com.applovin.impl.sdk.a.a aVar = new com.applovin.impl.sdk.a.a(this.a, this.c, this.e, this.b);
        boolean booleanValue = JsonUtils.getBoolean(this.a, "gs_load_immediately", false).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.a, "vs_load_immediately", true).booleanValue();
        d dVar = new d(aVar, this.b, this.d);
        dVar.a(booleanValue2);
        dVar.b(booleanValue);
        o.a aVar2 = o.a.CACHING_OTHER;
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.be)).booleanValue()) {
            if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.REGULAR) {
                aVar2 = o.a.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar2 = o.a.CACHING_INCENTIVIZED;
            }
        }
        this.b.Q().a(dVar, aVar2);
    }
}
