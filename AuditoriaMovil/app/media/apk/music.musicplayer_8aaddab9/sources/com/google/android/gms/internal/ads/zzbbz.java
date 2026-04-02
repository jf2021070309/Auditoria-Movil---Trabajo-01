package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbbz extends zzgga<zzbbz, zzbby> implements zzghj {
    private static final zzbbz zzh;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbbz zzbbzVar = new zzbbz();
        zzh = zzbbzVar;
        zzgga.zzay(zzbbz.class, zzbbzVar);
    }

    private zzbbz() {
    }

    public static zzbby zza() {
        return zzh.zzas();
    }

    public static /* synthetic */ void zzd(zzbbz zzbbzVar, int i2) {
        zzbbzVar.zzb |= 1;
        zzbbzVar.zze = i2;
    }

    public static /* synthetic */ void zze(zzbbz zzbbzVar, int i2) {
        zzbbzVar.zzb |= 2;
        zzbbzVar.zzf = i2;
    }

    public static /* synthetic */ void zzf(zzbbz zzbbzVar, int i2) {
        zzbbzVar.zzb |= 4;
        zzbbzVar.zzg = i2;
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
                    return new zzbby(null);
                }
                return new zzbbz();
            }
            return zzgga.zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
