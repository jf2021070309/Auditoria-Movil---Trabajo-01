package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zztz extends zzacz implements zzaeg {
    private static final zztz zzb;
    private zzui zze;
    private zztt zzf;
    private int zzg;

    static {
        zztz zztzVar = new zztz();
        zzb = zztzVar;
        zzacz.zzaF(zztz.class, zztzVar);
    }

    private zztz() {
    }

    public static zzty zzc() {
        return (zzty) zzb.zzau();
    }

    public static zztz zze() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zztz zztzVar, zzui zzuiVar) {
        zzuiVar.getClass();
        zztzVar.zze = zzuiVar;
    }

    public static /* synthetic */ void zzh(zztz zztzVar, zztt zzttVar) {
        zzttVar.getClass();
        zztzVar.zzf = zzttVar;
    }

    public final zztt zza() {
        zztt zzttVar = this.zzf;
        if (zzttVar == null) {
            return zztt.zzd();
        }
        return zzttVar;
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
                    return new zzty(null);
                }
                return new zztz();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzui zzf() {
        zzui zzuiVar = this.zze;
        if (zzuiVar == null) {
            return zzui.zzd();
        }
        return zzuiVar;
    }

    public final int zzi() {
        int i = this.zzg;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        i2 = 0;
                    } else {
                        i2 = 5;
                    }
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
