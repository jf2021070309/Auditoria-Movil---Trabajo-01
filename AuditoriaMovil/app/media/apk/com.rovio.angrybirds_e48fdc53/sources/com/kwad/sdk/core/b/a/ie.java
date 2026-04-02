package com.kwad.sdk.core.b.a;

import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ie implements com.kwad.sdk.core.d<AdMatrixInfo.SplashSlideInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.SplashSlideInfo splashSlideInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        splashSlideInfo.title = jSONObject.optString("title");
        if (splashSlideInfo.title == JSONObject.NULL) {
            splashSlideInfo.title = "";
        }
        splashSlideInfo.subtitle = jSONObject.optString(MessengerShareContentUtility.SUBTITLE);
        if (splashSlideInfo.subtitle == JSONObject.NULL) {
            splashSlideInfo.subtitle = "";
        }
        splashSlideInfo.style = jSONObject.optInt(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
        splashSlideInfo.convertDistance = jSONObject.optInt("convertDistance");
        splashSlideInfo.downloadTexts = new AdMatrixInfo.DownloadTexts();
        splashSlideInfo.downloadTexts.parseJson(jSONObject.optJSONObject("downloadTexts"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.SplashSlideInfo splashSlideInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (splashSlideInfo.title != null && !splashSlideInfo.title.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "title", splashSlideInfo.title);
        }
        if (splashSlideInfo.subtitle != null && !splashSlideInfo.subtitle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, MessengerShareContentUtility.SUBTITLE, splashSlideInfo.subtitle);
        }
        if (splashSlideInfo.style != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, splashSlideInfo.style);
        }
        if (splashSlideInfo.convertDistance != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "convertDistance", splashSlideInfo.convertDistance);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "downloadTexts", splashSlideInfo.downloadTexts);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.SplashSlideInfo splashSlideInfo, JSONObject jSONObject) {
        a2(splashSlideInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.SplashSlideInfo splashSlideInfo, JSONObject jSONObject) {
        return b2(splashSlideInfo, jSONObject);
    }
}
