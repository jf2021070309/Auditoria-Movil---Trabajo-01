package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfxi extends zzgga<zzfxi, zzfxh> implements zzghj {
    private static final zzfxi zzf;
    private int zzb;
    private zzfxl zze;

    static {
        zzfxi zzfxiVar = new zzfxi();
        zzf = zzfxiVar;
        zzgga.zzay(zzfxi.class, zzfxiVar);
    }

    private zzfxi() {
    }

    public static zzfxi zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfxi) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfxh zze() {
        return zzf.zzas();
    }

    public static /* synthetic */ void zzh(zzfxi zzfxiVar, zzfxl zzfxlVar) {
        zzfxlVar.getClass();
        zzfxiVar.zze = zzfxlVar;
    }

    public final int zza() {
        return this.zzb;
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
                    return new zzfxh(null);
                }
                return new zzfxi();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzfxl zzc() {
        zzfxl zzfxlVar = this.zze;
        return zzfxlVar == null ? zzfxl.zzd() : zzfxlVar;
    }
}
