package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfyp extends zzgga<zzfyp, zzfyo> implements zzghj {
    private static final zzfyp zzf;
    private int zzb;
    private int zze;

    static {
        zzfyp zzfypVar = new zzfyp();
        zzf = zzfypVar;
        zzgga.zzay(zzfyp.class, zzfypVar);
    }

    private zzfyp() {
    }

    public static zzfyp zzc(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfyp) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfyo zzd() {
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
                    return new zzfyo(null);
                }
                return new zzfyp();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }
}
