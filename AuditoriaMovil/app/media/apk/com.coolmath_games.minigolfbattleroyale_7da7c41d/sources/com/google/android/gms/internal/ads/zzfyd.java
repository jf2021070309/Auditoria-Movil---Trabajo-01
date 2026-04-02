package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzfyd zzfydVar, zzfyj zzfyjVar) {
        zzfyjVar.getClass();
        zzfydVar.zze = zzfyjVar;
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
                    return new zzfyc(null);
                }
                return new zzfyd();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
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
