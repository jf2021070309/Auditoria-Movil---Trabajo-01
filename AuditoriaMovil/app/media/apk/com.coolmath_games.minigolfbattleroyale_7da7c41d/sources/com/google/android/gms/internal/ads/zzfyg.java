package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfyg extends zzgga<zzfyg, zzfyf> implements zzghj {
    private static final zzfyg zzf;
    private zzfyj zzb;
    private int zze;

    static {
        zzfyg zzfygVar = new zzfyg();
        zzf = zzfygVar;
        zzgga.zzay(zzfyg.class, zzfygVar);
    }

    private zzfyg() {
    }

    public static zzfyg zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfyg) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfyf zze() {
        return zzf.zzas();
    }

    public static /* synthetic */ void zzg(zzfyg zzfygVar, zzfyj zzfyjVar) {
        zzfyjVar.getClass();
        zzfygVar.zzb = zzfyjVar;
    }

    public final zzfyj zza() {
        zzfyj zzfyjVar = this.zzb;
        return zzfyjVar == null ? zzfyj.zzd() : zzfyjVar;
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
                    return new zzfyf(null);
                }
                return new zzfyg();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }
}
