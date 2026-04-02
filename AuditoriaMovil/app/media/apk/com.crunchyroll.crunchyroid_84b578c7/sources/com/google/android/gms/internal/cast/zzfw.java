package com.google.android.gms.internal.cast;

import com.amazon.aps.iva.q.c0;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzfw {
    public static Object zza(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(c0.a("at index ", i));
    }

    public static Object[] zzb(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zza(objArr[i2], i2);
        }
        return objArr;
    }
}
