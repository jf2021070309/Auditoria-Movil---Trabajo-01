package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.api.reward.RewardItem;
import com.kwad.components.ad.adbit.AdBid;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j implements com.kwad.sdk.core.d<AdBid> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdBid adBid, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adBid.creativeId = jSONObject.optLong("creativeId");
        adBid.ecpm = jSONObject.optLong(RewardItem.KEY_ECPM);
        adBid.bidEcpm = jSONObject.optInt("bidEcpm");
        adBid.winNoticeUrl = jSONObject.optString("winNoticeUrl");
        if (adBid.winNoticeUrl == JSONObject.NULL) {
            adBid.winNoticeUrl = "";
        }
        adBid.materialId = jSONObject.optString("materialId");
        if (adBid.materialId == JSONObject.NULL) {
            adBid.materialId = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdBid adBid, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (adBid.creativeId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "creativeId", adBid.creativeId);
        }
        if (adBid.ecpm != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, RewardItem.KEY_ECPM, adBid.ecpm);
        }
        if (adBid.bidEcpm != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "bidEcpm", adBid.bidEcpm);
        }
        if (adBid.winNoticeUrl != null && !adBid.winNoticeUrl.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "winNoticeUrl", adBid.winNoticeUrl);
        }
        if (adBid.materialId != null && !adBid.materialId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "materialId", adBid.materialId);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdBid adBid, JSONObject jSONObject) {
        a2(adBid, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdBid adBid, JSONObject jSONObject) {
        return b2(adBid, jSONObject);
    }
}
