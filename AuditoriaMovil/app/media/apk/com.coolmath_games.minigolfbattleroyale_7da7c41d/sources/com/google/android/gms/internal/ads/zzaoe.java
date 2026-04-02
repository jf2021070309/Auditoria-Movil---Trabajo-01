package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaoe implements Runnable {
    final /* synthetic */ zzanm zza;
    final /* synthetic */ zzaoi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoe(zzaoi zzaoiVar, zzanm zzanmVar) {
        this.zzb = zzaoiVar;
        this.zza = zzanmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaoj zzaojVar;
        zzaojVar = this.zzb.zzb;
        zzaojVar.zzh(this.zza);
    }
}
