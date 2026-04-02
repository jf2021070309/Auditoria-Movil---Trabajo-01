package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgju extends zzgga<zzgju, zzgjr> implements zzghj {
    private static final zzgju zzl;
    private int zzb;
    private zzgjt zze;
    private zzgex zzg;
    private zzgex zzh;
    private int zzi;
    private zzgex zzj;
    private byte zzk = 2;
    private zzggj<zzgjm> zzf = zzgga.zzaE();

    static {
        zzgju zzgjuVar = new zzgju();
        zzl = zzgjuVar;
        zzgga.zzay(zzgju.class, zzgjuVar);
    }

    private zzgju() {
        zzgex zzgexVar = zzgex.zzb;
        this.zzg = zzgexVar;
        this.zzh = zzgexVar;
        this.zzj = zzgexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            this.zzk = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzl;
                    }
                    return new zzgjr(null);
                }
                return new zzgju();
            }
            return zzgga.zzaz(zzl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzb", "zze", "zzf", zzgjm.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
