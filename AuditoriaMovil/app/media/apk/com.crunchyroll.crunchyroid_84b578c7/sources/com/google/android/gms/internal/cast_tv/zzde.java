package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzde extends zzht implements zzjd {
    private static final zzde zzb;
    private int zzd;
    private int zze;

    static {
        zzde zzdeVar = new zzde();
        zzb = zzdeVar;
        zzht.zzA(zzde.class, zzdeVar);
    }

    private zzde() {
    }

    public static zzda zza() {
        return (zzda) zzb.zzq();
    }

    public static zzde zzc(byte[] bArr, zzhh zzhhVar) throws zzie {
        return (zzde) zzht.zzt(zzb, bArr, zzhhVar);
    }

    public static /* synthetic */ void zze(zzde zzdeVar, int i) {
        zzdeVar.zze = i - 1;
        zzdeVar.zzd |= 1;
    }

    public final int zzd() {
        int zza = zzdd.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
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
                    return new zzda(null);
                }
                return new zzde();
            }
            return zzht.zzx(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", zzdc.zza});
        }
        return (byte) 1;
    }
}
