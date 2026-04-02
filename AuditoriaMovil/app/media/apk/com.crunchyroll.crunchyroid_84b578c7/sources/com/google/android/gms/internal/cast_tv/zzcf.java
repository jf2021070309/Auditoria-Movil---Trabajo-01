package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzcf extends zzht implements zzjd {
    private static final zzhz zzb = new zzcd();
    private static final zzcf zzd;
    private int zze;
    private int zzf;
    private int zzi;
    private String zzg = "";
    private zzib zzh = zzht.zzv();
    private zzhy zzj = zzht.zzu();
    private String zzk = "";

    static {
        zzcf zzcfVar = new zzcf();
        zzd = zzcfVar;
        zzht.zzA(zzcf.class, zzcfVar);
    }

    private zzcf() {
    }

    public static zzce zza() {
        return (zzce) zzd.zzq();
    }

    public static zzcf zzc(byte[] bArr, zzhh zzhhVar) throws zzie {
        return (zzcf) zzht.zzt(zzd, bArr, zzhhVar);
    }

    public static /* synthetic */ void zzd(zzcf zzcfVar, int i) {
        zzcfVar.zze |= 1;
        zzcfVar.zzf = i;
    }

    public static /* synthetic */ void zze(zzcf zzcfVar, int i) {
        zzcfVar.zze |= 4;
        zzcfVar.zzi = 1;
    }

    public static /* synthetic */ void zzf(zzcf zzcfVar, String str) {
        zzcfVar.zze |= 8;
        zzcfVar.zzk = str;
    }

    public static /* synthetic */ void zzg(zzcf zzcfVar, String str) {
        zzcfVar.zze |= 2;
        zzcfVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzcf zzcfVar, Iterable iterable) {
        int i;
        zzib zzibVar = zzcfVar.zzh;
        if (!zzibVar.zzc()) {
            int size = zzibVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzcfVar.zzh = zzibVar.zzd(i);
        }
        zzgc.zzm(iterable, zzcfVar.zzh);
    }

    public static /* synthetic */ void zzj(zzcf zzcfVar, int i) {
        int i2;
        zzhy zzhyVar = zzcfVar.zzj;
        if (!zzhyVar.zzc()) {
            int size = zzhyVar.size();
            if (size == 0) {
                i2 = 10;
            } else {
                i2 = size + size;
            }
            zzcfVar.zzj = zzhyVar.zzg(i2);
        }
        zzcfVar.zzj.zzh(1);
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
                    return new zzce(null);
                }
                return new zzcf();
            }
            return zzht.zzx(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001a\u0004င\u0002\u0005\u001e\u0006ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzdj.zza, "zzk"});
        }
        return (byte) 1;
    }
}
