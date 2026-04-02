package com.kwad.sdk.core.webview.b.c;

import android.text.TextUtils;
import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.commercial.model.HybridLoadMsg;
import com.kwad.sdk.commercial.model.WebViewLoadMsg;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.utils.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    public static final Map<String, JSONObject> ayY = new HashMap();
    public static boolean ayZ = true;

    /* loaded from: classes.dex */
    public static class a {
        public String msg;
    }

    public static void Y(String str, String str2) {
        JSONObject eg = eg(str);
        t.putValue(eg, "c_" + str2, System.currentTimeMillis());
    }

    private static void Z(String str, String str2) {
        a(str, str2, 1, "");
    }

    public static void a(com.kwad.sdk.h.a.b bVar, int i) {
        KSLoggerReporter.a(ILoggerReporter.Category.APM_LOG, new HybridLoadMsg().setSceneId(bVar.aCj).setH5Version(bVar.version).setLoadType(bVar.loadType).setState(i).setPackageUrl(bVar.packageUrl).setInterval(String.valueOf(System.currentTimeMillis() - bVar.FB())));
    }

    public static void a(com.kwad.sdk.h.a.b bVar, int i, int i2, String str) {
        KSLoggerReporter.a(ILoggerReporter.Category.ERROR_LOG, new HybridLoadMsg().setSceneId(bVar.aCj).setH5Version(bVar.version).setLoadType(bVar.loadType).setState(0).setPackageUrl(bVar.packageUrl).setFailState(i2).setInterval(String.valueOf(System.currentTimeMillis() - bVar.FB())).setFailReason(str));
    }

    private static void a(String str, String str2, int i, String str3) {
        long currentTimeMillis;
        JSONObject jSONObject = ayY.get(str2);
        if (jSONObject == null) {
            currentTimeMillis = -3;
        } else {
            long optLong = jSONObject.optLong("c_loadUrl");
            if (optLong <= 0) {
                currentTimeMillis = -2;
            } else {
                currentTimeMillis = System.currentTimeMillis() - optLong;
                if (currentTimeMillis > 100000 || currentTimeMillis < 0) {
                    currentTimeMillis = -1;
                }
            }
        }
        KSLoggerReporter.a(i == 2 ? ILoggerReporter.Category.ERROR_LOG : ILoggerReporter.Category.APM_LOG, new WebViewLoadMsg().setUrl(str).setState(i).setCostTime(jSONObject != null ? jSONObject.toString() : "").setInterval(String.valueOf(currentTimeMillis)).setFailReason(str3));
        eh(str2);
    }

    public static void a(String str, String str2, int i, String str3, long j) {
        KSLoggerReporter.b(i == 2 ? ILoggerReporter.Category.ERROR_LOG : ILoggerReporter.Category.APM_LOG, new HybridLoadMsg().setSceneId(str2).setUrl(str).setState(i).setInterval(String.valueOf((j > 60000 || j < 0) ? -1L : -1L)).setFailReason(str3));
    }

    public static void a(String str, String str2, String str3, String str4) {
        JSONObject eg = eg(str2);
        t.putValue(eg, "c_" + str3, System.currentTimeMillis());
        if (str3.equals("pageStatus")) {
            try {
                if (TextUtils.isEmpty(str4)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str4);
                int optInt = jSONObject.optInt("status");
                String optString = jSONObject.optString("errorMsg", "");
                String optString2 = jSONObject.optString("webViewCostParams", "");
                if (!TextUtils.isEmpty(optString2)) {
                    JSONObject jSONObject2 = new JSONObject(optString2);
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        eg.put(next, jSONObject2.opt(next));
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    if (optInt == 1) {
                        Z(str, str2);
                    } else {
                        aa(str, optString);
                    }
                }
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            } finally {
                eh(str2);
            }
        }
    }

    public static void aa(String str, String str2) {
        a(str, "", 2, str2);
    }

    public static void d(String str, String str2, String str3) {
        if (str3.contains("/")) {
            str3 = str3.substring(str3.lastIndexOf("/") + 1);
        }
        JSONObject eg = eg(str);
        t.putValue(eg, "c_responseStart_" + str2 + "_" + str3, System.currentTimeMillis());
    }

    public static void e(String str, String str2, String str3) {
        if (str3.contains("/")) {
            str3 = str3.substring(str3.lastIndexOf("/") + 1);
        }
        JSONObject eg = eg(str);
        t.putValue(eg, "c_responseEnd_" + str2 + "_" + str3, System.currentTimeMillis());
    }

    private static JSONObject eg(String str) {
        Map<String, JSONObject> map = ayY;
        JSONObject jSONObject = map.get(str);
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            map.put(str, jSONObject2);
            return jSONObject2;
        }
        return jSONObject;
    }

    private static void eh(String str) {
        ayY.remove(str);
    }

    public static void ei(String str) {
        JSONObject eg = eg(str);
        long Ee = com.kwad.sdk.core.webview.b.a.Ed().Ee();
        long currentTimeMillis = Ee <= 0 ? -1L : System.currentTimeMillis() - Ee;
        t.putValue(eg, "c_loadUrl", System.currentTimeMillis());
        t.putValue(eg, "c_init_interval", currentTimeMillis);
        t.putValue(eg, "c_init_state", ayZ ? 1 : 2);
        ayZ = false;
    }
}
