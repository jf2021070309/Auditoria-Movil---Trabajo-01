package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
/* loaded from: classes.dex */
public final class zzfbo implements zzgla<Clock> {
    private final zzfbn zza;

    public zzfbo(zzfbn zzfbnVar) {
        this.zza = zzfbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzgli.zzb(defaultClock);
        return defaultClock;
    }
}
