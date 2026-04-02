package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzux {
    private static final zzadc zza = new zzuw();

    public static /* synthetic */ String zza(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            return "UNRECOGNIZED";
                        }
                        return "DHKEM_P521_HKDF_SHA512";
                    }
                    return "DHKEM_P384_HKDF_SHA384";
                }
                return "DHKEM_P256_HKDF_SHA256";
            }
            return "DHKEM_X25519_HKDF_SHA256";
        }
        return "KEM_UNKNOWN";
    }
}
