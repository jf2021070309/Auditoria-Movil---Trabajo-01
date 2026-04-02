package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdnc implements zzgla<zzcei> {
    private final zzdmy zza;
    private final zzgln<Context> zzb;
    private final zzgln<zzfar> zzc;

    public zzdnc(zzdmy zzdmyVar, zzgln<Context> zzglnVar, zzgln<zzfar> zzglnVar2) {
        this.zza = zzdmyVar;
        this.zzb = zzglnVar;
        this.zzc = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzcei zzb() {
        return new zzcei(((zzfbv) this.zzb).zza(), ((zzdat) this.zzc).zza().zzf);
    }
}
