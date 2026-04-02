package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfyd extends zzgga<zzfyd, zzfyc> implements zzghj {
    private static final zzfyd zzg;
    private int zzb;
    private zzfyj zze;
    private zzgex zzf = zzgex.zzb;

    static {
        zzfyd zzfydVar = new zzfyd();
        zzg = zzfydVar;
        zzgga.zzay(zzfyd.class, zzfydVar);
    }

    private zzfyd() {
    }

    public static zzfyd zze(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfyd) zzgga.zzaI(zzg, zzgexVar, zzgfmVar);
    }

    public static zzfyc zzf() {
        return zzg.zzas();
    }

    public static /* synthetic */ void zzi(zzfyd zzfydVar, zzfyj zzfyjVar) {
        zzfyjVar.getClass();
        zzfydVar.zze = zzfyjVar;
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
                    return new zzfyc(null);
                }
                return new zzfyd();
            }
            return zzgga.zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfyj zzc() {
        zzfyj zzfyjVar = this.zze;
        return zzfyjVar == null ? zzfyj.zzd() : zzfyjVar;
    }

    public final zzgex zzd() {
        return this.zzf;
    }
}
