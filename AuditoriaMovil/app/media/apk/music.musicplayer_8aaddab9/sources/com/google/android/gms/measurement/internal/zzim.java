package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzim implements Runnable {
    public final /* synthetic */ zzih zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzio zzc;

    public zzim(zzio zzioVar, zzih zzihVar, long j2) {
        this.zzc = zzioVar;
        this.zza = zzihVar;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzC(this.zza, false, this.zzb);
        zzio zzioVar = this.zzc;
        zzioVar.zza = null;
        zzioVar.zzs.zzt().zzG(null);
    }
}
