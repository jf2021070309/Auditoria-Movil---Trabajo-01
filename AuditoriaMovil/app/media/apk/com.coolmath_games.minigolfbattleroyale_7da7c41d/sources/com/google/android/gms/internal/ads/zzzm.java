package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzzm extends zzgga<zzzm, zzzl> implements zzghj {
    private static final zzzm zzi;
    private int zzb;
    private zzggj<zzgex> zze = zzaE();
    private zzgex zzf = zzgex.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzzm zzzmVar = new zzzm();
        zzi = zzzmVar;
        zzgga.zzay(zzzm.class, zzzmVar);
    }

    private zzzm() {
    }

    public static zzzl zza() {
        return zzi.zzas();
    }

    public static /* synthetic */ void zzd(zzzm zzzmVar, zzgex zzgexVar) {
        zzggj<zzgex> zzggjVar = zzzmVar.zze;
        if (!zzggjVar.zza()) {
            zzzmVar.zze = zzgga.zzaF(zzggjVar);
        }
        zzzmVar.zze.add(zzgexVar);
    }

    public static /* synthetic */ void zze(zzzm zzzmVar, zzgex zzgexVar) {
        zzzmVar.zzb |= 1;
        zzzmVar.zzf = zzgexVar;
    }

    public static /* synthetic */ void zzf(zzzm zzzmVar, int i) {
        zzzmVar.zzh = i - 1;
        zzzmVar.zzb |= 4;
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
                        return zzi;
                    }
                    return new zzzl(null);
                }
                return new zzzm();
            }
            return zzaz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", zzzg.zza, "zzh", zzze.zza});
        }
        return (byte) 1;
    }
}
