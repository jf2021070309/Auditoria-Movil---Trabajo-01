package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.FeedSlideConf;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class de implements com.kwad.sdk.core.d<FeedSlideConf> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(FeedSlideConf feedSlideConf, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        feedSlideConf.maxRange = jSONObject.optInt("maxRange");
        feedSlideConf.minRange = jSONObject.optInt("minRange");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(FeedSlideConf feedSlideConf, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (feedSlideConf.maxRange != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "maxRange", feedSlideConf.maxRange);
        }
        if (feedSlideConf.minRange != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "minRange", feedSlideConf.minRange);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(FeedSlideConf feedSlideConf, JSONObject jSONObject) {
        a2(feedSlideConf, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(FeedSlideConf feedSlideConf, JSONObject jSONObject) {
        return b2(feedSlideConf, jSONObject);
    }
}
