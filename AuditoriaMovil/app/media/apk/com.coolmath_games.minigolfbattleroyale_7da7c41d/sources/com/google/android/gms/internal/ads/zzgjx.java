package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgjx extends zzgga<zzgjx, zzgjv> implements zzghj {
    private static final zzgjx zzh;
    private int zzb;
    private int zze;
    private String zzf = "";
    private zzgex zzg = zzgex.zzb;

    static {
        zzgjx zzgjxVar = new zzgjx();
        zzh = zzgjxVar;
        zzgga.zzay(zzgjx.class, zzgjxVar);
    }

    private zzgjx() {
    }

    public static zzgjv zza() {
        return zzh.zzas();
    }

    public static /* synthetic */ zzgjx zzc() {
        return zzh;
    }

    public static /* synthetic */ void zzd(zzgjx zzgjxVar, String str) {
        zzgjxVar.zzb |= 2;
        zzgjxVar.zzf = "image/png";
    }

    public static /* synthetic */ void zze(zzgjx zzgjxVar, zzgex zzgexVar) {
        zzgexVar.getClass();
        zzgjxVar.zzb |= 4;
        zzgjxVar.zzg = zzgexVar;
    }

    public static /* synthetic */ void zzf(zzgjx zzgjxVar, int i) {
        zzgjxVar.zze = 1;
        zzgjxVar.zzb = 1 | zzgjxVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzh;
                    }
                    return new zzgjv(null);
                }
                return new zzgjx();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", zzgjw.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
