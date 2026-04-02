package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzakv {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};

    public static String zza(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String zzb(zzamg zzamgVar) {
        zzamgVar.zzc(24);
        int zze = zzamgVar.zze(2);
        boolean zzd = zzamgVar.zzd();
        int zze2 = zzamgVar.zze(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (zzamgVar.zzd()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = zzamgVar.zze(8);
        }
        int zze3 = zzamgVar.zze(8);
        Object[] objArr = new Object[5];
        objArr[0] = zzc[zze];
        objArr[1] = Integer.valueOf(zze2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(true != zzd ? 'L' : 'H');
        objArr[4] = Integer.valueOf(zze3);
        StringBuilder sb = new StringBuilder(zzamq.zzv("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0) {
            int i5 = i3 - 1;
            if (iArr[i5] != 0) {
                break;
            }
            i3 = i5;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static byte[] zzc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
