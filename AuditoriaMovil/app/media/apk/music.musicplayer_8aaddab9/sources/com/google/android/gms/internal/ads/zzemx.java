package com.google.android.gms.internal.ads;

import java.util.Set;
/* loaded from: classes.dex */
public final class zzemx implements zzgla<zzemw> {
    private final zzgln<Set<String>> zza;

    public zzemx(zzgln<Set<String>> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemw(this.zza.zzb());
    }
}
