package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
public final class zzcvz implements zzgla<zzcei> {
    private final zzcvo zza;
    private final zzgln<Context> zzb;
    private final zzgln<zzfar> zzc;

    public zzcvz(zzcvo zzcvoVar, zzgln<Context> zzglnVar, zzgln<zzfar> zzglnVar2) {
        this.zza = zzcvoVar;
        this.zzb = zzglnVar;
        this.zzc = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzcei zzb() {
        return new zzcei(((zzfbv) this.zzb).zza(), ((zzdat) this.zzc).zza().zzf);
    }
}
