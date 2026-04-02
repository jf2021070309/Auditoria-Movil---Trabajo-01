package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdlc implements zzgla<Set<String>> {
    private final zzgln<zzdmx> zza;

    public zzdlc(zzgln<zzdmx> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        if (((zzdkz) this.zza).zza().zzd() != null) {
            emptySet = Collections.singleton("banner");
        } else {
            emptySet = Collections.emptySet();
        }
        zzgli.zzb(emptySet);
        return emptySet;
    }
}
