package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
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

    public static /* synthetic */ void zzf(zzfzm zzfzmVar, zzgau zzgauVar) {
        zzgauVar.getClass();
        zzfzmVar.zzb = zzgauVar;
    }

    public final zzgau zza() {
        zzgau zzgauVar = this.zzb;
        return zzgauVar == null ? zzgau.zze() : zzgauVar;
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
                    return new zzfzl(null);
                }
                return new zzfzm();
            }
            return zzgga.zzaz(zze, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
