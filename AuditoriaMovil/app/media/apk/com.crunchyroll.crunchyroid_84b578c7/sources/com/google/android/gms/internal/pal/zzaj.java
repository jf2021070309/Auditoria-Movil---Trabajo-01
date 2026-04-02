package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzaj extends zzacz implements zzaeg {
    private static final zzaj zzb;
    private int zze;
    private zzaby zzf;
    private zzaby zzg;

    static {
        zzaj zzajVar = new zzaj();
        zzb = zzajVar;
        zzacz.zzaF(zzaj.class, zzajVar);
    }

    private zzaj() {
        zzaby zzabyVar = zzaby.zzb;
        this.zzf = zzabyVar;
        this.zzg = zzabyVar;
    }

    public static zzai zza() {
        return (zzai) zzb.zzau();
    }

    public static /* synthetic */ void zzd(zzaj zzajVar, zzaby zzabyVar) {
        zzajVar.zze |= 1;
        zzajVar.zzf = zzabyVar;
    }

    public static /* synthetic */ void zze(zzaj zzajVar, zzaby zzabyVar) {
        zzajVar.zze |= 2;
        zzajVar.zzg = zzabyVar;
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
                    return new zzai(null);
                }
                return new zzaj();
            }
            return zzacz.zzaE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
