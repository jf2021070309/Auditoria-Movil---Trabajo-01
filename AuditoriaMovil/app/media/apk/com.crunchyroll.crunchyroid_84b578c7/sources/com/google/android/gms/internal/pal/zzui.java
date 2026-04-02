package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzui extends zzacz implements zzaeg {
    private static final zzui zzb;
    private int zze;
    private int zzf;
    private zzaby zzg = zzaby.zzb;

    static {
        zzui zzuiVar = new zzui();
        zzb = zzuiVar;
        zzacz.zzaF(zzui.class, zzuiVar);
    }

    private zzui() {
    }

    public static zzuh zza() {
        return (zzuh) zzb.zzau();
    }

    public static zzui zzd() {
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
                    return new zzuh(null);
                }
                return new zzui();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzaby zze() {
        return this.zzg;
    }

    public final int zzg() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            i2 = 0;
                        } else {
                            i2 = 7;
                        }
                    } else {
                        i2 = 6;
                    }
                } else {
                    i2 = 5;
                }
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int zzb2 = zzum.zzb(this.zzf);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
