package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfzy extends zzgga<zzfzy, zzfzx> implements zzghj {
    private static final zzfzy zzh;
    private int zzb;
    private zzfzs zze;
    private zzgex zzf = zzgex.zzb;
    private zzgex zzg = zzgex.zzb;

    static {
        zzfzy zzfzyVar = new zzfzy();
        zzh = zzfzyVar;
        zzgga.zzay(zzfzy.class, zzfzyVar);
    }

    private zzfzy() {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzfzy zzfzyVar, zzfzs zzfzsVar) {
        zzfzsVar.getClass();
        zzfzyVar.zze = zzfzsVar;
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
                        return zzh;
                    }
                    return new zzfzx(null);
                }
                return new zzfzy();
            }
            return zzaz(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzb", "zze", "zzf", "zzg"});
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
