package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzdo extends zzht implements zzjd {
    private static final zzdo zzb;
    private int zzd;
    private String zze = "";
    private int zzf;

    static {
        zzdo zzdoVar = new zzdo();
        zzb = zzdoVar;
        zzht.zzA(zzdo.class, zzdoVar);
    }

    private zzdo() {
    }

    public static zzdo zzc(byte[] bArr, zzhh zzhhVar) throws zzie {
        return (zzdo) zzht.zzt(zzb, bArr, zzhhVar);
    }

    public final zzdn zza() {
        zzdn zzb2 = zzdn.zzb(this.zzf);
        if (zzb2 == null) {
            return zzdn.UNKNOWN;
        }
        return zzb2;
    }

    public final String zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzht
    public final Object zzi(int i, Object obj, Object obj2) {
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
                    return new zzdk(null);
                }
                return new zzdo();
            }
            return zzht.zzx(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf", zzdm.zza});
        }
        return (byte) 1;
    }
}
