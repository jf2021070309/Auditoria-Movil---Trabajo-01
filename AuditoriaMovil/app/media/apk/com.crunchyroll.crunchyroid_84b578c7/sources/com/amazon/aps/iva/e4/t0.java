package com.amazon.aps.iva.e4;

import java.util.HashMap;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 {
    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int b(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static void d(int i, HashMap hashMap, String str, int i2, String str2, int i3, String str3, int i4, String str4) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
        hashMap.put(str3, Integer.valueOf(i3));
        hashMap.put(str4, Integer.valueOf(i4));
    }
}
