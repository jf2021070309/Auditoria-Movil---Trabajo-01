package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfzh extends zzgga<zzfzh, zzfzg> implements zzghj {
    private static final zzfzh zzb;

    static {
        zzfzh zzfzhVar = new zzfzh();
        zzb = zzfzhVar;
        zzgga.zzay(zzfzh.class, zzfzhVar);
    }

    private zzfzh() {
    }

    public static zzfzh zza(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfzh) zzgga.zzaI(zzb, zzgexVar, zzgfmVar);
    }

    public static zzfzh zzc() {
        return zzb;
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
                        return zzb;
                    }
                    return new zzfzg(null);
                }
                return new zzfzh();
            }
            return zzaz(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
