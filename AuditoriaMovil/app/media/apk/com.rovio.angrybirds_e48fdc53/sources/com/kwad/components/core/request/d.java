package com.kwad.components.core.request;

import android.text.TextUtils;
import com.kwad.components.core.request.model.ImpInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d extends com.kwad.sdk.core.network.d {
    public long PH;

    public d(int i, AdTemplate adTemplate) {
        String bD = com.kwad.sdk.core.response.b.a.bD(com.kwad.sdk.core.response.b.d.ck(adTemplate));
        try {
            String bE = com.kwad.sdk.core.response.b.a.bE(com.kwad.sdk.core.response.b.d.ck(adTemplate));
            try {
                if (!TextUtils.isEmpty(bE)) {
                    putBody("serverExt", new JSONObject(bE));
                }
            } catch (JSONException e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
            if (!TextUtils.isEmpty(bD) && bD != null) {
                JSONObject jSONObject = new JSONObject(bD);
                t.putValue(jSONObject, "checkType", i);
                putBody("callbackUrlInfo", jSONObject.toString());
            }
        } catch (Exception e2) {
            com.kwad.sdk.core.e.c.printStackTrace(e2);
        }
        ImpInfo impInfo = new ImpInfo(adTemplate.mAdScene);
        JSONArray jSONArray = new JSONArray();
        t.putValue(jSONArray, impInfo.toJson());
        putBody("impInfo", jSONArray);
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final String getUrl() {
        return com.kwad.sdk.h.xj();
    }
}
