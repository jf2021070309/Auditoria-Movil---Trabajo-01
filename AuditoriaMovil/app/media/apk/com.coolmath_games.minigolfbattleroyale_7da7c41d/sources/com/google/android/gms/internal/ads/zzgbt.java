package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzf;
                    }
                    return new zzgbs(null);
                }
                return new zzgbt();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzb", "zze"});
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
