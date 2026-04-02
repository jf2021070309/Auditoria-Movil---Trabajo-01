package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
