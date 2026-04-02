package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public enum zzbbm implements zzggc {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    
    private static final zzggd<zzbbm> zzg = new zzggd<zzbbm>() { // from class: com.google.android.gms.internal.ads.zzbbk
    };
    private final int zzh;

    zzbbm(int i2) {
        this.zzh = i2;
    }

    public static zzbbm zzb(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return null;
                            }
                            return SUSPENDED;
                        }
                        return DISCONNECTED;
                    }
                    return DISCONNECTING;
                }
                return CONNECTED;
            }
            return CONNECTING;
        }
        return UNSPECIFIED;
    }

    public static zzgge zzc() {
        return zzbbl.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    public final int zza() {
        return this.zzh;
    }
}
