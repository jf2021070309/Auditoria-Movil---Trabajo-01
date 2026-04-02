package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.codeless.internal.Constants;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ae {
    private static ae b;
    JSONObject a = new JSONObject();

    private ae() {
    }

    public static synchronized ae a() {
        ae aeVar;
        synchronized (ae.class) {
            if (b == null) {
                b = new ae();
            }
            aeVar = b;
        }
        return aeVar;
    }

    static /* synthetic */ JSONObject a(ae aeVar) {
        return d();
    }

    static /* synthetic */ void a(ae aeVar, JSONObject jSONObject) {
        aeVar.a(jSONObject);
    }

    private synchronized void a(String str, Object obj) {
        try {
            this.a.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        int k = com.ironsource.environment.h.k();
        int l = com.ironsource.environment.h.l();
        float o = com.ironsource.environment.h.o();
        if (applicationContext != null) {
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C0110d.a().c;
                concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b.a().d());
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                Boolean bool = E.a().x;
                if (bool != null) {
                    jSONObject.put("consent", bool.booleanValue());
                }
                String C = com.ironsource.environment.h.C(applicationContext);
                if (!TextUtils.isEmpty(C)) {
                    jSONObject.put("asid", C);
                }
                jSONObject.put("connT", IronSourceUtils.getConnectionType(applicationContext));
                jSONObject.put("dVol", com.ironsource.environment.h.m(applicationContext));
                jSONObject.put("root", com.ironsource.environment.h.j());
                jSONObject.put("bat", com.ironsource.environment.h.w(applicationContext));
                jSONObject.put("diskFS", com.ironsource.environment.h.p());
                jSONObject.put("MD", jSONObject2);
                jSONObject.put("cTime", new Date().getTime());
                jSONObject.put("dWidth", k);
                jSONObject.put("dHeight", l);
                jSONObject.put("dScrenScle", String.valueOf(o));
                jSONObject.put("sDepIS", com.ironsource.mediationsdk.utils.n.a().b(2));
                jSONObject.put("sDepRV", com.ironsource.mediationsdk.utils.n.a().b(1));
                jSONObject.put("UA", com.ironsource.environment.h.r());
            } catch (JSONException e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String language = applicationContext.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put("dLang", language.toUpperCase(Locale.ENGLISH));
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    jSONObject.put("plType", pluginType);
                }
                String e = com.ironsource.environment.h.e();
                if (e != null) {
                    jSONObject.put("dOSVF", e);
                    jSONObject.put("dOSV", e.replaceAll("[^0-9/.]", ""));
                }
                String z = com.ironsource.environment.h.z(applicationContext);
                if (z != null) {
                    jSONObject.put("auid", z);
                }
                jSONObject.put("sId", IronSourceUtils.getSessionId());
                jSONObject.put("appKey", E.a().j);
                jSONObject.put("mCar", com.ironsource.environment.h.j(applicationContext));
                jSONObject.put("medV", IronSourceUtils.getSDKVersion());
                jSONObject.put("dModel", Build.MODEL);
                jSONObject.put("dOS", Constants.PLATFORM);
                jSONObject.put("dMake", Build.MANUFACTURER);
                jSONObject.put("dAPI", String.valueOf(Build.VERSION.SDK_INT));
                jSONObject.put("bId", applicationContext.getPackageName());
                jSONObject.put("appV", com.ironsource.environment.c.c(applicationContext, applicationContext.getPackageName()));
                jSONObject.put("usId", E.a().k);
            } catch (JSONException e2) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:3|4|5|(1:7)(1:26)|8|(2:9|10)|11|(1:13)(2:19|(1:21))|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject d() {
        /*
            java.lang.String r0 = ""
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r2 = r2.getApplicationContext()
            if (r2 == 0) goto L72
            r3 = 0
            java.lang.String[] r4 = com.ironsource.environment.h.a(r2)     // Catch: java.lang.Exception -> L30
            r5 = r4[r3]     // Catch: java.lang.Exception -> L30
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L30
            if (r5 != 0) goto L21
            r5 = r4[r3]     // Catch: java.lang.Exception -> L30
            goto L22
        L21:
            r5 = r0
        L22:
            r6 = 1
            r4 = r4[r6]     // Catch: java.lang.Exception -> L2e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L2e
            boolean r3 = r4.booleanValue()     // Catch: java.lang.Exception -> L2e
            goto L49
        L2e:
            r4 = move-exception
            goto L32
        L30:
            r4 = move-exception
            r5 = r0
        L32:
            com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "got the following error "
            r7.<init>(r8)
            java.lang.String r4 = r4.getMessage()
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.error(r4)
        L49:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L52
            java.lang.String r0 = "GAID"
            goto L5e
        L52:
            java.lang.String r5 = com.ironsource.environment.h.y(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L5e
            java.lang.String r0 = "UUID"
        L5e:
            java.lang.String r2 = "advId"
            r1.put(r2, r5)     // Catch: java.lang.Exception -> L6e
            java.lang.String r2 = "advType"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = "isLAT"
            r1.put(r0, r3)     // Catch: java.lang.Exception -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.ae.d():org.json.JSONObject");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a(next, jSONObject.opt(next));
        }
    }
}
