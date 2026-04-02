package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class zzftq {
    public static zzftp zza(String str) throws GeneralSecurityException {
        if (zzfum.zzm().containsKey(str)) {
            return zzfum.zzm().get(str);
        }
        throw new GeneralSecurityException(str.length() != 0 ? "cannot find key template: ".concat(str) : new String("cannot find key template: "));
    }
}
