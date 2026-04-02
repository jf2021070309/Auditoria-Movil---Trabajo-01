package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbtg implements Runnable {
    final /* synthetic */ zzbtr zza;
    final /* synthetic */ zzbsn zzb;
    final /* synthetic */ zzbts zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtg(zzbts zzbtsVar, zzbtr zzbtrVar, zzbsn zzbsnVar) {
        this.zzc = zzbtsVar;
        this.zza = zzbtrVar;
        this.zzb = zzbsnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzc.zza;
        synchronized (obj) {
            if (this.zza.zzi() != -1 && this.zza.zzi() != 1) {
                this.zza.zzh();
                zzchg.zze.execute(zzbtf.zza(this.zzb));
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
