package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfxr extends zzgga<zzfxr, zzfxq> implements zzghj {
    private static final zzfxr zzf;
    private zzfxx zzb;
    private zzgal zze;

    static {
        zzfxr zzfxrVar = new zzfxr();
        zzf = zzfxrVar;
        zzgga.zzay(zzfxr.class, zzfxrVar);
    }

    private zzfxr() {
    }

    public static zzfxr zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfxr) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfxq zze() {
        return zzf.zzas();
    }

    public static /* synthetic */ void zzg(zzfxr zzfxrVar, zzfxx zzfxxVar) {
        zzfxxVar.getClass();
        zzfxrVar.zzb = zzfxxVar;
    }

    public static /* synthetic */ void zzh(zzfxr zzfxrVar, zzgal zzgalVar) {
        zzgalVar.getClass();
        zzfxrVar.zze = zzgalVar;
    }

    public final zzfxx zza() {
        zzfxx zzfxxVar = this.zzb;
        return zzfxxVar == null ? zzfxx.zzf() : zzfxxVar;
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
                    return new zzfxq(null);
                }
                return new zzfxr();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzgal zzc() {
        zzgal zzgalVar = this.zze;
        return zzgalVar == null ? zzgal.zzf() : zzgalVar;
    }
}
