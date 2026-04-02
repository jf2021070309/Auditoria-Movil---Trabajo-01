package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbat extends zzgga<zzbat, zzbas> implements zzghj {
    private static final zzbat zzg;
    private int zzb;
    private int zze;
    private zzggf zzf = zzaB();

    static {
        zzbat zzbatVar = new zzbat();
        zzg = zzbatVar;
        zzgga.zzay(zzbat.class, zzbatVar);
    }

    private zzbat() {
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
                        return zzg;
                    }
                    return new zzbas(null);
                }
                return new zzbat();
            }
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzb", "zze", zzbam.zza, "zzf"});
        }
        return (byte) 1;
    }
}
