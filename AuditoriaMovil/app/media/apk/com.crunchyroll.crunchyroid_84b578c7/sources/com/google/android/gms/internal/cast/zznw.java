package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zznw extends zztp implements zzuy {
    private static final zznw zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zznw zznwVar = new zznw();
        zzb = zznwVar;
        zztp.zzH(zznw.class, zznwVar);
    }

    private zznw() {
    }

    public static zznv zza() {
        return (zznv) zzb.zzv();
    }

    public static /* synthetic */ void zzd(zznw zznwVar, int i) {
        zznwVar.zzd |= 2;
        zznwVar.zzf = i;
    }

    public static /* synthetic */ void zze(zznw zznwVar, int i) {
        zznwVar.zzd |= 4;
        zznwVar.zzg = i;
    }

    public static /* synthetic */ void zzf(zznw zznwVar, int i) {
        zznwVar.zzd |= 8;
        zznwVar.zzh = i;
    }

    public static /* synthetic */ void zzg(zznw zznwVar, int i) {
        zznwVar.zze = i - 1;
        zznwVar.zzd |= 1;
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
                    return new zznv(null);
                }
                return new zznw();
            }
            return zztp.zzE(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", zzlk.zza(), "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
