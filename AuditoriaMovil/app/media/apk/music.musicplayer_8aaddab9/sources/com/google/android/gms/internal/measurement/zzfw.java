package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes2.dex */
public final class zzfw extends zzjx<zzfw, zzfv> implements zzld {
    private static final zzfw zza;
    private zzke<zzfy> zze = zzjx.zzbA();

    static {
        zzfw zzfwVar = new zzfw();
        zza = zzfwVar;
        zzjx.zzbG(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public static zzfv zza() {
        return zza.zzbu();
    }

    public static /* synthetic */ void zze(zzfw zzfwVar, zzfy zzfyVar) {
        zzfyVar.getClass();
        zzke<zzfy> zzkeVar = zzfwVar.zze;
        if (!zzkeVar.zzc()) {
            zzfwVar.zze = zzjx.zzbB(zzkeVar);
        }
        zzfwVar.zze.add(zzfyVar);
    }

    public final zzfy zzc(int i2) {
        return this.zze.get(0);
    }

    public final List<zzfy> zzd() {
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
                    return new zzfv(null);
                }
                return new zzfw();
            }
            return zzjx.zzbF(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfy.class});
        }
        return (byte) 1;
    }
}
