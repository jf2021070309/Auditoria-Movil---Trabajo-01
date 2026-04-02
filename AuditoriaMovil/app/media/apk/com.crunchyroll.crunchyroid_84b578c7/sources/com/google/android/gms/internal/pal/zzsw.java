package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzsw extends zzacz implements zzaeg {
    private static final zzsw zzb;
    private int zze;
    private int zzf;

    static {
        zzsw zzswVar = new zzsw();
        zzb = zzswVar;
        zzacz.zzaF(zzsw.class, zzswVar);
    }

    private zzsw() {
    }

    public static zzsv zzc() {
        return (zzsv) zzb.zzau();
    }

    public static zzsw zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzsw) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public final int zza() {
        return this.zze;
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
                    return new zzsv(null);
                }
                return new zzsw();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
