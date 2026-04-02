package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class zzgcj implements zzftg {
    private static final ThreadLocal<Cipher> zza = new zzgch();
    private static final ThreadLocal<Cipher> zzb = new zzgci();
    private final byte[] zzc;
    private final byte[] zzd;
    private final SecretKeySpec zze;
    private final int zzf;

    public zzgcj(byte[] bArr, int i2) throws GeneralSecurityException {
        if (!zzfvw.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i2 != 12 && i2 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzf = i2;
        zzgdu.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zze = secretKeySpec;
        Cipher cipher = zza.get();
        cipher.init(1, secretKeySpec);
        byte[] zzc = zzc(cipher.doFinal(new byte[16]));
        this.zzc = zzc;
        this.zzd = zzc(zzc);
    }

    private static byte[] zzb(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    private static byte[] zzc(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 15) {
            byte b2 = bArr[i2];
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((b2 + b2) ^ ((bArr[i3] & 255) >>> 7)) & 255);
            i2 = i3;
        }
        byte b3 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b3 + b3));
        return bArr2;
    }

    private final byte[] zzd(Cipher cipher, int i2, byte[] bArr, int i3, int i4) throws IllegalBlockSizeException, BadPaddingException {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i2;
        if (i4 == 0) {
            return cipher.doFinal(zzb(bArr3, this.zzc));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i5 = 0;
        int i6 = 0;
        while (i4 - i6 > 16) {
            for (int i7 = 0; i7 < 16; i7++) {
                doFinal[i7] = (byte) (doFinal[i7] ^ bArr[(i3 + i6) + i7]);
            }
            doFinal = cipher.doFinal(doFinal);
            i6 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i6 + i3, i3 + i4);
        if (copyOfRange.length == 16) {
            bArr2 = zzb(copyOfRange, this.zzc);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zzd, 16);
            while (true) {
                length = copyOfRange.length;
                if (i5 >= length) {
                    break;
                }
                copyOf[i5] = (byte) (copyOf[i5] ^ copyOfRange[i5]);
                i5++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(zzb(doFinal, bArr2));
    }

    @Override // com.google.android.gms.internal.ads.zzftg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.zzf;
        if (length <= (Integer.MAX_VALUE - i2) - 16) {
            byte[] bArr3 = new byte[i2 + length + 16];
            byte[] zza2 = zzgds.zza(i2);
            System.arraycopy(zza2, 0, bArr3, 0, this.zzf);
            Cipher cipher = zza.get();
            cipher.init(1, this.zze);
            byte[] zzd = zzd(cipher, 0, zza2, 0, zza2.length);
            byte[] zzd2 = zzd(cipher, 1, bArr2, 0, 0);
            Cipher cipher2 = zzb.get();
            cipher2.init(1, this.zze, new IvParameterSpec(zzd));
            cipher2.doFinal(bArr, 0, length, bArr3, this.zzf);
            byte[] zzd3 = zzd(cipher, 2, bArr3, this.zzf, length);
            int i3 = length + this.zzf;
            for (int i4 = 0; i4 < 16; i4++) {
                bArr3[i3 + i4] = (byte) ((zzd2[i4] ^ zzd[i4]) ^ zzd3[i4]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
