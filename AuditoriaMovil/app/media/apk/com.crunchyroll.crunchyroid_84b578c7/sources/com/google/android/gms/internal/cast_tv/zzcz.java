package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzcz extends zzht implements zzjd {
    private static final zzcz zzb;
    private int zzd;
    private String zze = "";

    static {
        zzcz zzczVar = new zzcz();
        zzb = zzczVar;
        zzht.zzA(zzcz.class, zzczVar);
    }

    private zzcz() {
    }

    public static zzcz zzb(byte[] bArr, zzhh zzhhVar) throws zzie {
        return (zzcz) zzht.zzt(zzb, bArr, zzhhVar);
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
                    return new zzcy(null);
                }
                return new zzcz();
            }
            return zzht.zzx(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
