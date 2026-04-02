package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzetu implements zzery<zzetv> {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbzu zzc;

    public zzetu(zzbzu zzbzuVar, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.zzc = zzbzuVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzetv> zza() {
        return zzfsd.zzj(zzfsd.zzh(zzfsd.zza(new Bundle()), ((Long) zzbet.zzc().zzc(zzbjl.zzcy)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzett.zza, zzchg.zza);
    }
}
