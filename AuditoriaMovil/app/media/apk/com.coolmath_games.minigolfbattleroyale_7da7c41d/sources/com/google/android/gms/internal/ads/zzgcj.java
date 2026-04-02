package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgcj implements zzftg {
    private static final ThreadLocal<Cipher> zza = new zzgch();
    private static final ThreadLocal<Cipher> zzb = new zzgci();
    private final byte[] zzc;
    private final byte[] zzd;
    private final SecretKeySpec zze;
    private final int zzf;

    public zzgcj(byte[] bArr, int i) throws GeneralSecurityException {
        if (!zzfvw.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i == 12 || i == 16) {
            this.zzf = i;
            zzgdu.zza(bArr.length);
            this.zze = new SecretKeySpec(bArr, "AES");
            Cipher cipher = zza.get();
            cipher.init(1, this.zze);
            byte[] zzc = zzc(cipher.doFinal(new byte[16]));
            this.zzc = zzc;
            this.zzd = zzc(zzc);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private static byte[] zzb(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    private static byte[] zzc(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & UByte.MAX_VALUE) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    private final byte[] zzd(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(zzb(bArr3, this.zzc));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = zzb(copyOfRange, this.zzc);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zzd, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ ByteCompanionObject.MIN_VALUE);
            bArr2 = copyOf;
        }
        return cipher.doFinal(zzb(doFinal, bArr2));
    }

    @Override // com.google.android.gms.internal.ads.zzftg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzf;
        if (length > (Integer.MAX_VALUE - i) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i + length + 16];
        byte[] zza2 = zzgds.zza(i);
        System.arraycopy(zza2, 0, bArr3, 0, this.zzf);
        Cipher cipher = zza.get();
        cipher.init(1, this.zze);
        byte[] zzd = zzd(cipher, 0, zza2, 0, zza2.length);
        byte[] zzd2 = zzd(cipher, 1, bArr2, 0, 0);
        Cipher cipher2 = zzb.get();
        cipher2.init(1, this.zze, new IvParameterSpec(zzd));
        cipher2.doFinal(bArr, 0, length, bArr3, this.zzf);
        byte[] zzd3 = zzd(cipher, 2, bArr3, this.zzf, length);
        int i2 = length + this.zzf;
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i2 + i3] = (byte) ((zzd2[i3] ^ zzd[i3]) ^ zzd3[i3]);
        }
        return bArr3;
    }
}
