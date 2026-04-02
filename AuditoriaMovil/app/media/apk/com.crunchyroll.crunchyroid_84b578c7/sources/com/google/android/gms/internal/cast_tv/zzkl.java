package com.google.android.gms.internal.cast_tv;

import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzkl extends zzkn {
    public zzkl(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkn
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkn
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkn
    public final void zzc(Object obj, long j, boolean z) {
        if (zzko.zzb) {
            zzko.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzko.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkn
    public final void zzd(Object obj, long j, byte b) {
        if (zzko.zzb) {
            zzko.zzD(obj, j, b);
        } else {
            zzko.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkn
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkn
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.cast_tv.zzkn
    public final boolean zzg(Object obj, long j) {
        if (zzko.zzb) {
            return zzko.zzt(obj, j);
        }
        return zzko.zzu(obj, j);
    }
}
