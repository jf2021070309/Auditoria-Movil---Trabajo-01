package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgbh extends zzgga<zzgbh, zzgbe> implements zzghj {
    private static final zzgbh zzf;
    private int zzb;
    private zzggj<zzgbg> zze = zzaE();

    static {
        zzgbh zzgbhVar = new zzgbh();
        zzf = zzgbhVar;
        zzgga.zzay(zzgbh.class, zzgbhVar);
    }

    private zzgbh() {
    }

    public static zzgbe zza() {
        return zzf.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzgbh zzgbhVar, zzgbg zzgbgVar) {
        zzgbgVar.getClass();
        zzggj<zzgbg> zzggjVar = zzgbhVar.zze;
        if (!zzggjVar.zza()) {
            zzgbhVar.zze = zzgga.zzaF(zzggjVar);
        }
        zzgbhVar.zze.add(zzgbgVar);
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
                        return zzf;
                    }
                    return new zzgbe(null);
                }
                return new zzgbh();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", zzgbg.class});
        }
        return (byte) 1;
    }
}
