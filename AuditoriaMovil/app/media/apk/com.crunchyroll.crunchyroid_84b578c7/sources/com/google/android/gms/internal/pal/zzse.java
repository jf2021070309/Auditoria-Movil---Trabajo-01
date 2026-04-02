package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzse extends zzacz implements zzaeg {
    private static final zzse zzb;
    private zzsh zze;
    private int zzf;

    static {
        zzse zzseVar = new zzse();
        zzb = zzseVar;
        zzacz.zzaF(zzse.class, zzseVar);
    }

    private zzse() {
    }

    public static zzsd zzc() {
        return (zzsd) zzb.zzau();
    }

    public static zzse zze() {
        return zzb;
    }

    public static zzse zzf(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzse) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzh(zzse zzseVar, zzsh zzshVar) {
        zzshVar.getClass();
        zzseVar.zze = zzshVar;
    }

    public final int zza() {
        return this.zzf;
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
                    return new zzsd(null);
                }
                return new zzse();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzsh zzg() {
        zzsh zzshVar = this.zze;
        if (zzshVar == null) {
            return zzsh.zze();
        }
        return zzshVar;
    }
}
