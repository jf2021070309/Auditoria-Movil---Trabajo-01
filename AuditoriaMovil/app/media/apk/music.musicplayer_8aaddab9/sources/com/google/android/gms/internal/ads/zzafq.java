package com.google.android.gms.internal.ads;

import android.os.Build;
import e.a.d.a.a;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class zzafq {
    @Deprecated
    public static final String zza;
    private static final HashSet<String> zzb;
    private static final String zzc;

    static {
        String str = Build.VERSION.RELEASE;
        zza = a.s(new StringBuilder(String.valueOf(str).length() + 57), "ExoPlayerLib/2.15.0 (Linux; Android ", str, ") ExoPlayerLib/2.15.0");
        zzb = new HashSet<>();
        zzc = "goog.exo.core";
    }

    public static synchronized String zza() {
        String str;
        synchronized (zzafq.class) {
            str = zzc;
        }
        return str;
    }
}
