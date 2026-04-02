package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgbn extends zzgga<zzgbn, zzgbm> implements zzghj {
    private static final zzgbn zze;
    private String zzb = "";

    static {
        zzgbn zzgbnVar = new zzgbn();
        zze = zzgbnVar;
        zzgga.zzay(zzgbn.class, zzgbnVar);
    }

    private zzgbn() {
    }

    public static zzgbn zzc(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgbn) zzgga.zzaI(zze, zzgexVar, zzgfmVar);
    }

    public static zzgbn zzd() {
        return zze;
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
                        return zze;
                    }
                    return new zzgbm(null);
                }
                return new zzgbn();
            }
            return zzgga.zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
