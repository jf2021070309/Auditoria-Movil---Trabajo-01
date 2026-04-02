package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzvg extends zzacz implements zzaeg {
    private static final zzvg zzb;
    private int zze;
    private zzvj zzf;
    private zzaby zzg = zzaby.zzb;

    static {
        zzvg zzvgVar = new zzvg();
        zzb = zzvgVar;
        zzacz.zzaF(zzvg.class, zzvgVar);
    }

    private zzvg() {
    }

    public static zzvf zzc() {
        return (zzvf) zzb.zzau();
    }

    public static zzvg zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzvg) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzi(zzvg zzvgVar, zzvj zzvjVar) {
        zzvjVar.getClass();
        zzvgVar.zzf = zzvjVar;
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
                    return new zzvf(null);
                }
                return new zzvg();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzvj zzf() {
        zzvj zzvjVar = this.zzf;
        if (zzvjVar == null) {
            return zzvj.zzf();
        }
        return zzvjVar;
    }

    public final zzaby zzg() {
        return this.zzg;
    }

    public final boolean zzk() {
        if (this.zzf != null) {
            return true;
        }
        return false;
    }
}
