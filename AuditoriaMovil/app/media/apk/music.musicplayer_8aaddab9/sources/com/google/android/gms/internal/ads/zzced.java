package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
/* loaded from: classes.dex */
public final class zzced {
    private final Clock zza;
    private final zzceb zzb;

    public zzced(Clock clock, zzceb zzcebVar) {
        this.zza = clock;
        this.zzb = zzcebVar;
    }

    public static zzced zza(Context context) {
        return zzcfb.zzd(context).zzb();
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(zzbim zzbimVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i2, long j2) {
        this.zzb.zza(i2, j2);
    }

    public final void zze() {
        this.zzb.zzb();
    }
}
