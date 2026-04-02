package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
public final class zzfu implements Runnable {
    public final /* synthetic */ zzgy zza;
    public final /* synthetic */ zzfv zzb;

    public zzfu(zzfv zzfvVar, zzgy zzgyVar) {
        this.zzb = zzfvVar;
        this.zza = zzgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfv.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
