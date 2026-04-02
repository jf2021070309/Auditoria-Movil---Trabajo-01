package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzvj extends zzacz implements zzaeg {
    private static final zzvj zzb;
    private int zze;
    private zzvd zzf;
    private zzaby zzg = zzaby.zzb;

    static {
        zzvj zzvjVar = new zzvj();
        zzb = zzvjVar;
        zzacz.zzaF(zzvj.class, zzvjVar);
    }

    private zzvj() {
    }

    public static zzvi zzd() {
        return (zzvi) zzb.zzau();
    }

    public static zzvj zzf() {
        return zzb;
    }

    public static zzvj zzg(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzvj) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzj(zzvj zzvjVar, zzvd zzvdVar) {
        zzvdVar.getClass();
        zzvjVar.zzf = zzvdVar;
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
                    return new zzvi(null);
                }
                return new zzvj();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzvd zzc() {
        zzvd zzvdVar = this.zzf;
        if (zzvdVar == null) {
            return zzvd.zzd();
        }
        return zzvdVar;
    }

    public final zzaby zzh() {
        return this.zzg;
    }

    public final boolean zzl() {
        if (this.zzf != null) {
            return true;
        }
        return false;
    }
}
