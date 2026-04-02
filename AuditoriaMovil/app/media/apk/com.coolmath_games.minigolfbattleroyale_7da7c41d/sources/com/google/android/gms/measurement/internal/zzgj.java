package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
final class zzgj implements Callable<List<zzks>> {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgj(zzgm zzgmVar, String str) {
        this.zzb = zzgmVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<zzks> call() throws Exception {
        zzkn zzknVar;
        zzkn zzknVar2;
        zzknVar = this.zzb.zza;
        zzknVar.zzG();
        zzknVar2 = this.zzb.zza;
        return zzknVar2.zzi().zzl(this.zza);
    }
}
