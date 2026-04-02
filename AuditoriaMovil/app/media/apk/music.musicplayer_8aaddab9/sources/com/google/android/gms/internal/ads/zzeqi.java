package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzerx;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class zzeqi<S extends zzerx> implements zzery<S> {
    private final zzery<S> zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeqi(zzery<S> zzeryVar, long j2, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeryVar;
        this.zzb = j2;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<S> zza() {
        zzfsm<S> zza = this.zza.zza();
        long j2 = this.zzb;
        if (j2 > 0) {
            zza = zzfsd.zzh(zza, j2, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfsd.zzg(zza, Throwable.class, zzeqh.zza, zzchg.zzf);
    }
}
