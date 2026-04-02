package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzwj extends zzacz implements zzaeg {
    private static final zzwj zzb;
    private int zze;
    private zzwm zzf;

    static {
        zzwj zzwjVar = new zzwj();
        zzb = zzwjVar;
        zzacz.zzaF(zzwj.class, zzwjVar);
    }

    private zzwj() {
    }

    public static zzwi zzc() {
        return (zzwi) zzb.zzau();
    }

    public static zzwj zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzwj) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzh(zzwj zzwjVar, zzwm zzwmVar) {
        zzwmVar.getClass();
        zzwjVar.zzf = zzwmVar;
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
                    return new zzwi(null);
                }
                return new zzwj();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzwm zzf() {
        zzwm zzwmVar = this.zzf;
        if (zzwmVar == null) {
            return zzwm.zzc();
        }
        return zzwmVar;
    }
}
