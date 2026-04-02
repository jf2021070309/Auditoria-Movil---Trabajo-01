package com.google.android.gms.internal.pal;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zziu {
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
