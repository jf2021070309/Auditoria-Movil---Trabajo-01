package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzog extends zztp implements zzuy {
    private static final zzog zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;

    static {
        zzog zzogVar = new zzog();
        zzb = zzogVar;
        zztp.zzH(zzog.class, zzogVar);
    }

    private zzog() {
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
                    return new zzof(null);
                }
                return new zzog();
            }
            return zztp.zzE(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002:\u0000\u00035\u0000\u00048\u0000", new Object[]{"zzf", "zze", "zzd", "zzg"});
        }
        return (byte) 1;
    }
}
