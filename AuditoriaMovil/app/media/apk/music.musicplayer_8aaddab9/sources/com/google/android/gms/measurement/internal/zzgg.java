package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpe;
/* loaded from: classes2.dex */
public final class zzgg implements Runnable {
    public final /* synthetic */ zzat zza;
    public final /* synthetic */ zzp zzb;
    public final /* synthetic */ zzgn zzc;

    public zzgg(zzgn zzgnVar, zzat zzatVar, zzp zzpVar) {
        this.zzc = zzgnVar;
        this.zza = zzatVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzat zzb = this.zzc.zzb(this.zza, this.zzb);
        zzpe.zzc();
        zzksVar = this.zzc.zza;
        if (zzksVar.zzg().zzs(null, zzdy.zzat)) {
            this.zzc.zzw(zzb, this.zzb);
        } else {
            this.zzc.zzB(zzb, this.zzb);
        }
    }
}
