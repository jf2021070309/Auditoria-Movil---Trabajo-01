package com.google.android.gms.internal.cast_tv;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzcl extends zzht implements zzjd {
    private static final zzhz zzb = new zzcj();
    private static final zzcl zzd;
    private zzhy zze = zzht.zzu();

    static {
        zzcl zzclVar = new zzcl();
        zzd = zzclVar;
        zzht.zzA(zzcl.class, zzclVar);
    }

    private zzcl() {
    }

    public static zzcl zzb() {
        return zzd;
    }

    public static zzcl zzc(byte[] bArr, zzhh zzhhVar) throws zzie {
        return (zzcl) zzht.zzt(zzd, bArr, zzhhVar);
    }

    public final List zzd() {
        return new zzia(this.zze, zzb);
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
                        return zzd;
                    }
                    return new zzck(null);
                }
                return new zzcl();
            }
            return zzht.zzx(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zze", zzch.zza});
        }
        return (byte) 1;
    }
}
