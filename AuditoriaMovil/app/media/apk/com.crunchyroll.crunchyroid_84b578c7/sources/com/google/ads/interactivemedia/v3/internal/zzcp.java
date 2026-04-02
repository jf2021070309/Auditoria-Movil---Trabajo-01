package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzcp {
    public static void zza(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void zzb(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException(str);
    }
}
