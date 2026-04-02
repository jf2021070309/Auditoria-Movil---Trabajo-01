package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcya implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzdcj zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcya(zzdcj zzdcjVar) {
        this.zza = zzdcjVar;
    }

    private final void zzh() {
        if (this.zzc.get()) {
            return;
        }
        this.zzc.set(true);
        this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbp() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs(int i) {
        this.zzb.set(true);
        zzh();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzd() {
        zzh();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
