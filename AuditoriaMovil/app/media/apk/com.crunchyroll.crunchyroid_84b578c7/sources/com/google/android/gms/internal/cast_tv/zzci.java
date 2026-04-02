package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public enum zzci implements zzhv {
    CAST_TV_CLIENT_CAPABILITY_UNSPECIFIED(0),
    CAST_TV_CLIENT_CAPABILITY_LOGGING_SUPPORTED(1),
    CAST_TV_CLIENT_CAPABILITY_JWT_SUPPORTED(2),
    CAST_TV_CLIENT_CAPABILITY_GET_CAST_DEVICE_HEADERS_SUPPORTED(3);
    
    private static final zzhw zze = new zzhw() { // from class: com.google.android.gms.internal.cast_tv.zzcg
    };
    private final int zzg;

    zzci(int i) {
        this.zzg = i;
    }

    public static zzci zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return CAST_TV_CLIENT_CAPABILITY_GET_CAST_DEVICE_HEADERS_SUPPORTED;
                }
                return CAST_TV_CLIENT_CAPABILITY_JWT_SUPPORTED;
            }
            return CAST_TV_CLIENT_CAPABILITY_LOGGING_SUPPORTED;
        }
        return CAST_TV_CLIENT_CAPABILITY_UNSPECIFIED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzhv
    public final int zza() {
        return this.zzg;
    }
}
