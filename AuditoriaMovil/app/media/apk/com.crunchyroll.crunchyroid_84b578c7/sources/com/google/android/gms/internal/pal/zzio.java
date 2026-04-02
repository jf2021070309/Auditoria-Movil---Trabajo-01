package com.google.android.gms.internal.pal;

import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzio {
    private static final Logger zza = Logger.getLogger(zzio.class.getName());
    private static final zzin zzb = new zzin(null);

    private zzio() {
    }

    public static String zza(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return null;
    }
}
