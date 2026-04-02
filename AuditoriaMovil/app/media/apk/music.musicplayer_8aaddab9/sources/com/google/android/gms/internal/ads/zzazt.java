package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzazt extends zzgga<zzazt, zzazs> implements zzghj {
    private static final zzazt zzh;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzazt zzaztVar = new zzazt();
        zzh = zzaztVar;
        zzgga.zzay(zzazt.class, zzaztVar);
    }

    private zzazt() {
    }

    public static zzazs zza() {
        return zzh.zzas();
    }

    public static /* synthetic */ void zzd(zzazt zzaztVar, boolean z) {
        zzaztVar.zzb |= 1;
        zzaztVar.zze = z;
    }

    public static /* synthetic */ void zze(zzazt zzaztVar, boolean z) {
        zzaztVar.zzb |= 2;
        zzaztVar.zzf = z;
    }

    public static /* synthetic */ void zzf(zzazt zzaztVar, int i2) {
        zzaztVar.zzb |= 4;
        zzaztVar.zzg = i2;
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
                    return new zzazs(null);
                }
                return new zzazt();
            }
            return zzgga.zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
