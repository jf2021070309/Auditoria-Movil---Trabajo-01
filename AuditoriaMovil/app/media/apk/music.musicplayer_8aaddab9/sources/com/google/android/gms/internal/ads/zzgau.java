package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgau extends zzgga<zzgau, zzgat> implements zzghj {
    private static final zzgau zzg;
    private String zzb = "";
    private zzgex zze = zzgex.zzb;
    private int zzf;

    static {
        zzgau zzgauVar = new zzgau();
        zzg = zzgauVar;
        zzgga.zzay(zzgau.class, zzgauVar);
    }

    private zzgau() {
    }

    public static zzgat zzd() {
        return zzg.zzas();
    }

    public static zzgau zze() {
        return zzg;
    }

    public static /* synthetic */ zzgau zzf() {
        return zzg;
    }

    public static /* synthetic */ void zzg(zzgau zzgauVar, String str) {
        str.getClass();
        zzgauVar.zzb = str;
    }

    public static /* synthetic */ void zzh(zzgau zzgauVar, zzgex zzgexVar) {
        zzgauVar.zze = zzgexVar;
    }

    public static /* synthetic */ void zzj(zzgau zzgauVar, int i2) {
        zzgauVar.zzf = zzgbv.zza(i2);
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
                        return zzg;
                    }
                    return new zzgat(null);
                }
                return new zzgau();
            }
            return zzgga.zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgex zzc() {
        return this.zze;
    }

    public final int zzi() {
        int zzb = zzgbv.zzb(this.zzf);
        if (zzb == 0) {
            return 1;
        }
        return zzb;
    }
}
