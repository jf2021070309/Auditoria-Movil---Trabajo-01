package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzerx;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class zzeoh<S extends zzerx> implements zzery<S> {
    private final AtomicReference<zzeog<S>> zza = new AtomicReference<>();
    private final Clock zzb;
    private final zzery<S> zzc;
    private final long zzd;

    public zzeoh(zzery<S> zzeryVar, long j2, Clock clock) {
        this.zzb = clock;
        this.zzc = zzeryVar;
        this.zzd = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<S> zza() {
        zzeog<S> zzeogVar = this.zza.get();
        if (zzeogVar == null || zzeogVar.zza()) {
            zzeogVar = new zzeog<>(this.zzc.zza(), this.zzd, this.zzb);
            this.zza.set(zzeogVar);
        }
        return zzeogVar.zza;
    }
}
