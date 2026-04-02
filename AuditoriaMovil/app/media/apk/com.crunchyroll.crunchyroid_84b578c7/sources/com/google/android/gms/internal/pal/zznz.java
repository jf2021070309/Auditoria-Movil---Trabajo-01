package com.google.android.gms.internal.pal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zznz {
    private static final byte[] zza = new byte[0];
    private final zzny zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zznz(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzny zznyVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zznyVar;
    }

    public static zznz zzc(byte[] bArr, byte[] bArr2, zzoc zzocVar, zznx zznxVar, zzny zznyVar, byte[] bArr3) throws GeneralSecurityException {
        byte[] zzb = zzol.zzb(zzocVar.zzb(), zznxVar.zzc(), zznyVar.zzb());
        byte[] bArr4 = zzol.zzl;
        byte[] bArr5 = zza;
        byte[] zzc = zzxo.zzc(zzol.zza, zznxVar.zze(bArr4, bArr5, "psk_id_hash", zzb), zznxVar.zze(bArr4, bArr3, "info_hash", zzb));
        byte[] zze = zznxVar.zze(bArr2, bArr5, "secret", zzb);
        byte[] zzd = zznxVar.zzd(zze, zzc, "key", zzb, zznyVar.zza());
        byte[] zzd2 = zznxVar.zzd(zze, zzc, "base_nonce", zzb, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new zznz(bArr, zzd, zzd2, bigInteger.shiftLeft(96).subtract(bigInteger), zznyVar);
    }

    private final synchronized byte[] zzd() throws GeneralSecurityException {
        byte[] zzd;
        byte[] bArr = this.zze;
        byte[] byteArray = this.zzg.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length <= 13) {
                if (length == 13) {
                    if (byteArray[0] == 0) {
                        byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                    } else {
                        throw new GeneralSecurityException("integer too large");
                    }
                } else {
                    byte[] bArr2 = new byte[12];
                    System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                    byteArray = bArr2;
                }
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        }
        zzd = zzxo.zzd(bArr, byteArray);
        if (this.zzg.compareTo(this.zzc) < 0) {
            this.zzg = this.zzg.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zzd;
    }

    public final byte[] zza() {
        return this.zzf;
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzd(), bArr, bArr2);
    }
}
