package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzchg;
import com.google.android.gms.internal.ads.zzfsm;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public zzfsm<?> zzc() {
        return zzchg.zza.zza(this.zza);
    }
}
