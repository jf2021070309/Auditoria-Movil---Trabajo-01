package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class am implements com.kwad.sdk.core.d<AdInfo.AdvertiserInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo.AdvertiserInfo advertiserInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        advertiserInfo.userId = jSONObject.optLong("userId");
        advertiserInfo.userName = jSONObject.optString("userName");
        if (advertiserInfo.userName == JSONObject.NULL) {
            advertiserInfo.userName = "";
        }
        advertiserInfo.rawUserName = jSONObject.optString("rawUserName");
        if (advertiserInfo.rawUserName == JSONObject.NULL) {
            advertiserInfo.rawUserName = "";
        }
        advertiserInfo.userGender = jSONObject.optString("userGender");
        if (advertiserInfo.userGender == JSONObject.NULL) {
            advertiserInfo.userGender = "";
        }
        advertiserInfo.portraitUrl = jSONObject.optString("portraitUrl");
        if (advertiserInfo.portraitUrl == JSONObject.NULL) {
            advertiserInfo.portraitUrl = "";
        }
        advertiserInfo.adAuthorText = jSONObject.optString("adAuthorText");
        if (advertiserInfo.adAuthorText == JSONObject.NULL) {
            advertiserInfo.adAuthorText = "";
        }
        advertiserInfo.authorIconGuide = jSONObject.optString("authorIconGuide");
        if (advertiserInfo.authorIconGuide == JSONObject.NULL) {
            advertiserInfo.authorIconGuide = "";
        }
        advertiserInfo.followed = jSONObject.optBoolean("followed");
        advertiserInfo.fansCount = jSONObject.optInt("fansCount");
        advertiserInfo.brief = jSONObject.optString("brief");
        if (advertiserInfo.brief == JSONObject.NULL) {
            advertiserInfo.brief = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo.AdvertiserInfo advertiserInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (advertiserInfo.userId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "userId", advertiserInfo.userId);
        }
        if (advertiserInfo.userName != null && !advertiserInfo.userName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "userName", advertiserInfo.userName);
        }
        if (advertiserInfo.rawUserName != null && !advertiserInfo.rawUserName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rawUserName", advertiserInfo.rawUserName);
        }
        if (advertiserInfo.userGender != null && !advertiserInfo.userGender.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "userGender", advertiserInfo.userGender);
        }
        if (advertiserInfo.portraitUrl != null && !advertiserInfo.portraitUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "portraitUrl", advertiserInfo.portraitUrl);
        }
        if (advertiserInfo.adAuthorText != null && !advertiserInfo.adAuthorText.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adAuthorText", advertiserInfo.adAuthorText);
        }
        if (advertiserInfo.authorIconGuide != null && !advertiserInfo.authorIconGuide.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "authorIconGuide", advertiserInfo.authorIconGuide);
        }
        if (advertiserInfo.followed) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "followed", advertiserInfo.followed);
        }
        if (advertiserInfo.fansCount != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "fansCount", advertiserInfo.fansCount);
        }
        if (advertiserInfo.brief != null && !advertiserInfo.brief.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "brief", advertiserInfo.brief);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo.AdvertiserInfo advertiserInfo, JSONObject jSONObject) {
        a2(advertiserInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo.AdvertiserInfo advertiserInfo, JSONObject jSONObject) {
        return b2(advertiserInfo, jSONObject);
    }
}
