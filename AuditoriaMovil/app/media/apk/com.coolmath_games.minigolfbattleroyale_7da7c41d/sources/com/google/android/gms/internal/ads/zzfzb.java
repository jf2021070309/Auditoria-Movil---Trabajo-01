package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
                    return new zzfza(null);
                }
                return new zzfzb();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }
}
