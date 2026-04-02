package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public class zzbkn<T> {
    private final String zza;
    private final T zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbkn(String str, T t, int i) {
        this.zza = str;
        this.zzb = t;
        this.zzc = i;
    }

    public static zzbkn<Boolean> zza(String str, boolean z) {
        return new zzbkn<>(str, Boolean.valueOf(z), 1);
    }

    public static zzbkn<Long> zzb(String str, long j) {
        return new zzbkn<>(str, Long.valueOf(j), 2);
    }

    public static zzbkn<Double> zzc(String str, double d) {
        return new zzbkn<>(str, Double.valueOf(d), 3);
    }

    public static zzbkn<String> zzd(String str, String str2) {
        return new zzbkn<>(str, str2, 4);
    }

    public final T zze() {
        zzblm zza = zzbln.zza();
        if (zza == null) {
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return (T) zza.zzd(this.zza, (String) this.zzb);
                }
                return (T) zza.zzc(this.zza, ((Double) this.zzb).doubleValue());
            }
            return (T) zza.zzb(this.zza, ((Long) this.zzb).longValue());
        }
        return (T) zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
