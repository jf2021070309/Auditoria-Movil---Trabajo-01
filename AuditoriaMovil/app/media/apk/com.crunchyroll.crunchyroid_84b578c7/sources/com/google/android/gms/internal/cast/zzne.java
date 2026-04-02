package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzne extends zztp implements zzuy {
    private static final zzne zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzne zzneVar = new zzne();
        zzb = zzneVar;
        zztp.zzH(zzne.class, zzneVar);
    }

    private zzne() {
    }

    public static zznd zza() {
        return (zznd) zzb.zzv();
    }

    public static /* synthetic */ void zzd(zzne zzneVar, String str) {
        str.getClass();
        zzneVar.zzd |= 1;
        zzneVar.zze = str;
    }

    public static /* synthetic */ void zze(zzne zzneVar, String str) {
        str.getClass();
        zzneVar.zzd |= 2;
        zzneVar.zzf = str;
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
                    return new zznd(null);
                }
                return new zzne();
            }
            return zztp.zzE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
