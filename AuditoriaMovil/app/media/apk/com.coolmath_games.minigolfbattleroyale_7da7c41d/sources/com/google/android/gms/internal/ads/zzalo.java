package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzalo {
    private int zza;
    private long[] zzb;

    public zzalo() {
        this(32);
    }

    public zzalo(int i) {
        this.zzb = new long[32];
    }

    public final void zza(long j) {
        int i = this.zza;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.zzb;
        int i2 = this.zza;
        this.zza = i2 + 1;
        jArr2[i2] = j;
    }

    public final long zzb(int i) {
        if (i < 0 || i >= this.zza) {
            int i2 = this.zza;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Invalid index ");
            sb.append(i);
            sb.append(", size is ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.zzb[i];
    }

    public final int zzc() {
        return this.zza;
    }
}
