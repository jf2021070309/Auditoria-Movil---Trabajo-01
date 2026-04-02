package com.ironsource.sdk.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.integrity.IntegrityManager;
import com.ironsource.environment.a;
import com.ironsource.environment.h;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b {
    private static final String a = b.class.getSimpleName();

    public static JSONObject a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(advertiserId)) {
            try {
                Logger.i(a, "add AID and LAT");
                jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject, "displaySizeWidth", String.valueOf(h.k()));
            a(jSONObject, "displaySizeHeight", String.valueOf(h.l()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String a2 = com.ironsource.c.a.a(context);
            if (!TextUtils.isEmpty(a2) && !a2.equals(IntegrityManager.INTEGRITY_TYPE_NONE)) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a2));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put(SDKUtils.encodeString("hasVPN"), com.ironsource.c.a.c(context));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(h.p())));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("batteryLevel"), h.w(context));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("lpm"), h.x(context));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            com.ironsource.sdk.utils.a.a(context);
            jSONObject.put(SDKUtils.encodeString("deviceVolume"), com.ironsource.sdk.utils.a.b(context));
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("sdCardAvailable")) {
                jSONObject.put(SDKUtils.encodeString("sdCardAvailable"), h.d());
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("isCharging")) {
                jSONObject.put(SDKUtils.encodeString("isCharging"), h.f(context));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("chargingType")) {
                jSONObject.put(SDKUtils.encodeString("chargingType"), h.g(context));
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("airplaneMode")) {
                jSONObject.put(SDKUtils.encodeString("airplaneMode"), h.h(context));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("stayOnWhenPluggedIn")) {
                jSONObject.put(SDKUtils.encodeString("stayOnWhenPluggedIn"), h.i(context));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject c(Context context) {
        com.ironsource.sdk.utils.a a2 = com.ironsource.sdk.utils.a.a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String str = a2.a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a2.b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
            }
            String str3 = a2.c;
            if (str3 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
            }
            String str4 = a2.d;
            if (str4 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
            }
            String str5 = a2.d;
            if (str5 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
            }
            jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), String.valueOf(a2.e));
            jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(com.ironsource.sdk.utils.a.a()));
            if (a2.f != null && a2.f.length() > 0) {
                jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a2.f));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
            }
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("totalDeviceRAM")) {
                jSONObject.put(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(h.e(context))));
            }
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
            }
            String valueOf = String.valueOf(h.o());
            if (!TextUtils.isEmpty(valueOf)) {
                jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf));
            }
            String valueOf2 = String.valueOf(h.j());
            if (!TextUtils.isEmpty(valueOf2)) {
                jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), d.a(context));
            jSONObject.put("mcc", a.AnonymousClass1.c(context));
            jSONObject.put("mnc", a.AnonymousClass1.d(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), a.AnonymousClass1.f(context));
            jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(a.AnonymousClass1.e(context)));
            jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), com.ironsource.environment.c.b(context));
            jSONObject.put(SDKUtils.encodeString("firstInstallTime"), com.ironsource.environment.c.a(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(com.ironsource.environment.c.c(context)));
            String d = com.ironsource.environment.c.d(context);
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d));
            }
            jSONObject.put("localTime", SDKUtils.encodeString(String.valueOf(h.a())));
            jSONObject.put("timezoneOffset", SDKUtils.encodeString(String.valueOf(h.b())));
            String k = h.k(context);
            if (!TextUtils.isEmpty(k)) {
                jSONObject.put("icc", k);
            }
            String c = h.c();
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("tz", SDKUtils.encodeString(c));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
