package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfyy extends zzgga<zzfyy, zzfyx> implements zzghj {
    private static final zzfyy zzf;
    private int zzb;
    private zzgex zze = zzgex.zzb;

    static {
        zzfyy zzfyyVar = new zzfyy();
        zzf = zzfyyVar;
        zzgga.zzay(zzfyy.class, zzfyyVar);
    }

    private zzfyy() {
    }

    public static zzfyy zzd(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfyy) zzgga.zzaI(zzf, zzgexVar, zzgfmVar);
    }

    public static zzfyx zze() {
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
                    return new zzfyx(null);
                }
                return new zzfyy();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final zzgex zzc() {
        return this.zze;
    }
}
