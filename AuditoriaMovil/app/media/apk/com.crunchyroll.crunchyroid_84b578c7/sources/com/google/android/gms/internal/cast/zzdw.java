package com.google.android.gms.internal.cast;

import android.os.Build;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
final class zzdw {
    public static boolean zza() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }
}
