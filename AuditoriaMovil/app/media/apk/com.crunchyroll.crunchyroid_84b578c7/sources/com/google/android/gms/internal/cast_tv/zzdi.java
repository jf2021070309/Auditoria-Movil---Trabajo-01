package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzdi extends zzht implements zzjd {
    private static final zzdi zzb;
    private int zzd;
    private String zze = "";

    static {
        zzdi zzdiVar = new zzdi();
        zzb = zzdiVar;
        zzht.zzA(zzdi.class, zzdiVar);
    }

    private zzdi() {
    }

    public static zzdi zzb(byte[] bArr, zzhh zzhhVar) throws zzie {
        return (zzdi) zzht.zzt(zzb, bArr, zzhhVar);
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
                    return new zzdh(null);
                }
                return new zzdi();
            }
            return zzht.zzx(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
