package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzoe {
    public static zzog zzb(zzamf zzamfVar) {
        zzamfVar.zzk(1);
        int zzr = zzamfVar.zzr();
        long zzg = zzamfVar.zzg() + zzr;
        int i = zzr / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzx = zzamfVar.zzx();
            if (zzx != -1) {
                jArr[i2] = zzx;
                jArr2[i2] = zzamfVar.zzx();
                zzamfVar.zzk(2);
                i2++;
            } else {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
        }
        zzamfVar.zzk((int) (zzg - zzamfVar.zzg()));
        return new zzog(jArr, jArr2);
    }

    public static zzaiv zza(zznv zznvVar, boolean z) throws IOException {
        zzaiv zza = new zzol().zza(zznvVar, z ? null : zzajw.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
