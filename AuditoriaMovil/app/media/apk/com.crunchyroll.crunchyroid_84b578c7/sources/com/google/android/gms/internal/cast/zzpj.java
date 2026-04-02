package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzpj extends zztp implements zzuy {
    private static final zzpj zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzpj zzpjVar = new zzpj();
        zzb = zzpjVar;
        zztp.zzH(zzpj.class, zzpjVar);
    }

    private zzpj() {
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
                        return zzb;
                    }
                    return new zzpi(null);
                }
                return new zzpj();
            }
            return zztp.zzE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
