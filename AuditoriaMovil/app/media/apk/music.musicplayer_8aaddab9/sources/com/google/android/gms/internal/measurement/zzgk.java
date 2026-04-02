package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes2.dex */
public final class zzgk extends zzjx<zzgk, zzgj> implements zzld {
    private static final zzgk zza;
    private zzke<zzgm> zze = zzjx.zzbA();

    static {
        zzgk zzgkVar = new zzgk();
        zza = zzgkVar;
        zzjx.zzbG(zzgk.class, zzgkVar);
    }

    private zzgk() {
    }

    public static zzgk zzc() {
        return zza;
    }

    public final int zza() {
        return this.zze.size();
    }

    public final List<zzgm> zzd() {
        return this.zze;
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
                    return new zzgj(null);
                }
                return new zzgk();
            }
            return zzjx.zzbF(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgm.class});
        }
        return (byte) 1;
    }
}
