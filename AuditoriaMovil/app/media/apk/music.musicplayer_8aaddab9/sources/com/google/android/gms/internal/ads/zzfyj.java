package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfyj extends zzgga<zzfyj, zzfyi> implements zzghj {
    private static final zzfyj zze;
    private int zzb;

    static {
        zzfyj zzfyjVar = new zzfyj();
        zze = zzfyjVar;
        zzgga.zzay(zzfyj.class, zzfyjVar);
    }

    private zzfyj() {
    }

    public static zzfyi zzc() {
        return zze.zzas();
    }

    public static zzfyj zzd() {
        return zze;
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
                        return zze;
                    }
                    return new zzfyi(null);
                }
                return new zzfyj();
            }
            return zzgga.zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
