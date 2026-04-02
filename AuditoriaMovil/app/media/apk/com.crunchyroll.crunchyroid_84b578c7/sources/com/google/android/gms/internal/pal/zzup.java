package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzup extends zzacz implements zzaeg {
    private static final zzup zzb;
    private int zze;
    private zzuv zzf;
    private zzaby zzg = zzaby.zzb;

    static {
        zzup zzupVar = new zzup();
        zzb = zzupVar;
        zzacz.zzaF(zzup.class, zzupVar);
    }

    private zzup() {
    }

    public static zzuo zzc() {
        return (zzuo) zzb.zzau();
    }

    public static zzup zze() {
        return zzb;
    }

    public static zzup zzf(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzup) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzj(zzup zzupVar, zzuv zzuvVar) {
        zzuvVar.getClass();
        zzupVar.zzf = zzuvVar;
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
                    return new zzuo(null);
                }
                return new zzup();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzuv zzg() {
        zzuv zzuvVar = this.zzf;
        if (zzuvVar == null) {
            return zzuv.zze();
        }
        return zzuvVar;
    }

    public final zzaby zzh() {
        return this.zzg;
    }
}
