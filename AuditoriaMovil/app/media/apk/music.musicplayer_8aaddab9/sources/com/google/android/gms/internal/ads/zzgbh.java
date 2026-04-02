package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgbh extends zzgga<zzgbh, zzgbe> implements zzghj {
    private static final zzgbh zzf;
    private int zzb;
    private zzggj<zzgbg> zze = zzgga.zzaE();

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

    public static /* synthetic */ void zze(zzgbh zzgbhVar, zzgbg zzgbgVar) {
        zzgbgVar.getClass();
        zzggj<zzgbg> zzggjVar = zzgbhVar.zze;
        if (!zzggjVar.zza()) {
            zzgbhVar.zze = zzgga.zzaF(zzggjVar);
        }
        zzgbhVar.zze.add(zzgbgVar);
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
                        return zzf;
                    }
                    return new zzgbe(null);
                }
                return new zzgbh();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", zzgbg.class});
        }
        return (byte) 1;
    }
}
