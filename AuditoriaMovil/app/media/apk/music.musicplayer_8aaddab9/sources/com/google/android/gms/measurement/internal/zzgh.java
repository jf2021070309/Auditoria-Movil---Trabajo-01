package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzgh implements Runnable {
    public final /* synthetic */ zzat zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzgn zzc;

    public zzgh(zzgn zzgnVar, zzat zzatVar, String str) {
        this.zzc = zzgnVar;
        this.zza = zzatVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzks zzksVar2;
        zzksVar = this.zzc.zza;
        zzksVar.zzA();
        zzksVar2 = this.zzc.zza;
        zzksVar2.zzE(this.zza, this.zzb);
    }
}
