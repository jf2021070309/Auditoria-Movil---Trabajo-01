package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbbd extends zzgga<zzbbd, zzbaw> implements zzghj {
    private static final zzbbd zzg;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzbbd zzbbdVar = new zzbbd();
        zzg = zzbbdVar;
        zzgga.zzay(zzbbd.class, zzbbdVar);
    }

    private zzbbd() {
    }

    public static zzbaw zzd() {
        return zzg.zzas();
    }

    public static zzbbd zze() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzbbd zzbbdVar, int i) {
        zzbbdVar.zze = i - 1;
        zzbbdVar.zzb |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzbbd zzbbdVar, int i) {
        zzbbdVar.zzf = i - 1;
        zzbbdVar.zzb |= 2;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                        return zzg;
                    }
                    return new zzbaw(null);
                }
                return new zzbbd();
            }
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", zzbbb.zza, "zzf", zzbay.zza});
        }
        return (byte) 1;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final int zzg() {
        int zza = zzbbc.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzbaz.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
