package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzws extends zzacz implements zzaeg {
    private static final zzws zzb;
    private String zze = "";
    private zzvt zzf;

    static {
        zzws zzwsVar = new zzws();
        zzb = zzwsVar;
        zzacz.zzaF(zzws.class, zzwsVar);
    }

    private zzws() {
    }

    public static zzws zzd() {
        return zzb;
    }

    public static zzws zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzws) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public final zzvt zza() {
        zzvt zzvtVar = this.zzf;
        if (zzvtVar == null) {
            return zzvt.zzd();
        }
        return zzvtVar;
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
                    return new zzwr(null);
                }
                return new zzws();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        if (this.zzf != null) {
            return true;
        }
        return false;
    }
}
