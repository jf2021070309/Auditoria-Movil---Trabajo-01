package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zztc extends zzacz implements zzaeg {
    private static final zztc zzb;
    private int zze;
    private int zzf;

    static {
        zztc zztcVar = new zztc();
        zzb = zztcVar;
        zzacz.zzaF(zztc.class, zztcVar);
    }

    private zztc() {
    }

    public static zztb zzc() {
        return (zztb) zzb.zzau();
    }

    public static zztc zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zztc) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
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
                    return new zztb(null);
                }
                return new zztc();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        return (byte) 1;
    }
}
