package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public class zzbck {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbck(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbck zza(String str, double d) {
        return new zzbck(str, Double.valueOf(d), 3);
    }

    public static zzbck zzb(String str, long j) {
        return new zzbck(str, Long.valueOf(j), 2);
    }

    public static zzbck zzc(String str, String str2) {
        return new zzbck(str, str2, 4);
    }

    public static zzbck zzd(String str, boolean z) {
        return new zzbck(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbdo zza = zzbdq.zza();
        if (zza == null) {
            if (zzbdq.zzb() != null) {
                zzbdq.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return zza.zzd(this.zza, (String) this.zzb);
                }
                return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
