package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzcx extends zzht implements zzjd {
    private static final zzcx zzb;
    private int zzd;
    private String zze = "";

    static {
        zzcx zzcxVar = new zzcx();
        zzb = zzcxVar;
        zzht.zzA(zzcx.class, zzcxVar);
    }

    private zzcx() {
    }

    public static zzcx zzb(byte[] bArr, zzhh zzhhVar) throws zzie {
        return (zzcx) zzht.zzt(zzb, bArr, zzhhVar);
    }

    public final String zzc() {
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
                    return new zzcw(null);
                }
                return new zzcx();
            }
            return zzht.zzx(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
