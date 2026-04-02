package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzxx extends zzgga<zzxx, zzxw> implements zzghj {
    private static final zzxx zzg;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        zzxx zzxxVar = new zzxx();
        zzg = zzxxVar;
        zzgga.zzay(zzxx.class, zzxxVar);
    }

    private zzxx() {
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
                    return new zzxw(null);
                }
                return new zzxx();
            }
            return zzgga.zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
