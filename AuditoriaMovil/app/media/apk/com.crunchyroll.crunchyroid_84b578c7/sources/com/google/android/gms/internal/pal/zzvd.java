package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzvd extends zzacz implements zzaeg {
    private static final zzvd zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzvd zzvdVar = new zzvd();
        zzb = zzvdVar;
        zzacz.zzaF(zzvd.class, zzvdVar);
    }

    private zzvd() {
    }

    public static zzvc zza() {
        return (zzvc) zzb.zzau();
    }

    public static zzvd zzd() {
        return zzb;
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
                    return new zzvc(null);
                }
                return new zzvd();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final int zze() {
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

    public final int zzf() {
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

    public final int zzg() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            i2 = 0;
                        } else {
                            i2 = 6;
                        }
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
