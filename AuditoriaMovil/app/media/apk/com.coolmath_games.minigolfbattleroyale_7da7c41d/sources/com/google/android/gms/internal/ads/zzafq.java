package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzafq {
    @Deprecated
    public static final String zza;
    private static final HashSet<String> zzb;
    private static final String zzc;

    static {
        String str = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57);
        sb.append("ExoPlayerLib/2.15.0 (Linux; Android ");
        sb.append(str);
        sb.append(") ExoPlayerLib/2.15.0");
        zza = sb.toString();
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
