package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzasf implements Runnable {
    final /* synthetic */ zzasl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
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
