package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzyy extends zzgga<zzyy, zzyx> implements zzghj {
    private static final zzyy zzl;
    private int zzb;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        zzyy zzyyVar = new zzyy();
        zzl = zzyyVar;
        zzgga.zzay(zzyy.class, zzyyVar);
    }

    private zzyy() {
    }

    public static zzyx zza() {
        return zzl.zzas();
    }

    public static /* synthetic */ void zzd(zzyy zzyyVar, long j2) {
        zzyyVar.zzb |= 4;
        zzyyVar.zzg = j2;
    }

    public static /* synthetic */ void zze(zzyy zzyyVar, long j2) {
        zzyyVar.zzb |= 8;
        zzyyVar.zzh = j2;
    }

    public static /* synthetic */ void zzf(zzyy zzyyVar, long j2) {
        zzyyVar.zzb |= 16;
        zzyyVar.zzi = j2;
    }

    public static /* synthetic */ void zzg(zzyy zzyyVar, long j2) {
        zzyyVar.zzb |= 32;
        zzyyVar.zzj = j2;
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
                        return zzl;
                    }
                    return new zzyx(null);
                }
                return new zzyy();
            }
            return zzgga.zzaz(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
