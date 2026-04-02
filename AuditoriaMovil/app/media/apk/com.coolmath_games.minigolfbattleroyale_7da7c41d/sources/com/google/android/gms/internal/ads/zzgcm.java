package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgcm implements zzftj {
    private static final Collection<Integer> zza = Arrays.asList(64);
    private static final byte[] zzb = new byte[16];
    private final zzgdn zzc;
    private final byte[] zzd;

    public zzgcm(byte[] bArr) throws GeneralSecurityException {
        if (zzfvw.zza(1)) {
            Collection<Integer> collection = zza;
            int length = bArr.length;
            if (!collection.contains(Integer.valueOf(length))) {
                StringBuilder sb = new StringBuilder(59);
                sb.append("invalid key size: ");
                sb.append(length);
                sb.append(" bytes; key must have 64 bytes");
                throw new InvalidKeyException(sb.toString());
            }
            int i = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.zzd = Arrays.copyOfRange(bArr, i, length);
            this.zzc = new zzgdn(copyOfRange);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzftj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzd;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher zzb2 = zzgdb.zza.zzb("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] zza2 = this.zzc.zza(zzb, 16);
        for (int i = 0; i <= 0; i++) {
            byte[] bArr4 = bArr3[i];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            zza2 = zzgco.zzd(zzgcn.zza(zza2), this.zzc.zza(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = zza2.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i2 = length - length2;
            zzd = Arrays.copyOf(bArr5, length);
            for (int i3 = 0; i3 < zza2.length; i3++) {
                int i4 = i2 + i3;
                zzd[i4] = (byte) (zzd[i4] ^ zza2[i3]);
            }
        } else {
            zzd = zzgco.zzd(zzgcn.zzb(bArr5), zzgcn.zza(zza2));
        }
        byte[] zza3 = this.zzc.zza(zzd, 16);
        byte[] bArr6 = (byte[]) zza3.clone();
        bArr6[8] = (byte) (bArr6[8] & ByteCompanionObject.MAX_VALUE);
        bArr6[12] = (byte) (bArr6[12] & ByteCompanionObject.MAX_VALUE);
        zzb2.init(1, new SecretKeySpec(this.zzd, "AES"), new IvParameterSpec(bArr6));
        return zzgco.zza(zza3, zzb2.doFinal(bArr));
    }
}
