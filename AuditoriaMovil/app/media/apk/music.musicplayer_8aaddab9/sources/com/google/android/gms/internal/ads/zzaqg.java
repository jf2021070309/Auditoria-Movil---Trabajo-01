package com.google.android.gms.internal.ads;

import ch.qos.logback.core.util.FileSize;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzaqg {
    private final zzaux zza = new zzaux(8);
    private int zzb;

    private final long zzb(zzapn zzapnVar) throws IOException, InterruptedException {
        int i2 = 0;
        zzapnVar.zze(this.zza.zza, 0, 1, false);
        int i3 = this.zza.zza[0] & 255;
        if (i3 != 0) {
            int i4 = 128;
            int i5 = 0;
            while ((i3 & i4) == 0) {
                i4 >>= 1;
                i5++;
            }
            int i6 = i3 & (i4 ^ (-1));
            zzapnVar.zze(this.zza.zza, 1, i5, false);
            while (i2 < i5) {
                i2++;
                i6 = (this.zza.zza[i2] & 255) + (i6 << 8);
            }
            this.zzb = i5 + 1 + this.zzb;
            return i6;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzapn zzapnVar) throws IOException, InterruptedException {
        long zzi = zzapnVar.zzi();
        long j2 = FileSize.KB_COEFFICIENT;
        if (zzi != -1 && zzi <= FileSize.KB_COEFFICIENT) {
            j2 = zzi;
        }
        int i2 = (int) j2;
        zzapnVar.zze(this.zza.zza, 0, 4, false);
        long zzp = this.zza.zzp();
        this.zzb = 4;
        while (zzp != 440786851) {
            int i3 = this.zzb + 1;
            this.zzb = i3;
            if (i3 == i2) {
                return false;
            }
            zzapnVar.zze(this.zza.zza, 0, 1, false);
            zzp = ((zzp << 8) & (-256)) | (this.zza.zza[0] & 255);
        }
        long zzb = zzb(zzapnVar);
        long j3 = this.zzb;
        if (zzb != Long.MIN_VALUE && (zzi == -1 || j3 + zzb < zzi)) {
            while (true) {
                long j4 = this.zzb;
                long j5 = j3 + zzb;
                if (j4 < j5) {
                    if (zzb(zzapnVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long zzb2 = zzb(zzapnVar);
                    if (zzb2 < 0) {
                        return false;
                    }
                    if (zzb2 != 0) {
                        zzapnVar.zzf((int) zzb2, false);
                        this.zzb = (int) (this.zzb + zzb2);
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }
}
