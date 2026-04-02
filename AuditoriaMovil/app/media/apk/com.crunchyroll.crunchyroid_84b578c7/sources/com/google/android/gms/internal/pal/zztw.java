package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zztw extends zzacz implements zzaeg {
    private static final zztw zzb;
    private zztz zze;

    static {
        zztw zztwVar = new zztw();
        zzb = zztwVar;
        zzacz.zzaF(zztw.class, zztwVar);
    }

    private zztw() {
    }

    public static zztv zza() {
        return (zztv) zzb.zzau();
    }

    public static zztw zzd(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zztw) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzf(zztw zztwVar, zztz zztzVar) {
        zztzVar.getClass();
        zztwVar.zze = zztzVar;
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
                    return new zztv(null);
                }
                return new zztw();
            }
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final zztz zze() {
        zztz zztzVar = this.zze;
        if (zztzVar == null) {
            return zztz.zze();
        }
        return zztzVar;
    }
}
