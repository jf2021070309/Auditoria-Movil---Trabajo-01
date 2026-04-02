package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfzs extends zzgga<zzfzs, zzfzr> implements zzghj {
    private static final zzfzs zzg;
    private zzgab zzb;
    private zzfzm zze;
    private int zzf;

    static {
        zzfzs zzfzsVar = new zzfzs();
        zzg = zzfzsVar;
        zzgga.zzay(zzfzs.class, zzfzsVar);
    }

    private zzfzs() {
    }

    public static zzfzr zzd() {
        return zzg.zzas();
    }

    public static zzfzs zze() {
        return zzg;
    }

    public static /* synthetic */ void zzg(zzfzs zzfzsVar, zzgab zzgabVar) {
        zzgabVar.getClass();
        zzfzsVar.zzb = zzgabVar;
    }

    public static /* synthetic */ void zzh(zzfzs zzfzsVar, zzfzm zzfzmVar) {
        zzfzmVar.getClass();
        zzfzsVar.zze = zzfzmVar;
    }

    public final zzgab zza() {
        zzgab zzgabVar = this.zzb;
        return zzgabVar == null ? zzgab.zzd() : zzgabVar;
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
                        return zzg;
                    }
                    return new zzfzr(null);
                }
                return new zzfzs();
            }
            return zzgga.zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfzm zzc() {
        zzfzm zzfzmVar = this.zze;
        return zzfzmVar == null ? zzfzm.zzd() : zzfzmVar;
    }

    public final int zzi() {
        int i2 = this.zzf;
        int i3 = 3;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 != 1) {
            i3 = i2 != 2 ? i2 != 3 ? 0 : 5 : 4;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}
