package com.kwad.sdk.contentalliance.a.a;

import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.l;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    public long adStyle;
    public long clickTime;
    public int contentType;
    public long photoId;

    public a() {
        this.clickTime = -1L;
    }

    public a(AdTemplate adTemplate, long j) {
        this.clickTime = -1L;
        this.photoId = d.cq(adTemplate);
        this.clickTime = j;
        this.adStyle = d.cf(adTemplate);
        this.contentType = d.cg(adTemplate);
    }

    public static a as(AdTemplate adTemplate) {
        return new a(adTemplate, l.cG(adTemplate));
    }

    public final String yO() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentType", this.contentType);
            jSONObject.put("adStyle", this.adStyle);
        } catch (JSONException e) {
            c.printStackTrace(e);
        }
        return jSONObject.toString();
    }
}
