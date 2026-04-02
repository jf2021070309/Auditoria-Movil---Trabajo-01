package com.google.android.gms.internal.common;

import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzah {
    public static Object[] zza(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(a.R(20, "at index ", i3));
            }
        }
        return objArr;
    }
}
