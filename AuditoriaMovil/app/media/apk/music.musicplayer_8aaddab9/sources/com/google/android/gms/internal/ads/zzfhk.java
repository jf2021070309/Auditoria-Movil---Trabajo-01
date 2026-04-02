package com.google.android.gms.internal.ads;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class zzfhk {
    public static void zza(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void zzb(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
