package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzerx;
/* loaded from: classes.dex */
public final class zzeog<S extends zzerx<?>> {
    public final zzfsm<S> zza;
    private final long zzb;
    private final Clock zzc;

    public zzeog(zzfsm<S> zzfsmVar, long j2, Clock clock) {
        this.zza = zzfsmVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j2;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
