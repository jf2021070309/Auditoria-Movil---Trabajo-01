package com.ironsource.sdk.b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b {
    public static Handler a;
    public a b;
    public WebView d;
    public String e;
    public String f = b.class.getSimpleName();
    private String[] g = {"handleGetViewVisibility"};
    private final String[] h = {"loadWithUrl", "updateAd", "isExternalAdViewInitiated", "handleGetViewVisibility", "sendMessage"};
    public d c = new d();

    static /* synthetic */ void a(b bVar, String str) {
        try {
            String str2 = "javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}";
            if (Build.VERSION.SDK_INT >= 19) {
                bVar.d.evaluateJavascript(str2, null);
            } else {
                bVar.d.loadUrl(str2);
            }
        } catch (Throwable th) {
            Log.e(bVar.f, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + str + "Android API level: " + Build.VERSION.SDK_INT);
            th.printStackTrace();
        }
    }

    private Handler b() {
        try {
            if (a == null) {
                a = new Handler(Looper.getMainLooper());
            }
        } catch (Exception e) {
            Log.e(this.f, "Error while trying execute method getUIThreadHandler");
            e.printStackTrace();
        }
        return a;
    }

    private static String d(String str) {
        return String.format("window.ssa.onMessageReceived(%1$s)", str);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("visibilityParams", this.c.a());
            jSONObject.put("configs", jSONObject2);
            jSONObject.put("adViewId", this.e);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.c.a());
        } catch (Exception e) {
            String str = this.f;
            Log.e(str, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e.printStackTrace();
        }
        return jSONObject2;
    }

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.e);
            a(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(String str, int i, boolean z) {
        d dVar = this.c;
        if (dVar.a.containsKey(str)) {
            dVar.a.put(str, Boolean.valueOf(i == 0));
        }
        dVar.a.put("isShown", Boolean.valueOf(z));
        dVar.a.put("isViewVisible", Boolean.valueOf((dVar.a.get("isWindowVisible").booleanValue() || dVar.a.get("isVisible").booleanValue()) && dVar.a.get("isShown").booleanValue()));
        if (!(Build.VERSION.SDK_INT <= 22 ? str.equalsIgnoreCase("isWindowVisible") : str.equalsIgnoreCase("isVisible")) || this.b == null || this.c == null) {
            return;
        }
        a("containerIsVisible", a());
    }

    public final void a(String str, String str2) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(str, str2, this.e);
        }
    }

    public final void a(String str, String str2, String str3) {
        if (this.d == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f, str4);
            this.b.a(str3, str4, this.e);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = "\"" + str + "\"";
        }
        final String d = d(str);
        b().post(new Runnable() { // from class: com.ironsource.sdk.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this, d);
            }
        });
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.e);
        a(str2, jSONObject);
    }

    public final void a(String str, JSONObject jSONObject) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(str, jSONObject);
        }
    }

    public final void b(String str) {
        JSONObject a2 = this.c.a();
        a2.put("adViewId", this.e);
        a(str, a2);
    }

    public boolean c(String str) {
        for (String str2 : this.g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
