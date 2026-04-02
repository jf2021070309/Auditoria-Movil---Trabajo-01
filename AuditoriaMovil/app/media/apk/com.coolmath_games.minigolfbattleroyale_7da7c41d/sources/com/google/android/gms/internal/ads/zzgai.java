package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgai extends zzgga<zzgai, zzgah> implements zzghj {
    private static final zzgai zzg;
    private int zzb;
    private zzgao zze;
    private zzgex zzf = zzgex.zzb;

    static {
        zzgai zzgaiVar = new zzgai();
        zzg = zzgaiVar;
        zzgga.zzay(zzgai.class, zzgaiVar);
    }

    private zzgai() {
    }

    public static zzgai zze(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzgai) zzgga.zzaI(zzg, zzgexVar, zzgfmVar);
    }

    public static zzgah zzf() {
        return zzg.zzas();
    }

    public static zzgai zzg() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzgai zzgaiVar, zzgao zzgaoVar) {
        zzgaoVar.getClass();
        zzgaiVar.zze = zzgaoVar;
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
                    return new zzgah(null);
                }
                return new zzgai();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgao zzc() {
        zzgao zzgaoVar = this.zze;
        return zzgaoVar == null ? zzgao.zzd() : zzgaoVar;
    }

    public final zzgex zzd() {
        return this.zzf;
    }
}
