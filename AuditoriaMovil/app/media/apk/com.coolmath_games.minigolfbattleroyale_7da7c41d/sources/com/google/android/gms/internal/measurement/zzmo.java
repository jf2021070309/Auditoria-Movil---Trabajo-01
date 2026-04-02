package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
/* loaded from: classes2.dex */
final class zzmo extends zzmq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmo(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzmq
    public final void zza(Object obj, long j, byte b) {
        if (zzmr.zzb) {
            zzmr.zzD(obj, j, b);
        } else {
            zzmr.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmq
    public final boolean zzb(Object obj, long j) {
        if (zzmr.zzb) {
            return zzmr.zzv(obj, j);
        }
        return zzmr.zzw(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzmq
    public final void zzc(Object obj, long j, boolean z) {
        if (zzmr.zzb) {
            zzmr.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzmr.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmq
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(zzk(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzmq
    public final void zze(Object obj, long j, float f) {
        zzl(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zzmq
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(zzm(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzmq
    public final void zzg(Object obj, long j, double d) {
        zzn(obj, j, Double.doubleToLongBits(d));
    }
}
