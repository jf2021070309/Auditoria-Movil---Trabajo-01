package com.google.android.gms.internal.ads;

import ch.qos.logback.core.util.FileSize;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzqj {
    private final zzamf zza = new zzamf(8);
    private int zzb;

    private final long zzb(zznv zznvVar) throws IOException {
        zznp zznpVar = (zznp) zznvVar;
        int i2 = 0;
        zznpVar.zzh(this.zza.zzi(), 0, 1, false);
        int i3 = this.zza.zzi()[0] & 255;
        if (i3 != 0) {
            int i4 = 128;
            int i5 = 0;
            while ((i3 & i4) == 0) {
                i4 >>= 1;
                i5++;
            }
            int i6 = i3 & (i4 ^ (-1));
            zznpVar.zzh(this.zza.zzi(), 1, i5, false);
            while (i2 < i5) {
                i2++;
                i6 = (this.zza.zzi()[i2] & 255) + (i6 << 8);
            }
            this.zzb = i5 + 1 + this.zzb;
            return i6;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zznv zznvVar) throws IOException {
        long zzo = zznvVar.zzo();
        long j2 = FileSize.KB_COEFFICIENT;
        if (zzo != -1 && zzo <= FileSize.KB_COEFFICIENT) {
            j2 = zzo;
        }
        int i2 = (int) j2;
        zznp zznpVar = (zznp) zznvVar;
        zznpVar.zzh(this.zza.zzi(), 0, 4, false);
        long zzt = this.zza.zzt();
        this.zzb = 4;
        while (zzt != 440786851) {
            int i3 = this.zzb + 1;
            this.zzb = i3;
            if (i3 == i2) {
                return false;
            }
            zznpVar.zzh(this.zza.zzi(), 0, 1, false);
            zzt = ((zzt << 8) & (-256)) | (this.zza.zzi()[0] & 255);
        }
        long zzb = zzb(zznvVar);
        long j3 = this.zzb;
        if (zzb != Long.MIN_VALUE && (zzo == -1 || j3 + zzb < zzo)) {
            while (true) {
                long j4 = this.zzb;
                long j5 = j3 + zzb;
                if (j4 < j5) {
                    if (zzb(zznvVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long zzb2 = zzb(zznvVar);
                    if (zzb2 < 0) {
                        return false;
                    }
                    if (zzb2 != 0) {
                        int i4 = (int) zzb2;
                        zznpVar.zzj(i4, false);
                        this.zzb += i4;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }
}
