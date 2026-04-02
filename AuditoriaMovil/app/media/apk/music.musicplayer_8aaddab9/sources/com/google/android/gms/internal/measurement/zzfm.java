package com.google.android.gms.internal.measurement;
/* loaded from: classes2.dex */
public final class zzfm extends zzjx<zzfm, zzfl> implements zzld {
    private static final zzfm zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzfm zzfmVar = new zzfm();
        zza = zzfmVar;
        zzjx.zzbG(zzfm.class, zzfmVar);
    }

    private zzfm() {
    }

    public static zzfl zzc() {
        return zza.zzbu();
    }

    public static /* synthetic */ void zze(zzfm zzfmVar, int i2) {
        zzfmVar.zze |= 1;
        zzfmVar.zzf = i2;
    }

    public static /* synthetic */ void zzf(zzfm zzfmVar, long j2) {
        zzfmVar.zze |= 2;
        zzfmVar.zzg = j2;
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzfl(null);
                }
                return new zzfm();
            }
            return zzjx.zzbF(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
