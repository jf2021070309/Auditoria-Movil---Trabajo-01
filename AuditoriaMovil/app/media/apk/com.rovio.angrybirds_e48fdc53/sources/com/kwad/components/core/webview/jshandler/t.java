package com.kwad.components.core.webview.jshandler;

import com.kwad.sdk.commercial.model.WebViewCommercialMsg;
import com.kwad.sdk.core.report.KSLoggerReporter;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class t implements com.kwad.sdk.core.webview.c.a {
    private static void a(WebViewCommercialMsg webViewCommercialMsg) {
        com.kwad.sdk.core.e.c.d("WebCardLogHandler", "handleH5Log actionType actionType" + webViewCommercialMsg.category);
        KSLoggerReporter.a(webViewCommercialMsg.category, webViewCommercialMsg);
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void a(String str, com.kwad.sdk.core.webview.c.c cVar) {
        try {
            WebViewCommercialMsg webViewCommercialMsg = new WebViewCommercialMsg();
            webViewCommercialMsg.parseJson(new JSONObject(str));
            a(webViewCommercialMsg);
            cVar.a(null);
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            cVar.onError(-1, e.getMessage());
        }
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final String getKey() {
        return "commercialLog";
    }

    @Override // com.kwad.sdk.core.webview.c.a
    public final void onDestroy() {
    }
}
