package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgbt extends zzgga<zzgbt, zzgbs> implements zzghj {
    private static final zzgbt zzf;
    private String zzb = "";
    private zzgau zze;

    static {
        zzgbt zzgbtVar = new zzgbt();
        zzf = zzgbtVar;
        zzgga.zzay(zzgbt.class, zzgbtVar);
    }

    private zzgbt() {
    }

    public static zzgbt zze(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgbt) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzgbt zzf() {
        return zzf;
    }

    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzf;
                    }
                    return new zzgbs(null);
                }
                return new zzgbt();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final boolean zzc() {
        return this.zze != null;
    }

    public final zzgau zzd() {
        zzgau zzgauVar = this.zze;
        return zzgauVar == null ? zzgau.zze() : zzgauVar;
    }
}
