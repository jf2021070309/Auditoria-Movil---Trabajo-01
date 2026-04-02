package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgar extends zzgga<zzgar, zzgaq> implements zzghj {
    private static final zzgar zzg;
    private String zzb = "";
    private zzgex zze = zzgex.zzb;
    private int zzf;

    static {
        zzgar zzgarVar = new zzgar();
        zzg = zzgarVar;
        zzgga.zzay(zzgar.class, zzgarVar);
    }

    private zzgar() {
    }

    public static zzgaq zzd() {
        return zzg.zzas();
    }

    public static zzgar zze() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
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
                    return new zzgaq(null);
                }
                return new zzgar();
            }
            return zzgga.zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgex zzc() {
        return this.zze;
    }

    public final int zzi() {
        int i2 = this.zzf;
        int i3 = 4;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 == 1) {
            i3 = 3;
        } else if (i2 != 2) {
            i3 = i2 != 3 ? i2 != 4 ? 0 : 6 : 5;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}
