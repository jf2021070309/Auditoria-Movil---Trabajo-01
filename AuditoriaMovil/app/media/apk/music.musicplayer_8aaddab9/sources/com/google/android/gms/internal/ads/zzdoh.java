package com.google.android.gms.internal.ads;

import c.f.a;
/* loaded from: classes.dex */
public final class zzdoh implements zzdbw {
    private final zzdmm zza;
    private final zzdmr zzb;

    public zzdoh(zzdmm zzdmmVar, zzdmr zzdmrVar) {
        this.zza = zzdmmVar;
        this.zzb = zzdmrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzg() {
        if (this.zza.zzU() == null) {
            return;
        }
        zzcml zzT = this.zza.zzT();
        zzcml zzR = this.zza.zzR();
        if (zzT == null) {
            zzT = zzR != null ? zzR : null;
        }
        if (!this.zzb.zzd() || zzT == null) {
            return;
        }
        zzT.zze("onSdkImpression", new a());
    }
}
