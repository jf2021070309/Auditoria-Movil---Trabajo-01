package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class zzgcg implements zzgdl {
    private static final ThreadLocal<Cipher> zza = new zzgcf();
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzgcg(byte[] bArr, int i2) throws GeneralSecurityException {
        if (!zzfvw.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgdu.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
        int blockSize = zza.get().getBlockSize();
        this.zzd = blockSize;
        if (i2 < 12 || i2 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.zzc;
        int i3 = Integer.MAX_VALUE - i2;
        if (length <= i3) {
            byte[] bArr2 = new byte[i2 + length];
            byte[] zza2 = zzgds.zza(i2);
            System.arraycopy(zza2, 0, bArr2, 0, this.zzc);
            int i4 = this.zzc;
            Cipher cipher = zza.get();
            byte[] bArr3 = new byte[this.zzd];
            System.arraycopy(zza2, 0, bArr3, 0, this.zzc);
            cipher.init(1, this.zzb, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i4) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException(a.R(43, "plaintext length can not exceed ", i3));
    }
}
