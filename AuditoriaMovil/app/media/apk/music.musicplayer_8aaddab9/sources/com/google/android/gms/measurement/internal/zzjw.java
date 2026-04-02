package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzjw implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzkd zzb;

    public zzjw(zzkd zzkdVar, long j2) {
        this.zzb = zzkdVar;
        this.zza = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkd.zzj(this.zzb, this.zza);
    }
}
