package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class zzeji implements com.google.android.gms.ads.internal.zzf {
    public final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdba zzb;
    private final zzdbu zzc;
    private final zzdiq zzd;
    private final zzdij zze;
    private final zzctq zzf;

    public zzeji(zzdba zzdbaVar, zzdbu zzdbuVar, zzdiq zzdiqVar, zzdij zzdijVar, zzctq zzctqVar) {
        this.zzb = zzdbaVar;
        this.zzc = zzdbuVar;
        this.zzd = zzdiqVar;
        this.zze = zzdijVar;
        this.zzf = zzctqVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzg();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.zza.get()) {
            zzdba zzdbaVar = this.zzb;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
