package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgbk extends zzgga<zzgbk, zzgbj> implements zzghj {
    private static final zzgbk zzf;
    private int zzb;
    private zzgbn zze;

    static {
        zzgbk zzgbkVar = new zzgbk();
        zzf = zzgbkVar;
        zzgga.zzay(zzgbk.class, zzgbkVar);
    }

    private zzgbk() {
    }

    public static zzgbk zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgbk) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzgbj zze() {
        return zzf.zzas();
    }

    public static /* synthetic */ void zzh(zzgbk zzgbkVar, zzgbn zzgbnVar) {
        zzgbnVar.getClass();
        zzgbkVar.zze = zzgbnVar;
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
                        return zzf;
                    }
                    return new zzgbj(null);
                }
                return new zzgbk();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzgbn zzc() {
        zzgbn zzgbnVar = this.zze;
        return zzgbnVar == null ? zzgbn.zzd() : zzgbnVar;
    }
}
