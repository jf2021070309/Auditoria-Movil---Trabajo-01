package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzdq extends zzht implements zzjd {
    private static final zzdq zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzdq zzdqVar = new zzdq();
        zzb = zzdqVar;
        zzht.zzA(zzdq.class, zzdqVar);
    }

    private zzdq() {
    }

    public static zzdq zzb(byte[] bArr, zzhh zzhhVar) throws zzie {
        return (zzdq) zzht.zzt(zzb, bArr, zzhhVar);
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzf;
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
                    return new zzdp(null);
                }
                return new zzdq();
            }
            return zzht.zzx(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
