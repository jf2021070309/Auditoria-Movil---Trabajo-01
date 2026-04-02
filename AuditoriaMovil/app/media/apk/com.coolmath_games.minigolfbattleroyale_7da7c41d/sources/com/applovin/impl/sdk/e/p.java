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
    private final com.applovin.impl.sdk.a.d c;
    private final com.applovin.impl.sdk.a.b d;
    private final AppLovinAdLoadListener e;

    public p(JSONObject jSONObject, com.applovin.impl.sdk.a.d dVar, com.applovin.impl.sdk.a.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.a = jSONObject;
        this.c = dVar;
        this.d = bVar;
        this.e = appLovinAdLoadListener;
    }

    private void a(int i) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            a("Starting task for AppLovin ad...");
            this.b.Q().a(new r(jSONObject, this.a, this.d, this, this.b));
        } else if ("vast".equalsIgnoreCase(string)) {
            a("Starting task for VAST ad...");
            this.b.Q().a(q.a(jSONObject, this.a, this.d, this, this.b));
        } else {
            c("Unable to process ad of unknown type: " + string);
            failedToReceiveAd(AppLovinErrorCodes.INVALID_RESPONSE);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        a(i);
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
        Utils.maybeHandleNoFillResponseForPublisher(this.c.a(), this.c.b(), this.a, this.b);
        a(204);
    }
}
