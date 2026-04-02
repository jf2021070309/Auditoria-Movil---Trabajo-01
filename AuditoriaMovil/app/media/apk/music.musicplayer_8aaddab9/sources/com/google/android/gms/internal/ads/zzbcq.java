package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbcq extends zzgga<zzbcq, zzbcp> implements zzghj {
    private static final zzbcq zzh;
    private int zzb;
    private int zze = 1000;
    private zzbcg zzf;
    private zzbbx zzg;

    static {
        zzbcq zzbcqVar = new zzbcq();
        zzh = zzbcqVar;
        zzgga.zzay(zzbcq.class, zzbcqVar);
    }

    private zzbcq() {
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
                    return new zzbcp(null);
                }
                return new zzbcq();
            }
            return zzgga.zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", zzbam.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
