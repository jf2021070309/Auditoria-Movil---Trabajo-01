package com.facebook.ads.internal.i;

import android.os.Build;
import com.facebook.share.internal.MessengerShareContentUtility;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
class b {
    private static final String a = b.class.getSimpleName();

    b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "is_emu", String.valueOf(b()));
        return jSONObject.toString();
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
        }
    }

    private static boolean b() {
        return Build.FINGERPRINT.contains(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE) || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE) && Build.DEVICE.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE)) || "google_sdk".equals(Build.PRODUCT);
    }
}
