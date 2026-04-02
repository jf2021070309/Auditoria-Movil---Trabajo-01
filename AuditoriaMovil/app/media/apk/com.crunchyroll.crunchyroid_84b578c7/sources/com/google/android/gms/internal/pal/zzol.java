package com.google.android.gms.internal.pal;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzol {
    public static final byte[] zza = zzc(1, 0);
    public static final byte[] zzb = zzc(2, 32);
    public static final byte[] zzc = zzc(2, 16);
    public static final byte[] zzd = zzc(2, 17);
    public static final byte[] zze = zzc(2, 18);
    public static final byte[] zzf = zzc(2, 1);
    public static final byte[] zzg = zzc(2, 2);
    public static final byte[] zzh = zzc(2, 3);
    public static final byte[] zzi = zzc(2, 1);
    public static final byte[] zzj = zzc(2, 2);
    public static final byte[] zzk = zzc(2, 3);
    public static final byte[] zzl = new byte[0];
    private static final byte[] zzm = "KEM".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzn = "HPKE".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzo = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    public static void zza(zzvd zzvdVar) throws GeneralSecurityException {
        if (zzvdVar.zzg() != 2 && zzvdVar.zzg() != 1) {
            String str = "UNRECOGNIZED";
            if (zzvdVar.zzf() != 2 && zzvdVar.zzf() != 1) {
                if (zzvdVar.zze() != 2 && zzvdVar.zze() != 1) {
                    return;
                }
                int zze2 = zzvdVar.zze();
                if (zze2 != 2) {
                    if (zze2 != 3) {
                        if (zze2 != 4) {
                            if (zze2 == 5) {
                                str = "CHACHA20_POLY1305";
                            }
                        } else {
                            str = "AES_256_GCM";
                        }
                    } else {
                        str = "AES_128_GCM";
                    }
                } else {
                    str = "AEAD_UNKNOWN";
                }
                throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
            }
            int zzf2 = zzvdVar.zzf();
            if (zzf2 != 2) {
                if (zzf2 != 3) {
                    if (zzf2 != 4) {
                        if (zzf2 == 5) {
                            str = "HKDF_SHA512";
                        }
                    } else {
                        str = "HKDF_SHA384";
                    }
                } else {
                    str = "HKDF_SHA256";
                }
            } else {
                str = "KDF_UNKNOWN";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        throw new GeneralSecurityException("Invalid KEM param: ".concat(zzux.zza(zzvdVar.zzg())));
    }

    public static byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzxo.zzc(zzn, bArr, bArr2, bArr3);
    }

    public static byte[] zzc(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] zzd(byte[] bArr) throws GeneralSecurityException {
        return zzxo.zzc(zzm, bArr);
    }

    public static byte[] zze(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzxo.zzc(zzo, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    public static byte[] zzf(String str, byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        return zzxo.zzc(zzc(2, i), zzo, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
