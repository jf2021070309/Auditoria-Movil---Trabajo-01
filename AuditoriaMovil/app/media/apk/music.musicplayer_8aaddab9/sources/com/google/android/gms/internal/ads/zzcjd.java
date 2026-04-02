package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcjd implements Runnable {
    private final zzcip zza;
    private boolean zzb = false;

    public zzcjd(zzcip zzcipVar) {
        this.zza = zzcipVar;
    }

    private final void zzc() {
        zzfla zzflaVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzflaVar.removeCallbacks(this);
        zzflaVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzE();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzE();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
