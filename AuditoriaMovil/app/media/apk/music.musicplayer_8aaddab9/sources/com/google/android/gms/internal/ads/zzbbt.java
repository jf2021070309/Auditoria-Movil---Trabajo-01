package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbbt extends zzgga<zzbbt, zzbbs> implements zzghj {
    private static final zzbbt zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzbbt zzbbtVar = new zzbbt();
        zzg = zzbbtVar;
        zzgga.zzay(zzbbt.class, zzbbtVar);
    }

    private zzbbt() {
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
                    return new zzbbs(null);
                }
                return new zzbbt();
            }
            return zzgga.zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
