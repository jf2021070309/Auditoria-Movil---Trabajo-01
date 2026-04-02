package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzrp extends zzacz implements zzaeg {
    private static final zzrp zzb;
    private int zze;
    private zzrs zzf;

    static {
        zzrp zzrpVar = new zzrp();
        zzb = zzrpVar;
        zzacz.zzaF(zzrp.class, zzrpVar);
    }

    private zzrp() {
    }

    public static zzro zzc() {
        return (zzro) zzb.zzau();
    }

    public static zzrp zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzrp) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzh(zzrp zzrpVar, zzrs zzrsVar) {
        zzrsVar.getClass();
        zzrpVar.zzf = zzrsVar;
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
                    return new zzro(null);
                }
                return new zzrp();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzrs zzf() {
        zzrs zzrsVar = this.zzf;
        if (zzrsVar == null) {
            return zzrs.zze();
        }
        return zzrsVar;
    }
}
