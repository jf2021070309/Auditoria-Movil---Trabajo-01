package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfrb implements Runnable {
    final /* synthetic */ zzfsm zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfrd zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrb(zzfrd zzfrdVar, zzfsm zzfsmVar, int i) {
        this.zzc = zzfrdVar;
        this.zza = zzfsmVar;
        this.zzb = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.zza.isCancelled()) {
                zzfrd.zza(this.zzc, null);
                this.zzc.cancel(false);
            } else {
                this.zzc.zzL(this.zzb, this.zza);
            }
        } finally {
            zzfrd.zzy(this.zzc, null);
        }
    }
}
