package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfxl extends zzgga<zzfxl, zzfxk> implements zzghj {
    private static final zzfxl zze;
    private int zzb;

    static {
        zzfxl zzfxlVar = new zzfxl();
        zze = zzfxlVar;
        zzgga.zzay(zzfxl.class, zzfxlVar);
    }

    private zzfxl() {
    }

    public static zzfxk zzc() {
        return zze.zzas();
    }

    public static zzfxl zzd() {
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
                    return new zzfxk(null);
                }
                return new zzfxl();
            }
            return zzgga.zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
