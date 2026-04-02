package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.facebook.appevents.AppEventsConstants;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.process.UMProcessDBHelper;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.utils.JSONArraySortUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: CoreProtocolImpl.java */
/* loaded from: classes3.dex */
public class o {
    private static final String l = "first_activate_time";
    private static final String m = "ana_is_f";
    private static final String n = "thtstart";
    private static final String o = "dstk_last_time";
    private static final String p = "dstk_cnt";
    private static final String q = "gkvc";
    private static final String r = "ekvc";
    private static final String t = "-1";
    private static final String x = "com.umeng.umcrash.UMCrashUtils";
    private c b;
    private SharedPreferences c;
    private String d;
    private String e;
    private int f;
    private JSONArray g;
    private final int h;
    private int i;
    private int j;
    private long k;
    private final long s;
    private boolean u;
    private boolean v;
    private Object w;
    private static Context a = null;
    private static Class<?> y = null;
    private static Method z = null;

    /* compiled from: CoreProtocolImpl.java */
    /* loaded from: classes3.dex */
    public static class a {
        public static final int A = 8210;
        public static final int B = 8211;
        public static final int C = 8212;
        public static final int D = 8213;
        public static final int E = 8214;
        public static final int F = 8215;
        public static final int a = 4097;
        public static final int b = 4098;
        public static final int c = 4099;
        public static final int d = 4100;
        public static final int e = 4101;
        public static final int f = 4102;
        public static final int g = 4103;
        public static final int h = 4104;
        public static final int i = 4105;
        public static final int j = 4106;
        public static final int k = 4352;
        public static final int l = 4353;
        public static final int m = 4354;
        public static final int n = 4355;
        public static final int o = 4356;
        public static final int p = 4357;
        public static final int q = 8193;
        public static final int r = 8194;
        public static final int s = 8195;
        public static final int t = 8196;
        public static final int u = 8197;
        public static final int v = 8199;
        public static final int w = 8200;
        public static final int x = 8201;
        public static final int y = 8208;
        public static final int z = 8209;
    }

    static {
        h();
    }

    private static void h() {
        try {
            Class<?> cls = Class.forName(x);
            if (cls != null) {
                y = cls;
                Method declaredMethod = cls.getDeclaredMethod("setPuidAndProvider", String.class, String.class);
                if (declaredMethod != null) {
                    z = declaredMethod;
                }
            }
        } catch (Throwable th) {
        }
    }

    private o() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 10;
        this.g = new JSONArray();
        this.h = 5000;
        this.i = 0;
        this.j = 0;
        this.k = 0L;
        this.s = 28800000L;
        this.u = false;
        this.v = false;
        this.w = new Object();
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(a);
            this.k = sharedPreferences.getLong(n, 0L);
            this.i = sharedPreferences.getInt(q, 0);
            this.j = sharedPreferences.getInt(r, 0);
            this.b = new c();
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CoreProtocolImpl.java */
    /* loaded from: classes3.dex */
    public static class b {
        private static final o a = new o();

        private b() {
        }
    }

    public static o a(Context context) {
        if (a == null && context != null) {
            a = context.getApplicationContext();
        }
        return b.a;
    }

    public void a() {
        if (a != null) {
            synchronized (this.w) {
                if (this.u) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> network is now available, rebuild instant session data packet.");
                    Context context = a;
                    UMWorkDispatch.sendEvent(context, a.l, CoreProtocol.getInstance(context), null);
                }
            }
            synchronized (this.w) {
                if (this.v) {
                    Context context2 = a;
                    UMWorkDispatch.sendEvent(context2, a.m, CoreProtocol.getInstance(context2), null);
                }
            }
        }
    }

    public void b() {
    }

    public void c() {
        b(a);
        d();
        a(true);
    }

    private void a(String str, String str2) {
        Method method;
        Class<?> cls = y;
        if (cls == null || (method = z) == null) {
            return;
        }
        try {
            method.invoke(cls, str, str2);
        } catch (Throwable th) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> reflect call setPuidAndProvider method of crash lib failed.");
        }
    }

    public void a(Object obj, int i) {
        if (com.umeng.commonsdk.utils.c.a()) {
            if (i == 4357) {
                try {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> clean db in silent mode.");
                    h.a(a);
                    com.umeng.commonsdk.utils.c.c(a);
                } catch (Throwable th) {
                }
            } else {
                return;
            }
        }
        if (!AnalyticsConfig.enable) {
            return;
        }
        switch (i) {
            case 4097:
                try {
                    if (UMUtils.isMainProgress(a)) {
                        if (obj != null) {
                            e(obj);
                        }
                        if (!"-1".equals(((JSONObject) obj).optString("__i"))) {
                            a(false);
                            return;
                        }
                        return;
                    }
                    UMProcessDBHelper.getInstance(a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(a), new JSONArray().put(obj));
                    return;
                } catch (Throwable th2) {
                    return;
                }
            case 4098:
                if (obj != null) {
                    try {
                        e(obj);
                    } catch (Throwable th3) {
                        return;
                    }
                }
                if (!"-1".equals(((JSONObject) obj).optString("__i"))) {
                    a(false);
                    return;
                }
                return;
            case 4099:
                v.a(a);
                return;
            case a.d /* 4100 */:
                l.c(a);
                return;
            case a.e /* 4101 */:
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNIN");
                a((Object) null, true);
                g(obj);
                return;
            case a.f /* 4102 */:
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNOFF");
                a((Object) null, true);
                f(obj);
                return;
            case a.g /* 4103 */:
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> START_SESSION");
                u.a().a(a, obj);
                synchronized (this.w) {
                    this.v = true;
                }
                return;
            case a.h /* 4104 */:
                u.a().c(a, obj);
                return;
            case a.i /* 4105 */:
                d();
                return;
            case a.j /* 4106 */:
                h(obj);
                return;
            default:
                switch (i) {
                    case a.k /* 4352 */:
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> INSTANT_SESSION_START");
                        u.a().b(a, obj);
                        synchronized (this.w) {
                            this.u = true;
                        }
                        return;
                    case a.l /* 4353 */:
                        a(obj, true);
                        return;
                    case a.m /* 4354 */:
                        c();
                        return;
                    case a.n /* 4355 */:
                        try {
                            if (UMUtils.isMainProgress(a)) {
                                if (obj != null) {
                                    e(obj);
                                    d();
                                }
                            } else {
                                UMProcessDBHelper.getInstance(a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(a), new JSONArray().put(obj));
                            }
                            return;
                        } catch (Throwable th4) {
                            return;
                        }
                    case a.o /* 4356 */:
                        if (obj == null || y == null || z == null) {
                            return;
                        }
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_CHANGE_NOTIFY");
                        try {
                            String str = "";
                            String str2 = "";
                            if (obj instanceof JSONObject) {
                                JSONObject jSONObject = (JSONObject) obj;
                                if (jSONObject.has("uid") && jSONObject.has(com.umeng.analytics.pro.d.M)) {
                                    str = jSONObject.getString(com.umeng.analytics.pro.d.M);
                                    str2 = jSONObject.getString("uid");
                                }
                                a(str2, str);
                                return;
                            }
                            return;
                        } catch (Throwable th5) {
                            return;
                        }
                    default:
                        switch (i) {
                            case a.s /* 8195 */:
                                com.umeng.analytics.b.a().a(obj);
                                return;
                            case a.t /* 8196 */:
                                com.umeng.analytics.b.a().m();
                                return;
                            case a.u /* 8197 */:
                                com.umeng.analytics.b.a().k();
                                return;
                            default:
                                switch (i) {
                                    case a.v /* 8199 */:
                                    case a.w /* 8200 */:
                                        com.umeng.analytics.b.a().b(obj);
                                        return;
                                    case a.x /* 8201 */:
                                        com.umeng.analytics.b.a().b((Object) null);
                                        return;
                                    default:
                                        switch (i) {
                                            case a.y /* 8208 */:
                                                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> receive DELAY_BUILD_ENVELOPE event.");
                                                Context context = a;
                                                UMWorkDispatch.sendEvent(context, a.z, CoreProtocol.getInstance(context), null);
                                                Context context2 = a;
                                                UMWorkDispatch.sendEvent(context2, a.m, CoreProtocol.getInstance(context2), null);
                                                return;
                                            case a.z /* 8209 */:
                                                a(obj, false);
                                                return;
                                            case a.A /* 8210 */:
                                                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> recv BUILD_ENVELOPE_IMMEDIATELY.");
                                                try {
                                                    if (!UMUtils.isMainProgress(a) || (this.b.c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                                                        return;
                                                    }
                                                    a(true);
                                                    return;
                                                } catch (Throwable th6) {
                                                    return;
                                                }
                                            default:
                                                switch (i) {
                                                    case a.D /* 8213 */:
                                                        if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                                                            if (DeviceConfig.getGlobleActivity(a) != null) {
                                                                u.b(a);
                                                            }
                                                            Context context3 = a;
                                                            UMWorkDispatch.sendEventEx(context3, a.D, CoreProtocol.getInstance(context3), null, PushUIConfig.dismissTime);
                                                            return;
                                                        }
                                                        return;
                                                    case a.E /* 8214 */:
                                                        if (obj != null && (obj instanceof JSONObject)) {
                                                            try {
                                                                String optString = ((JSONObject) obj).optString(AnalyticsConfig.RTD_START_TIME);
                                                                String optString2 = ((JSONObject) obj).optString(AnalyticsConfig.RTD_PERIOD);
                                                                String optString3 = ((JSONObject) obj).optString(AnalyticsConfig.DEBUG_KEY);
                                                                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                                                                    com.umeng.common.b.a(a, AnalyticsConfig.RTD_SP_FILE, AnalyticsConfig.RTD_START_TIME, optString);
                                                                    com.umeng.common.b.a(a, AnalyticsConfig.RTD_SP_FILE, AnalyticsConfig.RTD_PERIOD, optString2);
                                                                    com.umeng.common.b.a(a, AnalyticsConfig.RTD_SP_FILE, AnalyticsConfig.DEBUG_KEY, optString3);
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (Throwable th7) {
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    case a.F /* 8215 */:
                                                        com.umeng.common.b.a(a, AnalyticsConfig.RTD_SP_FILE);
                                                        return;
                                                    default:
                                                        return;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public void a(boolean z2) {
        if (c(z2)) {
            if (this.b.c() instanceof ReportPolicy.ReportQuasiRealtime) {
                if (z2) {
                    if (UMEnvelopeBuild.isOnline(a)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send session start in policy ReportQuasiRealtime.");
                        j();
                    }
                } else if (UMEnvelopeBuild.isReadyBuild(a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send normal data in policy ReportQuasiRealtime.");
                    j();
                }
            } else if (UMEnvelopeBuild.isReadyBuild(a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> constructMessage()");
                j();
            }
        }
    }

    private void i() {
        JSONObject b2 = b(UMEnvelopeBuild.maxDataSpace(a));
        if (b2 == null || b2.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) b2.opt("header");
        JSONObject jSONObject2 = (JSONObject) b2.opt("content");
        if (a != null && jSONObject != null && jSONObject2 != null) {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> constructInstantMessage: request build envelope.");
            JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(a, jSONObject, jSONObject2);
            if (buildEnvelopeWithExtHeader != null) {
                try {
                    if (buildEnvelopeWithExtHeader.has("exception")) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
                    }
                } catch (Throwable th) {
                }
                if (UMConfigure.isDebugLog()) {
                    e(buildEnvelopeWithExtHeader);
                }
                b((Object) buildEnvelopeWithExtHeader);
            }
        }
    }

    private void j() {
        JSONObject buildEnvelopeWithExtHeader;
        JSONObject a2 = a(UMEnvelopeBuild.maxDataSpace(a));
        if (a2 == null || a2.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) a2.opt("header");
        JSONObject jSONObject2 = (JSONObject) a2.opt("content");
        Context context = a;
        if (context != null && jSONObject != null && jSONObject2 != null && (buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2)) != null) {
            try {
                if (buildEnvelopeWithExtHeader.has("exception")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
                }
            } catch (Throwable th) {
            }
            if (UMConfigure.isDebugLog()) {
                d(buildEnvelopeWithExtHeader);
            }
            a((Object) buildEnvelopeWithExtHeader);
        }
    }

    private boolean a(JSONArray jSONArray) {
        int length = jSONArray.length();
        List asList = Arrays.asList("$$_onUMengEnterForeground", "$$_onUMengEnterBackground", "$$_onUMengEnterForegroundInitError");
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null && asList.contains(optJSONObject.optString("id"))) {
                    i++;
                }
            } catch (Throwable th) {
            }
        }
        if (i < length) {
            return false;
        }
        return true;
    }

    private boolean a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("ekv");
        int length = optJSONArray.length();
        if (optJSONArray != null) {
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray(keys.next());
                        if (optJSONArray2 != null && a(optJSONArray2)) {
                            i++;
                        }
                    }
                } catch (Throwable th) {
                }
            }
            if (i >= length) {
                return true;
            }
        }
        return false;
    }

    public JSONObject a(long j) {
        if (TextUtils.isEmpty(y.a().d(a))) {
            return null;
        }
        JSONObject b2 = b(false);
        int a2 = r.a().a(a);
        if (b2.length() <= 0) {
            if (a2 != 3) {
                return null;
            }
        } else {
            if (b2.length() == 1) {
                if (b2.optJSONObject(com.umeng.analytics.pro.d.L) != null && a2 != 3) {
                    return null;
                }
                if (!TextUtils.isEmpty(b2.optString("userlevel")) && a2 != 3) {
                    return null;
                }
            } else if (b2.length() == 2 && b2.optJSONObject(com.umeng.analytics.pro.d.L) != null && !TextUtils.isEmpty(b2.optString("userlevel")) && a2 != 3) {
                return null;
            }
            String optString = b2.optString(com.umeng.analytics.pro.d.n);
            String optString2 = b2.optString(com.umeng.analytics.pro.d.T);
            String optString3 = b2.optString("ekv");
            if (TextUtils.isEmpty(optString) && TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && a(b2)) {
                return null;
            }
        }
        JSONObject l2 = l();
        if (l2 != null) {
            c(l2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (a2 == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (b2 != null && b2.length() > 0) {
                jSONObject2.put("analytics", b2);
            }
            if (l2 != null && l2.length() > 0) {
                jSONObject.put("header", l2);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            return a(jSONObject, j);
        } catch (Throwable th) {
            return jSONObject;
        }
    }

    private void b(JSONObject jSONObject) {
        JSONObject f;
        if (!i.a(UMGlobalContext.getAppContext(a)).c() && (f = i.a(UMGlobalContext.getAppContext(a)).f()) != null) {
            String optString = f.optString("__av");
            String optString2 = f.optString("__vc");
            try {
                if (TextUtils.isEmpty(optString)) {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMUtils.getAppVersionName(a));
                } else {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), optString);
                }
                if (TextUtils.isEmpty(optString2)) {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), UMUtils.getAppVersionCode(a));
                } else {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), optString2);
                }
            } catch (Throwable th) {
            }
        }
    }

    public JSONObject b(long j) {
        if (TextUtils.isEmpty(y.a().d(UMGlobalContext.getAppContext(a)))) {
            return null;
        }
        JSONObject b2 = i.a(UMGlobalContext.getAppContext(a)).b(false);
        String[] a2 = com.umeng.analytics.c.a(a);
        if (a2 != null && !TextUtils.isEmpty(a2[0]) && !TextUtils.isEmpty(a2[1])) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(com.umeng.analytics.pro.d.M, a2[0]);
                jSONObject.put(com.umeng.analytics.pro.d.N, a2[1]);
                if (jSONObject.length() > 0) {
                    b2.put(com.umeng.analytics.pro.d.L, jSONObject);
                }
            } catch (Throwable th) {
            }
        }
        int a3 = r.a().a(a);
        if (b2.length() != 1 || b2.optJSONObject(com.umeng.analytics.pro.d.L) == null || a3 == 3) {
            r.a().b(b2, a);
            if (b2.length() > 0 || a3 == 3) {
                JSONObject k = k();
                if (k != null) {
                    b(k);
                }
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    if (a3 == 3) {
                        jSONObject3.put("analytics", new JSONObject());
                    } else if (b2 != null && b2.length() > 0) {
                        jSONObject3.put("analytics", b2);
                    }
                    if (k != null && k.length() > 0) {
                        jSONObject2.put("header", k);
                    }
                    if (jSONObject3.length() > 0) {
                        jSONObject2.put("content", jSONObject3);
                    }
                    return b(jSONObject2, j);
                } catch (Throwable th2) {
                    return jSONObject2;
                }
            }
            return null;
        }
        return null;
    }

    private JSONObject a(JSONObject jSONObject, long j) {
        try {
            if (q.a(jSONObject) > j) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("header");
                jSONObject2.put(com.umeng.analytics.pro.d.aB, q.a(jSONObject));
                jSONObject.put("header", jSONObject2);
                return q.a(a, j, jSONObject);
            }
            return jSONObject;
        } catch (Throwable th) {
            return jSONObject;
        }
    }

    private JSONObject b(JSONObject jSONObject, long j) {
        try {
            if (q.a(jSONObject) > j) {
                jSONObject = null;
                i.a(a).a(true, false);
                i.a(a).b();
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> Instant session packet overload !!! ");
                return null;
            }
            return jSONObject;
        } catch (Throwable th) {
            return jSONObject;
        }
    }

    private JSONObject k() {
        JSONObject l2 = l();
        if (l2 != null) {
            try {
                l2.put("st", "1");
            } catch (Throwable th) {
            }
        }
        return l2;
    }

    private void c(JSONObject jSONObject) {
        if (!i.a(a).e()) {
            JSONObject g = i.a(a).g();
            if (g != null) {
                String optString = g.optString("__av");
                String optString2 = g.optString("__vc");
                try {
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMUtils.getAppVersionName(a));
                    } else {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), optString);
                    }
                    if (TextUtils.isEmpty(optString2)) {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), UMUtils.getAppVersionCode(a));
                        return;
                    } else {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), optString2);
                        return;
                    }
                } catch (Throwable th) {
                    return;
                }
            }
            return;
        }
        try {
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMUtils.getAppVersionName(a));
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("version_code"), UMUtils.getAppVersionCode(a));
        } catch (Throwable th2) {
        }
    }

    private JSONObject l() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (AnalyticsConfig.mWrapperType != null && AnalyticsConfig.mWrapperVersion != null) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("wrapper_version"), AnalyticsConfig.mWrapperVersion);
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("wrapper_type"), AnalyticsConfig.mWrapperType);
            }
            int verticalType = AnalyticsConfig.getVerticalType(a);
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.i), verticalType);
            String str = "9.6.1";
            if (verticalType == 1) {
                String gameSdkVersion = AnalyticsConfig.getGameSdkVersion(a);
                if (!TextUtils.isEmpty(gameSdkVersion)) {
                    str = gameSdkVersion;
                }
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("sdk_version"), str);
            } else {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("sdk_version"), "9.6.1");
            }
            String MD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(a));
            if (!TextUtils.isEmpty(MD5)) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a("secret"), MD5);
            }
            String imprintProperty = UMEnvelopeBuild.imprintProperty(a, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(a);
            String imprintProperty2 = UMEnvelopeBuild.imprintProperty(a, com.umeng.analytics.pro.d.an, "");
            if (!TextUtils.isEmpty(imprintProperty2)) {
                if (AnalyticsConfig.CLEAR_EKV_BL) {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.ap), "");
                } else {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.ap), imprintProperty2);
                }
            }
            String imprintProperty3 = UMEnvelopeBuild.imprintProperty(a, com.umeng.analytics.pro.d.ao, "");
            if (!TextUtils.isEmpty(imprintProperty3)) {
                if (AnalyticsConfig.CLEAR_EKV_WL) {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.aq), "");
                } else {
                    jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.aq), imprintProperty3);
                }
            }
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.ah), "1.0.0");
            if (s()) {
                jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.aj), "1");
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong(m, 0L).commit();
                }
            }
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.l), m());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.m), n());
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("vers_name", "");
                if (!TextUtils.isEmpty(string)) {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (TextUtils.isEmpty(imprintProperty)) {
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.l), sharedPreferences.getString("vers_pre_version", AppEventsConstants.EVENT_PARAM_VALUE_NO));
                        jSONObject.put(com.umeng.commonsdk.statistics.b.a(com.umeng.analytics.pro.d.m), sharedPreferences.getString("vers_date", format));
                    }
                    sharedPreferences.edit().putString("pre_version", string).putString("cur_version", DeviceConfig.getAppVersionName(a)).putString("pre_date", format).remove("vers_name").remove("vers_code").remove("vers_date").remove("vers_pre_version").commit();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public JSONObject b(boolean z2) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject = null;
        try {
            jSONObject = i.a(a).a(z2);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            } else {
                try {
                    if (jSONObject.has(com.umeng.analytics.pro.d.n)) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray(com.umeng.analytics.pro.d.n);
                        JSONArray jSONArray4 = new JSONArray();
                        int i = 0;
                        while (i < jSONArray3.length()) {
                            JSONObject jSONObject2 = (JSONObject) jSONArray3.get(i);
                            JSONArray optJSONArray = jSONObject2.optJSONArray(com.umeng.analytics.pro.d.t);
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray(com.umeng.analytics.pro.d.u);
                            if (optJSONArray == null && optJSONArray2 != null) {
                                jSONObject2.put(com.umeng.analytics.pro.d.t, optJSONArray2);
                                jSONObject2.remove(com.umeng.analytics.pro.d.u);
                            }
                            if (optJSONArray != null && optJSONArray2 != null) {
                                ArrayList<JSONObject> arrayList = new ArrayList();
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    arrayList.add((JSONObject) optJSONArray.get(i2));
                                }
                                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                    arrayList.add((JSONObject) optJSONArray2.get(i3));
                                }
                                JSONArraySortUtil jSONArraySortUtil = new JSONArraySortUtil();
                                jSONArraySortUtil.setCompareKey(com.umeng.analytics.pro.d.x);
                                Collections.sort(arrayList, jSONArraySortUtil);
                                JSONArray jSONArray5 = new JSONArray();
                                for (JSONObject jSONObject3 : arrayList) {
                                    jSONArray5.put(jSONObject3);
                                }
                                jSONObject2.put(com.umeng.analytics.pro.d.t, jSONArray5);
                                jSONObject2.remove(com.umeng.analytics.pro.d.u);
                            }
                            if (jSONObject2.has(com.umeng.analytics.pro.d.t)) {
                                JSONArray optJSONArray3 = jSONObject2.optJSONArray(com.umeng.analytics.pro.d.t);
                                int i4 = 0;
                                while (i4 < optJSONArray3.length()) {
                                    JSONObject jSONObject4 = optJSONArray3.getJSONObject(i4);
                                    if (!jSONObject4.has(com.umeng.analytics.pro.d.x)) {
                                        jSONArray2 = jSONArray3;
                                    } else {
                                        jSONArray2 = jSONArray3;
                                        jSONObject4.put("ts", jSONObject4.getLong(com.umeng.analytics.pro.d.x));
                                        jSONObject4.remove(com.umeng.analytics.pro.d.x);
                                    }
                                    i4++;
                                    jSONArray3 = jSONArray2;
                                }
                                jSONArray = jSONArray3;
                                jSONObject2.put(com.umeng.analytics.pro.d.t, optJSONArray3);
                                jSONObject2.put(com.umeng.analytics.pro.d.z, optJSONArray3.length());
                            } else {
                                jSONArray = jSONArray3;
                                jSONObject2.put(com.umeng.analytics.pro.d.z, 0);
                            }
                            jSONArray4.put(jSONObject2);
                            i++;
                            jSONArray3 = jSONArray;
                        }
                        jSONObject.put(com.umeng.analytics.pro.d.n, jSONArray4);
                    }
                } catch (Exception e) {
                    MLog.e("merge pages error");
                    e.printStackTrace();
                }
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(a);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("userlevel", string);
                }
            }
            String[] a2 = com.umeng.analytics.c.a(a);
            if (a2 != null && !TextUtils.isEmpty(a2[0]) && !TextUtils.isEmpty(a2[1])) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(com.umeng.analytics.pro.d.M, a2[0]);
                jSONObject5.put(com.umeng.analytics.pro.d.N, a2[1]);
                if (jSONObject5.length() > 0) {
                    jSONObject.put(com.umeng.analytics.pro.d.L, jSONObject5);
                }
            }
            if (ABTest.getService(a).isInTest()) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(ABTest.getService(a).getTestName(), ABTest.getService(a).getGroupInfo());
                jSONObject.put(com.umeng.analytics.pro.d.K, jSONObject6);
            }
            r.a().a(jSONObject, a);
        } catch (Throwable th) {
        }
        return jSONObject;
    }

    private String m() {
        String str = null;
        try {
            str = UMEnvelopeBuild.imprintProperty(a, "pr_ve", null);
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.d)) {
                    return this.d;
                }
                if (this.c == null) {
                    this.c = PreferenceWrapper.getDefault(a);
                }
                String string = this.c.getString("pre_version", "");
                String appVersionName = DeviceConfig.getAppVersionName(a);
                if (!TextUtils.isEmpty(string)) {
                    String string2 = this.c.getString("cur_version", "");
                    if (!appVersionName.equals(string2)) {
                        this.c.edit().putString("pre_version", string2).putString("cur_version", appVersionName).commit();
                        str = string2;
                    } else {
                        str = string;
                    }
                } else {
                    this.c.edit().putString("pre_version", AppEventsConstants.EVENT_PARAM_VALUE_NO).putString("cur_version", appVersionName).commit();
                    str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
            }
        } catch (Throwable th) {
        }
        this.d = str;
        return str;
    }

    private String n() {
        String str = null;
        try {
            str = UMEnvelopeBuild.imprintProperty(a, "ud_da", null);
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.e)) {
                    return this.e;
                }
                if (this.c == null) {
                    this.c = PreferenceWrapper.getDefault(a);
                }
                String string = this.c.getString("pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.c.edit().putString("pre_date", format).commit();
                    str = format;
                } else {
                    String format2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(format2)) {
                        this.c.edit().putString("pre_date", format2).commit();
                        str = format2;
                    } else {
                        str = string;
                    }
                }
            }
        } catch (Throwable th) {
        }
        this.e = str;
        return str;
    }

    public void d() {
        try {
            if (this.g.length() > 0) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** flushMemoryData: 事件落库。");
                i.a(a).a(this.g);
                this.g = new JSONArray();
            }
            PreferenceWrapper.getDefault(a).edit().putLong(n, this.k).putInt(q, this.i).putInt(r, this.j).commit();
        } catch (Throwable th) {
        }
    }

    /* compiled from: CoreProtocolImpl.java */
    /* loaded from: classes3.dex */
    public static class d {
        private Map<String, Object> a;
        private String b;
        private String c;
        private long d;

        private d() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = 0L;
        }

        public d(String str, Map<String, Object> map, String str2, long j) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = 0L;
            this.a = map;
            this.b = str;
            this.d = j;
            this.c = str2;
        }

        public Map<String, Object> a() {
            return this.a;
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.b;
        }

        public long d() {
            return this.d;
        }
    }

    private void e(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (!a(this.k, this.i)) {
                    return;
                }
                this.i++;
            } else if (2049 == jSONObject.getInt("__t")) {
                if (!a(this.k, this.j)) {
                    return;
                }
                this.j++;
            }
            if (AnalyticsConfig.isRealTimeDebugMode()) {
                if (this.g == null) {
                    this.g = new JSONArray();
                }
                this.g.put(jSONObject);
                i.a(a).a(this.g);
                this.g = new JSONArray();
                return;
            }
            if (this.g.length() >= this.f) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** 超过10个事件，事件落库。");
                i.a(a).a(this.g);
                this.g = new JSONArray();
            }
            if (this.k == 0) {
                this.k = System.currentTimeMillis();
            }
            this.g.put(jSONObject);
        } catch (Throwable th) {
            MLog.e(th);
        }
    }

    private boolean a(long j, int i) {
        if (j != 0) {
            if (System.currentTimeMillis() - j <= 28800000) {
                return i < 5000;
            }
            o();
            return true;
        }
        return true;
    }

    private void o() {
        try {
            this.i = 0;
            this.j = 0;
            this.k = System.currentTimeMillis();
            PreferenceWrapper.getDefault(a).edit().putLong(o, System.currentTimeMillis()).putInt(p, 0).commit();
        } catch (Throwable th) {
        }
    }

    private boolean c(boolean z2) {
        if (s() || AnalyticsConfig.isRealTimeDebugMode()) {
            return true;
        }
        if (this.b == null) {
            this.b = new c();
        }
        this.b.a();
        ReportPolicy.ReportStrategy c2 = this.b.c();
        boolean shouldSendMessage = c2.shouldSendMessage(z2);
        if (shouldSendMessage) {
            if (((c2 instanceof ReportPolicy.ReportByInterval) || (c2 instanceof ReportPolicy.DebugPolicy) || (c2 instanceof ReportPolicy.ReportQuasiRealtime)) && p()) {
                d();
            }
            if ((c2 instanceof ReportPolicy.DefconPolicy) && p()) {
                d();
            }
            if (UMConfigure.isDebugLog()) {
                MLog.d("数据发送策略 : " + c2.getClass().getSimpleName());
            }
        }
        return shouldSendMessage;
    }

    private boolean p() {
        try {
            if (!TextUtils.isEmpty(u.a().b())) {
                b(a);
            }
            if (this.g.length() > 0) {
                for (int i = 0; i < this.g.length(); i++) {
                    JSONObject optJSONObject = this.g.optJSONObject(i);
                    if (optJSONObject != null && optJSONObject.length() > 0) {
                        String optString = optJSONObject.optString("__i");
                        if (TextUtils.isEmpty(optString) || "-1".equals(optString)) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            return true;
        }
    }

    /* compiled from: CoreProtocolImpl.java */
    /* loaded from: classes3.dex */
    public static class c {
        private ReportPolicy.ReportStrategy a = null;
        private int b = -1;
        private int c = -1;
        private int d = -1;
        private int e = -1;
        private ABTest f;

        public c() {
            this.f = null;
            this.f = ABTest.getService(o.a);
        }

        public void a() {
            try {
                int[] a = a(-1, -1);
                this.b = a[0];
                this.c = a[1];
            } catch (Throwable th) {
            }
        }

        public int[] a(int i, int i2) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.a, "report_policy", "-1")).intValue();
            int intValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.a, "report_interval", "-1")).intValue();
            if (intValue == -1 || !ReportPolicy.isValid(intValue)) {
                return new int[]{i, i2};
            }
            if (6 == intValue) {
                if (intValue2 == -1 || intValue2 < 90 || intValue2 > 86400) {
                    intValue2 = 90;
                }
                return new int[]{intValue, intValue2 * 1000};
            } else if (11 == intValue) {
                if (intValue2 == -1 || intValue2 < 15 || intValue2 > 3600) {
                    intValue2 = 15;
                }
                return new int[]{intValue, intValue2 * 1000};
            } else {
                return new int[]{i, i2};
            }
        }

        public int a(int i) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.a, "test_report_interval", "-1")).intValue();
            if (intValue == -1 || intValue < 90 || intValue > 86400) {
                return i;
            }
            return intValue * 1000;
        }

        protected void b() {
            int i;
            Defcon service = Defcon.getService(o.a);
            if (service.isOpen()) {
                ReportPolicy.ReportStrategy reportStrategy = this.a;
                this.a = (reportStrategy instanceof ReportPolicy.DefconPolicy) && reportStrategy.isValid() ? this.a : new ReportPolicy.DefconPolicy(StatTracer.getInstance(o.a), service);
            } else {
                boolean z = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.a, "integrated_test", "-1")).intValue() == 1;
                if (UMConfigure.isDebugLog() && z && !MLog.DEBUG) {
                    UMLog.mutlInfo(j.K, 3, "\\|", null, null);
                }
                if (MLog.DEBUG && z) {
                    this.a = new ReportPolicy.DebugPolicy(StatTracer.getInstance(o.a));
                } else if (this.f.isInTest() && "RPT".equals(this.f.getTestName())) {
                    if (this.f.getTestPolicy() != 6) {
                        i = 0;
                    } else {
                        if (Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.a, "test_report_interval", "-1")).intValue() != -1) {
                            i = a(90000);
                        } else {
                            i = this.c;
                            if (i <= 0) {
                                i = this.e;
                            }
                        }
                    }
                    this.a = b(this.f.getTestPolicy(), i);
                } else {
                    int i2 = this.d;
                    int i3 = this.e;
                    int i4 = this.b;
                    if (i4 != -1) {
                        i3 = this.c;
                        i2 = i4;
                    }
                    this.a = b(i2, i3);
                }
            }
            if (UMConfigure.isDebugLog()) {
                try {
                    ReportPolicy.ReportStrategy reportStrategy2 = this.a;
                    if (reportStrategy2 instanceof ReportPolicy.ReportAtLaunch) {
                        UMLog.mutlInfo(j.I, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportByInterval) {
                        UMLog.mutlInfo(j.J, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportByInterval) reportStrategy2).getReportInterval() / 1000)});
                    } else if (reportStrategy2 instanceof ReportPolicy.DebugPolicy) {
                        UMLog.mutlInfo(j.L, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportQuasiRealtime) {
                        String[] strArr = {String.valueOf(((ReportPolicy.ReportQuasiRealtime) reportStrategy2).getReportInterval() / 1000)};
                        UMLog uMLog = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(j.M, 3, "", new String[]{"@"}, strArr);
                    } else {
                        boolean z2 = reportStrategy2 instanceof ReportPolicy.DefconPolicy;
                    }
                } catch (Throwable th) {
                }
            }
        }

        public ReportPolicy.ReportStrategy c() {
            b();
            return this.a;
        }

        private ReportPolicy.ReportStrategy b(int i, int i2) {
            if (i == 0) {
                ReportPolicy.ReportStrategy reportStrategy = this.a;
                return reportStrategy instanceof ReportPolicy.ReportRealtime ? reportStrategy : new ReportPolicy.ReportRealtime();
            } else if (i == 1) {
                ReportPolicy.ReportStrategy reportStrategy2 = this.a;
                return reportStrategy2 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy2 : new ReportPolicy.ReportAtLaunch();
            } else if (i == 4) {
                ReportPolicy.ReportStrategy reportStrategy3 = this.a;
                if (!(reportStrategy3 instanceof ReportPolicy.ReportDaily)) {
                    return new ReportPolicy.ReportDaily(StatTracer.getInstance(o.a));
                }
                return reportStrategy3;
            } else if (i == 5) {
                ReportPolicy.ReportStrategy reportStrategy4 = this.a;
                if (!(reportStrategy4 instanceof ReportPolicy.ReportWifiOnly)) {
                    return new ReportPolicy.ReportWifiOnly(o.a);
                }
                return reportStrategy4;
            } else if (i == 6) {
                ReportPolicy.ReportStrategy reportStrategy5 = this.a;
                if (reportStrategy5 instanceof ReportPolicy.ReportByInterval) {
                    ((ReportPolicy.ReportByInterval) reportStrategy5).setReportInterval(i2);
                    return reportStrategy5;
                }
                return new ReportPolicy.ReportByInterval(StatTracer.getInstance(o.a), i2);
            } else if (i == 8) {
                ReportPolicy.ReportStrategy reportStrategy6 = this.a;
                if (!(reportStrategy6 instanceof ReportPolicy.SmartPolicy)) {
                    return new ReportPolicy.SmartPolicy(StatTracer.getInstance(o.a));
                }
                return reportStrategy6;
            } else if (i == 11) {
                ReportPolicy.ReportStrategy reportStrategy7 = this.a;
                if (reportStrategy7 instanceof ReportPolicy.ReportQuasiRealtime) {
                    ((ReportPolicy.ReportQuasiRealtime) reportStrategy7).setReportInterval(i2);
                    return reportStrategy7;
                }
                ReportPolicy.ReportQuasiRealtime reportQuasiRealtime = new ReportPolicy.ReportQuasiRealtime();
                reportQuasiRealtime.setReportInterval(i2);
                return reportQuasiRealtime;
            } else {
                ReportPolicy.ReportStrategy reportStrategy8 = this.a;
                return reportStrategy8 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy8 : new ReportPolicy.ReportAtLaunch();
            }
        }
    }

    private void d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"));
                if (jSONObject4.has("ekv")) {
                    jSONObject3.put("ekv", jSONObject4.getJSONArray("ekv"));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]事件:" + jSONObject3.toString());
                        } else {
                            MLog.d("事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.T)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.T, jSONObject4.getJSONArray(com.umeng.analytics.pro.d.T));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]游戏事件:" + jSONObject3.toString());
                        } else {
                            MLog.d("游戏事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has("error")) {
                    jSONObject3.put("error", jSONObject4.getJSONArray("error"));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]错误:" + jSONObject3.toString());
                        } else {
                            MLog.d("错误:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(com.umeng.analytics.pro.d.n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            if (jSONObject5.has(com.umeng.analytics.pro.d.u)) {
                                jSONObject5.remove(com.umeng.analytics.pro.d.u);
                            }
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(com.umeng.analytics.pro.d.n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]会话:" + jSONObject3.toString());
                        } else {
                            MLog.d("会话:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.I)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.I, jSONObject4.getJSONObject(com.umeng.analytics.pro.d.I));
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.L)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.L, jSONObject4.getJSONObject(com.umeng.analytics.pro.d.L));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]账号:" + jSONObject3.toString());
                        } else {
                            MLog.d("账号:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has("dplus")) {
                jSONObject3.put("dplus", jSONObject.getJSONObject("dplus"));
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("header")) && (jSONObject2 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header"))) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("sdk_version"))) {
                    jSONObject3.put("sdk_version", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("sdk_version")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_id"))) {
                    jSONObject3.put("device_id", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_id")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_model"))) {
                    jSONObject3.put("device_model", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_model")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("version_code"))) {
                    jSONObject3.put("version", jSONObject2.getInt(com.umeng.commonsdk.statistics.b.a("version_code")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("appkey"))) {
                    jSONObject3.put("appkey", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("appkey")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("channel"))) {
                    jSONObject3.put("channel", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("channel")));
                }
                if (jSONObject3.length() > 0) {
                    MLog.d("基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.e(th);
        }
    }

    private void e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"));
                if (jSONObject4.has(com.umeng.analytics.pro.d.n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(com.umeng.analytics.pro.d.n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(com.umeng.analytics.pro.d.n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        MLog.d("本次启动会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.L)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.L, jSONObject4.getJSONObject(com.umeng.analytics.pro.d.L));
                    if (jSONObject3.length() > 0) {
                        MLog.d("本次启动账号:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("header")) && jSONObject.has(com.umeng.commonsdk.statistics.b.a("header")) && (jSONObject2 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header"))) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("sdk_version"))) {
                    jSONObject3.put("sdk_version", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("sdk_version")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_id"))) {
                    jSONObject3.put("device_id", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_id")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("device_model"))) {
                    jSONObject3.put("device_model", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("device_model")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("version_code"))) {
                    jSONObject3.put("version", jSONObject2.getInt(com.umeng.commonsdk.statistics.b.a("version_code")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("appkey"))) {
                    jSONObject3.put("appkey", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("appkey")));
                }
                if (jSONObject2.has(com.umeng.commonsdk.statistics.b.a("channel"))) {
                    jSONObject3.put("channel", jSONObject2.getString(com.umeng.commonsdk.statistics.b.a("channel")));
                }
                if (jSONObject3.length() > 0) {
                    MLog.d("本次启动基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.e(th);
        }
    }

    public void a(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has("exception")) {
                        if (101 != jSONObject.getInt("exception")) {
                            g(jSONObject);
                        }
                    } else {
                        g(jSONObject);
                    }
                }
            } catch (Throwable th) {
            }
        }
    }

    public void b(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has("exception")) {
                        if (101 != jSONObject.getInt("exception")) {
                            f(jSONObject);
                        }
                    } else {
                        f(jSONObject);
                    }
                }
            } catch (Throwable th) {
            }
        }
    }

    private void f(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            if (jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header")).has(com.umeng.analytics.pro.d.aB)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"));
                    if (jSONObject2.has(com.umeng.analytics.pro.d.n) && (optJSONObject2 = jSONObject2.getJSONArray(com.umeng.analytics.pro.d.n).optJSONObject(0)) != null) {
                        String optString = optJSONObject2.optString("id");
                        if (!TextUtils.isEmpty(optString)) {
                            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: really delete instant session data");
                            i.a(a).b(optString);
                        }
                    }
                }
                i.a(a).b();
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE.");
                Context context = a;
                UMWorkDispatch.sendEvent(context, a.l, CoreProtocol.getInstance(context), null);
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics")) && (optJSONObject = jSONObject.optJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"))) != null && optJSONObject.length() > 0 && optJSONObject.has(com.umeng.analytics.pro.d.n)) {
                i.a(a).a(true, false);
            }
            i.a(a).b();
        } catch (Exception e) {
        }
    }

    private void g(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            if (jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("header")).has(com.umeng.analytics.pro.d.aB)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics"))) {
                    if (jSONObject.getJSONObject(com.umeng.commonsdk.statistics.b.a("analytics")).has(com.umeng.analytics.pro.d.n)) {
                        i.a(a).i();
                        i.a(a).h();
                        i.a(a).b(true, false);
                        i.a(a).a();
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> Error, Should not go to this branch.");
                    }
                    return;
                }
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has(com.umeng.commonsdk.statistics.b.a("analytics")) && (optJSONObject = jSONObject.optJSONObject(com.umeng.commonsdk.statistics.b.a("analytics"))) != null && optJSONObject.length() > 0) {
                if (optJSONObject.has(com.umeng.analytics.pro.d.n)) {
                    i.a(a).b(true, false);
                }
                if (optJSONObject.has("ekv") || optJSONObject.has(com.umeng.analytics.pro.d.T)) {
                    i.a(a).h();
                }
                if (optJSONObject.has("error")) {
                    i.a(a).i();
                }
            }
            i.a(a).a();
        } catch (Exception e) {
        }
    }

    public void c(Object obj) {
        b(a);
        d();
        if (d(false)) {
            j();
        }
    }

    public void b(Context context) {
        try {
            i.a(context).d();
            q();
        } catch (Throwable th) {
        }
    }

    public void e() {
        if (d(false)) {
            j();
        }
    }

    public void d(Object obj) {
        r();
        m();
        n();
        a(true);
    }

    private boolean d(boolean z2) {
        if (this.b == null) {
            this.b = new c();
        }
        ReportPolicy.ReportStrategy c2 = this.b.c();
        if (c2 instanceof ReportPolicy.DefconPolicy) {
            if (z2) {
                return ((ReportPolicy.DefconPolicy) c2).shouldSendMessageByInstant();
            }
            return c2.shouldSendMessage(false);
        }
        return true;
    }

    public void a(Object obj, boolean z2) {
        if (z2) {
            if (d(true)) {
                i();
            }
        } else if (UMEnvelopeBuild.isOnline(a) && d(true)) {
            i();
        }
    }

    private void q() {
        if (this.g.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.g.length(); i++) {
                try {
                    JSONObject jSONObject = this.g.getJSONObject(i);
                    if (jSONObject != null && jSONObject.length() > 0) {
                        String optString = jSONObject.optString("__i");
                        String str = "-1";
                        if (TextUtils.isEmpty(optString) || "-1".equals(optString)) {
                            String b2 = u.a().b();
                            if (!TextUtils.isEmpty(b2)) {
                                str = b2;
                            }
                            jSONObject.put("__i", str);
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        jSONArray.put(jSONObject);
                    }
                } catch (Throwable th) {
                }
            }
            this.g = jSONArray;
        }
    }

    private void r() {
        Context context;
        SharedPreferences sharedPreferences;
        try {
            if (s() && (context = a) != null && (sharedPreferences = PreferenceWrapper.getDefault(context)) != null && sharedPreferences.getLong(l, 0L) == 0) {
                sharedPreferences.edit().putLong(l, System.currentTimeMillis()).commit();
            }
        } catch (Throwable th) {
        }
    }

    public long f() {
        SharedPreferences sharedPreferences;
        try {
            Context context = a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return 0L;
            }
            long j = sharedPreferences.getLong(l, 0L);
            if (j != 0) {
                return j;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong(l, currentTimeMillis).commit();
                return currentTimeMillis;
            } catch (Throwable th) {
                return j;
            }
        } catch (Throwable th2) {
            return 0L;
        }
    }

    private boolean s() {
        SharedPreferences sharedPreferences;
        try {
            Context context = a;
            if (context != null && (sharedPreferences = PreferenceWrapper.getDefault(context)) != null) {
                if (sharedPreferences.getLong(m, -1L) != 0) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    private void f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                long j = jSONObject.getLong("ts");
                b(a);
                d();
                String[] a2 = com.umeng.analytics.c.a(a);
                if (a2 != null && !TextUtils.isEmpty(a2[0]) && !TextUtils.isEmpty(a2[1])) {
                    u.a().a(a, j);
                    String c2 = y.a().c(a);
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + c2);
                    boolean b2 = u.a().b(a, j, false);
                    com.umeng.analytics.c.b(a);
                    u.a().a(a, j, true);
                    if (b2) {
                        u.a().b(a, j);
                    }
                }
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    private void g(Object obj) {
        try {
            b(a);
            d();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString(com.umeng.analytics.pro.d.M);
                String string2 = jSONObject.getString("uid");
                long j = jSONObject.getLong("ts");
                String[] a2 = com.umeng.analytics.c.a(a);
                if (a2 == null || !string.equals(a2[0]) || !string2.equals(a2[1])) {
                    u.a().a(a, j);
                    String c2 = y.a().c(a);
                    boolean b2 = u.a().b(a, j, false);
                    com.umeng.analytics.c.a(a, string, string2);
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + c2);
                    u.a().a(a, j, true);
                    if (b2) {
                        u.a().b(a, j);
                    }
                }
            }
        } catch (Throwable th) {
        }
    }

    private void h(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0 && jSONObject.has("__ii")) {
                String optString = jSONObject.optString("__ii");
                jSONObject.remove("__ii");
                if (!TextUtils.isEmpty(optString)) {
                    i.a(a).a(optString, obj.toString(), 2);
                }
            }
        } catch (Throwable th) {
        }
    }
}
