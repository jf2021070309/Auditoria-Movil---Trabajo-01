package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzfzs zzfzsVar, zzgab zzgabVar) {
        zzgabVar.getClass();
        zzfzsVar.zzb = zzgabVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzfzs zzfzsVar, zzfzm zzfzmVar) {
        zzfzmVar.getClass();
        zzfzsVar.zze = zzfzmVar;
    }

    public final zzgab zza() {
        zzgab zzgabVar = this.zzb;
        return zzgabVar == null ? zzgab.zzd() : zzgabVar;
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
                    return new zzfzr(null);
                }
                return new zzfzs();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfzm zzc() {
        zzfzm zzfzmVar = this.zze;
        return zzfzmVar == null ? zzfzm.zzd() : zzfzmVar;
    }

    public final int zzi() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
