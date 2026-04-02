package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfya extends zzgga<zzfya, zzfxz> implements zzghj {
    private static final zzfya zze;
    private int zzb;

    static {
        zzfya zzfyaVar = new zzfya();
        zze = zzfyaVar;
        zzgga.zzay(zzfya.class, zzfyaVar);
    }

    private zzfya() {
    }

    public static zzfxz zzc() {
        return zze.zzas();
    }

    public static zzfya zzd() {
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
                    return new zzfxz(null);
                }
                return new zzfya();
            }
            return zzgga.zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
