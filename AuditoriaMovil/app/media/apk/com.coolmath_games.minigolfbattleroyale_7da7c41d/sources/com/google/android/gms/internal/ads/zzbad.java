package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbad extends zzgga<zzbad, zzbac> implements zzghj {
    private static final zzbad zzj;
    private int zzb;
    private String zze = "";
    private zzggj<zzazz> zzf = zzaE();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzbad zzbadVar = new zzbad();
        zzj = zzbadVar;
        zzgga.zzay(zzbad.class, zzbadVar);
    }

    private zzbad() {
    }

    public static zzbad zza() {
        return zzj;
    }

    public static /* synthetic */ void zzd(zzbad zzbadVar, String str) {
        str.getClass();
        zzbadVar.zzb |= 1;
        zzbadVar.zze = str;
    }

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
                        return zzj;
                    }
                    return new zzbac(null);
                }
                return new zzbad();
            }
            return zzaz(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzb", "zze", "zzf", zzazz.class, "zzg", zzbam.zza, "zzh", zzbam.zza, "zzi", zzbam.zza});
        }
        return (byte) 1;
    }
}
