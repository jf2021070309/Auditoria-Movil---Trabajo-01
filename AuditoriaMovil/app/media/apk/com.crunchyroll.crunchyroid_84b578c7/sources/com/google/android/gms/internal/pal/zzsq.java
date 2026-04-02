package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzsq extends zzacz implements zzaeg {
    private static final zzsq zzb;
    private int zze;

    static {
        zzsq zzsqVar = new zzsq();
        zzb = zzsqVar;
        zzacz.zzaF(zzsq.class, zzsqVar);
    }

    private zzsq() {
    }

    public static zzsp zzc() {
        return (zzsp) zzb.zzau();
    }

    public static zzsq zze() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
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
                    return new zzsp(null);
                }
                return new zzsq();
            }
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
