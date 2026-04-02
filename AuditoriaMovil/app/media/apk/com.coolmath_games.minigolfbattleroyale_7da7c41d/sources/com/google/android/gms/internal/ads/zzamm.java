package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzamm<V> {
    private long[] zza;
    private V[] zzb;
    private int zzc;
    private int zzd;

    public zzamm() {
        this(10);
    }

    public zzamm(int i) {
        this.zza = new long[10];
        this.zzb = (V[]) new Object[10];
    }

    private final V zzf() {
        zzakt.zzd(this.zzd > 0);
        V[] vArr = this.zzb;
        int i = this.zzc;
        V v = vArr[i];
        vArr[i] = null;
        this.zzc = (i + 1) % vArr.length;
        this.zzd--;
        return v;
    }

    public final synchronized void zza(long j, V v) {
        int i = this.zzd;
        if (i > 0) {
            if (j <= this.zza[((this.zzc + i) - 1) % this.zzb.length]) {
                zzb();
            }
        }
        int length = this.zzb.length;
        if (this.zzd >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            V[] vArr = (V[]) new Object[i2];
            int i3 = this.zzc;
            int i4 = length - i3;
            System.arraycopy(this.zza, i3, jArr, 0, i4);
            System.arraycopy(this.zzb, this.zzc, vArr, 0, i4);
            int i5 = this.zzc;
            if (i5 > 0) {
                System.arraycopy(this.zza, 0, jArr, i4, i5);
                System.arraycopy(this.zzb, 0, vArr, i4, this.zzc);
            }
            this.zza = jArr;
            this.zzb = vArr;
            this.zzc = 0;
        }
        int i6 = this.zzc;
        int i7 = this.zzd;
        V[] vArr2 = this.zzb;
        int length2 = (i6 + i7) % vArr2.length;
        this.zza[length2] = j;
        vArr2[length2] = v;
        this.zzd = i7 + 1;
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

    public final synchronized V zze(long j) {
        V v;
        v = null;
        while (this.zzd > 0 && j - this.zza[this.zzc] >= 0) {
            v = zzf();
        }
        return v;
    }
}
