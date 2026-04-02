package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfzp extends zzgga<zzfzp, zzfzo> implements zzghj {
    private static final zzfzp zze;
    private zzfzs zzb;

    static {
        zzfzp zzfzpVar = new zzfzp();
        zze = zzfzpVar;
        zzgga.zzay(zzfzp.class, zzfzpVar);
    }

    private zzfzp() {
    }

    public static zzfzp zzc(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfzp) zzgga.zzaI(zze, zzgexVar, zzgfmVar);
    }

    public static zzfzo zzd() {
        return zze.zzas();
    }

    public static /* synthetic */ void zzf(zzfzp zzfzpVar, zzfzs zzfzsVar) {
        zzfzsVar.getClass();
        zzfzpVar.zzb = zzfzsVar;
    }

    public final zzfzs zza() {
        zzfzs zzfzsVar = this.zzb;
        return zzfzsVar == null ? zzfzs.zze() : zzfzsVar;
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
                    return new zzfzo(null);
                }
                return new zzfzp();
            }
            return zzgga.zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
