package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
/* loaded from: classes.dex */
public final class zzclm implements zzafy {
    private final zzko zza = new zzko(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zza() {
        zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzb() {
        zzn(true);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc() {
        zzn(true);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zzd() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzf(long j2, long j3, float f2) {
        boolean z = true;
        char c2 = j3 > this.zzc ? (char) 0 : j3 < this.zzb ? (char) 2 : (char) 1;
        int zzg = this.zza.zzg();
        int i2 = this.zzf;
        if (c2 != 2 && (c2 != 1 || !this.zzg || zzg >= i2)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzg(long j2, float f2, boolean z, long j3) {
        long j4 = z ? this.zze : this.zzd;
        return j4 <= 0 || j2 >= j4;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzko zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzi(zzahv[] zzahvVarArr, zzs zzsVar, zzjg[] zzjgVarArr) {
        this.zzf = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzjgVarArr[i2] != null) {
                this.zzf += zzahvVarArr[i2].zzac() != 1 ? 131072000 : 13107200;
            }
        }
        this.zza.zzb(this.zzf);
    }

    public final synchronized void zzj(int i2) {
        this.zzb = i2 * 1000;
    }

    public final synchronized void zzk(int i2) {
        this.zzc = i2 * 1000;
    }

    public final synchronized void zzl(int i2) {
        this.zzd = i2 * 1000;
    }

    public final synchronized void zzm(int i2) {
        this.zze = i2 * 1000;
    }

    @VisibleForTesting
    public final void zzn(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zza();
        }
    }
}
