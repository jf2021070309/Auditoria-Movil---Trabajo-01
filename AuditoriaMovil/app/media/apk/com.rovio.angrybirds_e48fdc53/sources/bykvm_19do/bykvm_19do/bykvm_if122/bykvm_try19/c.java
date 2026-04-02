package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.text.TextUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.facebook.share.internal.ShareConstants;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private static Random a = new SecureRandom();

    public static String a() {
        String a2 = a(8);
        if (a2 == null || a2.length() != 16) {
            return null;
        }
        return a2;
    }

    public static String a(int i) {
        try {
            byte[] bArr = new byte[i];
            a.nextBytes(bArr);
            return o.a(bArr);
        } catch (Exception e) {
            return null;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String b = b();
        String a2 = a(b, 32);
        String a3 = a();
        String str2 = null;
        if (a2 != null && a3 != null) {
            str2 = a.a(str, a3, a2);
        }
        return 3 + b + a3 + str2;
    }

    public static String a(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                String a2 = a(jSONObject.toString());
                if (TextUtils.isEmpty(a2)) {
                    jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject.toString());
                    jSONObject2.put("cypher", 0);
                } else {
                    jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, a2);
                    jSONObject2.put("cypher", 3);
                }
            } catch (Throwable th) {
                try {
                    jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject.toString());
                    jSONObject2.put("cypher", 0);
                } catch (Throwable th2) {
                    Logger.d(th2.getMessage());
                }
            }
        }
        return jSONObject2;
    }

    public static String b() {
        String a2 = a(16);
        if (a2 == null || a2.length() != 32) {
            return null;
        }
        return a2;
    }
}
