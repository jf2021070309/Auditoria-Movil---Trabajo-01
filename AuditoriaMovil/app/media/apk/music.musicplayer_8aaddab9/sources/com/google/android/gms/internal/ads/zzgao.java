package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgao extends zzgga<zzgao, zzgan> implements zzghj {
    private static final zzgao zzf;
    private int zzb;
    private int zze;

    static {
        zzgao zzgaoVar = new zzgao();
        zzf = zzgaoVar;
        zzgga.zzay(zzgao.class, zzgaoVar);
    }

    private zzgao() {
    }

    public static zzgan zzc() {
        return zzf.zzas();
    }

    public static zzgao zzd() {
        return zzf;
    }

    public final int zza() {
        return this.zze;
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
                        return zzf;
                    }
                    return new zzgan(null);
                }
                return new zzgao();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int zzg() {
        int zzb = zzgaf.zzb(this.zzb);
        if (zzb == 0) {
            return 1;
        }
        return zzb;
    }
}
