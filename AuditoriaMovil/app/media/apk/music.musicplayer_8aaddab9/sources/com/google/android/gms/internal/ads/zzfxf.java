package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
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

    public static /* synthetic */ void zzj(zzfxf zzfxfVar, zzfxl zzfxlVar) {
        zzfxlVar.getClass();
        zzfxfVar.zzf = zzfxlVar;
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
                        return zzg;
                    }
                    return new zzfxe(null);
                }
                return new zzfxf();
            }
            return zzgga.zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzb", "zze", "zzf"});
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
