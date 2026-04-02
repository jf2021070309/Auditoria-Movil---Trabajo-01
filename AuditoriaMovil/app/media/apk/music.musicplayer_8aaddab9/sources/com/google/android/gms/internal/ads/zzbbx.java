package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbbx extends zzgga<zzbbx, zzbbw> implements zzghj {
    private static final zzbbx zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzbbx zzbbxVar = new zzbbx();
        zzg = zzbbxVar;
        zzgga.zzay(zzbbx.class, zzbbxVar);
    }

    private zzbbx() {
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
                        return zzg;
                    }
                    return new zzbbw(null);
                }
                return new zzbbx();
            }
            return zzgga.zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
