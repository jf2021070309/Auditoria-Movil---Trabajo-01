package com.kwad.sdk.core.b.a;

import com.facebook.share.internal.ShareConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bm implements com.kwad.sdk.core.d<com.kwad.sdk.core.report.k> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.report.k kVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        kVar.llsid = jSONObject.optLong("llsid");
        kVar.creativeId = jSONObject.optLong("creative_id");
        kVar.score = jSONObject.optInt("score");
        kVar.arg = jSONObject.optInt("is_bidding");
        kVar.source = jSONObject.optString(ShareConstants.FEED_SOURCE_PARAM);
        if (kVar.source == JSONObject.NULL) {
            kVar.source = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.report.k kVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (kVar.llsid != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "llsid", kVar.llsid);
        }
        if (kVar.creativeId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "creative_id", kVar.creativeId);
        }
        if (kVar.score != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "score", kVar.score);
        }
        if (kVar.arg != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "is_bidding", kVar.arg);
        }
        if (kVar.source != null && !kVar.source.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, ShareConstants.FEED_SOURCE_PARAM, kVar.source);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.report.k kVar, JSONObject jSONObject) {
        a2(kVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.report.k kVar, JSONObject jSONObject) {
        return b2(kVar, jSONObject);
    }
}
