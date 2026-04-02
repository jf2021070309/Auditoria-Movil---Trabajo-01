package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzwa extends zzacz implements zzaeg {
    private static final zzwa zzb;
    private zzvo zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzwa zzwaVar = new zzwa();
        zzb = zzwaVar;
        zzacz.zzaF(zzwa.class, zzwaVar);
    }

    private zzwa() {
    }

    public static zzvz zzd() {
        return (zzvz) zzb.zzau();
    }

    public static /* synthetic */ void zzf(zzwa zzwaVar, zzvo zzvoVar) {
        zzvoVar.getClass();
        zzwaVar.zze = zzvoVar;
    }

    public final int zza() {
        return this.zzg;
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
                    return new zzvz(null);
                }
                return new zzwa();
            }
            return zzacz.zzaE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzvo zzc() {
        zzvo zzvoVar = this.zze;
        if (zzvoVar == null) {
            return zzvo.zze();
        }
        return zzvoVar;
    }

    public final boolean zzh() {
        if (this.zze != null) {
            return true;
        }
        return false;
    }

    public final int zzi() {
        int i = this.zzf;
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

    public final int zzj() {
        int zzb2 = zzwu.zzb(this.zzh);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
