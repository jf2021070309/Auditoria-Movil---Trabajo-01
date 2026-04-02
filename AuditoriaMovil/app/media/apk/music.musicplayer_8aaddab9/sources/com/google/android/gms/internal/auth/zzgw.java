package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class zzgw extends zzgy {
    public zzgw(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final double zza(Object obj, long j2) {
        return Double.longBitsToDouble(zzj(obj, j2));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final float zzb(Object obj, long j2) {
        return Float.intBitsToFloat(zzi(obj, j2));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final void zzc(Object obj, long j2, boolean z) {
        if (zzgz.zza) {
            zzgz.zzi(obj, j2, z);
        } else {
            zzgz.zzj(obj, j2, z);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final void zzd(Object obj, long j2, double d2) {
        zzn(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final void zze(Object obj, long j2, float f2) {
        zzm(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    public final boolean zzf(Object obj, long j2) {
        return zzgz.zza ? zzgz.zzq(obj, j2) : zzgz.zzr(obj, j2);
    }
}
