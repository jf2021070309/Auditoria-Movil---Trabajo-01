package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.sdk.ad.c;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final v logger;
    private final m sdk;

    public AppLovinNativeAdService(m mVar) {
        this.sdk = mVar;
        this.logger = mVar.B();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        StringBuilder sb;
        String str2;
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            v.i(TAG, "Invalid ad token specified");
            j.a(appLovinNativeAdLoadListener, -8);
            return;
        }
        com.applovin.impl.sdk.ad.c cVar = new com.applovin.impl.sdk.ad.c(trim, this.sdk);
        if (cVar.b() == c.a.REGULAR) {
            v vVar = this.logger;
            vVar.b(TAG, "Loading next ad for token: " + cVar);
            this.sdk.S().a(new b(cVar, appLovinNativeAdLoadListener, this.sdk), o.a.MAIN);
            return;
        }
        if (cVar.b() == c.a.AD_RESPONSE_JSON) {
            JSONObject d2 = cVar.d();
            if (d2 != null) {
                h.f(d2, this.sdk);
                h.d(d2, this.sdk);
                h.c(d2, this.sdk);
                h.e(d2, this.sdk);
                if (JsonUtils.getJSONArray(d2, "ads", new JSONArray()).length() > 0) {
                    v vVar2 = this.logger;
                    vVar2.b(TAG, "Rendering ad for token: " + cVar);
                    this.sdk.S().a(new d(d2, appLovinNativeAdLoadListener, this.sdk), o.a.MAIN);
                    return;
                }
                v vVar3 = this.logger;
                vVar3.e(TAG, "No ad returned from the server for token: " + cVar);
                j.a(appLovinNativeAdLoadListener, 204);
                return;
            }
            sb = new StringBuilder();
            str2 = "Unable to retrieve ad response JSON from token: ";
        } else {
            sb = new StringBuilder();
            str2 = "Invalid ad token specified: ";
        }
        sb.append(str2);
        sb.append(cVar);
        v.i(TAG, sb.toString());
        j.a(appLovinNativeAdLoadListener, -8);
    }
}
