package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaak implements Runnable {
    final /* synthetic */ zzaal zza;

    /* JADX INFO: Access modifiers changed from: package-private */
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
            } catch (Exception e) {
                zzfiiVar = this.zza.zzh;
                zzfiiVar.zzc(2023, -1L, e);
            }
            obj2 = this.zza.zzl;
            synchronized (obj2) {
                this.zza.zzm = false;
            }
        }
    }
}
