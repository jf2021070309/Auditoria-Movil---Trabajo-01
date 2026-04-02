package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
final class zzgd implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzgm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgd(zzgm zzgmVar, zzp zzpVar) {
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
        zzp zzpVar = this.zza;
        zzknVar2.zzav().zzg();
        zzknVar2.zzr();
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzknVar2.zzT(zzpVar);
    }
}
