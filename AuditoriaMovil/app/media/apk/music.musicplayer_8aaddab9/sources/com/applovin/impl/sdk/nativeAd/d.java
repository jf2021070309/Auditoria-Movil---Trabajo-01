package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d extends com.applovin.impl.sdk.e.a {
    private final JSONObject a;

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f4167c;

    public d(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, m mVar) {
        super("TaskProcessNativeAdResponse", mVar);
        this.a = jSONObject;
        this.f4167c = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            a("Processing ad...");
            this.f4020b.S().a(new e(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.a, this.f4167c, this.f4020b));
            return;
        }
        c("No ads were returned from the server");
        Utils.maybeHandleNoFillResponseForPublisher("native_native", MaxAdFormat.NATIVE, this.a, this.f4020b);
        this.f4167c.onNativeAdLoadFailed(204);
    }
}
