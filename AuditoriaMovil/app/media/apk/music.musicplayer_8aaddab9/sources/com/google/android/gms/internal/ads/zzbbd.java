package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
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

    public static /* synthetic */ void zzi(zzbbd zzbbdVar, int i2) {
        zzbbdVar.zze = i2 - 1;
        zzbbdVar.zzb |= 1;
    }

    public static /* synthetic */ void zzj(zzbbd zzbbdVar, int i2) {
        zzbbdVar.zzf = i2 - 1;
        zzbbdVar.zzb |= 2;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzg;
                    }
                    return new zzbaw(null);
                }
                return new zzbbd();
            }
            return zzgga.zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", zzbbb.zza, "zzf", zzbay.zza});
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
