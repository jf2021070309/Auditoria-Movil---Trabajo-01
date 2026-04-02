package com.google.android.gms.internal.ads;

import java.util.Set;
/* loaded from: classes.dex */
public final class zzdct implements zzgla<zzdcs> {
    private final zzgln<Set<zzdih<zzdcu>>> zza;

    public zzdct(zzgln<Set<zzdih<zzdcu>>> zzglnVar) {
        this.zza = zzglnVar;
    }

    public static zzdcs zzc(Set<zzdih<zzdcu>> set) {
        return new zzdcs(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zza */
    public final zzdcs zzb() {
        return new zzdcs(((zzgll) this.zza).zzb());
    }
}
