package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class p extends a implements AppLovinAdLoadListener {
    private final JSONObject a;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.d f4078c;

    /* renamed from: d  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f4079d;

    /* renamed from: e  reason: collision with root package name */
    private final AppLovinAdLoadListener f4080e;

    public p(JSONObject jSONObject, com.applovin.impl.sdk.ad.d dVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskProcessAdResponse", mVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.a = jSONObject;
        this.f4078c = dVar;
        this.f4079d = bVar;
        this.f4080e = appLovinAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        a qVar;
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            a("Starting task for AppLovin ad...");
            qVar = new s(jSONObject, this.a, this.f4079d, this, this.f4020b);
        } else if ("vast".equalsIgnoreCase(string)) {
            a("Starting task for VAST ad...");
            this.f4020b.S().a(r.a(jSONObject, this.a, this.f4079d, this, this.f4020b));
            return;
        } else if (!"js_tag".equalsIgnoreCase(string)) {
            c("Unable to process ad of unknown type: " + string);
            failedToReceiveAd(AppLovinErrorCodes.INVALID_RESPONSE);
            return;
        } else {
            a("Starting task for JS tag ad...");
            qVar = new q(jSONObject, this.a, this.f4079d, this, this.f4020b);
        }
        this.f4020b.S().a(qVar);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f4080e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f4080e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            a("Processing ad...");
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
            return;
        }
        c("No ads were returned from the server");
        Utils.maybeHandleNoFillResponseForPublisher(this.f4078c.a(), this.f4078c.b(), this.a, this.f4020b);
        failedToReceiveAd(204);
    }
}
