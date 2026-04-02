package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzhe implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzia zzb;

    public zzhe(zzia zziaVar, long j2) {
        this.zzb = zziaVar;
        this.zza = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzm().zzf.zzb(this.zza);
        this.zzb.zzs.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
