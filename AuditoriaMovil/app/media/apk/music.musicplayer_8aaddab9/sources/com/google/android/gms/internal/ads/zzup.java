package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzup {
    public static int zza(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] != 71) {
            i2++;
        }
        return i2;
    }

    public static long zzb(zzamf zzamfVar, int i2, int i3) {
        zzamfVar.zzh(i2);
        if (zzamfVar.zzd() < 5) {
            return -9223372036854775807L;
        }
        int zzv = zzamfVar.zzv();
        if ((8388608 & zzv) == 0 && ((zzv >> 8) & 8191) == i3 && (zzv & 32) != 0 && zzamfVar.zzn() >= 7 && zzamfVar.zzd() >= 7 && (zzamfVar.zzn() & 16) == 16) {
            byte[] bArr = new byte[6];
            zzamfVar.zzm(bArr, 0, 6);
            byte b2 = bArr[0];
            byte b3 = bArr[1];
            byte b4 = bArr[2];
            long j2 = bArr[3] & 255;
            return ((b3 & 255) << 17) | ((b2 & 255) << 25) | ((b4 & 255) << 9) | (j2 + j2) | ((bArr[4] & 255) >> 7);
        }
        return -9223372036854775807L;
    }
}
