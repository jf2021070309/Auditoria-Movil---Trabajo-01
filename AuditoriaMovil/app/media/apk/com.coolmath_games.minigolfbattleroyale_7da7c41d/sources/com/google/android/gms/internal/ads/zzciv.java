package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzciv {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) zzbet.zzc().zzc(zzbjl.zzy)).longValue());
    private boolean zzc = true;

    public final void zza() {
        this.zzc = true;
    }

    public final void zzb(SurfaceTexture surfaceTexture, zzcih zzcihVar) {
        if (zzcihVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.zzc || Math.abs(timestamp - this.zzb) >= this.zza) {
            this.zzc = false;
            this.zzb = timestamp;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzciu(this, zzcihVar));
        }
    }
}
