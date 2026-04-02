package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzzd extends zzgga<zzzd, zzzc> implements zzghj {
    private static final zzzd zzi;
    private int zzb;
    private zzgex zze = zzgex.zzb;
    private zzgex zzf = zzgex.zzb;
    private zzgex zzg = zzgex.zzb;
    private zzgex zzh = zzgex.zzb;

    static {
        zzzd zzzdVar = new zzzd();
        zzi = zzzdVar;
        zzgga.zzay(zzzd.class, zzzdVar);
    }

    private zzzd() {
    }

    public static zzzd zzf(byte[] bArr, zzgfm zzgfmVar) throws zzggm {
        return (zzzd) zzgga.zzaK(zzi, bArr, zzgfmVar);
    }

    public static zzzc zzg() {
        return zzi.zzas();
    }

    public static /* synthetic */ zzzd zzh() {
        return zzi;
    }

    public static /* synthetic */ void zzi(zzzd zzzdVar, zzgex zzgexVar) {
        zzzdVar.zzb |= 1;
        zzzdVar.zze = zzgexVar;
    }

    public static /* synthetic */ void zzj(zzzd zzzdVar, zzgex zzgexVar) {
        zzzdVar.zzb |= 2;
        zzzdVar.zzf = zzgexVar;
    }

    public static /* synthetic */ void zzk(zzzd zzzdVar, zzgex zzgexVar) {
        zzzdVar.zzb |= 4;
        zzzdVar.zzg = zzgexVar;
    }

    public static /* synthetic */ void zzl(zzzd zzzdVar, zzgex zzgexVar) {
        zzzdVar.zzb |= 8;
        zzzdVar.zzh = zzgexVar;
    }

    public final zzgex zza() {
        return this.zze;
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
                    return new zzzc(null);
                }
                return new zzzd();
            }
            return zzaz(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzgex zzc() {
        return this.zzf;
    }

    public final zzgex zzd() {
        return this.zzg;
    }

    public final zzgex zze() {
        return this.zzh;
    }
}
