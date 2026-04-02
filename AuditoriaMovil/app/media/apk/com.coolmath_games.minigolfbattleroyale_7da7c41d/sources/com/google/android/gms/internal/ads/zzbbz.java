package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzbbz zzbbzVar, int i) {
        zzbbzVar.zzb |= 1;
        zzbbzVar.zze = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzbbz zzbbzVar, int i) {
        zzbbzVar.zzb |= 2;
        zzbbzVar.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzbbz zzbbzVar, int i) {
        zzbbzVar.zzb |= 4;
        zzbbzVar.zzg = i;
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
                    return new zzbby(null);
                }
                return new zzbbz();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
