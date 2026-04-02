package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzhu implements Runnable {
    public final /* synthetic */ zzag zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzia zzf;

    public zzhu(zzia zziaVar, zzag zzagVar, long j2, int i2, long j3, boolean z) {
        this.zzf = zziaVar;
        this.zza = zzagVar;
        this.zzb = j2;
        this.zzc = i2;
        this.zzd = j3;
        this.zze = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzW(this.zza);
        this.zzf.zzL(this.zzb, false);
        zzia.zzv(this.zzf, this.zza, this.zzc, this.zzd, true, this.zze);
    }
}
