package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbcd extends zzgga<zzbcd, zzbcc> implements zzghj {
    private static final zzbcd zzh;
    private int zzb;
    private int zze = 1000;
    private zzbcg zzf;
    private zzbbx zzg;

    static {
        zzbcd zzbcdVar = new zzbcd();
        zzh = zzbcdVar;
        zzgga.zzay(zzbcd.class, zzbcdVar);
    }

    private zzbcd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzh;
                    }
                    return new zzbcc(null);
                }
                return new zzbcd();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", zzbam.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
