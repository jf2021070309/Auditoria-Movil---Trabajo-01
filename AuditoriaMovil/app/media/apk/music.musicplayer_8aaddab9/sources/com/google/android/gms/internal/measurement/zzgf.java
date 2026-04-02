package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes2.dex */
public final class zzgf extends zzjx<zzgf, zzge> implements zzld {
    private static final zzgf zza;
    private int zze;
    private int zzf;
    private zzkd zzg = zzjx.zzby();

    static {
        zzgf zzgfVar = new zzgf();
        zza = zzgfVar;
        zzjx.zzbG(zzgf.class, zzgfVar);
    }

    private zzgf() {
    }

    public static zzge zzd() {
        return zza.zzbu();
    }

    public static /* synthetic */ void zzg(zzgf zzgfVar, int i2) {
        zzgfVar.zze |= 1;
        zzgfVar.zzf = i2;
    }

    public static /* synthetic */ void zzh(zzgf zzgfVar, Iterable iterable) {
        zzkd zzkdVar = zzgfVar.zzg;
        if (!zzkdVar.zzc()) {
            zzgfVar.zzg = zzjx.zzbz(zzkdVar);
        }
        zzih.zzbq(iterable, zzgfVar.zzg);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final long zzc(int i2) {
        return this.zzg.zza(i2);
    }

    public final List<Long> zzf() {
        return this.zzg;
    }

    public final boolean zzi() {
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
                    return new zzge(null);
                }
                return new zzgf();
            }
            return zzjx.zzbF(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
