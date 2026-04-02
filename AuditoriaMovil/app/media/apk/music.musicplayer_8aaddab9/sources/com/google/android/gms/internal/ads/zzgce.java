package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgce extends zzgga<zzgce, zzgcd> implements zzghj {
    private static final zzgce zze;
    private int zzb;

    static {
        zzgce zzgceVar = new zzgce();
        zze = zzgceVar;
        zzgga.zzay(zzgce.class, zzgceVar);
    }

    private zzgce() {
    }

    public static zzgce zza(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgce) zzgga.zzaI(zze, zzgexVar, zzgfmVar);
    }

    public static zzgce zzc() {
        return zze;
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
                    return new zzgcd(null);
                }
                return new zzgce();
            }
            return zzgga.zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
