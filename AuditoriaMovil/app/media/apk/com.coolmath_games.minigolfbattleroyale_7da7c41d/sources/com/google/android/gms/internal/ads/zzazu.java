package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzazu extends zzgga<zzazu, zzazo> implements zzghj {
    private static final zzazu zze;
    private zzggj<zzazn> zzb = zzaE();

    static {
        zzazu zzazuVar = new zzazu();
        zze = zzazuVar;
        zzgga.zzay(zzazu.class, zzazuVar);
    }

    private zzazu() {
    }

    public static zzazo zza() {
        return zze.zzas();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzazu zzazuVar, zzazn zzaznVar) {
        zzaznVar.getClass();
        zzggj<zzazn> zzggjVar = zzazuVar.zzb;
        if (!zzggjVar.zza()) {
            zzazuVar.zzb = zzgga.zzaF(zzggjVar);
        }
        zzazuVar.zzb.add(zzaznVar);
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
                        return zze;
                    }
                    return new zzazo(null);
                }
                return new zzazu();
            }
            return zzaz(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzazn.class});
        }
        return (byte) 1;
    }
}
