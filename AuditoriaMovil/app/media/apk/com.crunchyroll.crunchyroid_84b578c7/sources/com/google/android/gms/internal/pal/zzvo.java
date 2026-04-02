package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzvo extends zzacz implements zzaeg {
    private static final zzvo zzb;
    private String zze = "";
    private zzaby zzf = zzaby.zzb;
    private int zzg;

    static {
        zzvo zzvoVar = new zzvo();
        zzb = zzvoVar;
        zzacz.zzaF(zzvo.class, zzvoVar);
    }

    private zzvo() {
    }

    public static zzvl zza() {
        return (zzvl) zzb.zzau();
    }

    public static zzvo zze() {
        return zzb;
    }

    public static /* synthetic */ void zzh(zzvo zzvoVar, String str) {
        str.getClass();
        zzvoVar.zze = str;
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
                    return new zzvl(null);
                }
                return new zzvo();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzvn zzc() {
        zzvn zzb2 = zzvn.zzb(this.zzg);
        if (zzb2 == null) {
            return zzvn.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final zzaby zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }
}
