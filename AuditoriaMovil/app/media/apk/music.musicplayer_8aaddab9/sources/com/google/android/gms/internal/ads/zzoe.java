package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzoe {
    public static zzaiv zza(zznv zznvVar, boolean z) throws IOException {
        zzaiv zza = new zzol().zza(zznvVar, z ? null : zzajw.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzog zzb(zzamf zzamfVar) {
        zzamfVar.zzk(1);
        int zzr = zzamfVar.zzr();
        long zzg = zzamfVar.zzg() + zzr;
        int i2 = zzr / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long zzx = zzamfVar.zzx();
            if (zzx == -1) {
                jArr = Arrays.copyOf(jArr, i3);
                jArr2 = Arrays.copyOf(jArr2, i3);
                break;
            }
            jArr[i3] = zzx;
            jArr2[i3] = zzamfVar.zzx();
            zzamfVar.zzk(2);
            i3++;
        }
        zzamfVar.zzk((int) (zzg - zzamfVar.zzg()));
        return new zzog(jArr, jArr2);
    }
}
