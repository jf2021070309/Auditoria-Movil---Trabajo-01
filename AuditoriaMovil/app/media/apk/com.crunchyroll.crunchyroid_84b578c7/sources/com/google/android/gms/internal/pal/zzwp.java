package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzwp extends zzacz implements zzaeg {
    private static final zzwp zzb;
    private int zze;
    private zzws zzf;

    static {
        zzwp zzwpVar = new zzwp();
        zzb = zzwpVar;
        zzacz.zzaF(zzwp.class, zzwpVar);
    }

    private zzwp() {
    }

    public static zzwo zzc() {
        return (zzwo) zzb.zzau();
    }

    public static zzwp zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzwp) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzh(zzwp zzwpVar, zzws zzwsVar) {
        zzwsVar.getClass();
        zzwpVar.zzf = zzwsVar;
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
                    return new zzwo(null);
                }
                return new zzwp();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzws zzf() {
        zzws zzwsVar = this.zzf;
        if (zzwsVar == null) {
            return zzws.zzd();
        }
        return zzwsVar;
    }
}
