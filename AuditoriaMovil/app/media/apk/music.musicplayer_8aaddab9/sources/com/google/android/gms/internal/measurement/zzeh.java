package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes2.dex */
public final class zzeh extends zzjx<zzeh, zzeg> implements zzld {
    private static final zzeh zza;
    private int zze;
    private int zzf;
    private zzke<zzes> zzg = zzjx.zzbA();
    private zzke<zzej> zzh = zzjx.zzbA();
    private boolean zzi;
    private boolean zzj;

    static {
        zzeh zzehVar = new zzeh();
        zza = zzehVar;
        zzjx.zzbG(zzeh.class, zzehVar);
    }

    private zzeh() {
    }

    public static /* synthetic */ void zzi(zzeh zzehVar, int i2, zzes zzesVar) {
        zzesVar.getClass();
        zzke<zzes> zzkeVar = zzehVar.zzg;
        if (!zzkeVar.zzc()) {
            zzehVar.zzg = zzjx.zzbB(zzkeVar);
        }
        zzehVar.zzg.set(i2, zzesVar);
    }

    public static /* synthetic */ void zzj(zzeh zzehVar, int i2, zzej zzejVar) {
        zzejVar.getClass();
        zzke<zzej> zzkeVar = zzehVar.zzh;
        if (!zzkeVar.zzc()) {
            zzehVar.zzh = zzjx.zzbB(zzkeVar);
        }
        zzehVar.zzh.set(i2, zzejVar);
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzh.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final zzej zze(int i2) {
        return this.zzh.get(i2);
    }

    public final zzes zzf(int i2) {
        return this.zzg.get(i2);
    }

    public final List<zzej> zzg() {
        return this.zzh;
    }

    public final List<zzes> zzh() {
        return this.zzg;
    }

    public final boolean zzk() {
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
                    return new zzeg(null);
                }
                return new zzeh();
            }
            return zzjx.zzbF(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zzes.class, "zzh", zzej.class, "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
