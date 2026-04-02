package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes2.dex */
public final class zzge implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzgn zzb;

    public zzge(zzgn zzgnVar, zzp zzpVar) {
        this.zzb = zzgnVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzks zzksVar2;
        zzksVar = this.zzb.zza;
        zzksVar.zzA();
        zzksVar2 = this.zzb.zza;
        zzp zzpVar = this.zza;
        zzksVar2.zzaz().zzg();
        zzksVar2.zzB();
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzksVar2.zzd(zzpVar);
    }
}
