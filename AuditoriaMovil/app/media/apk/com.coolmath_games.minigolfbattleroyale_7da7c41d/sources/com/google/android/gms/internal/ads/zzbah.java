package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbah extends zzgga<zzbah, zzbag> implements zzghj {
    private static final zzbah zzm;
    private int zzb;
    private zzbbx zzf;
    private int zzg;
    private zzbbz zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        zzbah zzbahVar = new zzbah();
        zzm = zzbahVar;
        zzgga.zzay(zzbah.class, zzbahVar);
    }

    private zzbah() {
    }

    public static zzbah zza() {
        return zzm;
    }

    public static /* synthetic */ void zzd(zzbah zzbahVar, String str) {
        zzbahVar.zzb |= 1;
        zzbahVar.zze = str;
    }

    public static /* synthetic */ void zze(zzbah zzbahVar, zzbbz zzbbzVar) {
        zzbbzVar.getClass();
        zzbahVar.zzh = zzbbzVar;
        zzbahVar.zzb |= 8;
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
                        return zzm;
                    }
                    return new zzbag(null);
                }
                return new zzbah();
            }
            return zzaz(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzbam.zza, "zzk", zzbam.zza, "zzl", zzbam.zza});
        }
        return (byte) 1;
    }
}
