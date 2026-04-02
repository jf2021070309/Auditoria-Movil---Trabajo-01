package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfzb extends zzgga<zzfzb, zzfza> implements zzghj {
    private static final zzfzb zzf;
    private int zzb;
    private int zze;

    static {
        zzfzb zzfzbVar = new zzfzb();
        zzf = zzfzbVar;
        zzgga.zzay(zzfzb.class, zzfzbVar);
    }

    private zzfzb() {
    }

    public static zzfzb zzc(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfzb) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfza zzd() {
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
                    return new zzfza(null);
                }
                return new zzfzb();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }
}
