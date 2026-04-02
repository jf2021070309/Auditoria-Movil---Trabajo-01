package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
/* loaded from: classes.dex */
public final class zzcjy {
    private final zzauc zza = new zzauc(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza() {
        zzk(false);
    }

    public final void zzb(zzanr[] zzanrVarArr, zzatg zzatgVar, zzats zzatsVar) {
        this.zzf = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzatsVar.zza(i2) != null) {
                this.zzf = zzave.zzq(zzanrVarArr[i2].zza()) + this.zzf;
            }
        }
        this.zza.zzb(this.zzf);
    }

    public final void zzc() {
        zzk(true);
    }

    public final void zzd() {
        zzk(true);
    }

    public final synchronized boolean zze(long j2, boolean z) {
        long j3;
        j3 = z ? this.zze : this.zzd;
        return j3 <= 0 || j2 >= j3;
    }

    public final synchronized boolean zzf(long j2) {
        boolean z;
        z = true;
        char c2 = j2 > this.zzc ? (char) 0 : j2 < this.zzb ? (char) 2 : (char) 1;
        int zzg = this.zza.zzg();
        int i2 = this.zzf;
        if (c2 != 2 && (c2 != 1 || !this.zzg || zzg >= i2)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    public final synchronized void zzg(int i2) {
        this.zzb = i2 * 1000;
    }

    public final synchronized void zzh(int i2) {
        this.zzc = i2 * 1000;
    }

    public final synchronized void zzi(int i2) {
        this.zzd = i2 * 1000;
    }

    public final synchronized void zzj(int i2) {
        this.zze = i2 * 1000;
    }

    @VisibleForTesting
    public final void zzk(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zza();
        }
    }

    public final zzauc zzl() {
        return this.zza;
    }
}
