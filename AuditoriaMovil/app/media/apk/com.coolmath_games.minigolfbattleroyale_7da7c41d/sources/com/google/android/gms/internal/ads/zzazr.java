package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzazr extends zzgga<zzazr, zzazq> implements zzghj {
    private static final zzazr zzg;
    private int zzb;
    private boolean zze;
    private int zzf;

    static {
        zzazr zzazrVar = new zzazr();
        zzg = zzazrVar;
        zzgga.zzay(zzazr.class, zzazrVar);
    }

    private zzazr() {
    }

    public static zzazq zza() {
        return zzg.zzas();
    }

    public static zzazr zzc() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzazr zzazrVar, boolean z) {
        zzazrVar.zzb |= 1;
        zzazrVar.zze = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzazr zzazrVar, int i) {
        zzazrVar.zzb |= 2;
        zzazrVar.zzf = i;
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
                    return new zzazq(null);
                }
                return new zzazr();
            }
            return zzaz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
