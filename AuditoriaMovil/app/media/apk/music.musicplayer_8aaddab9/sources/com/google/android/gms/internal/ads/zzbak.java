package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbak extends zzgga<zzbak, zzbai> implements zzghj {
    private static final zzbak zzi;
    private int zzb;
    private int zze;
    private zzbbz zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzbak zzbakVar = new zzbak();
        zzi = zzbakVar;
        zzgga.zzay(zzbak.class, zzbakVar);
    }

    private zzbak() {
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
                    return new zzbai(null);
                }
                return new zzbak();
            }
            return zzgga.zzaz(zzi, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzb", "zze", zzbaj.zza, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
