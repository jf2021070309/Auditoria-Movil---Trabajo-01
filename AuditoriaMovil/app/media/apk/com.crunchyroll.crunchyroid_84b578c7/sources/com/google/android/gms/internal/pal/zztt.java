package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zztt extends zzacz implements zzaeg {
    private static final zztt zzb;
    private zzvt zze;

    static {
        zztt zzttVar = new zztt();
        zzb = zzttVar;
        zzacz.zzaF(zztt.class, zzttVar);
    }

    private zztt() {
    }

    public static zzts zza() {
        return (zzts) zzb.zzau();
    }

    public static zztt zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zztt zzttVar, zzvt zzvtVar) {
        zzvtVar.getClass();
        zzttVar.zze = zzvtVar;
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
                    return new zzts(null);
                }
                return new zztt();
            }
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final zzvt zze() {
        zzvt zzvtVar = this.zze;
        if (zzvtVar == null) {
            return zzvt.zzd();
        }
        return zzvtVar;
    }
}
