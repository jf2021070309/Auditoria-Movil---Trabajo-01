package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzahf {
    public static final zzahf zza = new zzahf(1.0f, 1.0f);
    public static final zzadw<zzahf> zzd = zzahe.zza;
    public final float zzb;
    public final float zzc;
    private final int zze;

    public zzahf(float f2, float f3) {
        zzakt.zza(f2 > 0.0f);
        zzakt.zza(f3 > 0.0f);
        this.zzb = f2;
        this.zzc = f3;
        this.zze = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahf.class == obj.getClass()) {
            zzahf zzahfVar = (zzahf) obj;
            if (this.zzb == zzahfVar.zzb && this.zzc == zzahfVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzc) + ((Float.floatToRawIntBits(this.zzb) + 527) * 31);
    }

    public final String toString() {
        return zzamq.zzv("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzb), Float.valueOf(this.zzc));
    }

    public final long zza(long j2) {
        return j2 * this.zze;
    }
}
