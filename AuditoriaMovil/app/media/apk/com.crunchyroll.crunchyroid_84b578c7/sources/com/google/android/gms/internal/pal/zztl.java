package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zztl extends zzacz implements zzaeg {
    private static final zztl zzb;
    private int zze;
    private zzaby zzf = zzaby.zzb;

    static {
        zztl zztlVar = new zztl();
        zzb = zztlVar;
        zzacz.zzaF(zztl.class, zztlVar);
    }

    private zztl() {
    }

    public static zztk zzc() {
        return (zztk) zzb.zzau();
    }

    public static zztl zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zztl) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
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
                    return new zztk(null);
                }
                return new zztl();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzaby zzf() {
        return this.zzf;
    }
}
