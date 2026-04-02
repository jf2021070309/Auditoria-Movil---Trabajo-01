package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzhw implements Runnable {
    public final /* synthetic */ zzag zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzia zze;

    public zzhw(zzia zziaVar, zzag zzagVar, int i2, long j2, boolean z) {
        this.zze = zziaVar;
        this.zza = zzagVar;
        this.zzb = i2;
        this.zzc = j2;
        this.zzd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzW(this.zza);
        zzia.zzv(this.zze, this.zza, this.zzb, this.zzc, false, this.zzd);
    }
}
