package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzaqh {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzc(int i2) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = ((zza[i3] & i2) > 0L ? 1 : ((zza[i3] & i2) == 0L ? 0 : -1));
            i3++;
            if (i4 != 0) {
                return i3;
            }
        }
        return -1;
    }

    public static long zzd(byte[] bArr, int i2, boolean z) {
        long j2 = bArr[0] & 255;
        if (z) {
            j2 &= zza[i2 - 1] ^ (-1);
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (bArr[i3] & 255);
        }
        return j2;
    }

    public final void zza() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final long zze(zzapn zzapnVar, boolean z, boolean z2, int i2) throws IOException, InterruptedException {
        if (this.zzc == 0) {
            if (!zzapnVar.zzb(this.zzb, 0, 1, z)) {
                return -1L;
            }
            int zzc = zzc(this.zzb[0] & 255);
            this.zzd = zzc;
            if (zzc == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i3 = this.zzd;
        if (i3 > i2) {
            this.zzc = 0;
            return -2L;
        }
        if (i3 != 1) {
            zzapnVar.zzb(this.zzb, 1, i3 - 1, false);
        }
        this.zzc = 0;
        return zzd(this.zzb, this.zzd, z2);
    }
}
