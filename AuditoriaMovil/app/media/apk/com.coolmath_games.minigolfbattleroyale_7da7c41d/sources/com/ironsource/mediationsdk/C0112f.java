package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.internal.NativeProtocol;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.ironsource.mediationsdk.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0112f {
    private static C0112f a = new C0112f();

    /* renamed from: com.ironsource.mediationsdk.f$a */
    /* loaded from: classes2.dex */
    public static class a {
        String a;
        List<com.ironsource.mediationsdk.a.c> b;
        com.ironsource.mediationsdk.a.c c;
        JSONObject d;
        int e;
        String f;
    }

    /* renamed from: com.ironsource.mediationsdk.f$b */
    /* loaded from: classes2.dex */
    static class b extends AsyncTask<String, Void, Boolean> {
        private String a;
        private String b;
        private String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        private static Boolean a(String... strArr) {
            try {
                boolean z = false;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                return Boolean.valueOf((responseCode == 200 || responseCode == 204) ? true : true);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ Boolean doInBackground(String[] strArr) {
            return a(strArr);
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, this.a + ";" + this.b + ";" + this.c);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, jSONObject));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.ironsource.mediationsdk.f$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {1, 2};
    }

    public static com.ironsource.mediationsdk.a.c a(String str, List<com.ironsource.mediationsdk.a.c> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).a().equals(str)) {
                return list.get(i);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(JSONObject jSONObject) {
        String optString = jSONObject.optString(IronSourceConstants.EVENTS_AUCTION_ID);
        if (TextUtils.isEmpty(optString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a();
        aVar.a = optString;
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.c = new com.ironsource.mediationsdk.a.c(jSONObject2);
            r0 = jSONObject2.has("armData") ? jSONObject2.optJSONObject("armData") : null;
            if (jSONObject2.has(IronSourceConstants.EVENTS_GENERIC_PARAMS)) {
                aVar.d = jSONObject2.optJSONObject(IronSourceConstants.EVENTS_GENERIC_PARAMS);
            }
        }
        aVar.b = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("waterfall");
        for (int i = 0; i < jSONArray.length(); i++) {
            com.ironsource.mediationsdk.a.c cVar = new com.ironsource.mediationsdk.a.c(jSONArray.getJSONObject(i), r0);
            if (!cVar.g()) {
                aVar.e = 1002;
                aVar.f = "waterfall " + i;
                throw new JSONException("invalid response");
            }
            aVar.b.add(cVar);
        }
        return aVar;
    }

    public static C0112f a() {
        return a;
    }

    public static String a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace("${INSTANCE}", str2).replace("${INSTANCE_TYPE}", Integer.toString(i)).replace("${DYNAMIC_DEMAND_SOURCE}", str3).replace("${PLACEMENT_NAME}", str7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(String str) {
        try {
            return new JSONObject(IronSourceAES.decode(com.ironsource.mediationsdk.utils.g.a().b(), str));
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject a(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (list.contains(next)) {
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2, String str3) {
        new b(str, str2, str3).execute(str3);
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (jSONObject.has(next)) {
                int i = 0;
                str = next;
                while (jSONObject.has(str)) {
                    i++;
                    str = next + "_" + i;
                }
            } else {
                str = next;
            }
            try {
                jSONObject.put(str, jSONObject2.opt(next));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (((com.ironsource.environment.ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        return com.ironsource.mediationsdk.C0112f.c.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b() {
        /*
            int r0 = com.ironsource.mediationsdk.C0112f.c.b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L16
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r0 = r0.isCleartextTrafficPermitted()
            if (r0 == 0) goto L13
            goto L34
        L13:
            int r0 = com.ironsource.mediationsdk.C0112f.c.b
            goto L36
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L34
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 == 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            if (r0 == 0) goto L13
        L34:
            int r0 = com.ironsource.mediationsdk.C0112f.c.a
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0112f.b():int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(JSONObject jSONObject) {
        return IronSourceAES.encode(com.ironsource.mediationsdk.utils.g.a().b(), jSONObject.toString());
    }

    public static Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(NativeProtocol.WEB_DIALOG_PARAMS)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return hashMap;
    }

    private JSONObject b(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    HashMap<String, String> hashMap = com.ironsource.environment.l.b;
                    String str = hashMap.containsKey(next) ? hashMap.get(next) : next;
                    if ((list.isEmpty() && !com.ironsource.environment.l.a.contains(str) && !str.startsWith("metadata_")) || list.contains(str)) {
                        jSONObject2.put(str, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    public static String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException unused) {
            return str;
        }
    }

    public static String d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(NativeProtocol.WEB_DIALOG_PARAMS)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
                return jSONObject2.has(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID) ? jSONObject2.getString(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID) : "";
            }
            return "";
        } catch (JSONException unused) {
            return "";
        }
    }

    public final String a(String str, int i, com.ironsource.mediationsdk.a.c cVar, String str2, String str3, String str4) {
        String str5;
        String c2 = cVar.c();
        if (!TextUtils.isEmpty(c2) && !TextUtils.isEmpty(str2)) {
            double parseDouble = Double.parseDouble(c2);
            double parseDouble2 = Double.parseDouble(str2);
            if (parseDouble2 != 0.0d) {
                str5 = String.valueOf(Math.round((parseDouble / parseDouble2) * 1000.0d) / 1000.0d);
                return a(str, cVar.a(), i, d(cVar.b()), c2, str5, str3, str4);
            }
        }
        str5 = "";
        return a(str, cVar.a(), i, d(cVar.b()), c2, str5, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject a(Context context, Map<String, Object> map, List<String> list, C0115i c0115i, int i, String str, com.ironsource.mediationsdk.utils.b bVar, ISBannerSize iSBannerSize) {
        Object obj;
        String str2;
        JSONObject jSONObject = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            obj = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceType", 2);
            jSONObject2.put("biddingAdditionalData", new JSONObject((Map) map.get(next)));
            if (c0115i != null) {
                obj = c0115i.a(next);
            }
            jSONObject2.put("performance", obj);
            jSONObject.put(next, jSONObject2);
        }
        if (list != null) {
            for (String str3 : list) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("instanceType", 1);
                jSONObject3.put("performance", c0115i != null ? c0115i.a(str3) : "");
                jSONObject.put(str3, jSONObject3);
            }
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = C0110d.a().c;
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b.a().d());
        JSONObject jSONObject4 = new JSONObject();
        for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
            jSONObject4.put(entry.getKey(), TextUtils.join(",", entry.getValue()));
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("applicationUserId", E.a().k);
        Boolean bool = E.a().x;
        if (bool != null) {
            jSONObject5.put("consent", bool.booleanValue() ? 1 : 0);
        }
        jSONObject5.put("mobileCarrier", com.ironsource.environment.h.j(context));
        jSONObject5.put("connectionType", IronSourceUtils.getConnectionType(context));
        jSONObject5.put("deviceOS", Constants.PLATFORM);
        jSONObject5.put("deviceWidth", context.getResources().getConfiguration().screenWidthDp);
        jSONObject5.put("deviceHeight", context.getResources().getConfiguration().screenHeightDp);
        jSONObject5.put("deviceOSVersion", Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")");
        jSONObject5.put("deviceModel", Build.MODEL);
        jSONObject5.put("deviceMake", Build.MANUFACTURER);
        jSONObject5.put("bundleId", context.getPackageName());
        jSONObject5.put("appVersion", com.ironsource.environment.c.c(context, context.getPackageName()));
        jSONObject5.put("clientTimestamp", new Date().getTime());
        jSONObject5.put("fs", IronSourceUtils.getFirstSession(context) ? 1 : 0);
        jSONObject5.put("browserUserAgent", com.ironsource.environment.h.r());
        jSONObject5.put("deviceType", IronSourceUtils.getDeviceType(context));
        jSONObject5.put("deviceLang", Locale.getDefault().getLanguage());
        jSONObject5.put("secure", b() - 1);
        if (iSBannerSize != null) {
            jSONObject5.put("bannerSize", iSBannerSize.getDescription());
            jSONObject5.put("bannerWidth", iSBannerSize.getWidth());
            jSONObject5.put("bannerHeight", iSBannerSize.getHeight());
        }
        try {
            String[] a2 = com.ironsource.environment.h.a(context);
            str2 = !TextUtils.isEmpty(a2[0]) ? a2[0] : "";
            try {
                Boolean.valueOf(a2[1]).booleanValue();
            } catch (Exception unused) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = com.ironsource.environment.h.y(context);
                    if (!TextUtils.isEmpty(str2)) {
                        obj = IronSourceConstants.TYPE_UUID;
                    }
                } else {
                    obj = IronSourceConstants.TYPE_GAID;
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject5.put("advId", str2);
                    jSONObject5.put("advIdType", obj);
                    jSONObject5.put("isLimitAdTrackingEnabled", 0 != 0 ? "true" : "false");
                }
                String C = com.ironsource.environment.h.C(context);
                if (!TextUtils.isEmpty(C)) {
                    jSONObject5.put("asid", C);
                }
                String z = com.ironsource.environment.h.z(context);
                if (!TextUtils.isEmpty(z)) {
                    jSONObject5.put("auid", z);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("applicationKey", E.a().j);
                jSONObject6.put("SDKVersion", IronSourceUtils.getSDKVersion());
                jSONObject6.put("clientParams", jSONObject5);
                jSONObject6.put(IronSourceConstants.KEY_SESSION_DEPTH, i);
                jSONObject6.put("sessionId", str);
                jSONObject6.put("instances", jSONObject);
                jSONObject6.put("auctionData", bVar.c);
                jSONObject6.put("metaData", jSONObject4);
                return jSONObject6;
            }
        } catch (Exception unused2) {
            str2 = "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject a(String str, boolean z, Map<String, Object> map, List<String> list, C0115i c0115i, int i, ISBannerSize iSBannerSize) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("instp", 2);
            jSONObject3.put("badt", new JSONObject((Map) map.get(next)));
            if (c0115i != null) {
                str2 = c0115i.a(next);
            }
            jSONObject3.put("prfm", str2);
            jSONObject2.put(next, jSONObject3);
        }
        if (list != null) {
            for (String str3 : list) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("instp", 1);
                jSONObject4.put("prfm", c0115i != null ? c0115i.a(str3) : "");
                jSONObject2.put(str3, jSONObject4);
            }
        }
        jSONObject.put("inst", jSONObject2);
        JSONObject a2 = com.ironsource.environment.j.a(new com.ironsource.environment.a.b().a);
        Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        JSONObject a3 = com.ironsource.environment.c.b.a(a2.optJSONObject("md"));
        if (a3 != null) {
            a2.put("md", a3);
        }
        a2.put("sd", i);
        a2.put("scr", b() - 1);
        jSONObject.put("ctdt", a2);
        if (iSBannerSize != null) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("bns", iSBannerSize.getDescription());
            jSONObject5.put("bnw", iSBannerSize.getWidth());
            jSONObject5.put("bnh", iSBannerSize.getHeight());
            jSONObject.put("bndt", jSONObject5);
        }
        jSONObject.put("adu", str);
        jSONObject.put("dner", !z ? 1 : 0);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, List<String> list) {
        ae a2 = ae.a();
        a2.a(ae.c());
        a2.a(ae.b());
        JSONObject a3 = a(a2.a, list.isEmpty() ? com.ironsource.environment.l.a : list);
        a(a3, b(jSONObject, list));
        if (!list.isEmpty()) {
            jSONObject2 = a(jSONObject2, list);
        }
        a(a3, jSONObject2);
        return a3;
    }
}
