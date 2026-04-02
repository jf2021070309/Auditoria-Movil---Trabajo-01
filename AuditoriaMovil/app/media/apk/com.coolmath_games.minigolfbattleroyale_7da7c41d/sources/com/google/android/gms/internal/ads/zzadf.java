package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzadf extends zzgga<zzadf, zzade> implements zzghj {
    private static final zzadf zzh;
    private int zzb;
    private zzadi zze;
    private zzgex zzf = zzgex.zzb;
    private zzgex zzg = zzgex.zzb;

    static {
        zzadf zzadfVar = new zzadf();
        zzh = zzadfVar;
        zzgga.zzay(zzadf.class, zzadfVar);
    }

    private zzadf() {
    }

    public static zzadf zze(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzadf) zzgga.zzaI(zzh, zzgexVar, zzgfmVar);
    }

    public final zzadi zza() {
        zzadi zzadiVar = this.zze;
        return zzadiVar == null ? zzadi.zzj() : zzadiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                        return zzh;
                    }
                    return new zzade(null);
                }
                return new zzadf();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
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
