package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdap implements zzgla<Context> {
    private final zzdao zza;
    private final zzgln<Context> zzb;

    public zzdap(zzdao zzdaoVar, zzgln<Context> zzglnVar) {
        this.zza = zzdaoVar;
        this.zzb = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zze = this.zza.zze(((zzfbv) this.zzb).zza());
        zzgli.zzb(zze);
        return zze;
    }
}
