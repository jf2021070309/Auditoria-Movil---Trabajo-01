package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgal extends zzgga<zzgal, zzgak> implements zzghj {
    private static final zzgal zzg;
    private zzgao zzb;
    private int zze;
    private int zzf;

    static {
        zzgal zzgalVar = new zzgal();
        zzg = zzgalVar;
        zzgga.zzay(zzgal.class, zzgalVar);
    }

    private zzgal() {
    }

    public static zzgal zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgal) zzgga.zzaI(zzg, zzgexVar, zzgfmVar);
    }

    public static zzgak zze() {
        return zzg.zzas();
    }

    public static zzgal zzf() {
        return zzg;
    }

    public static /* synthetic */ void zzh(zzgal zzgalVar, zzgao zzgaoVar) {
        zzgaoVar.getClass();
        zzgalVar.zzb = zzgaoVar;
    }

    public final zzgao zza() {
        zzgao zzgaoVar = this.zzb;
        return zzgaoVar == null ? zzgao.zzd() : zzgaoVar;
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
                        return zzg;
                    }
                    return new zzgak(null);
                }
                return new zzgal();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }
}
