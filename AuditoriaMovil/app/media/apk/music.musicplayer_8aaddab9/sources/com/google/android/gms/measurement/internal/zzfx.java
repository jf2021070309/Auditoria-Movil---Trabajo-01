package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzfx implements Runnable {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ zzp zzb;
    public final /* synthetic */ zzgn zzc;

    public zzfx(zzgn zzgnVar, zzab zzabVar, zzp zzpVar) {
        this.zzc = zzgnVar;
        this.zza = zzabVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzks zzksVar2;
        zzks zzksVar3;
        zzksVar = this.zzc.zza;
        zzksVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzksVar3 = this.zzc.zza;
            zzksVar3.zzN(this.zza, this.zzb);
            return;
        }
        zzksVar2 = this.zzc.zza;
        zzksVar2.zzS(this.zza, this.zzb);
    }
}
