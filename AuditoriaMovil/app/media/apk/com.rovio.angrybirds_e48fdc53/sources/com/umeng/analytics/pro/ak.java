package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ModelHelper.java */
/* loaded from: classes3.dex */
public class ak {
    public static JSONObject a(Context context, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            aj ajVar = new aj();
            String uMId = UMUtils.getUMId(context);
            if (TextUtils.isEmpty(uMId)) {
                return null;
            }
            ajVar.a(uMId);
            String appkey = UMUtils.getAppkey(context);
            if (TextUtils.isEmpty(appkey)) {
                return null;
            }
            ajVar.b(appkey);
            ajVar.c(UMUtils.getAppVersionName(context));
            ajVar.d("9.6.1");
            ajVar.e(UMUtils.getChannel(context));
            ajVar.f(Build.VERSION.SDK_INT + "");
            ajVar.g(Build.BRAND);
            ajVar.h(Build.MODEL);
            String[] localeInfo = DeviceConfig.getLocaleInfo(context);
            ajVar.i(localeInfo[1]);
            ajVar.j(localeInfo[0]);
            int[] resolutionArray = DeviceConfig.getResolutionArray(context);
            ajVar.b(Integer.valueOf(resolutionArray[1]));
            ajVar.a(Integer.valueOf(resolutionArray[0]));
            ajVar.k(ao.a(context, "install_datetime", ""));
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                e = e;
            }
            try {
                jSONObject.put(aj.a, ajVar.a());
                jSONObject.put(aj.c, ajVar.c());
                jSONObject.put(aj.b, ajVar.b());
                jSONObject.put(aj.d, ajVar.d());
                jSONObject.put(aj.e, ajVar.e());
                jSONObject.put(aj.f, ajVar.f());
                jSONObject.put(aj.g, ajVar.g());
                jSONObject.put(aj.h, ajVar.h());
                jSONObject.put(aj.k, ajVar.k());
                jSONObject.put(aj.j, ajVar.j());
                jSONObject.put(aj.l, ajVar.l());
                jSONObject.put(aj.i, ajVar.i());
                jSONObject.put(aj.m, ajVar.m());
                jSONObject.put(bg.al, UMUtils.getZid(context));
                jSONObject.put("platform", "android");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(bg.ba, com.umeng.commonsdk.internal.a.e);
                if (!TextUtils.isEmpty(UMUtils.VALUE_ANALYTICS_VERSION)) {
                    jSONObject3.put(bg.bb, UMUtils.VALUE_ANALYTICS_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_GAME_VERSION)) {
                    jSONObject3.put(bg.bc, UMUtils.VALUE_GAME_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_PUSH_VERSION)) {
                    jSONObject3.put(bg.bd, UMUtils.VALUE_PUSH_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_SHARE_VERSION)) {
                    jSONObject3.put(bg.be, UMUtils.VALUE_SHARE_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_APM_VERSION)) {
                    jSONObject3.put(bg.bf, UMUtils.VALUE_APM_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_VERIFY_VERSION)) {
                    jSONObject3.put(bg.bg, UMUtils.VALUE_VERIFY_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_SMS_VERSION)) {
                    jSONObject3.put(bg.bh, UMUtils.VALUE_SMS_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                    jSONObject3.put(bg.bi, UMUtils.VALUE_REC_VERSION_NAME);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_VISUAL_VERSION)) {
                    jSONObject3.put(bg.bj, UMUtils.VALUE_VISUAL_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                    jSONObject3.put(bg.bk, UMUtils.VALUE_ASMS_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_LINK_VERSION)) {
                    jSONObject3.put(bg.bl, UMUtils.VALUE_LINK_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_ABTEST_VERSION)) {
                    jSONObject3.put(bg.bm, UMUtils.VALUE_ABTEST_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_ANTI_VERSION)) {
                    jSONObject3.put(bg.bn, UMUtils.VALUE_ANTI_VERSION);
                }
                jSONObject.put("optional", jSONObject3);
                String[] split = str.split("@");
                if (split.length == 4) {
                    try {
                        long parseLong = Long.parseLong(split[0]);
                        String str2 = split[1];
                        jSONObject.put("s1", parseLong);
                        jSONObject.put("s2", str2);
                    } catch (Throwable th) {
                    }
                }
                return jSONObject;
            } catch (JSONException e2) {
                e = e2;
                jSONObject2 = jSONObject;
                UMRTLog.e(UMRTLog.RTLOG_TAG, "[getCloudConfigParam] error " + e.getMessage());
                return jSONObject2;
            } catch (Throwable th2) {
                th = th2;
                jSONObject2 = jSONObject;
                UMRTLog.e(UMRTLog.RTLOG_TAG, "[getCloudConfigParam] error " + th.getMessage());
                return jSONObject2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static JSONObject a(Context context, int i, JSONArray jSONArray, String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                String zid = UMUtils.getZid(context);
                if (!TextUtils.isEmpty(zid)) {
                    jSONObject2.put("atoken", zid);
                    String deviceToken = UMUtils.getDeviceToken(context);
                    if (!TextUtils.isEmpty(deviceToken)) {
                        jSONObject2.put("device_token", deviceToken);
                    }
                    jSONObject2.put("model", Build.MODEL);
                    jSONObject2.put(bg.x, "android");
                    jSONObject2.put(bg.y, Build.VERSION.RELEASE);
                    jSONObject2.put(com.umeng.ccg.a.n, str);
                    jSONObject2.put("sdk", jSONArray);
                    jSONObject2.put("e", i);
                    return jSONObject2;
                }
                return jSONObject2;
            } catch (Throwable th) {
                jSONObject = jSONObject2;
                return jSONObject;
            }
        } catch (Throwable th2) {
        }
    }
}
