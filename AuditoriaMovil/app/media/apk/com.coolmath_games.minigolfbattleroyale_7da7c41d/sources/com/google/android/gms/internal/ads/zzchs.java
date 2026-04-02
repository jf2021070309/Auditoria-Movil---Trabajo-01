package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@Deprecated
/* loaded from: classes2.dex */
public class zzchs<T> {
    private final zzchl<T> zza = new zzchl<>();
    private final AtomicInteger zzb = new AtomicInteger(0);

    public zzchs() {
        zzfsd.zzp(this.zza, new zzchq(this), zzchg.zzf);
    }

    @Deprecated
    public final void zzf(zzchp<T> zzchpVar, zzchn zzchnVar) {
        zzfsd.zzp(this.zza, new zzchr(this, zzchpVar, zzchnVar), zzchg.zzf);
    }

    @Deprecated
    public final void zzg(T t) {
        this.zza.zzc(t);
    }

    @Deprecated
    public final void zzh() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }
}
