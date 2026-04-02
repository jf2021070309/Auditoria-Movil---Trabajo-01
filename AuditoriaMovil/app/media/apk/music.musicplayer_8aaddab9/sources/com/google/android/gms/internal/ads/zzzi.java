package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzzi extends zzgga<zzzi, zzzh> implements zzghj {
    private static final zzzi zzh;
    private int zzb;
    private long zze;
    private String zzf = "";
    private zzgex zzg = zzgex.zzb;

    static {
        zzzi zzziVar = new zzzi();
        zzh = zzziVar;
        zzgga.zzay(zzzi.class, zzziVar);
    }

    private zzzi() {
    }

    public static zzzi zzd() {
        return zzh;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
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
                    return new zzzh(null);
                }
                return new zzzi();
            }
            return zzgga.zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zze;
    }
}
