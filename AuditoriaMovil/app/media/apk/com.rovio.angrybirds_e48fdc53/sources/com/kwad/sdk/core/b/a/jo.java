package com.kwad.sdk.core.b.a;

import com.facebook.internal.ServerProtocol;
import com.kwad.sdk.commercial.model.WebViewLoadMsg;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class jo implements com.kwad.sdk.core.d<WebViewLoadMsg> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(WebViewLoadMsg webViewLoadMsg, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        webViewLoadMsg.url = jSONObject.optString("url");
        if (webViewLoadMsg.url == JSONObject.NULL) {
            webViewLoadMsg.url = "";
        }
        webViewLoadMsg.state = jSONObject.optInt(ServerProtocol.DIALOG_PARAM_STATE);
        webViewLoadMsg.interval = jSONObject.optString(com.umeng.analytics.pro.bg.aU);
        if (webViewLoadMsg.interval == JSONObject.NULL) {
            webViewLoadMsg.interval = "";
        }
        webViewLoadMsg.failReason = jSONObject.optString("fail_reason");
        if (webViewLoadMsg.failReason == JSONObject.NULL) {
            webViewLoadMsg.failReason = "";
        }
        webViewLoadMsg.costTime = jSONObject.optString("cost_time");
        if (webViewLoadMsg.costTime == JSONObject.NULL) {
            webViewLoadMsg.costTime = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(WebViewLoadMsg webViewLoadMsg, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (webViewLoadMsg.url != null && !webViewLoadMsg.url.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "url", webViewLoadMsg.url);
        }
        if (webViewLoadMsg.state != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, ServerProtocol.DIALOG_PARAM_STATE, webViewLoadMsg.state);
        }
        if (webViewLoadMsg.interval != null && !webViewLoadMsg.interval.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, com.umeng.analytics.pro.bg.aU, webViewLoadMsg.interval);
        }
        if (webViewLoadMsg.failReason != null && !webViewLoadMsg.failReason.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "fail_reason", webViewLoadMsg.failReason);
        }
        if (webViewLoadMsg.costTime != null && !webViewLoadMsg.costTime.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cost_time", webViewLoadMsg.costTime);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(WebViewLoadMsg webViewLoadMsg, JSONObject jSONObject) {
        a2(webViewLoadMsg, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(WebViewLoadMsg webViewLoadMsg, JSONObject jSONObject) {
        return b2(webViewLoadMsg, jSONObject);
    }
}
