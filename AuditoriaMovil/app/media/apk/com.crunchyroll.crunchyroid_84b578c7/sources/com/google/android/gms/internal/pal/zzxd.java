package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzxd extends zzacz implements zzaeg {
    private static final zzxd zzb;
    private int zze;

    static {
        zzxd zzxdVar = new zzxd();
        zzb = zzxdVar;
        zzacz.zzaF(zzxd.class, zzxdVar);
    }

    private zzxd() {
    }

    public static zzxd zzc() {
        return zzb;
    }

    public static zzxd zzd(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzxd) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
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
                    return new zzxc(null);
                }
                return new zzxd();
            }
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
