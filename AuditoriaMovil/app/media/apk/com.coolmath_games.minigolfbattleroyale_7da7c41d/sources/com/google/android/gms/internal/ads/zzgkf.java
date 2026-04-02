package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgkf extends zzgga<zzgkf, zzgke> implements zzghj {
    private static final zzgkf zzh;
    private int zzb;
    private String zze = "";
    private long zzf;
    private boolean zzg;

    static {
        zzgkf zzgkfVar = new zzgkf();
        zzh = zzgkfVar;
        zzgga.zzay(zzgkf.class, zzgkfVar);
    }

    private zzgkf() {
    }

    public static zzgke zza() {
        return zzh.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzgkf zzgkfVar, String str) {
        zzgkfVar.zzb |= 1;
        zzgkfVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzgkf zzgkfVar, long j) {
        zzgkfVar.zzb |= 2;
        zzgkfVar.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzgkf zzgkfVar, boolean z) {
        zzgkfVar.zzb |= 4;
        zzgkfVar.zzg = z;
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
                        return zzh;
                    }
                    return new zzgke(null);
                }
                return new zzgkf();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
