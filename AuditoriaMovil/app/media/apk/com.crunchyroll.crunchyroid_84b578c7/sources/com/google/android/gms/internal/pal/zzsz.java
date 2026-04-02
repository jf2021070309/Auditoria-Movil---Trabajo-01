package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzsz extends zzacz implements zzaeg {
    private static final zzsz zzb;
    private int zze;
    private zzaby zzf = zzaby.zzb;

    static {
        zzsz zzszVar = new zzsz();
        zzb = zzszVar;
        zzacz.zzaF(zzsz.class, zzszVar);
    }

    private zzsz() {
    }

    public static zzsy zzc() {
        return (zzsy) zzb.zzau();
    }

    public static zzsz zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzsz) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
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
                    return new zzsy(null);
                }
                return new zzsz();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzaby zzf() {
        return this.zzf;
    }
}
