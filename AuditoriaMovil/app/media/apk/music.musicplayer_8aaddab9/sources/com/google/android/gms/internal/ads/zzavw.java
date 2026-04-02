package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzavw implements Runnable {
    public final /* synthetic */ zzapf zza;
    public final /* synthetic */ zzavx zzb;

    public zzavw(zzavx zzavxVar, zzapf zzapfVar) {
        this.zzb = zzavxVar;
        this.zza = zzapfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
