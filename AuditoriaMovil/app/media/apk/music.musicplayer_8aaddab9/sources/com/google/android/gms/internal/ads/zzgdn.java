package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class zzgdn implements zzfxc {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgdn(byte[] bArr) throws GeneralSecurityException {
        zzgdu.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zza = zzgcn.zza(zzb.doFinal(new byte[16]));
        this.zzb = zza;
        this.zzc = zzgcn.zza(zza);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzfvw.zza(1)) {
            return zzgdb.zza.zzb("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final byte[] zza(byte[] bArr, int i2) throws GeneralSecurityException {
        if (i2 <= 16) {
            Cipher zzb = zzb();
            zzb.init(1, this.zza);
            int length = bArr.length;
            double d2 = length;
            Double.isNaN(d2);
            int max = Math.max(1, (int) Math.ceil(d2 / 16.0d));
            byte[] zzb2 = max * 16 == length ? zzgco.zzb(bArr, (max - 1) * 16, this.zzb, 0, 16) : zzgco.zzd(zzgcn.zzb(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.zzc);
            byte[] bArr2 = new byte[16];
            for (int i3 = 0; i3 < max - 1; i3++) {
                bArr2 = zzb.doFinal(zzgco.zzb(bArr2, 0, bArr, i3 * 16, 16));
            }
            return Arrays.copyOf(zzb.doFinal(zzgco.zzd(zzb2, bArr2)), i2);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
