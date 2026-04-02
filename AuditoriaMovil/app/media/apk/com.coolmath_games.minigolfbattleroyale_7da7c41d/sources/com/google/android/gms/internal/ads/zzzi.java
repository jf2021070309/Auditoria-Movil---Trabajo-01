package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: protected */
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
                        return zzh;
                    }
                    return new zzzh(null);
                }
                return new zzzi();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zze;
    }
}
