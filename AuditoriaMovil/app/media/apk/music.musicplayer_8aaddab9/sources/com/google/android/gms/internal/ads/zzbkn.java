package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public class zzbkn<T> {
    private final String zza;
    private final T zzb;
    private final int zzc;

    public zzbkn(String str, T t, int i2) {
        this.zza = str;
        this.zzb = t;
        this.zzc = i2;
    }

    public static zzbkn<Boolean> zza(String str, boolean z) {
        return new zzbkn<>(str, Boolean.valueOf(z), 1);
    }

    public static zzbkn<Long> zzb(String str, long j2) {
        return new zzbkn<>(str, Long.valueOf(j2), 2);
    }

    public static zzbkn<Double> zzc(String str, double d2) {
        return new zzbkn<>(str, Double.valueOf(d2), 3);
    }

    public static zzbkn<String> zzd(String str, String str2) {
        return new zzbkn<>(str, str2, 4);
    }

    public final T zze() {
        zzblm zza = zzbln.zza();
        if (zza == null) {
            return this.zzb;
        }
        int i2 = this.zzc - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? (T) zza.zzd(this.zza, (String) this.zzb) : (T) zza.zzc(this.zza, ((Double) this.zzb).doubleValue()) : (T) zza.zzb(this.zza, ((Long) this.zzb).longValue()) : (T) zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
