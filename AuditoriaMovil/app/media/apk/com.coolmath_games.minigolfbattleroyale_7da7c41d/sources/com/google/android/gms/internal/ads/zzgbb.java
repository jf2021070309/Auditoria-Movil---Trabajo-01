package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgbb extends zzgga<zzgbb, zzgba> implements zzghj {
    private static final zzgbb zzh;
    private zzgar zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgbb zzgbbVar = new zzgbb();
        zzh = zzgbbVar;
        zzgga.zzay(zzgbb.class, zzgbbVar);
    }

    private zzgbb() {
    }

    public final boolean zza() {
        return this.zzb != null;
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
                        return zzh;
                    }
                    return new zzgba(null);
                }
                return new zzgbb();
            }
            return zzaz(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgar zzc() {
        zzgar zzgarVar = this.zzb;
        return zzgarVar == null ? zzgar.zze() : zzgarVar;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final int zzf() {
        int i = this.zze;
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

    public final int zzg() {
        int zzb = zzgbv.zzb(this.zzg);
        if (zzb == 0) {
            return 1;
        }
        return zzb;
    }
}
