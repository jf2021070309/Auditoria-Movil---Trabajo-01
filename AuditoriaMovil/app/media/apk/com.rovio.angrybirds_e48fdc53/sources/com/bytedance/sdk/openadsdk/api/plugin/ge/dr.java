package com.bytedance.sdk.openadsdk.api.plugin.ge;

import android.util.Base64;
import com.facebook.ads.AudienceNetworkActivity;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public class dr {
    public static String dr(String str, String str2, String str3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING)), 0);
        } catch (Throwable th) {
            return null;
        }
    }
}
