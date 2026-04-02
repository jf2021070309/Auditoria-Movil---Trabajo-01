package com.rovio.rcs.payment.google;

import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
/* loaded from: classes4.dex */
public class ReceiptHelper {
    private static final String KEY_FACTORY_ALGORITHM = "RSA";
    private static final String SIGNATURE_ALGORITHM = "SHA1withRSA";
    private static final String TAG = "ReceiptHelper";

    public static boolean verifyPurchase(String str, String str2, String str3) {
        if (str2 == null) {
            Log.e(TAG, "data is null");
            return false;
        } else if (!TextUtils.isEmpty(str3) && !verify(generatePublicKey(str), str2, str3)) {
            Log.w(TAG, "signature does not match data.");
            return false;
        } else {
            return true;
        }
    }

    public static PublicKey generatePublicKey(String str) {
        try {
            return KeyFactory.getInstance(KEY_FACTORY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str)));
        } catch (Base64DecoderException e) {
            Log.e(TAG, "Base64 decoding failed.");
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        } catch (InvalidKeySpecException e3) {
            Log.e(TAG, "Invalid key specification.");
            throw new IllegalArgumentException(e3);
        }
    }

    public static boolean verify(PublicKey publicKey, String str, String str2) {
        try {
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initVerify(publicKey);
            signature.update(str.getBytes());
            if (!signature.verify(Base64.decode(str2))) {
                Log.e(TAG, "Signature verification failed.");
                return false;
            }
            return true;
        } catch (Base64DecoderException e) {
            Log.e(TAG, "Base64 decoding failed.");
            return false;
        } catch (InvalidKeyException e2) {
            Log.e(TAG, "Invalid key specification.");
            return false;
        } catch (NoSuchAlgorithmException e3) {
            Log.e(TAG, "NoSuchAlgorithmException.");
            return false;
        } catch (SignatureException e4) {
            Log.e(TAG, "Signature exception.");
            return false;
        }
    }
}
