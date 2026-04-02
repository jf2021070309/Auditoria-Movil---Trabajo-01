package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzsb extends zzacz implements zzaeg {
    private static final zzsb zzb;
    private int zze;
    private zzsh zzf;
    private zzaby zzg = zzaby.zzb;

    static {
        zzsb zzsbVar = new zzsb();
        zzb = zzsbVar;
        zzacz.zzaF(zzsb.class, zzsbVar);
    }

    private zzsb() {
    }

    public static zzsa zzc() {
        return (zzsa) zzb.zzau();
    }

    public static zzsb zze() {
        return zzb;
    }

    public static zzsb zzf(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzsb) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzj(zzsb zzsbVar, zzsh zzshVar) {
        zzshVar.getClass();
        zzsbVar.zzf = zzshVar;
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
                    return new zzsa(null);
                }
                return new zzsb();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzsh zzg() {
        zzsh zzshVar = this.zzf;
        if (zzshVar == null) {
            return zzsh.zze();
        }
        return zzshVar;
    }

    public final zzaby zzh() {
        return this.zzg;
    }
}
