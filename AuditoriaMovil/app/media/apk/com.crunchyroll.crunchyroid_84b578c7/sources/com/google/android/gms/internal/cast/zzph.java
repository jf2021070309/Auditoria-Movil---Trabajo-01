package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzph extends zztp implements zzuy {
    private static final zzph zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        zzph zzphVar = new zzph();
        zzb = zzphVar;
        zztp.zzH(zzph.class, zzphVar);
    }

    private zzph() {
    }

    @Override // com.google.android.gms.internal.cast.zztp
    public final Object zzb(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            } else {
                                b = 1;
                            }
                            this.zzh = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzpg(null);
                }
                return new zzph();
            }
            return zztp.zzE(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", zzjl.zza(), "zzf", "zzg", zzmr.zza()});
        }
        return Byte.valueOf(this.zzh);
    }
}
