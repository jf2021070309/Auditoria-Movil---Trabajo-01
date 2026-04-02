package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzwm extends zzacz implements zzaeg {
    private static final zzwm zzb;
    private String zze = "";

    static {
        zzwm zzwmVar = new zzwm();
        zzb = zzwmVar;
        zzacz.zzaF(zzwm.class, zzwmVar);
    }

    private zzwm() {
    }

    public static zzwm zzc() {
        return zzb;
    }

    public static zzwm zzd(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzwm) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
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
                    return new zzwl(null);
                }
                return new zzwm();
            }
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final String zze() {
        return this.zze;
    }
}
