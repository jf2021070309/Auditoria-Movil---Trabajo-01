package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzazu extends zzgga<zzazu, zzazo> implements zzghj {
    private static final zzazu zze;
    private zzggj<zzazn> zzb = zzgga.zzaE();

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

    public static /* synthetic */ void zzd(zzazu zzazuVar, zzazn zzaznVar) {
        zzaznVar.getClass();
        zzggj<zzazn> zzggjVar = zzazuVar.zzb;
        if (!zzggjVar.zza()) {
            zzazuVar.zzb = zzgga.zzaF(zzggjVar);
        }
        zzazuVar.zzb.add(zzaznVar);
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
                        return zze;
                    }
                    return new zzazo(null);
                }
                return new zzazu();
            }
            return zzgga.zzaz(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzazn.class});
        }
        return (byte) 1;
    }
}
