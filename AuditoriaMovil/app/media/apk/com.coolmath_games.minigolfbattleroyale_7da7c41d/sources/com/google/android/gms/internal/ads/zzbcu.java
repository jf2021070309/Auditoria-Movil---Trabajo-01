package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzbcu zzbcuVar, boolean z) {
        zzbcuVar.zzb |= 1;
        zzbcuVar.zze = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzbcu zzbcuVar, int i) {
        zzbcuVar.zzb |= 2;
        zzbcuVar.zzf = i;
    }

    public final boolean zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
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
                    return new zzbct(null);
                }
                return new zzbcu();
            }
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
