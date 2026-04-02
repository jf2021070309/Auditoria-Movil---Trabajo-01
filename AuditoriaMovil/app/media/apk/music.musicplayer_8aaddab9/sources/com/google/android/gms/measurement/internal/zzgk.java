package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class zzgk implements Callable<List<zzkx>> {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzgn zzb;

    public zzgk(zzgn zzgnVar, String str) {
        this.zzb = zzgnVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<zzkx> call() throws Exception {
        zzks zzksVar;
        zzks zzksVar2;
        zzksVar = this.zzb.zza;
        zzksVar.zzA();
        zzksVar2 = this.zzb.zza;
        return zzksVar2.zzi().zzu(this.zza);
    }
}
