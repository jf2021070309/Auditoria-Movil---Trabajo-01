package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbav extends zzgga<zzbav, zzbau> implements zzghj {
    private static final zzbav zzi;
    private int zzb;
    private zzbar zze;
    private zzggj<zzbbv> zzf = zzgga.zzaE();
    private int zzg;
    private zzbbx zzh;

    static {
        zzbav zzbavVar = new zzbav();
        zzi = zzbavVar;
        zzgga.zzay(zzbav.class, zzbavVar);
    }

    private zzbav() {
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
                        return zzi;
                    }
                    return new zzbau(null);
                }
                return new zzbav();
            }
            return zzgga.zzaz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", zzbbv.class, "zzg", zzbam.zza, "zzh"});
        }
        return (byte) 1;
    }
}
