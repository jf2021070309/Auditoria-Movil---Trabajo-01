package com.google.android.gms.internal.measurement;
/* loaded from: classes2.dex */
public final class zzfu extends zzjx<zzfu, zzft> implements zzld {
    private static final zzfu zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfi zzh;

    static {
        zzfu zzfuVar = new zzfu();
        zza = zzfuVar;
        zzjx.zzbG(zzfu.class, zzfuVar);
    }

    private zzfu() {
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzft(null);
                }
                return new zzfu();
            }
            return zzjx.zzbF(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
