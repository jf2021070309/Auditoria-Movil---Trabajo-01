package com.kwad.components.core.webview;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.kwad.components.core.webview.jshandler.t;
import com.kwad.sdk.core.webview.KsAdWebView;
import com.kwad.sdk.core.webview.c.d;
import com.kwad.sdk.core.webview.c.e;
import com.kwad.sdk.core.webview.c.f;
import com.kwad.sdk.utils.bp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    private WebView My;
    private final Map<String, com.kwad.sdk.core.webview.c.a> Tc = new ConcurrentHashMap(32);
    private com.kwad.sdk.core.webview.c.a Td = new d();
    private boolean Te;

    public a(WebView webView) {
        this.My = webView;
        rk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str, String str2) {
        String str3;
        if (this.Te) {
            str3 = "callJS after destroy jsInterface, " + str2;
        } else if (!TextUtils.isEmpty(str)) {
            com.kwad.sdk.core.e.c.d("KSAdJSBridge", "callJS callback:+ " + str + "--params: " + str2);
            WebView webView = this.My;
            if (webView == null) {
                return;
            }
            bp.a(webView, str, str2);
            return;
        } else {
            str3 = "callJS callback is empty";
        }
        com.kwad.sdk.core.e.c.d("KSAdJSBridge", str3);
    }

    private void rk() {
        a(new com.kwad.sdk.core.webview.d.a());
        a(new com.kwad.sdk.core.webview.d.b());
        a(new t());
    }

    public final void a(com.kwad.sdk.core.webview.c.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.getKey())) {
            com.kwad.sdk.core.e.c.e("KSAdJSBridge", "handler and handler'key cannot be null");
            return;
        }
        if (this.Tc.containsKey(aVar.getKey())) {
            com.kwad.sdk.core.e.c.e("KSAdJSBridge", "cannot register handler again, handler: " + aVar.getKey());
        }
        this.Tc.put(aVar.getKey(), aVar);
    }

    public final void b(com.kwad.sdk.core.webview.c.a aVar) {
        if (TextUtils.isEmpty(aVar.getKey())) {
            com.kwad.sdk.core.e.c.e("KSAdJSBridge", "handler and handler'key cannot be null");
        } else {
            this.Tc.put(aVar.getKey(), aVar);
        }
    }

    @JavascriptInterface
    public final void callAdBridge(String str) {
        com.kwad.sdk.core.e.c.d("KSAdJSBridge", "callAdBridge ==" + str);
        try {
            final com.kwad.sdk.core.webview.c.b bVar = new com.kwad.sdk.core.webview.c.b();
            bVar.parseJson(new JSONObject(str));
            com.kwad.sdk.core.webview.c.a aVar = this.Tc.get(bVar.azb);
            if (aVar == null) {
                aVar = this.Td;
            }
            WebView webView = this.My;
            if (webView != null && (webView instanceof KsAdWebView)) {
                KsAdWebView ksAdWebView = (KsAdWebView) webView;
                com.kwad.sdk.core.webview.b.c.b.a(ksAdWebView.getLoadUrl(), ksAdWebView.getUniqueId(), bVar.azb, bVar.data);
            }
            if (aVar != null) {
                aVar.a(bVar.data, !TextUtils.isEmpty(bVar.azc) ? new com.kwad.sdk.core.webview.c.c() { // from class: com.kwad.components.core.webview.a.1
                    @Override // com.kwad.sdk.core.webview.c.c
                    public final void a(com.kwad.sdk.core.b bVar2) {
                        a.this.h(bVar.azc, new f(bVar2).toJson().toString());
                    }

                    @Override // com.kwad.sdk.core.webview.c.c
                    public final void onError(int i, String str2) {
                        a.this.h(bVar.azc, new e(i, str2).toJson().toString());
                    }
                } : new com.kwad.sdk.core.webview.c.c() { // from class: com.kwad.components.core.webview.a.2
                    @Override // com.kwad.sdk.core.webview.c.c
                    public final void a(com.kwad.sdk.core.b bVar2) {
                    }

                    @Override // com.kwad.sdk.core.webview.c.c
                    public final void onError(int i, String str2) {
                    }
                });
            } else {
                com.kwad.sdk.core.e.c.e("KSAdJSBridge", "bridgeHandler is null");
            }
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            com.kwad.sdk.core.e.c.e("KSAdJSBridge", "callAdBridge JSONException:" + e);
        }
    }

    public final void destroy() {
        com.kwad.sdk.core.e.c.i("KSAdJSBridge", "destroy jsInterface");
        for (Map.Entry<String, com.kwad.sdk.core.webview.c.a> entry : this.Tc.entrySet()) {
            com.kwad.sdk.core.webview.c.a value = entry.getValue();
            if (value != null) {
                value.onDestroy();
            }
        }
        this.Te = true;
    }
}
