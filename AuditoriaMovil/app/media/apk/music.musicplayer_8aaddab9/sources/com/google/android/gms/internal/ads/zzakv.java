package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzakv {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};

    public static String zza(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static String zzb(zzamg zzamgVar) {
        zzamgVar.zzc(24);
        int zze = zzamgVar.zze(2);
        boolean zzd = zzamgVar.zzd();
        int zze2 = zzamgVar.zze(5);
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            if (zzamgVar.zzd()) {
                i2 |= 1 << i3;
            }
        }
        int i4 = 6;
        int[] iArr = new int[6];
        for (int i5 = 0; i5 < 6; i5++) {
            iArr[i5] = zzamgVar.zze(8);
        }
        int zze3 = zzamgVar.zze(8);
        Object[] objArr = new Object[5];
        objArr[0] = zzc[zze];
        objArr[1] = Integer.valueOf(zze2);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Character.valueOf(true != zzd ? 'L' : 'H');
        objArr[4] = Integer.valueOf(zze3);
        StringBuilder sb = new StringBuilder(zzamq.zzv("hvc1.%s%d.%X.%c%d", objArr));
        while (i4 > 0) {
            int i6 = i4 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i4 = i6;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    public static byte[] zzc(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i2, bArr2, 4, i3);
        return bArr2;
    }
}
