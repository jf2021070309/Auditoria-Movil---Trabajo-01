package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
                    return new zzfxq(null);
                }
                return new zzfxr();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzgal zzc() {
        zzgal zzgalVar = this.zze;
        return zzgalVar == null ? zzgal.zzf() : zzgalVar;
    }
}
