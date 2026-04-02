package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzaak implements Runnable {
    public final /* synthetic */ zzaal zza;

    public zzaak(zzaal zzaalVar) {
        this.zza = zzaalVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfii zzfiiVar;
        Object obj2;
        obj = this.zza.zzl;
        synchronized (obj) {
            z = this.zza.zzm;
            if (z) {
                return;
            }
            this.zza.zzm = true;
            try {
                zzaal.zzi(this.zza);
            } catch (Exception e2) {
                zzfiiVar = this.zza.zzh;
                zzfiiVar.zzc(2023, -1L, e2);
            }
            obj2 = this.zza.zzl;
            synchronized (obj2) {
                this.zza.zzm = false;
            }
        }
    }
}
