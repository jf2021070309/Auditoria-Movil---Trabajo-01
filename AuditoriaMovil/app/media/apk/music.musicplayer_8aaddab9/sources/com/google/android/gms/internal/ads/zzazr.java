package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzazr extends zzgga<zzazr, zzazq> implements zzghj {
    private static final zzazr zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        zzazr zzazrVar = new zzazr();
        zzg = zzazrVar;
        zzgga.zzay(zzazr.class, zzazrVar);
    }

    private zzazr() {
    }

    public static zzazq zza() {
        return zzg.zzas();
    }

    public static zzazr zzc() {
        return zzg;
    }

    public static /* synthetic */ void zze(zzazr zzazrVar, boolean z) {
        zzazrVar.zzb |= 1;
        zzazrVar.zze = z;
    }

    public static /* synthetic */ void zzf(zzazr zzazrVar, int i2) {
        zzazrVar.zzb |= 2;
        zzazrVar.zzf = i2;
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
                        return zzg;
                    }
                    return new zzazq(null);
                }
                return new zzazr();
            }
            return zzgga.zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
