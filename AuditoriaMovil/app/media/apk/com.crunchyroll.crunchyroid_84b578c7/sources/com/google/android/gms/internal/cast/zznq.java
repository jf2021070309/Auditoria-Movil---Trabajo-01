package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zznq extends zztp implements zzuy {
    private static final zznq zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zznq zznqVar = new zznq();
        zzb = zznqVar;
        zztp.zzH(zznq.class, zznqVar);
    }

    private zznq() {
    }

    public static zznp zza() {
        return (zznp) zzb.zzv();
    }

    public static /* synthetic */ void zzd(zznq zznqVar, int i) {
        zznqVar.zzd |= 2;
        zznqVar.zzf = i;
    }

    public static /* synthetic */ void zze(zznq zznqVar, int i) {
        zznqVar.zzd |= 4;
        zznqVar.zzg = i;
    }

    public static /* synthetic */ void zzf(zznq zznqVar, int i) {
        zznqVar.zzd |= 8;
        zznqVar.zzh = i;
    }

    public static /* synthetic */ void zzg(zznq zznqVar, int i) {
        zznqVar.zzd |= 16;
        zznqVar.zzi = i;
    }

    public static /* synthetic */ void zzh(zznq zznqVar, int i) {
        zznqVar.zze = i - 1;
        zznqVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.zztp
    public final Object zzb(int i, Object obj, Object obj2) {
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
                    return new zznp(null);
                }
                return new zznq();
            }
            return zztp.zzE(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", zzle.zza(), "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
