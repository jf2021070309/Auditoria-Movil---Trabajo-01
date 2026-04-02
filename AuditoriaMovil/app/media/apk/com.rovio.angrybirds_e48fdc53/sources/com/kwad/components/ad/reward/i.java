package com.kwad.components.ad.reward;

import android.text.TextUtils;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class i extends com.kwad.sdk.core.network.d {
    public i(AdTemplate adTemplate) {
        putBody("callbackUrlInfo", com.kwad.sdk.core.response.b.a.bD(com.kwad.sdk.core.response.b.d.ck(adTemplate)));
        ImpInfo impInfo = new ImpInfo(adTemplate.mAdScene);
        JSONArray jSONArray = new JSONArray();
        t.putValue(jSONArray, impInfo.toJson());
        putBody("impInfo", jSONArray);
        try {
            String bE = com.kwad.sdk.core.response.b.a.bE(com.kwad.sdk.core.response.b.d.ck(adTemplate));
            if (TextUtils.isEmpty(bE)) {
                return;
            }
            putBody("serverExt", new JSONObject(bE));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final String getUrl() {
        return com.kwad.sdk.h.xf();
    }
}
