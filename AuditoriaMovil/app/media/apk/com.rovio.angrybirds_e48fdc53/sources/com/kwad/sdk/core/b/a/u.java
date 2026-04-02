package com.kwad.sdk.core.b.a;

import com.kwad.sdk.internal.api.AdLabelImpl;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class u implements com.kwad.sdk.core.d<AdLabelImpl> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdLabelImpl adLabelImpl, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adLabelImpl.thirdAge = jSONObject.optInt("thirdAge");
        adLabelImpl.thirdGender = jSONObject.optInt("thirdGender");
        adLabelImpl.thirdInterest = jSONObject.optString("thirdInterest");
        if (adLabelImpl.thirdInterest == JSONObject.NULL) {
            adLabelImpl.thirdInterest = "";
        }
        adLabelImpl.prevTitle = jSONObject.optString("prevTitle");
        if (adLabelImpl.prevTitle == JSONObject.NULL) {
            adLabelImpl.prevTitle = "";
        }
        adLabelImpl.postTitle = jSONObject.optString("postTitle");
        if (adLabelImpl.postTitle == JSONObject.NULL) {
            adLabelImpl.postTitle = "";
        }
        adLabelImpl.historyTitle = jSONObject.optString("historyTitle");
        if (adLabelImpl.historyTitle == JSONObject.NULL) {
            adLabelImpl.historyTitle = "";
        }
        adLabelImpl.channel = jSONObject.optString("channel");
        if (adLabelImpl.channel == JSONObject.NULL) {
            adLabelImpl.channel = "";
        }
        adLabelImpl.cpmBidFloor = jSONObject.optLong("cpmBidFloor");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdLabelImpl adLabelImpl, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (adLabelImpl.thirdAge != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "thirdAge", adLabelImpl.thirdAge);
        }
        if (adLabelImpl.thirdGender != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "thirdGender", adLabelImpl.thirdGender);
        }
        if (adLabelImpl.thirdInterest != null && !adLabelImpl.thirdInterest.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "thirdInterest", adLabelImpl.thirdInterest);
        }
        if (adLabelImpl.prevTitle != null && !adLabelImpl.prevTitle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "prevTitle", adLabelImpl.prevTitle);
        }
        if (adLabelImpl.postTitle != null && !adLabelImpl.postTitle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "postTitle", adLabelImpl.postTitle);
        }
        if (adLabelImpl.historyTitle != null && !adLabelImpl.historyTitle.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "historyTitle", adLabelImpl.historyTitle);
        }
        if (adLabelImpl.channel != null && !adLabelImpl.channel.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "channel", adLabelImpl.channel);
        }
        if (adLabelImpl.cpmBidFloor != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cpmBidFloor", adLabelImpl.cpmBidFloor);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdLabelImpl adLabelImpl, JSONObject jSONObject) {
        a2(adLabelImpl, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdLabelImpl adLabelImpl, JSONObject jSONObject) {
        return b2(adLabelImpl, jSONObject);
    }
}
