package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfpv {
    public static Object[] zza(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            zzb(objArr[i3], i3);
        }
        return objArr;
    }

    public static Object zzb(@CheckForNull Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(a.R(20, "at index ", i2));
    }
}
