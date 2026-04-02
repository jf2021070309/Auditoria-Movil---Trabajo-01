package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zznn {
    @Deprecated
    public static final zzwx zza;
    @Deprecated
    public static final zzwx zzb;
    @Deprecated
    public static final zzwx zzc;

    static {
        new zznm();
        new zznk();
        zza = zzwx.zzc();
        zzb = zzwx.zzc();
        zzc = zzwx.zzc();
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzlf.zzo(new zznp());
        zzlf.zzo(new zzns());
        zzli.zza();
        if (zznb.zzb()) {
            return;
        }
        zzlf.zzl(new zznk(), new zznm(), true);
        zzlf.zzl(new zzoi(), new zzok(), true);
    }
}
