package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public final class zzmj extends zzmk {
    public zzmj(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final double zza(Object obj, long j2) {
        return Double.longBitsToDouble(zzk(obj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final float zzb(Object obj, long j2) {
        return Float.intBitsToFloat(zzj(obj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final void zzc(Object obj, long j2, boolean z) {
        if (zzml.zzb) {
            zzml.zzD(obj, j2, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzml.zzE(obj, j2, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final void zzd(Object obj, long j2, byte b2) {
        if (zzml.zzb) {
            zzml.zzD(obj, j2, b2);
        } else {
            zzml.zzE(obj, j2, b2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final void zze(Object obj, long j2, double d2) {
        zzo(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final void zzf(Object obj, long j2, float f2) {
        zzn(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final boolean zzg(Object obj, long j2) {
        return zzml.zzb ? zzml.zzt(obj, j2) : zzml.zzu(obj, j2);
    }
}
