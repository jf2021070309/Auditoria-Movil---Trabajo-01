package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class zzgiv extends zzgix {
    public zzgiv(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final void zza(Object obj, long j2, byte b2) {
        if (zzgiy.zzb) {
            zzgiy.zzG(obj, j2, b2);
        } else {
            zzgiy.zzH(obj, j2, b2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final boolean zzb(Object obj, long j2) {
        return zzgiy.zzb ? zzgiy.zzx(obj, j2) : zzgiy.zzy(obj, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final void zzc(Object obj, long j2, boolean z) {
        if (zzgiy.zzb) {
            zzgiy.zzG(obj, j2, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzgiy.zzH(obj, j2, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final float zzd(Object obj, long j2) {
        return Float.intBitsToFloat(zzm(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final void zze(Object obj, long j2, float f2) {
        zzn(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final double zzf(Object obj, long j2) {
        return Double.longBitsToDouble(zzo(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final void zzg(Object obj, long j2, double d2) {
        zzp(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final byte zzh(long j2) {
        return Memory.peekByte((int) j2);
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final void zzi(long j2, byte[] bArr, long j3, long j4) {
        Memory.peekByteArray((int) j2, bArr, (int) j3, (int) j4);
    }
}
