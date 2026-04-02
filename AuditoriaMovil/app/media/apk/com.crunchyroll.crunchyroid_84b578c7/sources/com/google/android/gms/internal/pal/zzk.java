package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzk extends zzacz implements zzaeg {
    private static final zzk zzb;
    private int zze;
    private int zzf = 2;

    static {
        zzk zzkVar = new zzk();
        zzb = zzkVar;
        zzacz.zzaF(zzk.class, zzkVar);
    }

    private zzk() {
    }

    public static zzk zzc() {
        return zzb;
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
                    return new zzj(null);
                }
                return new zzk();
            }
            return zzacz.zzaE(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", zzm.zza});
        }
        return (byte) 1;
    }

    public final int zzd() {
        int zza = zzn.zza(this.zzf);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }
}
