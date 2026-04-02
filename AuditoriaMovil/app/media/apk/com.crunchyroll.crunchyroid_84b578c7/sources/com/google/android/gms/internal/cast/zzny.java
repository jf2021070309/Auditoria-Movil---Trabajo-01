package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzny extends zztp implements zzuy {
    private static final zzny zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzny zznyVar = new zzny();
        zzb = zznyVar;
        zztp.zzH(zzny.class, zznyVar);
    }

    private zzny() {
    }

    public static zznx zza() {
        return (zznx) zzb.zzv();
    }

    public static /* synthetic */ void zzd(zzny zznyVar, int i) {
        zznyVar.zzd |= 2;
        zznyVar.zzf = i;
    }

    public static /* synthetic */ void zze(zzny zznyVar, int i) {
        zznyVar.zze = i - 1;
        zznyVar.zzd |= 1;
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
                    return new zznx(null);
                }
                return new zzny();
            }
            return zztp.zzE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", zzlt.zza(), "zzf"});
        }
        return (byte) 1;
    }
}
