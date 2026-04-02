package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzal extends zzacz implements zzaeg {
    private static final zzal zzb;
    private int zze;
    private zzaby zzf;
    private zzaby zzg;
    private zzaby zzh;
    private zzaby zzi;

    static {
        zzal zzalVar = new zzal();
        zzb = zzalVar;
        zzacz.zzaF(zzal.class, zzalVar);
    }

    private zzal() {
        zzaby zzabyVar = zzaby.zzb;
        this.zzf = zzabyVar;
        this.zzg = zzabyVar;
        this.zzh = zzabyVar;
        this.zzi = zzabyVar;
    }

    public static zzak zza() {
        return (zzak) zzb.zzau();
    }

    public static zzal zzd(byte[] bArr, zzacm zzacmVar) throws zzadi {
        return (zzal) zzacz.zzax(zzb, bArr, zzacmVar);
    }

    public static /* synthetic */ void zzi(zzal zzalVar, zzaby zzabyVar) {
        zzalVar.zze |= 1;
        zzalVar.zzf = zzabyVar;
    }

    public static /* synthetic */ void zzj(zzal zzalVar, zzaby zzabyVar) {
        zzalVar.zze |= 2;
        zzalVar.zzg = zzabyVar;
    }

    public static /* synthetic */ void zzk(zzal zzalVar, zzaby zzabyVar) {
        zzalVar.zze |= 4;
        zzalVar.zzh = zzabyVar;
    }

    public static /* synthetic */ void zzl(zzal zzalVar, zzaby zzabyVar) {
        zzalVar.zze |= 8;
        zzalVar.zzi = zzabyVar;
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
                    return new zzak(null);
                }
                return new zzal();
            }
            return zzacz.zzaE(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final zzaby zze() {
        return this.zzf;
    }

    public final zzaby zzf() {
        return this.zzg;
    }

    public final zzaby zzg() {
        return this.zzi;
    }

    public final zzaby zzh() {
        return this.zzh;
    }
}
