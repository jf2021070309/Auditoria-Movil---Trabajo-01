package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzes implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzet zzb;

    public zzes(zzet zzetVar, boolean z) {
        this.zzb = zzetVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzksVar = this.zzb.zzb;
        zzksVar.zzI(this.zza);
    }
}
