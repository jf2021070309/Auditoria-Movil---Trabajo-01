package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgbq extends zzgga<zzgbq, zzgbp> implements zzghj {
    private static final zzgbq zzf;
    private int zzb;
    private zzgbt zze;

    static {
        zzgbq zzgbqVar = new zzgbq();
        zzf = zzgbqVar;
        zzgga.zzay(zzgbq.class, zzgbqVar);
    }

    private zzgbq() {
    }

    public static zzgbq zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgbq) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzgbp zze() {
        return zzf.zzas();
    }

    public static /* synthetic */ void zzh(zzgbq zzgbqVar, zzgbt zzgbtVar) {
        zzgbtVar.getClass();
        zzgbqVar.zze = zzgbtVar;
    }

    public final int zza() {
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
                    return new zzgbp(null);
                }
                return new zzgbq();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzgbt zzc() {
        zzgbt zzgbtVar = this.zze;
        return zzgbtVar == null ? zzgbt.zzf() : zzgbtVar;
    }
}
