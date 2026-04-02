package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
