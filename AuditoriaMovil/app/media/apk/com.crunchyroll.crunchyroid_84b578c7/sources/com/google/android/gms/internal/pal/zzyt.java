package com.google.android.gms.internal.pal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.security.InvalidKeyException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzyt {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            int i = copyOf[31] & Ascii.DEL;
            copyOf[31] = (byte) i;
            copyOf[31] = (byte) (i | 64);
            if (bArr2.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Ascii.DEL);
                for (int i2 = 0; i2 < 7; i2++) {
                    byte[][] bArr3 = zzxq.zza;
                    if (zzxo.zzb(bArr3[i2], copyOf2)) {
                        throw new InvalidKeyException("Banned public key: ".concat(zzyj.zza(bArr3[i2])));
                    }
                }
                long[] zzk = zzyi.zzk(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                int i3 = 10;
                System.arraycopy(zzk, 0, jArr2, 0, 10);
                int i4 = 0;
                int i5 = 32;
                while (i4 < i5) {
                    int i6 = copyOf[(32 - i4) - 1] & UnsignedBytes.MAX_VALUE;
                    int i7 = 0;
                    while (i7 < 8) {
                        int i8 = (i6 >> (7 - i7)) & 1;
                        zzxq.zza(jArr4, jArr2, i8);
                        zzxq.zza(jArr5, jArr3, i8);
                        byte[] bArr4 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        int i9 = i6;
                        long[] jArr10 = new long[19];
                        long[] jArr11 = jArr;
                        long[] jArr12 = new long[19];
                        int i10 = i4;
                        long[] jArr13 = new long[19];
                        int i11 = i7;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = new long[19];
                        long[] jArr16 = jArr9;
                        long[] jArr17 = new long[19];
                        long[] jArr18 = new long[19];
                        zzyi.zzi(jArr4, jArr4, jArr5);
                        zzyi.zzh(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzyi.zzi(jArr2, jArr2, jArr3);
                        zzyi.zzh(jArr3, copyOf4, jArr3);
                        zzyi.zzb(jArr14, jArr2, jArr5);
                        zzyi.zzb(jArr15, jArr4, jArr3);
                        zzyi.zze(jArr14);
                        zzyi.zzd(jArr14);
                        zzyi.zze(jArr15);
                        zzyi.zzd(jArr15);
                        long[] jArr19 = jArr2;
                        System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                        zzyi.zzi(jArr14, jArr14, jArr15);
                        zzyi.zzh(jArr15, copyOf4, jArr15);
                        zzyi.zzg(jArr18, jArr14);
                        zzyi.zzg(jArr17, jArr15);
                        zzyi.zzb(jArr15, jArr17, zzk);
                        zzyi.zze(jArr15);
                        zzyi.zzd(jArr15);
                        System.arraycopy(jArr18, 0, jArr6, 0, 10);
                        System.arraycopy(jArr15, 0, jArr7, 0, 10);
                        zzyi.zzg(jArr12, jArr4);
                        zzyi.zzg(jArr13, jArr5);
                        zzyi.zzb(jArr8, jArr12, jArr13);
                        zzyi.zze(jArr8);
                        zzyi.zzd(jArr8);
                        zzyi.zzh(jArr13, jArr12, jArr13);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        zzyi.zzf(jArr10, jArr13, 121665L);
                        zzyi.zzd(jArr10);
                        zzyi.zzi(jArr10, jArr10, jArr12);
                        zzyi.zzb(jArr16, jArr13, jArr10);
                        zzyi.zze(jArr16);
                        zzyi.zzd(jArr16);
                        zzxq.zza(jArr8, jArr6, i8);
                        zzxq.zza(jArr16, jArr7, i8);
                        i7 = i11 + 1;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        i6 = i9;
                        jArr = jArr11;
                        i4 = i10;
                        jArr6 = jArr19;
                        jArr5 = jArr16;
                        copyOf = bArr4;
                        long[] jArr20 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr20;
                        long[] jArr21 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr21;
                    }
                    i4++;
                    copyOf = copyOf;
                    i5 = 32;
                    i3 = 10;
                }
                long[] jArr22 = jArr;
                int i12 = i3;
                long[] jArr23 = new long[i12];
                long[] jArr24 = new long[i12];
                long[] jArr25 = new long[i12];
                long[] jArr26 = new long[i12];
                long[] jArr27 = new long[i12];
                long[] jArr28 = new long[i12];
                long[] jArr29 = new long[i12];
                long[] jArr30 = new long[i12];
                long[] jArr31 = new long[i12];
                long[] jArr32 = new long[i12];
                long[] jArr33 = jArr2;
                long[] jArr34 = new long[i12];
                zzyi.zzg(jArr24, jArr5);
                zzyi.zzg(jArr34, jArr24);
                zzyi.zzg(jArr32, jArr34);
                zzyi.zza(jArr25, jArr32, jArr5);
                zzyi.zza(jArr26, jArr25, jArr24);
                zzyi.zzg(jArr32, jArr26);
                zzyi.zza(jArr27, jArr32, jArr25);
                zzyi.zzg(jArr32, jArr27);
                zzyi.zzg(jArr34, jArr32);
                zzyi.zzg(jArr32, jArr34);
                zzyi.zzg(jArr34, jArr32);
                zzyi.zzg(jArr32, jArr34);
                zzyi.zza(jArr28, jArr32, jArr27);
                zzyi.zzg(jArr32, jArr28);
                zzyi.zzg(jArr34, jArr32);
                for (int i13 = 2; i13 < 10; i13 += 2) {
                    zzyi.zzg(jArr32, jArr34);
                    zzyi.zzg(jArr34, jArr32);
                }
                zzyi.zza(jArr29, jArr34, jArr28);
                zzyi.zzg(jArr32, jArr29);
                zzyi.zzg(jArr34, jArr32);
                for (int i14 = 2; i14 < 20; i14 += 2) {
                    zzyi.zzg(jArr32, jArr34);
                    zzyi.zzg(jArr34, jArr32);
                }
                zzyi.zza(jArr32, jArr34, jArr29);
                zzyi.zzg(jArr34, jArr32);
                zzyi.zzg(jArr32, jArr34);
                for (int i15 = 2; i15 < 10; i15 += 2) {
                    zzyi.zzg(jArr34, jArr32);
                    zzyi.zzg(jArr32, jArr34);
                }
                zzyi.zza(jArr30, jArr32, jArr28);
                zzyi.zzg(jArr32, jArr30);
                zzyi.zzg(jArr34, jArr32);
                for (int i16 = 2; i16 < 50; i16 += 2) {
                    zzyi.zzg(jArr32, jArr34);
                    zzyi.zzg(jArr34, jArr32);
                }
                zzyi.zza(jArr31, jArr34, jArr30);
                zzyi.zzg(jArr34, jArr31);
                zzyi.zzg(jArr32, jArr34);
                for (int i17 = 2; i17 < 100; i17 += 2) {
                    zzyi.zzg(jArr34, jArr32);
                    zzyi.zzg(jArr32, jArr34);
                }
                zzyi.zza(jArr34, jArr32, jArr31);
                zzyi.zzg(jArr32, jArr34);
                zzyi.zzg(jArr34, jArr32);
                for (int i18 = 2; i18 < 50; i18 += 2) {
                    zzyi.zzg(jArr32, jArr34);
                    zzyi.zzg(jArr34, jArr32);
                }
                zzyi.zza(jArr32, jArr34, jArr30);
                zzyi.zzg(jArr34, jArr32);
                zzyi.zzg(jArr32, jArr34);
                zzyi.zzg(jArr34, jArr32);
                zzyi.zzg(jArr32, jArr34);
                zzyi.zzg(jArr34, jArr32);
                zzyi.zza(jArr23, jArr34, jArr26);
                zzyi.zza(jArr22, jArr4, jArr23);
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = new long[11];
                long[] jArr38 = new long[11];
                long[] jArr39 = new long[11];
                zzyi.zza(jArr35, zzk, jArr22);
                zzyi.zzi(jArr36, zzk, jArr22);
                long[] jArr40 = new long[10];
                jArr40[0] = 486662;
                zzyi.zzi(jArr38, jArr36, jArr40);
                zzyi.zza(jArr38, jArr38, jArr3);
                zzyi.zzi(jArr38, jArr38, jArr33);
                zzyi.zza(jArr38, jArr38, jArr35);
                zzyi.zza(jArr38, jArr38, jArr33);
                zzyi.zzf(jArr37, jArr38, 4L);
                zzyi.zzd(jArr37);
                zzyi.zza(jArr38, jArr35, jArr3);
                zzyi.zzh(jArr38, jArr38, jArr3);
                zzyi.zza(jArr39, jArr36, jArr33);
                zzyi.zzi(jArr38, jArr38, jArr39);
                zzyi.zzg(jArr38, jArr38);
                if (zzxo.zzb(zzyi.zzj(jArr37), zzyi.zzj(jArr38))) {
                    return zzyi.zzj(jArr22);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzyj.zza(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zzb() {
        byte[] zza = zzyq.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        int i = zza[31] & 63;
        zza[31] = (byte) i;
        zza[31] = (byte) (i | 128);
        return zza;
    }

    public static byte[] zzc(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
