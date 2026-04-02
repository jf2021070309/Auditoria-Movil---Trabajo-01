package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzns {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, SyslogConstants.LOG_ALERT, 128, 192, 224, 256, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, ThrowableProxyConverter.BUILDER_CAPACITY, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static zzafv zza(byte[] bArr, String str, String str2, zzn zznVar) {
        zzame zzameVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzameVar = new zzame(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = copyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                    byte b3 = copyOf[i2];
                    int i3 = i2 + 1;
                    copyOf[i2] = copyOf[i3];
                    copyOf[i3] = b3;
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
        int i4 = zzb[zzameVar.zzh(6)];
        int i5 = zzc[zzameVar.zzh(4)];
        int zzh = zzameVar.zzh(5);
        int i6 = zzh < 29 ? (zzd[zzh] * 1000) / 2 : -1;
        zzameVar.zzf(10);
        int i7 = zzameVar.zzh(2) > 0 ? 1 : 0;
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD(str);
        zzaftVar.zzN("audio/vnd.dts");
        zzaftVar.zzI(i6);
        zzaftVar.zzaa(i4 + i7);
        zzaftVar.zzab(i5);
        zzaftVar.zzQ(null);
        zzaftVar.zzG(str2);
        return zzaftVar.zzah();
    }
}
