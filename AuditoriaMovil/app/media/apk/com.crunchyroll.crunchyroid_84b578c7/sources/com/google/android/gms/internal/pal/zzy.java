package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzy extends zzacz implements zzaeg {
    private static final zzy zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        zzy zzyVar = new zzy();
        zzb = zzyVar;
        zzacz.zzaF(zzy.class, zzyVar);
    }

    private zzy() {
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
                    return new zzx(null);
                }
                return new zzy();
            }
            return zzacz.zzaE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", zzv.zza, "zzg"});
        }
        return (byte) 1;
    }
}
