package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfxf extends zzgga<zzfxf, zzfxe> implements zzghj {
    private static final zzfxf zzg;
    private int zzb;
    private zzgex zze = zzgex.zzb;
    private zzfxl zzf;

    static {
        zzfxf zzfxfVar = new zzfxf();
        zzg = zzfxfVar;
        zzgga.zzay(zzfxf.class, zzfxfVar);
    }

    private zzfxf() {
    }

    public static zzfxf zze(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfxf) zzgga.zzaI(zzg, zzgexVar, zzgfmVar);
    }

    public static zzfxe zzf() {
        return zzg.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzfxf zzfxfVar, zzfxl zzfxlVar) {
        zzfxlVar.getClass();
        zzfxfVar.zzf = zzfxlVar;
    }

    public final int zza() {
        return this.zzb;
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
                        return zzg;
                    }
                    return new zzfxe(null);
                }
                return new zzfxf();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgex zzc() {
        return this.zze;
    }

    public final zzfxl zzd() {
        zzfxl zzfxlVar = this.zzf;
        return zzfxlVar == null ? zzfxl.zzd() : zzfxlVar;
    }
}
