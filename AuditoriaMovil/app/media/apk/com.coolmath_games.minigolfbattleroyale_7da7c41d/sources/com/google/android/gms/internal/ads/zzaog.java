package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzaog implements Runnable {
    final /* synthetic */ zzapf zza;
    final /* synthetic */ zzaoi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaog(zzaoi zzaoiVar, zzapf zzapfVar) {
        this.zzb = zzaoiVar;
        this.zza = zzapfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
