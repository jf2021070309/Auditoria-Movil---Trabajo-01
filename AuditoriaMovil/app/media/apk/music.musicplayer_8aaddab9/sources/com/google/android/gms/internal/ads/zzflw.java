package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzflw {
    private static final Logger zza = Logger.getLogger(zzflw.class.getName());
    private static final zzflu zzb = new zzflu(null);

    private zzflw() {
    }

    public static boolean zza(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }

    public static String zzb(@CheckForNull String str) {
        return str == null ? "" : str;
    }
}
