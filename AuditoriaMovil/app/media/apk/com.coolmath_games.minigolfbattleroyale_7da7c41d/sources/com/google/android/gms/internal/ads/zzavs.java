package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzavs implements Runnable {
    final /* synthetic */ zzanm zza;
    final /* synthetic */ zzavx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavs(zzavx zzavxVar, zzanm zzanmVar) {
        this.zzb = zzavxVar;
        this.zza = zzanmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzavy zzavyVar;
        zzavyVar = this.zzb.zzb;
        zzavyVar.zzl(this.zza);
    }
}
