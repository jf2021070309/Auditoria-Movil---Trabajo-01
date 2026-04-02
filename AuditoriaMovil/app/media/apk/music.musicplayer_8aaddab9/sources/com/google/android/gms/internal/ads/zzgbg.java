package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgbg extends zzgga<zzgbg, zzgbf> implements zzghj {
    private static final zzgbg zzh;
    private String zzb = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgbg zzgbgVar = new zzgbg();
        zzh = zzgbgVar;
        zzgga.zzay(zzgbg.class, zzgbgVar);
    }

    private zzgbg() {
    }

    public static zzgbf zza() {
        return zzh.zzas();
    }

    public static /* synthetic */ void zzd(zzgbg zzgbgVar, String str) {
        str.getClass();
        zzgbgVar.zzb = str;
    }

    public static /* synthetic */ void zzf(zzgbg zzgbgVar, int i2) {
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzgbgVar.zze = i2 - 2;
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
                        return zzh;
                    }
                    return new zzgbf(null);
                }
                return new zzgbg();
            }
            return zzgga.zzaz(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
