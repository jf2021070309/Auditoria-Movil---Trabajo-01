package com.kwad.sdk.core.webview.request;

import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.network.d;
import com.kwad.sdk.core.network.q;
import com.kwad.sdk.h;
import com.kwad.sdk.utils.t;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends d {
    private String azo;
    private String mUrl;

    public a(String str, String str2, String str3) {
        JSONObject jSONObject;
        this.mUrl = str;
        this.azo = str2;
        try {
            jSONObject = new JSONObject(str3);
        } catch (JSONException e) {
            c.printStackTrace(e);
            jSONObject = null;
        }
        c.d("WebCardGetDataRequest", "mBodyParams1 size=" + this.mBodyParams.length());
        if (jSONObject != null) {
            c.d("WebCardGetDataRequest", "paramsJsonObj=" + jSONObject.toString());
        }
        t.merge(this.mBodyParams, jSONObject);
        c.d("WebCardGetDataRequest", "mBodyParams2 size=" + this.mBodyParams.length());
        addHeader("user-agent", q.getUserAgent());
        c.d("WebCardGetDataRequest", "user-agent" + q.getUserAgent());
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public String getUrl() {
        return h.wY() + this.mUrl;
    }
}
