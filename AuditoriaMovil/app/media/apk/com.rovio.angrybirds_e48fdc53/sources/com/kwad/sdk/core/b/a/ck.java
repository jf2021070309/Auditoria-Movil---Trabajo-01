package com.kwad.sdk.core.b.a;

import com.facebook.internal.AnalyticsEvents;
import com.kwad.sdk.core.response.model.AdStyleInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ck implements com.kwad.sdk.core.d<AdStyleInfo.PlayDetailInfo.DetailWebCardInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdStyleInfo.PlayDetailInfo.DetailWebCardInfo detailWebCardInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        detailWebCardInfo.style = jSONObject.optInt(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
        detailWebCardInfo.maxTimeOut = jSONObject.optLong("maxTimeOut");
        detailWebCardInfo.typeLandscape = jSONObject.optLong("typeLandscape");
        detailWebCardInfo.typePortrait = jSONObject.optLong("typePortrait");
        detailWebCardInfo.cardUrl = jSONObject.optString("cardUrl");
        if (detailWebCardInfo.cardUrl == JSONObject.NULL) {
            detailWebCardInfo.cardUrl = "";
        }
        detailWebCardInfo.cardData = jSONObject.optString("cardData");
        if (detailWebCardInfo.cardData == JSONObject.NULL) {
            detailWebCardInfo.cardData = "";
        }
        detailWebCardInfo.cardShowTime = jSONObject.optLong("cardShowTime");
        detailWebCardInfo.cardType = jSONObject.optInt("cardType");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdStyleInfo.PlayDetailInfo.DetailWebCardInfo detailWebCardInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (detailWebCardInfo.style != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, detailWebCardInfo.style);
        }
        if (detailWebCardInfo.maxTimeOut != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "maxTimeOut", detailWebCardInfo.maxTimeOut);
        }
        if (detailWebCardInfo.typeLandscape != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "typeLandscape", detailWebCardInfo.typeLandscape);
        }
        if (detailWebCardInfo.typePortrait != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "typePortrait", detailWebCardInfo.typePortrait);
        }
        if (detailWebCardInfo.cardUrl != null && !detailWebCardInfo.cardUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cardUrl", detailWebCardInfo.cardUrl);
        }
        if (detailWebCardInfo.cardData != null && !detailWebCardInfo.cardData.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cardData", detailWebCardInfo.cardData);
        }
        if (detailWebCardInfo.cardShowTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cardShowTime", detailWebCardInfo.cardShowTime);
        }
        if (detailWebCardInfo.cardType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cardType", detailWebCardInfo.cardType);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdStyleInfo.PlayDetailInfo.DetailWebCardInfo detailWebCardInfo, JSONObject jSONObject) {
        a2(detailWebCardInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdStyleInfo.PlayDetailInfo.DetailWebCardInfo detailWebCardInfo, JSONObject jSONObject) {
        return b2(detailWebCardInfo, jSONObject);
    }
}
