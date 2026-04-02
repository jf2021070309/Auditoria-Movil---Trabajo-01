package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfym extends zzgga<zzfym, zzfyl> implements zzghj {
    private static final zzfym zzf;
    private int zzb;
    private zzgex zze = zzgex.zzb;

    static {
        zzfym zzfymVar = new zzfym();
        zzf = zzfymVar;
        zzgga.zzay(zzfym.class, zzfymVar);
    }

    private zzfym() {
    }

    public static zzfym zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfym) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfyl zze() {
        return zzf.zzas();
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
                    return new zzfyl(null);
                }
                return new zzfym();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzgex zzc() {
        return this.zze;
    }
}
