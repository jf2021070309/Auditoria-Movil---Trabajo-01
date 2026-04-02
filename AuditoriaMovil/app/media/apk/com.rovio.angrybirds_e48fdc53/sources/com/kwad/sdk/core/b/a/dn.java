package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dn implements com.kwad.sdk.core.d<AdInfo.FullScreenVideoInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.FullScreenVideoInfo fullScreenVideoInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        fullScreenVideoInfo.fullScreenEndCardSwitch = jSONObject.optBoolean("fullScreenEndCardSwitch");
        fullScreenVideoInfo.showLandingPage = jSONObject.optInt("showLandingPage");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.FullScreenVideoInfo fullScreenVideoInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (fullScreenVideoInfo.fullScreenEndCardSwitch) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "fullScreenEndCardSwitch", fullScreenVideoInfo.fullScreenEndCardSwitch);
        }
        if (fullScreenVideoInfo.showLandingPage != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "showLandingPage", fullScreenVideoInfo.showLandingPage);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.FullScreenVideoInfo fullScreenVideoInfo, JSONObject jSONObject) {
        a2(fullScreenVideoInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.FullScreenVideoInfo fullScreenVideoInfo, JSONObject jSONObject) {
        return b2(fullScreenVideoInfo, jSONObject);
    }
}
