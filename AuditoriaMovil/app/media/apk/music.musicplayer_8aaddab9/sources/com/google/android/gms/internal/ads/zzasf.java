package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzasf implements Runnable {
    public final /* synthetic */ zzasl zza;

    public zzasf(zzasl zzaslVar) {
        this.zza = zzaslVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        zzaso zzasoVar;
        z = this.zza.zzF;
        if (z) {
            return;
        }
        zzasoVar = this.zza.zzo;
        zzasoVar.zzbh(this.zza);
    }
}
