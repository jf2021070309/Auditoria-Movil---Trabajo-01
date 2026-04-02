package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzgl implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzgn zzb;

    public zzgl(zzgn zzgnVar, zzp zzpVar) {
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
        zzksVar2.zzK(this.zza);
    }
}
