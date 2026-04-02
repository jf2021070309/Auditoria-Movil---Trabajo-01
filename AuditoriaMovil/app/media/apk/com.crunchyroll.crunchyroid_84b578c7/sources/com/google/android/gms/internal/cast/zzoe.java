package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzoe extends zztp implements zzuy {
    private static final zzoe zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzoe zzoeVar = new zzoe();
        zzb = zzoeVar;
        zztp.zzH(zzoe.class, zzoeVar);
    }

    private zzoe() {
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
                    return new zzod(null);
                }
                return new zzoe();
            }
            return zztp.zzE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzib.zza(), "zzf", zzhy.zza()});
        }
        return (byte) 1;
    }
}
