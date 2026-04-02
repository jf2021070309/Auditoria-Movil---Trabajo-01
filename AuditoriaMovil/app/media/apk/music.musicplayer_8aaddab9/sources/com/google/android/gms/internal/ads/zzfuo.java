package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class zzfuo {
    public static final String zza;
    public static final String zzb;
    @Deprecated
    public static final zzgby zzc;
    @Deprecated
    public static final zzgby zzd;
    @Deprecated
    public static final zzgby zze;

    static {
        new zzfuu();
        zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new zzfvd();
        zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new zzfvg();
        new zzfva();
        new zzfvm();
        new zzfvq();
        new zzfvj();
        new zzfvt();
        zzgby zzc2 = zzgby.zzc();
        zzc = zzc2;
        zzd = zzc2;
        zze = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfum.zze(new zzfur());
        zzfwy.zza();
        zzfum.zzc(new zzfuu(), true);
        zzfum.zzc(new zzfvd(), true);
        if (zzfvx.zza()) {
            return;
        }
        zzfum.zzc(new zzfva(), true);
        zzfvg.zzk(true);
        zzfum.zzc(new zzfvj(), true);
        zzfum.zzc(new zzfvm(), true);
        zzfum.zzc(new zzfvq(), true);
        zzfum.zzc(new zzfvt(), true);
    }
}
