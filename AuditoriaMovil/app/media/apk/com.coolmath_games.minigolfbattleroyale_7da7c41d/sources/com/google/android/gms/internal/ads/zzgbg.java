package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzgbg zzgbgVar, String str) {
        str.getClass();
        zzgbgVar.zzb = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzgbg zzgbgVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzgbgVar.zze = i - 2;
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
                        return zzh;
                    }
                    return new zzgbf(null);
                }
                return new zzgbg();
            }
            return zzaz(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
