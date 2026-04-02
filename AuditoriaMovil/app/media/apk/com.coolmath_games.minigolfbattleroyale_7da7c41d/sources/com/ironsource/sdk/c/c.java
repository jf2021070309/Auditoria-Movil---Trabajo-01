package com.ironsource.sdk.c;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class c implements e {
    private static final String f = c.class.getSimpleName();
    public final String a;
    WebView b;
    public com.ironsource.sdk.b.b c;
    public com.ironsource.sdk.a d;
    public Activity e;
    private final String g;

    public c(com.ironsource.sdk.b.a aVar, Activity activity, String str, com.ironsource.sdk.a aVar2) {
        this.e = activity;
        com.ironsource.sdk.b.b bVar = new com.ironsource.sdk.b.b();
        this.c = bVar;
        bVar.e = str;
        this.g = IronSourceStorageUtils.getNetworkStorageDir(activity.getApplicationContext());
        this.a = str;
        this.c.b = aVar;
        this.d = aVar2;
    }

    static /* synthetic */ Activity a(c cVar, Activity activity) {
        cVar.e = null;
        return null;
    }

    static /* synthetic */ com.ironsource.sdk.b.b a(c cVar, com.ironsource.sdk.b.b bVar) {
        cVar.c = null;
        return null;
    }

    static /* synthetic */ void a(c cVar, final String str) {
        Logger.i(f, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(cVar.e);
        cVar.b = webView;
        webView.addJavascriptInterface(new b(cVar), "containerMsgHandler");
        cVar.b.setWebViewClient(new com.ironsource.sdk.b.c(new e.a() { // from class: com.ironsource.sdk.c.c.3
            @Override // com.ironsource.sdk.c.e.a
            public final void a(String str2) {
                String str3 = c.f;
                Logger.i(str3, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str2);
                c.this.b(str, str2);
            }

            @Override // com.ironsource.sdk.c.e.a
            public final void b(String str2) {
                String str3 = c.f;
                Logger.i(str3, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str2);
                try {
                    ((ViewGroup) c.this.b.getParent()).removeView(c.this.b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                c.this.c();
            }
        }));
        com.ironsource.sdk.utils.d.a(cVar.b);
        cVar.c.d = cVar.b;
    }

    static /* synthetic */ String b(c cVar, String str) {
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(cVar.g);
            String substring = str.substring(str.indexOf("/") + 1);
            sb.append(substring.substring(substring.indexOf("/")));
            return sb.toString();
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c() {
        a("", "");
    }

    @Override // com.ironsource.sdk.c.e
    public final WebView a() {
        return this.b;
    }

    @Override // com.ironsource.sdk.c.e
    public final synchronized void a(final String str, final String str2) {
        if (this.e == null) {
            return;
        }
        this.e.runOnUiThread(new Runnable() { // from class: com.ironsource.sdk.c.c.2
            @Override // java.lang.Runnable
            public final void run() {
                Logger.i(c.f, "performCleanup");
                try {
                    if (c.this.b != null) {
                        c.this.b.destroy();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("adViewId", c.this.a);
                    if (c.this.c != null) {
                        c.this.c.a(str, jSONObject);
                        com.ironsource.sdk.b.b bVar = c.this.c;
                        bVar.b = null;
                        bVar.c = null;
                        com.ironsource.sdk.b.b.a = null;
                    }
                    c.a(c.this, (com.ironsource.sdk.b.b) null);
                    c.a(c.this, (Activity) null);
                } catch (Exception e) {
                    String str3 = c.f;
                    Log.e(str3, "performCleanup | could not destroy ISNAdView webView ID: " + c.this.a);
                    com.ironsource.sdk.a.d.a(f.p, new com.ironsource.sdk.a.a().a("callfailreason", e.getMessage()).a);
                    c.this.b(str2, e.getMessage());
                }
            }
        });
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, "action parameter empty");
            return;
        }
        String str4 = f;
        Logger.i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.b.onPause();
            } else if (!str.equals("onResume")) {
                b(str3, "action not supported");
                return;
            } else {
                this.b.onResume();
            }
            this.c.a(str2);
        } catch (Exception unused) {
            b(str3, "failed to perform action");
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.c.b(str);
        } catch (Exception e) {
            String str3 = f;
            Logger.i(str3, "sendHandleGetViewVisibility fail with reason: " + e.getMessage());
        }
    }

    public final void b(String str, String str2) {
        com.ironsource.sdk.b.b bVar = this.c;
        if (bVar != null) {
            bVar.a(str, str2);
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void b(JSONObject jSONObject, String str, String str2) {
        try {
            this.c.a(jSONObject.getString(NativeProtocol.WEB_DIALOG_PARAMS), str, str2);
        } catch (Exception e) {
            String str3 = f;
            Logger.i(str3, "sendMessageToAd fail message: " + e.getMessage());
            throw e;
        }
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        com.ironsource.sdk.b.b bVar = this.c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(FirebaseAnalytics.Param.METHOD);
            if (TextUtils.isEmpty(optString) || !bVar.c(optString)) {
                bVar.a("containerSendMessage", jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                bVar.a(bVar.a(jSONObject).toString(), (String) null, (String) null);
            }
        } catch (JSONException e) {
            String str2 = bVar.f;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e.printStackTrace();
        }
    }
}
