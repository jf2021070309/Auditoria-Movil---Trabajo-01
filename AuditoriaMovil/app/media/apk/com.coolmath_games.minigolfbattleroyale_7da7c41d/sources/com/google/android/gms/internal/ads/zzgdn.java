package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgdn implements zzfxc {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgdn(byte[] bArr) throws GeneralSecurityException {
        zzgdu.zza(bArr.length);
        this.zza = new SecretKeySpec(bArr, "AES");
        Cipher zzb = zzb();
        zzb.init(1, this.zza);
        byte[] zza = zzgcn.zza(zzb.doFinal(new byte[16]));
        this.zzb = zza;
        this.zzc = zzgcn.zza(zza);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (!zzfvw.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        return zzgdb.zza.zzb("AES/ECB/NoPadding");
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] zzd;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher zzb = zzb();
        zzb.init(1, this.zza);
        int length = bArr.length;
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        if (max * 16 == length) {
            zzd = zzgco.zzb(bArr, (max - 1) * 16, this.zzb, 0, 16);
        } else {
            zzd = zzgco.zzd(zzgcn.zzb(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.zzc);
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr2 = zzb.doFinal(zzgco.zzb(bArr2, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(zzb.doFinal(zzgco.zzd(zzd, bArr2)), i);
    }
}
