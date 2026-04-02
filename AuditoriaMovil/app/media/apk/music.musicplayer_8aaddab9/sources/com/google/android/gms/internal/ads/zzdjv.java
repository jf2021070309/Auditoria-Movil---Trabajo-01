package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
public final class zzdjv implements zzgla<zzcei> {
    private final zzdjm zza;
    private final zzgln<Context> zzb;
    private final zzgln<zzfar> zzc;

    public zzdjv(zzdjm zzdjmVar, zzgln<Context> zzglnVar, zzgln<zzfar> zzglnVar2) {
        this.zza = zzdjmVar;
        this.zzb = zzglnVar;
        this.zzc = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzcei zzb() {
        return new zzcei(((zzfbv) this.zzb).zza(), ((zzdat) this.zzc).zza().zzf);
    }
}
