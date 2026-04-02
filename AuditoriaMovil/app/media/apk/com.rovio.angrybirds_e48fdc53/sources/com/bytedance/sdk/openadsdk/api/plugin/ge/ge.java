package com.bytedance.sdk.openadsdk.api.plugin.ge;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.facebook.share.internal.ShareConstants;
import java.security.SecureRandom;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ge {
    @JProtect
    public static String dr(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String dr = dr();
        String dr2 = dr(dr, 32);
        String ge = ge();
        String str2 = null;
        if (dr2 != null && ge != null) {
            str2 = dr.dr(str, ge, dr2);
        }
        return 3 + dr + ge + str2;
    }

    @JProtect
    public static JSONObject dr(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject2;
        }
        try {
            String dr = dr(jSONObject.toString());
            if (!TextUtils.isEmpty(dr)) {
                jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, dr);
                jSONObject2.put("cypher", 3);
            } else {
                jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject.toString());
                jSONObject2.put("cypher", 0);
            }
        } catch (Throwable th) {
            try {
                jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject.toString());
                jSONObject2.put("cypher", 0);
            } catch (Throwable th2) {
            }
        }
        return jSONObject2;
    }

    public static String dr() {
        String dr = dr(16);
        if (dr == null || dr.length() != 32) {
            return null;
        }
        return dr;
    }

    public static String dr(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    public static String ge() {
        String dr = dr(8);
        if (dr == null || dr.length() != 16) {
            return null;
        }
        return dr;
    }

    public static String dr(int i) {
        try {
            byte[] bArr = new byte[i];
            o().nextBytes(bArr);
            return o.dr(bArr);
        } catch (Exception e) {
            return null;
        }
    }

    private static SecureRandom o() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable th) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }
}
