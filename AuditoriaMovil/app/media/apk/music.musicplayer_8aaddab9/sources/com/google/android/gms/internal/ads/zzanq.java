package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzanq {
    public static final zzanq zza = new zzanq(1.0f, 1.0f);
    public final float zzb;
    public final float zzc = 1.0f;
    private final int zzd;

    public zzanq(float f2, float f3) {
        this.zzb = f2;
        this.zzd = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzanq.class == obj.getClass() && this.zzb == ((zzanq) obj).zzb;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(1.0f) + ((Float.floatToRawIntBits(this.zzb) + 527) * 31);
    }

    public final long zza(long j2) {
        return j2 * this.zzd;
    }
}
