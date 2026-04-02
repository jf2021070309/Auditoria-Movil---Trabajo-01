package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbcu extends zzgga<zzbcu, zzbct> implements zzghj {
    private static final zzbcu zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        zzbcu zzbcuVar = new zzbcu();
        zzg = zzbcuVar;
        zzgga.zzay(zzbcu.class, zzbcuVar);
    }

    private zzbcu() {
    }

    public static zzbct zzc() {
        return zzg.zzas();
    }

    public static /* synthetic */ void zze(zzbcu zzbcuVar, boolean z) {
        zzbcuVar.zzb |= 1;
        zzbcuVar.zze = z;
    }

    public static /* synthetic */ void zzf(zzbcu zzbcuVar, int i2) {
        zzbcuVar.zzb |= 2;
        zzbcuVar.zzf = i2;
    }

    public final boolean zza() {
        return this.zze;
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
                    return new zzbct(null);
                }
                return new zzbcu();
            }
            return zzgga.zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
