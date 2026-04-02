package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.0 */
/* loaded from: classes2.dex */
final class zzh implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzy().zzx(this.zza);
    }
}
