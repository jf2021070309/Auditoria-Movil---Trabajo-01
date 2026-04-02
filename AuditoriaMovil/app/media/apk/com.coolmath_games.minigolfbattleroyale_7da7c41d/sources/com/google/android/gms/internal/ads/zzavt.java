package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzavt implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzavx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavt(zzavx zzavxVar, int i, long j) {
        this.zzc = zzavxVar;
        this.zza = i;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzavy zzavyVar;
        zzavyVar = this.zzc.zzb;
        zzavyVar.zzm(this.zza, this.zzb);
    }
}
