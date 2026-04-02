package com.google.android.gms.internal.pal;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzmq {
    private static final ThreadLocal zza = new zzmp();
    private final SecretKey zzb;
    private final boolean zzc;

    public zzmq(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (zzna.zza(2)) {
            zzys.zza(bArr.length);
            this.zzb = new SecretKeySpec(bArr, "AES");
            this.zzc = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i;
        AlgorithmParameterSpec gCMParameterSpec;
        int i2;
        if (bArr.length == 12) {
            int length = bArr2.length;
            if (length <= 2147483619) {
                boolean z = this.zzc;
                if (z) {
                    i = length + 28;
                } else {
                    i = length + 16;
                }
                byte[] bArr4 = new byte[i];
                if (z) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                if (zzyr.zza() && Integer.valueOf(Build.VERSION.SDK_INT).intValue() <= 19) {
                    gCMParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
                }
                ThreadLocal threadLocal = zza;
                ((Cipher) threadLocal.get()).init(1, this.zzb, gCMParameterSpec);
                if (true != this.zzc) {
                    i2 = 0;
                } else {
                    i2 = 12;
                }
                int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr4, i2);
                if (doFinal == length + 16) {
                    return bArr4;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
