package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfzm extends zzgga<zzfzm, zzfzl> implements zzghj {
    private static final zzfzm zze;
    private zzgau zzb;

    static {
        zzfzm zzfzmVar = new zzfzm();
        zze = zzfzmVar;
        zzgga.zzay(zzfzm.class, zzfzmVar);
    }

    private zzfzm() {
    }

    public static zzfzl zzc() {
        return zze.zzas();
    }

    public static zzfzm zzd() {
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzfzm zzfzmVar, zzgau zzgauVar) {
        zzgauVar.getClass();
        zzfzmVar.zzb = zzgauVar;
    }

    public final zzgau zza() {
        zzgau zzgauVar = this.zzb;
        return zzgauVar == null ? zzgau.zze() : zzgauVar;
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
                        return zze;
                    }
                    return new zzfzl(null);
                }
                return new zzfzm();
            }
            return zzaz(zze, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
