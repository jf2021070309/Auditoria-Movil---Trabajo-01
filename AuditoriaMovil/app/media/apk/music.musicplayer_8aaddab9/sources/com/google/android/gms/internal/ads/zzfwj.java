package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class zzfwj {
    @Deprecated
    public static final zzgby zza;
    @Deprecated
    public static final zzgby zzb;
    @Deprecated
    public static final zzgby zzc;

    static {
        new zzfwi();
        new zzfwg();
        zza = zzgby.zzc();
        zzb = zzgby.zzc();
        zzc = zzgby.zzc();
        try {
            zzfum.zze(new zzfwl());
            zzfum.zze(new zzfwo());
            zzfuo.zza();
            if (zzfvx.zza()) {
                return;
            }
            zzfum.zzd(new zzfwg(), new zzfwi(), true);
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}
