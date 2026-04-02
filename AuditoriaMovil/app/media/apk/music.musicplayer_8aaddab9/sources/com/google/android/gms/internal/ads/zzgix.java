package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class zzgix {
    public final Unsafe zza;

    public zzgix(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j2, byte b2);

    public abstract boolean zzb(Object obj, long j2);

    public abstract void zzc(Object obj, long j2, boolean z);

    public abstract float zzd(Object obj, long j2);

    public abstract void zze(Object obj, long j2, float f2);

    public abstract double zzf(Object obj, long j2);

    public abstract void zzg(Object obj, long j2, double d2);

    public abstract byte zzh(long j2);

    public abstract void zzi(long j2, byte[] bArr, long j3, long j4);

    public final long zzj(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final int zzk(Class<?> cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzl(Class<?> cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzm(Object obj, long j2) {
        return this.zza.getInt(obj, j2);
    }

    public final void zzn(Object obj, long j2, int i2) {
        this.zza.putInt(obj, j2, i2);
    }

    public final long zzo(Object obj, long j2) {
        return this.zza.getLong(obj, j2);
    }

    public final void zzp(Object obj, long j2, long j3) {
        this.zza.putLong(obj, j2, j3);
    }

    public final Object zzq(Object obj, long j2) {
        return this.zza.getObject(obj, j2);
    }

    public final void zzr(Object obj, long j2, Object obj2) {
        this.zza.putObject(obj, j2, obj2);
    }
}
