package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzns {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static zzafv zza(byte[] bArr, String str, String str2, zzn zznVar) {
        zzame zzameVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzameVar = new zzame(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b2 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b2;
                }
            }
            int length = copyOf.length;
            zzameVar = new zzame(copyOf, length);
            if (copyOf[0] == 31) {
                zzame zzameVar2 = new zzame(copyOf, length);
                while (zzameVar2.zzb() >= 16) {
                    zzameVar2.zzf(2);
                    zzameVar.zzl(zzameVar2.zzh(14), 14);
                }
            }
            zzameVar.zza(copyOf, copyOf.length);
        }
        zzameVar.zzf(60);
        int i3 = zzb[zzameVar.zzh(6)];
        int i4 = zzc[zzameVar.zzh(4)];
        int zzh = zzameVar.zzh(5);
        int i5 = zzh < 29 ? (zzd[zzh] * 1000) / 2 : -1;
        zzameVar.zzf(10);
        int i6 = zzameVar.zzh(2) > 0 ? 1 : 0;
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD(str);
        zzaftVar.zzN("audio/vnd.dts");
        zzaftVar.zzI(i5);
        zzaftVar.zzaa(i3 + i6);
        zzaftVar.zzab(i4);
        zzaftVar.zzQ(null);
        zzaftVar.zzG(str2);
        return zzaftVar.zzah();
    }
}
