package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzrm extends zzacz implements zzaeg {
    private static final zzrm zzb;
    private int zze;
    private zzaby zzf = zzaby.zzb;
    private zzrs zzg;

    static {
        zzrm zzrmVar = new zzrm();
        zzb = zzrmVar;
        zzacz.zzaF(zzrm.class, zzrmVar);
    }

    private zzrm() {
    }

    public static zzrl zzc() {
        return (zzrl) zzb.zzau();
    }

    public static zzrm zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzrm) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzj(zzrm zzrmVar, zzrs zzrsVar) {
        zzrsVar.getClass();
        zzrmVar.zzg = zzrsVar;
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
                    return new zzrl(null);
                }
                return new zzrm();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzrs zzf() {
        zzrs zzrsVar = this.zzg;
        if (zzrsVar == null) {
            return zzrs.zze();
        }
        return zzrsVar;
    }

    public final zzaby zzg() {
        return this.zzf;
    }
}
