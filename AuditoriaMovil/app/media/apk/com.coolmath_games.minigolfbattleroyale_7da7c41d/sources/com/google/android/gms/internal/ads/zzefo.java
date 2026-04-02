package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzefo implements zzgla<zzefn> {
    private final zzgln<Context> zza;
    private final zzgln<zzcwe> zzb;

    public zzefo(zzgln<Context> zzglnVar, zzgln<zzcwe> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzefn zzb() {
        return new zzefn(this.zza.zzb(), this.zzb.zzb());
    }
}
