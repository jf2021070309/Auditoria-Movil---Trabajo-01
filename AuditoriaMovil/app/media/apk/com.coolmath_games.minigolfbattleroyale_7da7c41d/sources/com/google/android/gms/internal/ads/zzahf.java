package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzahf {
    public static final zzahf zza = new zzahf(1.0f, 1.0f);
    public static final zzadw<zzahf> zzd = zzahe.zza;
    public final float zzb;
    public final float zzc;
    private final int zze;

    public zzahf(float f, float f2) {
        zzakt.zza(f > 0.0f);
        zzakt.zza(f2 > 0.0f);
        this.zzb = f;
        this.zzc = f2;
        this.zze = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahf zzahfVar = (zzahf) obj;
            if (this.zzb == zzahfVar.zzb && this.zzc == zzahfVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.zzc);
    }

    public final String toString() {
        return zzamq.zzv("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzb), Float.valueOf(this.zzc));
    }

    public final long zza(long j) {
        return j * this.zze;
    }
}
