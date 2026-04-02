package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzqh extends zztp implements zzuy {
    private static final zzqh zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private zztx zzg = zztp.zzA();

    static {
        zzqh zzqhVar = new zzqh();
        zzb = zzqhVar;
        zztp.zzH(zzqh.class, zzqhVar);
    }

    private zzqh() {
    }

    @Override // com.google.android.gms.internal.cast.zztp
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzqg(null);
                }
                return new zzqh();
            }
            return zztp.zzE(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", zzqj.class});
        }
        return (byte) 1;
    }
}
