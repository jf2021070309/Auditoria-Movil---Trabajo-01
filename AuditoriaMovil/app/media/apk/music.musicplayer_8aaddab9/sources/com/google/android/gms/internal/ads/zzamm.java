package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzamm<V> {
    private long[] zza;
    private V[] zzb;
    private int zzc;
    private int zzd;

    public zzamm() {
        this(10);
    }

    public zzamm(int i2) {
        this.zza = new long[10];
        this.zzb = (V[]) new Object[10];
    }

    private final V zzf() {
        zzakt.zzd(this.zzd > 0);
        V[] vArr = this.zzb;
        int i2 = this.zzc;
        V v = vArr[i2];
        vArr[i2] = null;
        this.zzc = (i2 + 1) % vArr.length;
        this.zzd--;
        return v;
    }

    public final synchronized void zza(long j2, V v) {
        int i2 = this.zzd;
        if (i2 > 0) {
            if (j2 <= this.zza[((this.zzc + i2) - 1) % this.zzb.length]) {
                zzb();
            }
        }
        int length = this.zzb.length;
        if (this.zzd >= length) {
            int i3 = length + length;
            long[] jArr = new long[i3];
            V[] vArr = (V[]) new Object[i3];
            int i4 = this.zzc;
            int i5 = length - i4;
            System.arraycopy(this.zza, i4, jArr, 0, i5);
            System.arraycopy(this.zzb, this.zzc, vArr, 0, i5);
            int i6 = this.zzc;
            if (i6 > 0) {
                System.arraycopy(this.zza, 0, jArr, i5, i6);
                System.arraycopy(this.zzb, 0, vArr, i5, this.zzc);
            }
            this.zza = jArr;
            this.zzb = vArr;
            this.zzc = 0;
        }
        int i7 = this.zzc;
        int i8 = this.zzd;
        V[] vArr2 = this.zzb;
        int length2 = (i7 + i8) % vArr2.length;
        this.zza[length2] = j2;
        vArr2[length2] = v;
        this.zzd = i8 + 1;
    }

    public final synchronized void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public final synchronized int zzc() {
        return this.zzd;
    }

    public final synchronized V zzd() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    public final synchronized V zze(long j2) {
        V v;
        v = null;
        while (this.zzd > 0 && j2 - this.zza[this.zzc] >= 0) {
            v = zzf();
        }
        return v;
    }
}
