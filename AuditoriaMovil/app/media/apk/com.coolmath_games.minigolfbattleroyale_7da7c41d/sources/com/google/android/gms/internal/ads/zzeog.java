package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzerx;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzeog<S extends zzerx<?>> {
    public final zzfsm<S> zza;
    private final long zzb;
    private final Clock zzc;

    public zzeog(zzfsm<S> zzfsmVar, long j, Clock clock) {
        this.zza = zzfsmVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
