package com.google.android.gms.internal.cast_tv;

import android.os.Build;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzbw {
    public static boolean zza() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }
}
