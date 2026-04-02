package com.vungle.publisher;

import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes4.dex */
public final class yx {
    public static String a(String str, String str2) {
        return Base64.encodeToString(b(str, str2), 11);
    }

    public static byte[] b(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), mac.getAlgorithm()));
            return mac.doFinal(str.getBytes());
        } catch (InvalidKeyException e) {
            throw new UnsupportedOperationException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new UnsupportedOperationException(e2);
        }
    }
}
