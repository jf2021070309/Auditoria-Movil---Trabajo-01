package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
                        return zze;
                    }
                    return new zzfxk(null);
                }
                return new zzfxl();
            }
            return zzaz(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
