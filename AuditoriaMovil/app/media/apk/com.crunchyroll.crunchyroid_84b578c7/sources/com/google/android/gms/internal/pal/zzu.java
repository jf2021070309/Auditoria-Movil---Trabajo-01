package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzu extends zzacz implements zzaeg {
    private static final zzu zzb;
    private int zze;
    private int zzf;

    static {
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzacz.zzaF(zzu.class, zzuVar);
    }

    private zzu() {
    }

    @Override // com.google.android.gms.internal.pal.zzacz
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
                    return new zzt(null);
                }
                return new zzu();
            }
            return zzacz.zzaE(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", zzw.zza});
        }
        return (byte) 1;
    }
}
