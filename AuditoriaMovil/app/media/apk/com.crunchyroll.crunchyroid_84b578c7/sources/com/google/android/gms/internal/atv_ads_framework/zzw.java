package com.google.android.gms.internal.atv_ads_framework;

import java.util.Objects;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
final class zzw {
    public static void zza(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Objects.toString(obj2);
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
