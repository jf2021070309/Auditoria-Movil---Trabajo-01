package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfze extends zzgga<zzfze, zzfzd> implements zzghj {
    private static final zzfze zzf;
    private int zzb;
    private zzgex zze = zzgex.zzb;

    static {
        zzfze zzfzeVar = new zzfze();
        zzf = zzfzeVar;
        zzgga.zzay(zzfze.class, zzfzeVar);
    }

    private zzfze() {
    }

    public static zzfze zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfze) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfzd zze() {
        return zzf.zzas();
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
                        return zzf;
                    }
                    return new zzfzd(null);
                }
                return new zzfze();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzgex zzc() {
        return this.zze;
    }
}
