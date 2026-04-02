package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfxx extends zzgga<zzfxx, zzfxw> implements zzghj {
    private static final zzfxx zzf;
    private zzfya zzb;
    private int zze;

    static {
        zzfxx zzfxxVar = new zzfxx();
        zzf = zzfxxVar;
        zzgga.zzay(zzfxx.class, zzfxxVar);
    }

    private zzfxx() {
    }

    public static zzfxx zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfxx) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfxw zze() {
        return zzf.zzas();
    }

    public static zzfxx zzf() {
        return zzf;
    }

    public static /* synthetic */ void zzh(zzfxx zzfxxVar, zzfya zzfyaVar) {
        zzfyaVar.getClass();
        zzfxxVar.zzb = zzfyaVar;
    }

    public final zzfya zza() {
        zzfya zzfyaVar = this.zzb;
        return zzfyaVar == null ? zzfya.zzd() : zzfyaVar;
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
                    return new zzfxw(null);
                }
                return new zzfxx();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }
}
