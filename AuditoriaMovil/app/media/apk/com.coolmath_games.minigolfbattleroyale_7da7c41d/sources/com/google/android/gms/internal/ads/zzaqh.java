package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzaqh {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzc(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((zza[i2] & i) > 0L ? 1 : ((zza[i2] & i) == 0L ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    public static long zzd(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~zza[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final void zza() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final long zze(zzapn zzapnVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.zzc == 0) {
            if (!zzapnVar.zzb(this.zzb, 0, 1, z)) {
                return -1L;
            }
            int zzc = zzc(this.zzb[0] & UByte.MAX_VALUE);
            this.zzd = zzc;
            if (zzc != -1) {
                this.zzc = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.zzd;
        if (i2 > i) {
            this.zzc = 0;
            return -2L;
        }
        if (i2 != 1) {
            zzapnVar.zzb(this.zzb, 1, i2 - 1, false);
        }
        this.zzc = 0;
        return zzd(this.zzb, this.zzd, z2);
    }
}
