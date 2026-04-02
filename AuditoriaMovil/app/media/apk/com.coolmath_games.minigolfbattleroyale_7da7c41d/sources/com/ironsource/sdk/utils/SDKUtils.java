package com.ironsource.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.ironsource.environment.h;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.g.f;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class SDKUtils {
    private static String b;
    private static String d;
    private static String f;
    private static Map<String, String> g;
    private static final String a = SDKUtils.class.getSimpleName();
    private static boolean c = true;
    private static int e = 0;
    private static String h = "";
    private static final AtomicInteger i = new AtomicInteger(1);

    public static int convertDpToPx(int i2) {
        return (int) TypedValue.applyDimension(0, i2, Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i2) {
        return (int) TypedValue.applyDimension(1, i2, Resources.getSystem().getDisplayMetrics());
    }

    public static Handler createMainThreadHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public static String decodeString(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            String str2 = a;
            Logger.d(str2, "Failed decoding string " + e2.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j) {
        return (int) ((((float) j) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String encodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] encrypt(java.lang.String r3) {
        /*
            r0 = 0
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.io.UnsupportedEncodingException -> L18 java.security.NoSuchAlgorithmException -> L1e
            r1.reset()     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            r1.update(r3)     // Catch: java.io.UnsupportedEncodingException -> L14 java.security.NoSuchAlgorithmException -> L16
            goto L23
        L14:
            r3 = move-exception
            goto L1a
        L16:
            r3 = move-exception
            goto L20
        L18:
            r3 = move-exception
            r1 = r0
        L1a:
            r3.printStackTrace()
            goto L23
        L1e:
            r3 = move-exception
            r1 = r0
        L20:
            r3.printStackTrace()
        L23:
            if (r1 == 0) goto L2a
            byte[] r3 = r1.digest()
            return r3
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.utils.SDKUtils.encrypt(java.lang.String):byte[]");
    }

    public static String fetchDemandSourceId(f fVar) {
        return fetchDemandSourceId(fVar.d);
    }

    public static String fetchDemandSourceId(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceId");
        return !TextUtils.isEmpty(optString) ? optString : jSONObject.optString("demandSourceName");
    }

    public static String flatMapToJsonAsString(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (JSONException e2) {
                    String str = a;
                    Logger.i(str, "flatMapToJsonAsStringfailed " + e2.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT < 17) {
            do {
                i2 = i.get();
                i3 = i2 + 1;
                if (i3 > 16777215) {
                    i3 = 1;
                }
            } while (!i.compareAndSet(i2, i3));
            return i2;
        }
        return View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z) {
        int i2 = Build.VERSION.SDK_INT >= 14 ? 2 : 0;
        if (Build.VERSION.SDK_INT >= 16) {
            i2 |= 1796;
        }
        return (Build.VERSION.SDK_INT < 19 || !z) ? i2 : i2 | 4096;
    }

    public static String getAdvertiserId() {
        return b;
    }

    public static String getControllerConfig() {
        return f;
    }

    public static JSONObject getControllerConfigAsJSONObject() {
        try {
            return new JSONObject(getControllerConfig());
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    public static String getControllerUrl() {
        return !TextUtils.isEmpty(d) ? d : "";
    }

    public static int getDebugMode() {
        return e;
    }

    public static String getFileName(String str) {
        String[] split = str.split(File.separator);
        try {
            return URLEncoder.encode(split[split.length - 1].split("\\?")[0], "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> getInitSDKParams() {
        return g;
    }

    public static String getMD5(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = AppEventsConstants.EVENT_PARAM_VALUE_NO + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt("minOSVersionSupport");
    }

    public static JSONObject getNetworkConfiguration() {
        JSONObject jSONObject = new JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject("networkConfig");
        } catch (Exception e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public static JSONObject getOrientation(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, translateOrientation(h.p(context)));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static d.e getProductType(String str) {
        if (str.equalsIgnoreCase(d.e.RewardedVideo.toString())) {
            return d.e.RewardedVideo;
        }
        if (str.equalsIgnoreCase(d.e.Interstitial.toString())) {
            return d.e.Interstitial;
        }
        if (str.equalsIgnoreCase(d.e.OfferWall.toString())) {
            return d.e.OfferWall;
        }
        return null;
    }

    public static String getSDKVersion() {
        return "5.108";
    }

    public static String getTesterParameters() {
        return h;
    }

    public static String getValueFromJsonObject(String str, String str2) {
        try {
            return new JSONObject(str).getString(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isApplicationVisible(Context context) {
        String packageName = context.getPackageName();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    public static boolean isIronSourceActivity(Activity activity) {
        return (activity instanceof ControllerActivity) || (activity instanceof OpenUrlActivity);
    }

    public static boolean isLimitAdTrackingEnabled() {
        return c;
    }

    public static void loadGoogleAdvertiserInfo(Context context) {
        try {
            String[] a2 = h.a(context);
            b = a2[0];
            c = Boolean.valueOf(a2[1]).booleanValue();
        } catch (Exception e2) {
            if (e2.getMessage() != null) {
                String str = a;
                Logger.i(str, e2.getClass().getSimpleName() + ": " + e2.getMessage());
            }
            if (e2.getCause() != null) {
                String str2 = a;
                Logger.i(str2, e2.getClass().getSimpleName() + ": " + e2.getCause());
            }
        }
    }

    public static Map<String, String> mergeHashMaps(Map<String, String>[] mapArr) {
        HashMap hashMap = new HashMap();
        if (mapArr == null) {
            return hashMap;
        }
        for (Map<String, String> map : mapArr) {
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        return hashMap;
    }

    public static JSONObject mergeJSONObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j) {
        return (int) ((((float) j) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static String requireNonEmptyOrNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void setControllerConfig(String str) {
        f = str;
    }

    public static void setControllerUrl(String str) {
        d = str;
    }

    public static void setDebugMode(int i2) {
        e = i2;
    }

    public static void setInitSDKParams(Map<String, String> map) {
        g = map;
    }

    public static void setTesterParameters(String str) {
        h = str;
    }

    public static void showNoInternetDialog(Context context) {
        new AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new DialogInterface.OnClickListener() { // from class: com.ironsource.sdk.utils.SDKUtils.1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }).show();
    }

    public static String translateDeviceOrientation(int i2) {
        return i2 != 1 ? i2 != 2 ? IntegrityManager.INTEGRITY_TYPE_NONE : "landscape" : "portrait";
    }

    public static String translateOrientation(int i2) {
        return i2 != 1 ? i2 != 2 ? IntegrityManager.INTEGRITY_TYPE_NONE : "landscape" : "portrait";
    }

    public static String translateRequestedOrientation(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 11) {
                    if (i2 != 12) {
                        switch (i2) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return IntegrityManager.INTEGRITY_TYPE_NONE;
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }
}
