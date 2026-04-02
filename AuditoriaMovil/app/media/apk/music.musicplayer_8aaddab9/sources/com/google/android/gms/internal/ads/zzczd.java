package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
public final class zzczd implements zzgla<com.google.android.gms.ads.internal.zzb> {
    private final zzczc zza;
    private final zzgln<Context> zzb;
    private final zzgln<zzcdy> zzc;

    public zzczd(zzczc zzczcVar, zzgln<Context> zzglnVar, zzgln<zzcdy> zzglnVar2) {
        this.zza = zzczcVar;
        this.zzb = zzglnVar;
        this.zzc = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb(this.zzb.zzb(), this.zzc.zzb(), null);
    }
}
