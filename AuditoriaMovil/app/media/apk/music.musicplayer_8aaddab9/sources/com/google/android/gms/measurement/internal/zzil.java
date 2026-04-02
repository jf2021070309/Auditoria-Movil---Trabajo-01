package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzil implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzio zzb;

    public zzil(zzio zzioVar, long j2) {
        this.zzb = zzioVar;
        this.zza = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
