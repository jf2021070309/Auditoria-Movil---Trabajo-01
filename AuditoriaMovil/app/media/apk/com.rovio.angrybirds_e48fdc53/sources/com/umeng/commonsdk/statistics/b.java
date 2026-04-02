package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.kuaishou.weapon.p0.g;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.idtracking.e;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: EnvelopeManager.java */
/* loaded from: classes3.dex */
public class b {
    public static String a = null;
    private static final String c = "EnvelopeManager";
    private static final String d = "debug.umeng.umTaskId";
    private static final String e = "debug.umeng.umCaseId";
    private static final String f = "empty";
    private static Map<String, String> j;
    private static boolean l;
    private int k = 0;
    private static String g = "";
    private static String h = "";
    private static String i = null;
    public static String b = "";

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("header", "#h");
        j.put(bg.u, "#sdt");
        j.put(bg.Q, "#ac");
        j.put("device_model", "#dm");
        j.put(bg.g, "#umid");
        j.put(bg.x, bg.x);
        j.put(bg.N, "#lang");
        j.put(bg.ai, "#dt");
        j.put(bg.z, "#rl");
        j.put(bg.H, "#dmf");
        j.put(bg.J, "#dn");
        j.put("platform_version", "#pv");
        j.put("font_size_setting", "#fss");
        j.put(bg.y, "#ov");
        j.put(bg.I, "#did");
        j.put("platform_sdk_version", "#psv");
        j.put(bg.F, "#db");
        j.put("appkey", "#ak");
        j.put(bg.Y, "#itr");
        j.put("id_type", "#it");
        j.put("uuid", "#ud");
        j.put("device_id", "#dd");
        j.put(bg.X, "#imp");
        j.put("sdk_version", "#sv");
        j.put("st", "#st");
        j.put("analytics", "#a");
        j.put(bg.o, "#pkg");
        j.put(bg.p, "#sig");
        j.put(bg.q, "#sis1");
        j.put(bg.r, "#sis");
        j.put("app_version", "#av");
        j.put("version_code", "#vc");
        j.put(bg.v, "#imd");
        j.put(bg.B, "#mnc");
        j.put(bg.E, "#boa");
        j.put(bg.G, "#mant");
        j.put(bg.M, "#tz");
        j.put(bg.O, "#ct");
        j.put(bg.P, "#car");
        j.put(bg.s, "#disn");
        j.put(bg.T, "#nt");
        j.put(bg.b, "#cv");
        j.put(bg.d, "#mv");
        j.put(bg.c, "#cot");
        j.put(bg.e, "#mod");
        j.put(bg.aj, "#al");
        j.put("session_id", "#sid");
        j.put(bg.S, "#ip");
        j.put(bg.U, "#sre");
        j.put(bg.V, "#fre");
        j.put(bg.W, "#ret");
        j.put("channel", "#chn");
        j.put("wrapper_type", "#wt");
        j.put("wrapper_version", "#wv");
        j.put(bg.aV, "#tsv");
        j.put(bg.aW, "#rps");
        j.put(bg.aZ, "#mov");
        j.put(d.i, "#vt");
        j.put("secret", "#sec");
        j.put(d.ah, "#prv");
        j.put(d.l, "#$prv");
        j.put(d.m, "#uda");
        j.put(bg.a, "#tok");
        j.put(bg.aN, "#iv");
        j.put(bg.R, "#ast");
        j.put("backstate", "#bst");
        j.put("zdata_ver", "#zv");
        j.put("zdata_req_ts", "#zrt");
        j.put("app_b_v", "#bv");
        j.put("zdata", "#zta");
        j.put(bg.ap, "#mt");
        j.put(bg.am, "#zsv");
        j.put(bg.ao, "#oos");
    }

    public static String a(String str) {
        if (j.containsKey(str)) {
            return j.get(str);
        }
        return str;
    }

    public static void a() {
        if (i != null) {
            i = null;
            e.a();
        }
    }

    public static long a(Context context) {
        long j2 = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        if (ULog.DEBUG) {
            Log.i(c, "free size is " + j2);
        }
        return j2;
    }

    private JSONObject a(int i2, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i2);
            } catch (Exception e2) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i2);
        } catch (Exception e3) {
        }
        return jSONObject2;
    }

    private static boolean b() {
        boolean z;
        boolean z2;
        g = UMUtils.getSystemProperty(d, "");
        h = UMUtils.getSystemProperty(e, "");
        if (!TextUtils.isEmpty(g) && !f.equals(g)) {
            z = true;
        } else {
            z = false;
        }
        if (!TextUtils.isEmpty(h) && !f.equals(h)) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z && z2;
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String str4;
        boolean z;
        JSONObject jSONObject5;
        String str5;
        Envelope envelope;
        String str6;
        String str7;
        JSONObject optJSONObject;
        if (ULog.DEBUG && jSONObject != null && jSONObject2 != null) {
            Log.i(c, "headerJSONObject size is " + jSONObject.toString().getBytes().length);
            Log.i(c, "bodyJSONObject size is " + jSONObject2.toString().getBytes().length);
        }
        if (context == null || jSONObject2 == null) {
            return a(110, (JSONObject) null);
        }
        try {
            if (jSONObject2.has("analytics") && (optJSONObject = jSONObject2.optJSONObject("analytics")) != null && optJSONObject.has(d.n)) {
                z = true;
            } else {
                z = false;
            }
            JSONObject a2 = a(context, str2, z);
            if (a2 != null && jSONObject != null) {
                jSONObject5 = a(a2, jSONObject);
            } else {
                jSONObject5 = a2;
            }
            if (jSONObject5 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String) && (str7 = next) != null && jSONObject2.opt(str7) != null) {
                        try {
                            jSONObject5.put(a(str7), jSONObject2.opt(str7));
                        } catch (Exception e2) {
                        }
                    }
                }
            }
            String str8 = "u";
            String str9 = "1.0.0";
            if (!TextUtils.isEmpty(str2)) {
                str8 = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                str9 = str3;
            }
            if (jSONObject5 == null) {
                str5 = null;
            } else {
                String str10 = str8 + "==" + str9 + "&=";
                if (TextUtils.isEmpty(str10)) {
                    return a(101, jSONObject5);
                }
                if (!str10.endsWith("&=")) {
                    str5 = str10;
                } else {
                    str5 = str10.substring(0, str10.length() - 2);
                }
            }
            if (jSONObject5 != null) {
                try {
                    e a3 = e.a(context);
                    if (a3 != null) {
                        a3.b();
                        String encodeToString = Base64.encodeToString(new by().a(a3.c()), 0);
                        if (!TextUtils.isEmpty(encodeToString)) {
                            JSONObject jSONObject6 = jSONObject5.getJSONObject(a("header"));
                            jSONObject6.put(a(bg.Y), encodeToString);
                            jSONObject5.put(a("header"), jSONObject6);
                        }
                    }
                } catch (Exception e3) {
                }
            }
            if (jSONObject5 != null && DataHelper.largeThanMaxSize(jSONObject5.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, jSONObject5);
            }
            if (jSONObject5 != null) {
                Envelope a4 = a(context, jSONObject5.toString().getBytes());
                if (a4 == null) {
                    return a(111, jSONObject5);
                }
                envelope = a4;
            } else {
                envelope = null;
            }
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject5);
            }
            if (jSONObject5 == null) {
                str6 = null;
            } else {
                str6 = jSONObject5.optJSONObject(a("header")).optString(a("app_version"));
            }
            int a5 = a(context, envelope, str5, str6, str);
            if (a5 != 0) {
                return a(a5, jSONObject5);
            }
            if (ULog.DEBUG) {
                Log.i(c, "constructHeader size is " + jSONObject5.toString().getBytes().length);
            }
            if (!str5.startsWith(bg.aD) && !str5.startsWith("i") && !str5.startsWith(bg.aI) && !str5.startsWith("a") && !com.umeng.commonsdk.stateless.b.a()) {
                new com.umeng.commonsdk.stateless.b(context);
                com.umeng.commonsdk.stateless.b.b();
            }
            return jSONObject5;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            if (jSONObject == null) {
                jSONObject3 = null;
            } else {
                try {
                    jSONObject4 = new JSONObject();
                } catch (Exception e4) {
                    e = e4;
                    jSONObject3 = null;
                }
                try {
                    jSONObject4.put("header", jSONObject);
                } catch (JSONException e5) {
                } catch (Exception e6) {
                    e = e6;
                    jSONObject3 = jSONObject4;
                    UMCrashManager.reportCrash(context, e);
                    return a(110, jSONObject3);
                }
                jSONObject3 = jSONObject4;
            }
            if (jSONObject2 != null) {
                if (jSONObject3 == null) {
                    try {
                        jSONObject3 = new JSONObject();
                    } catch (Exception e7) {
                        e = e7;
                        UMCrashManager.reportCrash(context, e);
                        return a(110, jSONObject3);
                    }
                }
                if (jSONObject2 != null) {
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (next2 != null && (next2 instanceof String) && (str4 = next2) != null && jSONObject2.opt(str4) != null) {
                            try {
                                jSONObject3.put(str4, jSONObject2.opt(str4));
                            } catch (Exception e8) {
                            }
                        }
                    }
                }
            }
            return a(110, jSONObject3);
        }
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        String str2;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(a("header"), new JSONObject());
            if (jSONObject != null) {
                jSONObject3 = a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String) && (str2 = next) != null && jSONObject2.opt(str2) != null) {
                        try {
                            jSONObject3.put(str2, jSONObject2.opt(str2));
                        } catch (Exception e2) {
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, jSONObject3);
            }
            if (jSONObject3 == null) {
                envelope = null;
            } else {
                Envelope a2 = a(context, jSONObject3.toString().getBytes());
                if (a2 != null) {
                    envelope = a2;
                } else {
                    return a(111, jSONObject3);
                }
            }
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject3);
            }
            int a3 = a(context, envelope, "h==1.2.0", "", str);
            if (a3 != 0) {
                return a(a3, jSONObject3);
            }
            if (ULog.DEBUG) {
                Log.i(c, "constructHeader size is " + jSONObject3.toString().getBytes().length);
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return a(110, new JSONObject());
        }
    }

    public JSONObject b(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        String str2;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(a("header"), new JSONObject());
            try {
                if (b()) {
                    jSONObject.put("umTaskId", g);
                    jSONObject.put("umCaseId", h);
                }
            } catch (Throwable th) {
            }
            if (jSONObject != null) {
                jSONObject3 = a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String) && (str2 = next) != null && jSONObject2.opt(str2) != null) {
                        try {
                            jSONObject3.put(str2, jSONObject2.opt(str2));
                        } catch (Exception e2) {
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, jSONObject3);
            }
            if (jSONObject3 == null) {
                envelope = null;
            } else {
                Envelope a2 = a(context, jSONObject3.toString().getBytes());
                if (a2 != null) {
                    envelope = a2;
                } else {
                    return a(111, jSONObject3);
                }
            }
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject3);
            }
            int a3 = a(context, envelope, "z==1.2.0", DeviceConfig.getAppVersionName(context), str);
            if (a3 != 0) {
                return a(a3, jSONObject3);
            }
            if (ULog.DEBUG) {
                Log.i(c, "constructHeader size is " + jSONObject3.toString().getBytes().length);
            }
            return jSONObject3;
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
            return a(110, new JSONObject());
        }
    }

    private static int[] b(Context context) {
        int[] iArr = new int[3];
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(com.umeng.commonsdk.internal.c.a, 0);
            if (sharedPreferences != null) {
                iArr[0] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.b, 0);
                iArr[1] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.c, 0);
                iArr[2] = sharedPreferences.getInt("policyGrantResult", 0);
            }
        } catch (Throwable th) {
        }
        return iArr;
    }

    private static JSONObject a(Context context, String str, boolean z) {
        SharedPreferences sharedPreferences;
        JSONObject jSONObject;
        int[] resolutionArray;
        try {
            sharedPreferences = PreferenceWrapper.getDefault(context);
            if (!TextUtils.isEmpty(i)) {
                try {
                    jSONObject = new JSONObject(i);
                } catch (Exception e2) {
                    jSONObject = null;
                }
            } else {
                UMUtils.saveSDKComponent();
                jSONObject = new JSONObject();
                jSONObject.put(a(bg.p), DeviceConfig.getAppMD5Signature(context));
                jSONObject.put(a(bg.q), DeviceConfig.getAppSHA1Key(context));
                jSONObject.put(a(bg.r), DeviceConfig.getAppHashKey(context));
                jSONObject.put(a("app_version"), DeviceConfig.getAppVersionName(context));
                jSONObject.put(a("version_code"), Integer.parseInt(DeviceConfig.getAppVersionCode(context)));
                jSONObject.put(a(bg.v), DeviceConfig.getDeviceIdUmengMD5(context));
                jSONObject.put(a(bg.w), DeviceConfig.getCPU());
                String mccmnc = DeviceConfig.getMCCMNC(context);
                if (!TextUtils.isEmpty(mccmnc)) {
                    jSONObject.put(a(bg.B), mccmnc);
                    b = mccmnc;
                } else {
                    jSONObject.put(a(bg.B), "");
                }
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.I)) {
                    String subOSName = DeviceConfig.getSubOSName(context);
                    if (!TextUtils.isEmpty(subOSName)) {
                        jSONObject.put(a(bg.K), subOSName);
                    }
                    String subOSVersion = DeviceConfig.getSubOSVersion(context);
                    if (!TextUtils.isEmpty(subOSVersion)) {
                        jSONObject.put(a(bg.L), subOSVersion);
                    }
                }
                String deviceType = DeviceConfig.getDeviceType(context);
                if (!TextUtils.isEmpty(deviceType)) {
                    jSONObject.put(a(bg.ai), deviceType);
                }
                jSONObject.put(a(bg.o), DeviceConfig.getPackageName(context));
                jSONObject.put(a(bg.u), "Android");
                jSONObject.put(a("device_id"), DeviceConfig.getDeviceId(context));
                jSONObject.put(a("device_model"), Build.MODEL);
                jSONObject.put(a(bg.E), Build.BOARD);
                jSONObject.put(a(bg.F), Build.BRAND);
                jSONObject.put(a(bg.G), Build.TIME);
                jSONObject.put(a(bg.H), Build.MANUFACTURER);
                jSONObject.put(a(bg.I), Build.ID);
                jSONObject.put(a(bg.J), Build.DEVICE);
                jSONObject.put(a(bg.y), Build.VERSION.RELEASE);
                jSONObject.put(a(bg.x), "Android");
                if (DeviceConfig.getResolutionArray(context) != null) {
                    jSONObject.put(a(bg.z), resolutionArray[1] + "*" + resolutionArray[0]);
                }
                jSONObject.put(a(bg.A), DeviceConfig.getMac(context));
                jSONObject.put(a(bg.M), DeviceConfig.getTimeZone(context));
                String[] localeInfo = DeviceConfig.getLocaleInfo(context);
                jSONObject.put(a(bg.O), localeInfo[0]);
                jSONObject.put(a(bg.N), localeInfo[1]);
                jSONObject.put(a(bg.P), DeviceConfig.getNetworkOperatorName(context));
                jSONObject.put(a(bg.s), DeviceConfig.getAppName(context));
                String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
                if ("Wi-Fi".equals(networkAccessMode[0])) {
                    jSONObject.put(a(bg.Q), "wifi");
                } else if ("2G/3G".equals(networkAccessMode[0])) {
                    jSONObject.put(a(bg.Q), "2G/3G");
                } else {
                    jSONObject.put(a(bg.Q), "unknow");
                }
                if (!"".equals(networkAccessMode[1])) {
                    jSONObject.put(a(bg.R), networkAccessMode[1]);
                }
                if (DeviceConfig.isHarmony(context)) {
                    jSONObject.put(a(bg.ao), "harmony");
                } else {
                    jSONObject.put(a(bg.ao), "Android");
                }
                jSONObject.put(a(bg.T), DeviceConfig.getNetworkType(context));
                jSONObject.put(a(bg.b), "9.6.1");
                jSONObject.put(a(bg.c), SdkVersion.SDK_TYPE);
                jSONObject.put(a(bg.d), "1");
                if (!TextUtils.isEmpty(a)) {
                    jSONObject.put(a(bg.e), a);
                }
                jSONObject.put(a(bg.aj), Build.VERSION.SDK_INT);
                if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                    jSONObject.put(a(bg.af), UMUtils.VALUE_REC_VERSION_NAME);
                }
                try {
                    String uUIDForZid = UMUtils.getUUIDForZid(context);
                    if (TextUtils.isEmpty(uUIDForZid)) {
                        UMUtils.setUUIDForZid(context);
                        uUIDForZid = UMUtils.getUUIDForZid(context);
                    }
                    jSONObject.put(a("session_id"), uUIDForZid);
                } catch (Throwable th) {
                }
                i = jSONObject.toString();
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put(a(bg.ak), UMUtils.getOaidRequiredTime(context));
        } catch (Exception e3) {
        }
        try {
            jSONObject.put(a(bg.U), sharedPreferences.getInt("successful_request", 0));
            jSONObject.put(a(bg.V), sharedPreferences.getInt(bg.V, 0));
            jSONObject.put(a(bg.W), sharedPreferences.getInt("last_request_spent_ms", 0));
            String zid = UMUtils.getZid(context);
            if (!TextUtils.isEmpty(zid)) {
                jSONObject.put(a(bg.al), zid);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                jSONObject.put(a(bg.am), UMUtils.VALUE_ASMS_VERSION);
            }
        } catch (Exception e4) {
        }
        jSONObject.put(a("channel"), UMUtils.getChannel(context));
        jSONObject.put(a("appkey"), UMUtils.getAppkey(context));
        try {
            String deviceToken = UMUtils.getDeviceToken(context);
            if (!TextUtils.isEmpty(deviceToken)) {
                jSONObject.put(a(bg.a), deviceToken);
            }
        } catch (Exception e5) {
            UMCrashManager.reportCrash(context, e5);
        }
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(context, bg.g, null);
            if (!TextUtils.isEmpty(imprintProperty)) {
                jSONObject.put(a(bg.g), imprintProperty);
            }
        } catch (Exception e6) {
            UMCrashManager.reportCrash(context, e6);
        }
        try {
            jSONObject.put(a("wrapper_type"), a.a);
            jSONObject.put(a("wrapper_version"), a.b);
        } catch (Exception e7) {
        }
        try {
            int targetSdkVersion = UMUtils.getTargetSdkVersion(context);
            boolean checkPermission = UMUtils.checkPermission(context, g.c);
            jSONObject.put(a(bg.aV), targetSdkVersion);
            if (checkPermission) {
                jSONObject.put(a(bg.aW), "yes");
            } else {
                jSONObject.put(a(bg.aW), "no");
            }
        } catch (Throwable th3) {
        }
        try {
            if (b()) {
                jSONObject.put("umTaskId", g);
                jSONObject.put("umCaseId", h);
            }
        } catch (Throwable th4) {
        }
        if ((bg.aI.equals(str) || "a".equals(str)) && z) {
            try {
                int[] b2 = b(context);
                jSONObject.put(a(bg.bq), String.valueOf(b2[0]) + String.valueOf(b2[1]) + String.valueOf(b2[2]));
            } catch (Throwable th5) {
            }
        }
        try {
            Map<String, String> moduleTags = TagHelper.getModuleTags();
            if (moduleTags != null && moduleTags.size() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, String> entry : moduleTags.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put(a(bg.ap), jSONObject2);
            }
        } catch (Throwable th6) {
        }
        try {
            String realTimeDebugKey = AnalyticsConfig.getRealTimeDebugKey();
            if (!TextUtils.isEmpty(realTimeDebugKey)) {
                jSONObject.put(a(bg.bp), realTimeDebugKey);
            }
        } catch (Throwable th7) {
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(a(bg.ba), com.umeng.commonsdk.internal.a.e);
            if (!TextUtils.isEmpty(UMUtils.VALUE_ANALYTICS_VERSION)) {
                jSONObject3.put(a(bg.bb), UMUtils.VALUE_ANALYTICS_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_GAME_VERSION)) {
                jSONObject3.put(a(bg.bc), UMUtils.VALUE_GAME_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_PUSH_VERSION)) {
                jSONObject3.put(a(bg.bd), UMUtils.VALUE_PUSH_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_SHARE_VERSION)) {
                jSONObject3.put(a(bg.be), UMUtils.VALUE_SHARE_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_APM_VERSION)) {
                jSONObject3.put(a(bg.bf), UMUtils.VALUE_APM_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_VERIFY_VERSION)) {
                jSONObject3.put(a(bg.bg), UMUtils.VALUE_VERIFY_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_SMS_VERSION)) {
                jSONObject3.put(a(bg.bh), UMUtils.VALUE_SMS_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                jSONObject3.put(a(bg.bi), UMUtils.VALUE_REC_VERSION_NAME);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_VISUAL_VERSION)) {
                jSONObject3.put(a(bg.bj), UMUtils.VALUE_VISUAL_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                jSONObject3.put(a(bg.bk), UMUtils.VALUE_ASMS_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_LINK_VERSION)) {
                jSONObject3.put(a(bg.bl), UMUtils.VALUE_LINK_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_ABTEST_VERSION)) {
                jSONObject3.put(a(bg.bm), UMUtils.VALUE_ABTEST_VERSION);
            }
            if (!TextUtils.isEmpty(UMUtils.VALUE_ANTI_VERSION)) {
                jSONObject3.put(a(bg.bn), UMUtils.VALUE_ANTI_VERSION);
            }
            jSONObject.put(a(bg.aZ), jSONObject3);
        } catch (Throwable th8) {
        }
        try {
            String apmFlag = UMUtils.getApmFlag();
            if (!TextUtils.isEmpty(apmFlag)) {
                jSONObject.put(a(bg.bo), apmFlag);
            }
        } catch (Throwable th9) {
        }
        byte[] a2 = ImprintHandler.getImprintService(context).a();
        if (a2 != null && a2.length > 0) {
            try {
                jSONObject.put(a(bg.X), Base64.encodeToString(a2, 0));
            } catch (JSONException e8) {
                UMCrashManager.reportCrash(context, e8);
            }
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            return new JSONObject().put(a("header"), jSONObject);
        }
        return null;
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt(a("header")) != null && (jSONObject.opt(a("header")) instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt(a("header"));
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && (next instanceof String) && (str = next) != null && jSONObject2.opt(str) != null) {
                    try {
                        jSONObject3.put(str, jSONObject2.opt(str));
                        if (str.equals(a(d.i)) && (jSONObject2.opt(str) instanceof Integer)) {
                            this.k = ((Integer) jSONObject2.opt(str)).intValue();
                        }
                    } catch (Exception e2) {
                    }
                }
            }
        }
        return jSONObject;
    }

    private Envelope a(Context context, byte[] bArr) {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int i2 = -1;
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i2 = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e2) {
            UMCrashManager.reportCrash(context, e2);
        }
        if (i2 == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (i2 == 1) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (l) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    private int a(Context context, Envelope envelope, String str, String str2, String str3) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        String b2 = com.umeng.commonsdk.stateless.d.b(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&&");
        sb.append(str2);
        sb.append("_");
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(b2);
        sb.append(".log");
        byte[] binary = envelope.toBinary();
        if (com.umeng.commonsdk.utils.c.a()) {
            if (str.startsWith(bg.aG)) {
                return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
            }
            return 122;
        } else if (str.startsWith(bg.aG)) {
            return 122;
        } else {
            if (str.startsWith(bg.aD) || str.startsWith("i") || str.startsWith("a") || str.startsWith(bg.aI)) {
                return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
            }
            return com.umeng.commonsdk.stateless.d.a(context, com.umeng.commonsdk.stateless.a.f, sb.toString(), binary);
        }
    }

    public static void a(boolean z) {
        l = z;
    }
}
