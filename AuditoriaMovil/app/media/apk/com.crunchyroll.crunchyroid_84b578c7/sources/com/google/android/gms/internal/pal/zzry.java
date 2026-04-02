package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzry extends zzacz implements zzaeg {
    private static final zzry zzb;
    private zzse zze;
    private zzus zzf;

    static {
        zzry zzryVar = new zzry();
        zzb = zzryVar;
        zzacz.zzaF(zzry.class, zzryVar);
    }

    private zzry() {
    }

    public static zzrx zza() {
        return (zzrx) zzb.zzau();
    }

    public static zzry zzd(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzry) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzg(zzry zzryVar, zzse zzseVar) {
        zzseVar.getClass();
        zzryVar.zze = zzseVar;
    }

    public static /* synthetic */ void zzh(zzry zzryVar, zzus zzusVar) {
        zzusVar.getClass();
        zzryVar.zzf = zzusVar;
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
                    return new zzrx(null);
                }
                return new zzry();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzse zze() {
        zzse zzseVar = this.zze;
        if (zzseVar == null) {
            return zzse.zze();
        }
        return zzseVar;
    }

    public final zzus zzf() {
        zzus zzusVar = this.zzf;
        if (zzusVar == null) {
            return zzus.zze();
        }
        return zzusVar;
    }
}
