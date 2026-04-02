package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzkl {
    public static zzkk zza(String str) throws GeneralSecurityException {
        zzkk zzkkVar = (zzkk) zzlf.zzk().get(str);
        if (zzkkVar != null) {
            return zzkkVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
