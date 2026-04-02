package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfjj extends zzgga<zzfjj, zzfjh> implements zzghj {
    private static final zzfjj zzi;
    private int zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfjf zzh;

    static {
        zzfjj zzfjjVar = new zzfjj();
        zzi = zzfjjVar;
        zzgga.zzay(zzfjj.class, zzfjjVar);
    }

    private zzfjj() {
    }

    public static zzfjh zza() {
        return zzi.zzas();
    }

    public static /* synthetic */ void zzd(zzfjj zzfjjVar, String str) {
        str.getClass();
        zzfjjVar.zzb |= 2;
        zzfjjVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzfjj zzfjjVar, zzfjf zzfjfVar) {
        zzfjfVar.getClass();
        zzfjjVar.zzh = zzfjfVar;
        zzfjjVar.zzb |= 8;
    }

    public static /* synthetic */ void zzf(zzfjj zzfjjVar, int i2) {
        zzfjjVar.zze = 1;
        zzfjjVar.zzb = 1 | zzfjjVar.zzb;
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
                        return zzi;
                    }
                    return new zzfjh(null);
                }
                return new zzfjj();
            }
            return zzgga.zzaz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", zzfji.zza, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
