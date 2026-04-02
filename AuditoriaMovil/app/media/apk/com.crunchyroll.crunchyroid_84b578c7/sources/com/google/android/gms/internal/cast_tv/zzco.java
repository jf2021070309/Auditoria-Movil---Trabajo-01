package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public enum zzco implements zzhv {
    UNKNOWN(0),
    INSECURE_URL(1),
    HOST_NOT_ALLOWED(2),
    MEDIA_SHELL_NOT_CONNECTED(3),
    NO_CAST_CONFIGURATION(4),
    DEVICE_ID_FLAGS_NOT_SET(5);
    
    private static final zzhw zzg = new zzhw() { // from class: com.google.android.gms.internal.cast_tv.zzcm
    };
    private final int zzi;

    zzco(int i) {
        this.zzi = i;
    }

    public static zzco zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return DEVICE_ID_FLAGS_NOT_SET;
                        }
                        return NO_CAST_CONFIGURATION;
                    }
                    return MEDIA_SHELL_NOT_CONNECTED;
                }
                return HOST_NOT_ALLOWED;
            }
            return INSECURE_URL;
        }
        return UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzhv
    public final int zza() {
        return this.zzi;
    }
}
