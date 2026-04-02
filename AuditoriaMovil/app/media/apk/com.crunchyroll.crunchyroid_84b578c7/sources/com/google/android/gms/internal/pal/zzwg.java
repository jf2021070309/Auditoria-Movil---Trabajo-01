package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzwg extends zzacz implements zzaeg {
    private static final zzwg zzb;
    private int zze;
    private zzadf zzf = zzacz.zzaz();

    static {
        zzwg zzwgVar = new zzwg();
        zzb = zzwgVar;
        zzacz.zzaF(zzwg.class, zzwgVar);
    }

    private zzwg() {
    }

    public static zzwd zza() {
        return (zzwd) zzb.zzau();
    }

    public static /* synthetic */ void zze(zzwg zzwgVar, zzwf zzwfVar) {
        zzwfVar.getClass();
        zzadf zzadfVar = zzwgVar.zzf;
        if (!zzadfVar.zzc()) {
            zzwgVar.zzf = zzacz.zzaA(zzadfVar);
        }
        zzwgVar.zzf.add(zzwfVar);
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
                    return new zzwd(null);
                }
                return new zzwg();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzwf.class});
        }
        return (byte) 1;
    }
}
