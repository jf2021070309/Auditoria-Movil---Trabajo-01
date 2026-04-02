package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzuc extends zzacz implements zzaeg {
    private static final zzuc zzb;
    private int zze;
    private zzuf zzf;
    private zzaby zzg = zzaby.zzb;

    static {
        zzuc zzucVar = new zzuc();
        zzb = zzucVar;
        zzacz.zzaF(zzuc.class, zzucVar);
    }

    private zzuc() {
    }

    public static zzub zzc() {
        return (zzub) zzb.zzau();
    }

    public static zzuc zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzuc) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzi(zzuc zzucVar, zzuf zzufVar) {
        zzufVar.getClass();
        zzucVar.zzf = zzufVar;
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
                    return new zzub(null);
                }
                return new zzuc();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzuf zzf() {
        zzuf zzufVar = this.zzf;
        if (zzufVar == null) {
            return zzuf.zzf();
        }
        return zzufVar;
    }

    public final zzaby zzg() {
        return this.zzg;
    }
}
