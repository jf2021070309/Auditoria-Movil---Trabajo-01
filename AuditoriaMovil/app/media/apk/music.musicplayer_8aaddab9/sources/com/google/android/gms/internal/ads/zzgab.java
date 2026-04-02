package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgab extends zzgga<zzgab, zzgaa> implements zzghj {
    private static final zzgab zzg;
    private int zzb;
    private int zze;
    private zzgex zzf = zzgex.zzb;

    static {
        zzgab zzgabVar = new zzgab();
        zzg = zzgabVar;
        zzgga.zzay(zzgab.class, zzgabVar);
    }

    private zzgab() {
    }

    public static zzgaa zzc() {
        return zzg.zzas();
    }

    public static zzgab zzd() {
        return zzg;
    }

    public final zzgex zza() {
        return this.zzf;
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
                    return new zzgaa(null);
                }
                return new zzgab();
            }
            return zzgga.zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int zzg() {
        int i2 = this.zzb;
        int i3 = 5;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 == 2) {
            i3 = 4;
        } else if (i2 != 3) {
            i3 = i2 != 4 ? i2 != 5 ? 0 : 7 : 6;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int zzh() {
        int zzb = zzgaf.zzb(this.zze);
        if (zzb == 0) {
            return 1;
        }
        return zzb;
    }
}
