package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
final class zzgi implements Runnable {
    final /* synthetic */ zzkq zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzgm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgi(zzgm zzgmVar, zzkq zzkqVar, zzp zzpVar) {
        this.zzc = zzgmVar;
        this.zza = zzkqVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkn zzknVar;
        zzkn zzknVar2;
        zzkn zzknVar3;
        zzknVar = this.zzc.zza;
        zzknVar.zzG();
        if (this.zza.zza() == null) {
            zzknVar3 = this.zzc.zza;
            zzknVar3.zzK(this.zza, this.zzb);
            return;
        }
        zzknVar2 = this.zzc.zza;
        zzknVar2.zzJ(this.zza, this.zzb);
    }
}
