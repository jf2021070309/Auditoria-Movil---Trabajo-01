package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzazn extends zzgga<zzazn, zzazm> implements zzghj {
    private static final zzazn zzh;
    private int zzb;
    private int zze;
    private zzazr zzf;
    private zzazt zzg;

    static {
        zzazn zzaznVar = new zzazn();
        zzh = zzaznVar;
        zzgga.zzay(zzazn.class, zzaznVar);
    }

    private zzazn() {
    }

    public static zzazm zza() {
        return zzh.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzazn zzaznVar, zzazr zzazrVar) {
        zzazrVar.getClass();
        zzaznVar.zzf = zzazrVar;
        zzaznVar.zzb |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzazn zzaznVar, zzazt zzaztVar) {
        zzaztVar.getClass();
        zzaznVar.zzg = zzaztVar;
        zzaznVar.zzb |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzazn zzaznVar, int i) {
        zzaznVar.zze = 1;
        zzaznVar.zzb = 1 | zzaznVar.zzb;
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
                    return new zzazm(null);
                }
                return new zzazn();
            }
            return zzaz(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", zzazp.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
