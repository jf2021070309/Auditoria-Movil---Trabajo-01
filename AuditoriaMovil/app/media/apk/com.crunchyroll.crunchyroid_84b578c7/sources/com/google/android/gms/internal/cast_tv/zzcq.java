package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzcq extends zzht implements zzjd {
    private static final zzcq zzb;
    private int zzd;
    private String zze = "";

    static {
        zzcq zzcqVar = new zzcq();
        zzb = zzcqVar;
        zzht.zzA(zzcq.class, zzcqVar);
    }

    private zzcq() {
    }

    public static zzcp zza() {
        return (zzcp) zzb.zzq();
    }

    public static zzcq zzc(byte[] bArr, zzhh zzhhVar) throws zzie {
        return (zzcq) zzht.zzt(zzb, bArr, zzhhVar);
    }

    public static /* synthetic */ void zzd(zzcq zzcqVar, String str) {
        str.getClass();
        zzcqVar.zzd |= 1;
        zzcqVar.zze = str;
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
                    return new zzcp(null);
                }
                return new zzcq();
            }
            return zzht.zzx(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
