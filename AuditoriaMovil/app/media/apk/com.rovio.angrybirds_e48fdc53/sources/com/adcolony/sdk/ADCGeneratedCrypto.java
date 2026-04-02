package com.adcolony.sdk;

import com.umeng.analytics.pro.cv;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class ADCGeneratedCrypto {
    private static final byte[] a = {73, 47, -67, 11, -86, -53, 93, 81, -70, -31, -18, -33, 107, 71, -14, 116, -117, 50, 68, -37, 126, -5, 23, 28, -60, -62, 18, -8, -92, 32, 124, -101};
    private static final byte[] b = {56, 126, 20, cv.n, 122, 106, 52, 63, -117, 126, 5, -17, -123, -84, 78, 102, -51, 72, -109, -13, -106, -95, -9, 82};

    private native byte[] nativeDecryptBase64(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    public static byte[] decrypt(byte[] bArr) {
        try {
            ADCGeneratedCrypto aDCGeneratedCrypto = new ADCGeneratedCrypto();
            byte[] digest = MessageDigest.getInstance("SHA-512").digest(aDCGeneratedCrypto.getClass().getSimpleName().getBytes());
            byte[] bArr2 = new byte[a.length];
            byte[] bArr3 = new byte[b.length];
            for (int i = 0; i < bArr2.length; i++) {
                bArr2[i] = (byte) (a[i] ^ digest[i]);
            }
            for (int i2 = 0; i2 < bArr3.length; i2++) {
                bArr3[i2] = (byte) (b[i2] ^ digest[i2]);
            }
            if (new String(bArr, 0, 10).equals("adc_base64")) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 10, bArr.length);
                return aDCGeneratedCrypto.nativeDecryptBase64(bArr2, bArr3, copyOfRange, copyOfRange.length);
            }
            return null;
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
