package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzdg extends zzht implements zzjd {
    private static final zzdg zzb;
    private int zzd;
    private long zze;

    static {
        zzdg zzdgVar = new zzdg();
        zzb = zzdgVar;
        zzht.zzA(zzdg.class, zzdgVar);
    }

    private zzdg() {
    }

    public static zzdf zzb() {
        return (zzdf) zzb.zzq();
    }

    public static zzdg zzd(byte[] bArr, zzhh zzhhVar) throws zzie {
        return (zzdg) zzht.zzt(zzb, bArr, zzhhVar);
    }

    public static /* synthetic */ void zze(zzdg zzdgVar, long j) {
        zzdgVar.zzd |= 1;
        zzdgVar.zze = j;
    }

    public final long zza() {
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
                    return new zzdf(null);
                }
                return new zzdg();
            }
            return zzht.zzx(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
