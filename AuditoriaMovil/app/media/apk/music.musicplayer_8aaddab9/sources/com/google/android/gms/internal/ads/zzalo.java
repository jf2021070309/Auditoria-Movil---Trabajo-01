package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzalo {
    private int zza;
    private long[] zzb;

    public zzalo() {
        this(32);
    }

    public zzalo(int i2) {
        this.zzb = new long[32];
    }

    public final void zza(long j2) {
        int i2 = this.zza;
        long[] jArr = this.zzb;
        if (i2 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i2 + i2);
        }
        long[] jArr2 = this.zzb;
        int i3 = this.zza;
        this.zza = i3 + 1;
        jArr2[i3] = j2;
    }

    public final long zzb(int i2) {
        if (i2 < 0 || i2 >= this.zza) {
            throw new IndexOutOfBoundsException(a.S(46, "Invalid index ", i2, ", size is ", this.zza));
        }
        return this.zzb[i2];
    }

    public final int zzc() {
        return this.zza;
    }
}
