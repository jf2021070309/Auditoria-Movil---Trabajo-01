package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zznf {
    public static final String zza;
    @Deprecated
    public static final zzwx zzb;
    @Deprecated
    public static final zzwx zzc;

    static {
        new zzne();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzwx.zzc();
        zzc = zzwx.zzc();
        try {
            zzlf.zzo(new zznh());
            if (zznb.zzb()) {
                return;
            }
            zzlf.zzn(new zzne(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
