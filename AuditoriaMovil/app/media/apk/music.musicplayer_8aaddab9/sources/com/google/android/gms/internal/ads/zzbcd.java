package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
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
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzh;
                    }
                    return new zzbcc(null);
                }
                return new zzbcd();
            }
            return zzgga.zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", zzbam.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
