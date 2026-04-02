package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzha implements Runnable {
    final /* synthetic */ zzhw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzha(zzhw zzhwVar) {
        this.zza = zzhwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zza();
    }
}
