package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzmv extends zztp implements zzuy {
    private static final zztv zzb = new zzmt();
    private static final zzmv zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zztu zzh = zztp.zzy();

    static {
        zzmv zzmvVar = new zzmv();
        zzd = zzmvVar;
        zztp.zzH(zzmv.class, zzmvVar);
    }

    private zzmv() {
    }

    @Override // com.google.android.gms.internal.cast.zztp
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzd;
                    }
                    return new zzmu(null);
                }
                return new zzmv();
            }
            return zztp.zzE(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", zzml.zzb()});
        }
        return (byte) 1;
    }
}
