package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfzy extends zzgga<zzfzy, zzfzx> implements zzghj {
    private static final zzfzy zzh;
    private int zzb;
    private zzfzs zze;
    private zzgex zzf;
    private zzgex zzg;

    static {
        zzfzy zzfzyVar = new zzfzy();
        zzh = zzfzyVar;
        zzgga.zzay(zzfzy.class, zzfzyVar);
    }

    private zzfzy() {
        zzgex zzgexVar = zzgex.zzb;
        this.zzf = zzgexVar;
        this.zzg = zzgexVar;
    }

    public static zzfzy zzf(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfzy) zzgga.zzaI(zzh, zzgexVar, zzgfmVar);
    }

    public static zzfzx zzg() {
        return zzh.zzas();
    }

    public static zzfzy zzh() {
        return zzh;
    }

    public static /* synthetic */ void zzk(zzfzy zzfzyVar, zzfzs zzfzsVar) {
        zzfzsVar.getClass();
        zzfzyVar.zze = zzfzsVar;
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
                        return zzh;
                    }
                    return new zzfzx(null);
                }
                return new zzfzy();
            }
            return zzgga.zzaz(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzfzs zzc() {
        zzfzs zzfzsVar = this.zze;
        return zzfzsVar == null ? zzfzs.zze() : zzfzsVar;
    }

    public final zzgex zzd() {
        return this.zzf;
    }

    public final zzgex zze() {
        return this.zzg;
    }
}
