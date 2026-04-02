package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.sdk.commercial.model.WebViewCommercialMsg;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jn implements com.kwad.sdk.core.d<WebViewCommercialMsg> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(WebViewCommercialMsg webViewCommercialMsg, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        webViewCommercialMsg.category = jSONObject.optString("category");
        if (webViewCommercialMsg.category == JSONObject.NULL) {
            webViewCommercialMsg.category = "";
        }
        webViewCommercialMsg.tag = jSONObject.optString("tag");
        if (webViewCommercialMsg.tag == JSONObject.NULL) {
            webViewCommercialMsg.tag = "";
        }
        webViewCommercialMsg.msg = jSONObject.optJSONObject("msg");
        webViewCommercialMsg.extraParam = jSONObject.optJSONObject("extraParam");
        webViewCommercialMsg.eventId = jSONObject.optString("event_id");
        if (webViewCommercialMsg.eventId == JSONObject.NULL) {
            webViewCommercialMsg.eventId = "";
        }
        webViewCommercialMsg.rate = jSONObject.optDouble("rate");
        webViewCommercialMsg.suffixRatio = jSONObject.optString("suffixRatio");
        if (webViewCommercialMsg.suffixRatio == JSONObject.NULL) {
            webViewCommercialMsg.suffixRatio = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(WebViewCommercialMsg webViewCommercialMsg, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (webViewCommercialMsg.category != null && !webViewCommercialMsg.category.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "category", webViewCommercialMsg.category);
        }
        if (webViewCommercialMsg.tag != null && !webViewCommercialMsg.tag.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tag", webViewCommercialMsg.tag);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "msg", webViewCommercialMsg.msg);
        com.kwad.sdk.utils.t.putValue(jSONObject, "extraParam", webViewCommercialMsg.extraParam);
        if (webViewCommercialMsg.eventId != null && !webViewCommercialMsg.eventId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "event_id", webViewCommercialMsg.eventId);
        }
        if (webViewCommercialMsg.rate != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "rate", webViewCommercialMsg.rate);
        }
        if (webViewCommercialMsg.suffixRatio != null && !webViewCommercialMsg.suffixRatio.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "suffixRatio", webViewCommercialMsg.suffixRatio);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(WebViewCommercialMsg webViewCommercialMsg, JSONObject jSONObject) {
        a2(webViewCommercialMsg, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(WebViewCommercialMsg webViewCommercialMsg, JSONObject jSONObject) {
        return b2(webViewCommercialMsg, jSONObject);
    }
}
