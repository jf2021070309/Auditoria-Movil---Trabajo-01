package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbci extends zzgga<zzbci, zzbch> implements zzghj {
    private static final zzbci zzi;
    private int zzb;
    private zzbbz zze;
    private int zzf = 1000;
    private zzbcg zzg;
    private zzbbx zzh;

    static {
        zzbci zzbciVar = new zzbci();
        zzi = zzbciVar;
        zzgga.zzay(zzbci.class, zzbciVar);
    }

    private zzbci() {
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
                        return zzi;
                    }
                    return new zzbch(null);
                }
                return new zzbci();
            }
            return zzaz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", "zzf", zzbam.zza, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
