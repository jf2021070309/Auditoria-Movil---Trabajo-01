package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgcb extends zzgga<zzgcb, zzgca> implements zzghj {
    private static final zzgcb zzf;
    private int zzb;
    private zzgex zze = zzgex.zzb;

    static {
        zzgcb zzgcbVar = new zzgcb();
        zzf = zzgcbVar;
        zzgga.zzay(zzgcb.class, zzgcbVar);
    }

    private zzgcb() {
    }

    public static zzgcb zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgcb) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzgca zze() {
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
                    return new zzgca(null);
                }
                return new zzgcb();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzgex zzc() {
        return this.zze;
    }
}
