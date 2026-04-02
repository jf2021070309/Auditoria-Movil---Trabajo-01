package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbcs extends zzgga<zzbcs, zzbcr> implements zzghj {
    private static final zzbcs zzg;
    private int zzb;
    private int zze = 1000;
    private zzbcg zzf;

    static {
        zzbcs zzbcsVar = new zzbcs();
        zzg = zzbcsVar;
        zzgga.zzay(zzbcs.class, zzbcsVar);
    }

    private zzbcs() {
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
                        return zzg;
                    }
                    return new zzbcr(null);
                }
                return new zzbcs();
            }
            return zzgga.zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", zzbam.zza, "zzf"});
        }
        return (byte) 1;
    }
}
