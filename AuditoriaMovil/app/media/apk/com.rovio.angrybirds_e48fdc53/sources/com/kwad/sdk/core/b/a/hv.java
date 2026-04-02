package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class hv implements com.kwad.sdk.core.d<AdMatrixInfo.SplashActionBarInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.SplashActionBarInfo splashActionBarInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        splashActionBarInfo.title = jSONObject.optString("title");
        if (splashActionBarInfo.title == JSONObject.NULL) {
            splashActionBarInfo.title = "";
        }
        splashActionBarInfo.downloadTexts = new AdMatrixInfo.DownloadTexts();
        splashActionBarInfo.downloadTexts.parseJson(jSONObject.optJSONObject("downloadTexts"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.SplashActionBarInfo splashActionBarInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (splashActionBarInfo.title != null && !splashActionBarInfo.title.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "title", splashActionBarInfo.title);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "downloadTexts", splashActionBarInfo.downloadTexts);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.SplashActionBarInfo splashActionBarInfo, JSONObject jSONObject) {
        a2(splashActionBarInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.SplashActionBarInfo splashActionBarInfo, JSONObject jSONObject) {
        return b2(splashActionBarInfo, jSONObject);
    }
}
