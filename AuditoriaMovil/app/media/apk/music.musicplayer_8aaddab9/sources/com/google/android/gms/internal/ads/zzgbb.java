package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
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
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzh;
                    }
                    return new zzgba(null);
                }
                return new zzgbb();
            }
            return zzgga.zzaz(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
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
        int i2 = this.zze;
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

    public final int zzg() {
        int zzb = zzgbv.zzb(this.zzg);
        if (zzb == 0) {
            return 1;
        }
        return zzb;
    }
}
