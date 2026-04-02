package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzii implements Runnable {
    final /* synthetic */ zzid zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzik zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzii(zzik zzikVar, zzid zzidVar, long j) {
        this.zzc = zzikVar;
        this.zza = zzidVar;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzC(this.zza, false, this.zzb);
        zzik zzikVar = this.zzc;
        zzikVar.zza = null;
        zzikVar.zzs.zzy().zzz(null);
    }
}
