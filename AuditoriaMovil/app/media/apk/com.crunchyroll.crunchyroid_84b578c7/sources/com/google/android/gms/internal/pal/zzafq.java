package com.google.android.gms.internal.pal;

import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzafq extends zzafr {
    public zzafq(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzk(obj, j));
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzj(obj, j));
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final void zzc(Object obj, long j, boolean z) {
        if (zzafs.zzb) {
            zzafs.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzafs.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final void zzd(Object obj, long j, byte b) {
        if (zzafs.zzb) {
            zzafs.zzD(obj, j, b);
        } else {
            zzafs.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final void zze(Object obj, long j, double d) {
        zzo(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final void zzf(Object obj, long j, float f) {
        zzn(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final boolean zzg(Object obj, long j) {
        if (zzafs.zzb) {
            return zzafs.zzt(obj, j);
        }
        return zzafs.zzu(obj, j);
    }
}
