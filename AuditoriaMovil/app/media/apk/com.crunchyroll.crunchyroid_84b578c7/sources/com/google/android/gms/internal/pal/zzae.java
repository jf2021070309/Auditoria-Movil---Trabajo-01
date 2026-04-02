package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzae extends zzacz implements zzaeg {
    private static final zzae zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;

    static {
        zzae zzaeVar = new zzae();
        zzb = zzaeVar;
        zzacz.zzaF(zzae.class, zzaeVar);
    }

    private zzae() {
    }

    public static zzad zza() {
        return (zzad) zzb.zzau();
    }

    public static /* synthetic */ void zzd(zzae zzaeVar, long j) {
        zzaeVar.zze |= 1;
        zzaeVar.zzf = j;
    }

    public static /* synthetic */ void zze(zzae zzaeVar, long j) {
        zzaeVar.zze |= 4;
        zzaeVar.zzh = j;
    }

    public static /* synthetic */ void zzf(zzae zzaeVar, long j) {
        zzaeVar.zze |= 8;
        zzaeVar.zzi = j;
    }

    public static /* synthetic */ void zzg(zzae zzaeVar, long j) {
        zzaeVar.zze |= 16;
        zzaeVar.zzj = j;
    }

    public static /* synthetic */ void zzh(zzae zzaeVar, long j) {
        zzaeVar.zze |= 32;
        zzaeVar.zzk = j;
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
                    return new zzad(null);
                }
                return new zzae();
            }
            return zzacz.zzaE(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
