package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgab extends zzgga<zzgab, zzgaa> implements zzghj {
    private static final zzgab zzg;
    private int zzb;
    private int zze;
    private zzgex zzf = zzgex.zzb;

    static {
        zzgab zzgabVar = new zzgab();
        zzg = zzgabVar;
        zzgga.zzay(zzgab.class, zzgabVar);
    }

    private zzgab() {
    }

    public static zzgaa zzc() {
        return zzg.zzas();
    }

    public static zzgab zzd() {
        return zzg;
    }

    public final zzgex zza() {
        return this.zzf;
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
                    return new zzgaa(null);
                }
                return new zzgab();
            }
            return zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int zzg() {
        int i = this.zzb;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int zzb = zzgaf.zzb(this.zze);
        if (zzb == 0) {
            return 1;
        }
        return zzb;
    }
}
