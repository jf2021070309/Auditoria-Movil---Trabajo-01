package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzuv extends zzacz implements zzaeg {
    private static final zzuv zzb;
    private int zze;
    private int zzf;

    static {
        zzuv zzuvVar = new zzuv();
        zzb = zzuvVar;
        zzacz.zzaF(zzuv.class, zzuvVar);
    }

    private zzuv() {
    }

    public static zzuu zzc() {
        return (zzuu) zzb.zzau();
    }

    public static zzuv zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzuu(null);
                }
                return new zzuv();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int zzg() {
        int zzb2 = zzum.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
