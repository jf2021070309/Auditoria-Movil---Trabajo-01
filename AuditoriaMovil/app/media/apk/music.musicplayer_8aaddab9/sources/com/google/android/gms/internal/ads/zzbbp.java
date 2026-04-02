package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbbp extends zzgga<zzbbp, zzbbo> implements zzghj {
    private static final zzbbp zzp;
    private int zzb;
    private int zze = 1000;
    private int zzf = 1000;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzbbr zzo;

    static {
        zzbbp zzbbpVar = new zzbbp();
        zzp = zzbbpVar;
        zzgga.zzay(zzbbp.class, zzbbpVar);
    }

    private zzbbp() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                zzgge zzggeVar = zzbam.zza;
                return zzgga.zzaz(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzb", "zze", zzggeVar, "zzf", zzggeVar, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        return null;
                    }
                    return zzp;
                }
                return new zzbbo(null);
            } else {
                return new zzbbp();
            }
        }
        return (byte) 1;
    }
}
