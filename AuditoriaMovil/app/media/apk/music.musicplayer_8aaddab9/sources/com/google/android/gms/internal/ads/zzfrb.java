package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfrb implements Runnable {
    public final /* synthetic */ zzfsm zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzfrd zzc;

    public zzfrb(zzfrd zzfrdVar, zzfsm zzfsmVar, int i2) {
        this.zzc = zzfrdVar;
        this.zza = zzfsmVar;
        this.zzb = i2;
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
