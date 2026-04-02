package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
public final class zzego implements zzgla<zzegn> {
    private final zzgln<Context> zza;
    private final zzgln<zzdkf> zzb;

    public zzego(zzgln<Context> zzglnVar, zzgln<zzdkf> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzegn zzb() {
        return new zzegn(this.zza.zzb(), this.zzb.zzb());
    }
}
