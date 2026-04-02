package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgkf extends zzgga<zzgkf, zzgke> implements zzghj {
    private static final zzgkf zzh;
    private int zzb;
    private String zze = "";
    private long zzf;
    private boolean zzg;

    static {
        zzgkf zzgkfVar = new zzgkf();
        zzh = zzgkfVar;
        zzgga.zzay(zzgkf.class, zzgkfVar);
    }

    private zzgkf() {
    }

    public static zzgke zza() {
        return zzh.zzas();
    }

    public static /* synthetic */ void zzd(zzgkf zzgkfVar, String str) {
        zzgkfVar.zzb |= 1;
        zzgkfVar.zze = str;
    }

    public static /* synthetic */ void zze(zzgkf zzgkfVar, long j2) {
        zzgkfVar.zzb |= 2;
        zzgkfVar.zzf = j2;
    }

    public static /* synthetic */ void zzf(zzgkf zzgkfVar, boolean z) {
        zzgkfVar.zzb |= 4;
        zzgkfVar.zzg = z;
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
                    return new zzgke(null);
                }
                return new zzgkf();
            }
            return zzgga.zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
