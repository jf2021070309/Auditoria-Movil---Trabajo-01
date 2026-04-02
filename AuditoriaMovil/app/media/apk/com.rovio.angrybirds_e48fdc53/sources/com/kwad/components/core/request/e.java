package com.kwad.components.core.request;

import com.kwad.sdk.utils.t;
import com.kwad.sdk.utils.y;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e extends com.kwad.sdk.core.network.d {
    public e() {
        JSONArray jSONArray = new JSONArray();
        t.putValue(jSONArray, new JSONObject());
        putBody("impInfo", jSONArray);
        putBody("appTag", y.Iv());
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final String getUrl() {
        return com.kwad.sdk.h.xe();
    }
}
