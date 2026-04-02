package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzehm extends zzehh<zzdrw> {
    private final zzcoj zza;
    private final zzdam zzb;
    private final zzdgp zzc;

    public zzehm(zzcoj zzcojVar, zzdam zzdamVar, zzdgp zzdgpVar) {
        this.zza = zzcojVar;
        this.zzb = zzdamVar;
        this.zzc = zzdgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehh
    protected final zzfsm<zzdrw> zzc(zzfar zzfarVar, Bundle bundle) {
        zzdsa zzs = this.zza.zzs();
        zzdam zzdamVar = this.zzb;
        zzdamVar.zzf(zzfarVar);
        zzdamVar.zzg(bundle);
        zzs.zzb(zzdamVar.zzh());
        zzs.zzc(this.zzc);
        zzcyj<zzdrw> zzP = zzs.zza().zzP();
        return zzP.zzd(zzP.zzc());
    }
}
