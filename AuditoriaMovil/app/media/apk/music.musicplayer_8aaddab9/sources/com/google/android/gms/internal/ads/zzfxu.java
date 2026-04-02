package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfxu extends zzgga<zzfxu, zzfxt> implements zzghj {
    private static final zzfxu zzg;
    private int zzb;
    private zzfya zze;
    private zzgex zzf = zzgex.zzb;

    static {
        zzfxu zzfxuVar = new zzfxu();
        zzg = zzfxuVar;
        zzgga.zzay(zzfxu.class, zzfxuVar);
    }

    private zzfxu() {
    }

    public static zzfxu zze(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfxu) zzgga.zzaI(zzg, zzgexVar, zzgfmVar);
    }

    public static zzfxt zzf() {
        return zzg.zzas();
    }

    public static zzfxu zzg() {
        return zzg;
    }

    public static /* synthetic */ void zzj(zzfxu zzfxuVar, zzfya zzfyaVar) {
        zzfyaVar.getClass();
        zzfxuVar.zze = zzfyaVar;
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
                    return new zzfxt(null);
                }
                return new zzfxu();
            }
            return zzgga.zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfya zzc() {
        zzfya zzfyaVar = this.zze;
        return zzfyaVar == null ? zzfya.zzd() : zzfyaVar;
    }

    public final zzgex zzd() {
        return this.zzf;
    }
}
