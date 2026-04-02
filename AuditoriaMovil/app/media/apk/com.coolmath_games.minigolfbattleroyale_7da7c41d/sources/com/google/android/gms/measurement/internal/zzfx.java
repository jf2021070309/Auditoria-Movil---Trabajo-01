package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
final class zzfx implements Runnable {
    final /* synthetic */ zzaa zza;
    final /* synthetic */ zzgm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfx(zzgm zzgmVar, zzaa zzaaVar) {
        this.zzb = zzgmVar;
        this.zza = zzaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkn zzknVar;
        zzkn zzknVar2;
        zzkn zzknVar3;
        zzknVar = this.zzb.zza;
        zzknVar.zzG();
        if (this.zza.zzc.zza() == null) {
            zzknVar3 = this.zzb.zza;
            zzknVar3.zzR(this.zza);
            return;
        }
        zzknVar2 = this.zzb.zza;
        zzknVar2.zzP(this.zza);
    }
}
