package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcvv implements zzgla<Set<zzdih<zzdcq>>> {
    private final zzcvo zza;
    private final zzgln<zzcwy> zzb;

    public zzcvv(zzcvo zzcvoVar, zzgln<zzcwy> zzglnVar) {
        this.zza = zzcvoVar;
        this.zzb = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set<zzdih<zzdcq>> zzg = zzcvo.zzg(this.zzb.zzb());
        zzgli.zzb(zzg);
        return zzg;
    }
}
