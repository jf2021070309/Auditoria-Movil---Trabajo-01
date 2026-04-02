package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzffl implements zzgla<zzffk> {
    private final zzgln<Context> zza;
    private final zzgln<zzcgz> zzb;

    public zzffl(zzgln<Context> zzglnVar, zzgln<zzcgz> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzffk zzb() {
        return new zzffk(((zzcoo) this.zza).zza(), ((zzcox) this.zzb).zza());
    }
}
