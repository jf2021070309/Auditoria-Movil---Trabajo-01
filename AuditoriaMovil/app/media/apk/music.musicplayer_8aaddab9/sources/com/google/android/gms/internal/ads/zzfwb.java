package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class zzfwb {
    public static final String zza;
    @Deprecated
    public static final zzgby zzb;
    @Deprecated
    public static final zzgby zzc;

    static {
        new zzfwa();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzgby.zzc();
        zzc = zzgby.zzc();
        try {
            zzfum.zze(new zzfwd());
            if (zzfvx.zza()) {
                return;
            }
            zzfum.zzc(new zzfwa(), true);
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}
