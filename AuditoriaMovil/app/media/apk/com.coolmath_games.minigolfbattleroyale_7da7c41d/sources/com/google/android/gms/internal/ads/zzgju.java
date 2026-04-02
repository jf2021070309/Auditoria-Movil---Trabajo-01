package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgju extends zzgga<zzgju, zzgjr> implements zzghj {
    private static final zzgju zzl;
    private int zzb;
    private zzgjt zze;
    private int zzi;
    private byte zzk = 2;
    private zzggj<zzgjm> zzf = zzaE();
    private zzgex zzg = zzgex.zzb;
    private zzgex zzh = zzgex.zzb;
    private zzgex zzj = zzgex.zzb;

    static {
        zzgju zzgjuVar = new zzgju();
        zzl = zzgjuVar;
        zzgga.zzay(zzgju.class, zzgjuVar);
    }

    private zzgju() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzl;
                        }
                        this.zzk = obj == null ? (byte) 0 : (byte) 1;
                        return null;
                    }
                    return new zzgjr(null);
                }
                return new zzgju();
            }
            return zzaz(zzl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzb", "zze", "zzf", zzgjm.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
