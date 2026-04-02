package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzagh {
    public static final zzagh zza = new zzagh(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public static final zzadw<zzagh> zzg = zzagg.zza;
    public final long zzb = -9223372036854775807L;
    public final long zzc = -9223372036854775807L;
    public final long zzd = -9223372036854775807L;
    public final float zze = -3.4028235E38f;
    public final float zzf = -3.4028235E38f;

    public zzagh(long j2, long j3, long j4, float f2, float f3) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzagh) {
            long j2 = ((zzagh) obj).zzb;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (int) (-9223372034707292159L);
        int floatToIntBits = Float.floatToIntBits(-3.4028235E38f);
        return Float.floatToIntBits(-3.4028235E38f) + ((floatToIntBits + (((((i2 * 31) + i2) * 31) + i2) * 31)) * 31);
    }
}
