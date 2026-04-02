package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzadf extends zzgga<zzadf, zzade> implements zzghj {
    private static final zzadf zzh;
    private int zzb;
    private zzadi zze;
    private zzgex zzf;
    private zzgex zzg;

    static {
        zzadf zzadfVar = new zzadf();
        zzh = zzadfVar;
        zzgga.zzay(zzadf.class, zzadfVar);
    }

    private zzadf() {
        zzgex zzgexVar = zzgex.zzb;
        this.zzf = zzgexVar;
        this.zzg = zzgexVar;
    }

    public static zzadf zze(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzadf) zzgga.zzaI(zzh, zzgexVar, zzgfmVar);
    }

    public final zzadi zza() {
        zzadi zzadiVar = this.zze;
        return zzadiVar == null ? zzadi.zzj() : zzadiVar;
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
                        return zzh;
                    }
                    return new zzade(null);
                }
                return new zzadf();
            }
            return zzgga.zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgex zzc() {
        return this.zzf;
    }

    public final zzgex zzd() {
        return this.zzg;
    }
}
