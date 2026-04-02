package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzva extends zzacz implements zzaeg {
    private static final zzva zzb;
    private zzvd zze;

    static {
        zzva zzvaVar = new zzva();
        zzb = zzvaVar;
        zzacz.zzaF(zzva.class, zzvaVar);
    }

    private zzva() {
    }

    public static zzuz zza() {
        return (zzuz) zzb.zzau();
    }

    public static zzva zzd(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzva) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzf(zzva zzvaVar, zzvd zzvdVar) {
        zzvdVar.getClass();
        zzvaVar.zze = zzvdVar;
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
                    return new zzuz(null);
                }
                return new zzva();
            }
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final zzvd zze() {
        zzvd zzvdVar = this.zze;
        if (zzvdVar == null) {
            return zzvd.zzd();
        }
        return zzvdVar;
    }
}
