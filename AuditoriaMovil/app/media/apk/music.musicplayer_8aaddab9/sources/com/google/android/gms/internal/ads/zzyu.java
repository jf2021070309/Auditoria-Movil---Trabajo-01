package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzyu extends zzgga<zzyu, zzyt> implements zzghj {
    private static final zzyu zzg;
    private int zzb;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzyu zzyuVar = new zzyu();
        zzg = zzyuVar;
        zzgga.zzay(zzyu.class, zzyuVar);
    }

    private zzyu() {
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
                    return new zzyt(null);
                }
                return new zzyu();
            }
            return zzgga.zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf", zzzf.zza});
        }
        return (byte) 1;
    }
}
