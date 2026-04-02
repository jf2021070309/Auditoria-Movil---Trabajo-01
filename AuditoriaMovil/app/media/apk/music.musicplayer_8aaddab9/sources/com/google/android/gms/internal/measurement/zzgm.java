package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes2.dex */
public final class zzgm extends zzjx<zzgm, zzgl> implements zzld {
    private static final zzgm zza;
    private int zze;
    private String zzf = "";
    private zzke<zzgt> zzg = zzjx.zzbA();

    static {
        zzgm zzgmVar = new zzgm();
        zza = zzgmVar;
        zzjx.zzbG(zzgm.class, zzgmVar);
    }

    private zzgm() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final List<zzgt> zzc() {
        return this.zzg;
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
                    return new zzgl(null);
                }
                return new zzgm();
            }
            return zzjx.zzbF(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzgt.class});
        }
        return (byte) 1;
    }
}
