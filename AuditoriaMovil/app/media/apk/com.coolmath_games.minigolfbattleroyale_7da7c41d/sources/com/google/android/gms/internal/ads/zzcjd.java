package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcjd implements Runnable {
    private final zzcip zza;
    private boolean zzb = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjd(zzcip zzcipVar) {
        this.zza = zzcipVar;
    }

    private final void zzc() {
        com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this);
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this, 250L);
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
