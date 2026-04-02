package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzrv extends zzacz implements zzaeg {
    private static final zzrv zzb;
    private int zze;
    private zzsb zzf;
    private zzup zzg;

    static {
        zzrv zzrvVar = new zzrv();
        zzb = zzrvVar;
        zzacz.zzaF(zzrv.class, zzrvVar);
    }

    private zzrv() {
    }

    public static zzru zzc() {
        return (zzru) zzb.zzau();
    }

    public static zzrv zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzrv) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzi(zzrv zzrvVar, zzsb zzsbVar) {
        zzsbVar.getClass();
        zzrvVar.zzf = zzsbVar;
    }

    public static /* synthetic */ void zzj(zzrv zzrvVar, zzup zzupVar) {
        zzupVar.getClass();
        zzrvVar.zzg = zzupVar;
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
                    return new zzru(null);
                }
                return new zzrv();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzsb zzf() {
        zzsb zzsbVar = this.zzf;
        if (zzsbVar == null) {
            return zzsb.zze();
        }
        return zzsbVar;
    }

    public final zzup zzg() {
        zzup zzupVar = this.zzg;
        if (zzupVar == null) {
            return zzup.zze();
        }
        return zzupVar;
    }
}
