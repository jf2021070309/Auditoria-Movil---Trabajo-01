package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
final class zzgc implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzgm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgc(zzgm zzgmVar, zzp zzpVar) {
        this.zzb = zzgmVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkn zzknVar;
        zzkn zzknVar2;
        zzknVar = this.zzb.zza;
        zzknVar.zzG();
        zzknVar2 = this.zzb.zza;
        zzknVar2.zzI(this.zza);
    }
}
