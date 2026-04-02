package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzdjg implements zzgla<zzdjf> {
    private final zzgln<Set<zzdih<VideoController.VideoLifecycleCallbacks>>> zza;

    public zzdjg(zzgln<Set<zzdih<VideoController.VideoLifecycleCallbacks>>> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdjf(((zzgll) this.zza).zzb());
    }
}
