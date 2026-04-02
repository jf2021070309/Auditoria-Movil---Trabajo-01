package com.google.android.gms.internal.cast_tv;

import com.amazon.aps.iva.q.c0;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzfw {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(c0.a("at index ", i2));
            }
        }
        return objArr;
    }
}
