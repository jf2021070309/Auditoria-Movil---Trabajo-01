package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbad extends zzgga<zzbad, zzbac> implements zzghj {
    private static final zzbad zzj;
    private int zzb;
    private String zze = "";
    private zzggj<zzazz> zzf = zzgga.zzaE();
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
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                zzgge zzggeVar = zzbam.zza;
                return zzgga.zzaz(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzb", "zze", "zzf", zzazz.class, "zzg", zzggeVar, "zzh", zzggeVar, "zzi", zzggeVar});
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        return null;
                    }
                    return zzj;
                }
                return new zzbac(null);
            } else {
                return new zzbad();
            }
        }
        return (byte) 1;
    }
}
