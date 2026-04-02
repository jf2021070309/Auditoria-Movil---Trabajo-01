package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
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
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzfzg(null);
                }
                return new zzfzh();
            }
            return zzgga.zzaz(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
