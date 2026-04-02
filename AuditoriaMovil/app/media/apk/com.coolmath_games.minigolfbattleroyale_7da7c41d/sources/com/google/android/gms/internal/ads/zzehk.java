package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzehk extends zzehh<zzdji> {
    private final zzcoj zza;
    private final zzdam zzb;
    private final zzejq zzc;
    private final zzdgp zzd;

    public zzehk(zzcoj zzcojVar, zzdam zzdamVar, zzejq zzejqVar, zzdgp zzdgpVar) {
        this.zza = zzcojVar;
        this.zzb = zzdamVar;
        this.zzc = zzejqVar;
        this.zzd = zzdgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehh
    protected final zzfsm<zzdji> zzc(zzfar zzfarVar, Bundle bundle) {
        zzdke zzp = this.zza.zzp();
        zzdam zzdamVar = this.zzb;
        zzdamVar.zzf(zzfarVar);
        zzdamVar.zzg(bundle);
        zzp.zzc(zzdamVar.zzh());
        zzp.zzd(this.zzd);
        zzp.zzb(this.zzc);
        zzcyj<zzdji> zzP = zzp.zza().zzP();
        return zzP.zzd(zzP.zzc());
    }
}
