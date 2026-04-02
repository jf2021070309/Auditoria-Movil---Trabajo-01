package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfze extends zzgga<zzfze, zzfzd> implements zzghj {
    private static final zzfze zzf;
    private int zzb;
    private zzgex zze = zzgex.zzb;

    static {
        zzfze zzfzeVar = new zzfze();
        zzf = zzfzeVar;
        zzgga.zzay(zzfze.class, zzfzeVar);
    }

    private zzfze() {
    }

    public static zzfze zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfze) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfzd zze() {
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
                    return new zzfzd(null);
                }
                return new zzfze();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzgex zzc() {
        return this.zze;
    }
}
