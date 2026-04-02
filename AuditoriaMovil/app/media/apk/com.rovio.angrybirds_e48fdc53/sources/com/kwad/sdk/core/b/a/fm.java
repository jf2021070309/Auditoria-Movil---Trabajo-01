package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdMatrixInfo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class fm implements com.kwad.sdk.core.d<AdMatrixInfo.MerchantLiveReservationInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdMatrixInfo.MerchantLiveReservationInfo merchantLiveReservationInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        merchantLiveReservationInfo.title = jSONObject.optString("title");
        if (merchantLiveReservationInfo.title == JSONObject.NULL) {
            merchantLiveReservationInfo.title = "";
        }
        merchantLiveReservationInfo.userHeadUrl = jSONObject.optString("userHeadUrl");
        if (merchantLiveReservationInfo.userHeadUrl == JSONObject.NULL) {
            merchantLiveReservationInfo.userHeadUrl = "";
        }
        merchantLiveReservationInfo.bookUserCount = jSONObject.optInt("bookUserCount");
        merchantLiveReservationInfo.liveStartTime = jSONObject.optString("liveStartTime");
        if (merchantLiveReservationInfo.liveStartTime == JSONObject.NULL) {
            merchantLiveReservationInfo.liveStartTime = "";
        }
        merchantLiveReservationInfo.displayWeakCard = jSONObject.optBoolean("displayWeakCard");
        merchantLiveReservationInfo.bookUserUrlList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("bookUserUrlList");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                merchantLiveReservationInfo.bookUserUrlList.add((String) optJSONArray.opt(i));
            }
        }
        merchantLiveReservationInfo.displayBookCount = jSONObject.optBoolean("displayBookCount");
        merchantLiveReservationInfo.playEndCard = new AdMatrixInfo.MerchantLiveReservationInfo.LiveReservationPlayEndInfo();
        merchantLiveReservationInfo.playEndCard.parseJson(jSONObject.optJSONObject("playEndCard"));
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdMatrixInfo.MerchantLiveReservationInfo merchantLiveReservationInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (merchantLiveReservationInfo.title != null && !merchantLiveReservationInfo.title.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "title", merchantLiveReservationInfo.title);
        }
        if (merchantLiveReservationInfo.userHeadUrl != null && !merchantLiveReservationInfo.userHeadUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "userHeadUrl", merchantLiveReservationInfo.userHeadUrl);
        }
        if (merchantLiveReservationInfo.bookUserCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "bookUserCount", merchantLiveReservationInfo.bookUserCount);
        }
        if (merchantLiveReservationInfo.liveStartTime != null && !merchantLiveReservationInfo.liveStartTime.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "liveStartTime", merchantLiveReservationInfo.liveStartTime);
        }
        if (merchantLiveReservationInfo.displayWeakCard) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "displayWeakCard", merchantLiveReservationInfo.displayWeakCard);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "bookUserUrlList", merchantLiveReservationInfo.bookUserUrlList);
        if (merchantLiveReservationInfo.displayBookCount) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "displayBookCount", merchantLiveReservationInfo.displayBookCount);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "playEndCard", merchantLiveReservationInfo.playEndCard);
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdMatrixInfo.MerchantLiveReservationInfo merchantLiveReservationInfo, JSONObject jSONObject) {
        a2(merchantLiveReservationInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdMatrixInfo.MerchantLiveReservationInfo merchantLiveReservationInfo, JSONObject jSONObject) {
        return b2(merchantLiveReservationInfo, jSONObject);
    }
}
